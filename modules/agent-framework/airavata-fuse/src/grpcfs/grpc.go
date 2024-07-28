// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at

//   http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// place for grpc calls

package grpcfs

import (
	"context"
	pb "grpcfs/pb"
	"io/fs"
	"log"
	"time"

	"google.golang.org/protobuf/types/known/timestamppb"
)

var ctxt = &pb.RPCContext{
	AccessToken: "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJzSmJyaV9BQURUcXM3QzVTX3VHREVXY2pMZGZoRWtVMlBBSDNNcmZnM3FjIn0.eyJqdGkiOiJiMWY1YzgxNC1mZDZjLTRlNDEtOTlhNC0wZmY4ODgxNGU2MzIiLCJleHAiOjE3MjE2MjA2OTEsIm5iZiI6MCwiaWF0IjoxNzIxNjE4ODkxLCJpc3MiOiJodHRwczovL2lhbS5zY2lnYXAub3JnL2F1dGgvcmVhbG1zL3Rlc3Rkcml2ZSIsImF1ZCI6InBnYSIsInN1YiI6ImFkYzZhNmFjLTllZDItNGIxYy05NDE1LWI0OGU1ZDFlOTdkMyIsInR5cCI6IkJlYXJlciIsImF6cCI6InBnYSIsImF1dGhfdGltZSI6MTcyMTYxNTI4OSwic2Vzc2lvbl9zdGF0ZSI6ImQxZjExMjc5LTJhZDctNDhmOS05YWQ5LTlkNzllOTNiOGE3NCIsImFjciI6IjAiLCJjbGllbnRfc2Vzc2lvbiI6ImM1ZWZlNjJiLWVhNmUtNDJkNC05MzdjLTQ0ZWM1Y2VkMDU1MiIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwczovL3Rlc3Rkcml2ZS5ndy5jeWJlcnNodXR0bGUub3JnIiwiaHR0cHM6Ly90ZXN0ZHJpdmUueWJlcnNodXR0bGUub3JnIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImJyb2tlciI6eyJyb2xlcyI6WyJyZWFkLXRva2VuIl19LCJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50Iiwidmlldy1wcm9maWxlIl19fSwibmFtZSI6Illhc2l0aCBKYXlhd2FyZGFuYSIsInByZWZlcnJlZF91c2VybmFtZSI6InBqYXlhMDAxQG9kdS5lZHUiLCJnaXZlbl9uYW1lIjoiWWFzaXRoIiwiZmFtaWx5X25hbWUiOiJKYXlhd2FyZGFuYSIsImVtYWlsIjoicGpheWEwMDFAb2R1LmVkdSJ9.FeCkMhgoCPbbUpkc8J93S5gPbYwGMi2TYGYPHD-Beo947ygGaCKNsdCg6ek3ElmXfQW_zwGHp4b_FAvvs95j2-SJ3NDd6iRZK2Zj0l9w7qlvMJe4z-bdfNpct7n3u_nGnpphcWtvMGxS2IvWUhZor39S-iYWK4nzzgUvm8koHZ5-uRfhtuSXCHXUWGrzdGVEXwbak61hNTl6E6UerR4TE7gsI6fQKXIA-Fc5y40dewU_nZCD2JxPJGFJRr0iIMTmTOjl0sgJPs5ixoOotqxhttKqXzIF1BIfUg-UwdpdCrv8KTx7zqJLE6BQfWBlJBvuc9dBW6mTMTB4DZDwWxJhtw",
}

func getStatFs(fsClient pb.FuseServiceClient, ctx context.Context, root string) (*pb.StatFs, error) {
	req := &pb.StatFsReq{
		Name:    root,
		Context: ctxt,
	}
	res, err := fsClient.StatFs(ctx, req)
	if err != nil {
		return nil, err
	}
	raw := res.Result
	if raw == nil {
		return nil, ctx.Err()
	}
	return raw, err
}

func getStat(fsClient pb.FuseServiceClient, ctx context.Context, path string) (fs.FileInfo, error) {
	log.Print("grpc.getStat - path=", path)
	req := &pb.FileInfoReq{
		Name:    path,
		Context: ctxt,
	}
	log.Print("grpc.getStat - calling fsClient.FileInfo for ", path)
	res, err := fsClient.FileInfo(ctx, req)
	if err != nil {
		log.Print("grpc.getStat - fsClient.FileInfo raised error. ", err)
		return nil, err
	}
	raw := res.Result
	if raw == nil {
		return nil, ctx.Err()
	}
	result := &FileInfoBridge{info: *raw}
	return result, err
}

func readDir(fsClient pb.FuseServiceClient, ctx context.Context, path string) ([]fs.DirEntry, error) {
	req := &pb.ReadDirReq{
		Name:    path,
		Context: ctxt,
	}
	res, err := fsClient.ReadDir(ctx, req)
	if err != nil {
		log.Print("grpc.readDir - fsClient.ReadDir raised error. ", err)
		return nil, err
	}
	raw := res.Result
	var entries []fs.DirEntry
	for _, entry := range raw {
		entries = append(entries, &DirEntryBridge{info: *entry})
	}
	return entries, err
}

func readFile(fsClient pb.FuseServiceClient, ctx context.Context, path string) ([]byte, error) {
	req := &pb.ReadFileReq{
		Name:    path,
		Context: ctxt,
	}
	res, err := fsClient.ReadFile(ctx, req)
	return res.Result.Dst, err
}

func writeFile(fsClient pb.FuseServiceClient, ctx context.Context, path string, data []byte, offset int64) (bool, error) {
	req := &pb.WriteFileReq{
		Name:    path,
		Context: ctxt,
	}
	res, err := fsClient.WriteFile(ctx, req)
	return res.Result, err
}

func setInodeAttributes(fsClient pb.FuseServiceClient, ctx context.Context, path string, size *uint64, mode *uint32, atime *time.Time, mtime *time.Time) (*pb.InodeAtt, error) {
	var at *timestamppb.Timestamp
	var mt *timestamppb.Timestamp
	if atime != nil {
		at = timestamppb.New(*atime)
	}
	if mtime != nil {
		mt = timestamppb.New(*mtime)
	}
	req := &pb.SetInodeAttReq{
		Name:     path,
		Context:  ctxt,
		Size:     size,
		FileMode: mode,
		ATime:    at,
		MTime:    mt,
	}
	res, err := fsClient.SetInodeAtt(ctx, req)
	if err != nil {
		log.Print("grpc.setInodeAttributes - fsClient.SetInodeAtt raised error. ", err)
		return nil, err
	}
	return res.Result, err
}
