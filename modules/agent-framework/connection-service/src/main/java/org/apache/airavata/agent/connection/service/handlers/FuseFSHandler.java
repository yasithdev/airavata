package org.apache.airavata.agent.connection.service.handlers;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.apache.airavata.agent.ServerMessage;
import org.apache.airavata.agent.connection.service.services.AiravataFileService;
import org.apache.airavata.fuse.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Map;

@GrpcService
public class FuseFSHandler extends FuseServiceGrpc.FuseServiceImplBase {

    private final static Logger LOGGER = LoggerFactory.getLogger(FuseFSHandler.class);

    private final AiravataFileService airavataFileService;

    public FuseFSHandler(AiravataFileService airavataFileService) {
        this.airavataFileService = airavataFileService;
    }

    private final Map<String, FileInfo> fileTree = Map.ofEntries(
            Map.entry("/test", FileInfo.newBuilder()
                    .setName("test")
                    .setSize(512)
                    .setIno(2)
                    .setIsDir(true)
                    .setMode(777)
                    .setModTime(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000).build())
                    .build()),
            Map.entry("/pass.txt", FileInfo.newBuilder()
                    .setName("pass.txt")
                    .setSize(1024)
                    .setIno(2)
                    .setIsDir(false)
                    .setMode(777)
                    .setModTime(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000).build())
                    .build()),
            Map.entry("/case.txt", FileInfo.newBuilder()
                    .setName("case.txt")
                    .setSize(1024)
                    .setIno(3)
                    .setIsDir(false)
                    .setMode(777)
                    .setModTime(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000).build())
                    .build())
    );

    @Override
    public void statFs(StatFsReq request, StreamObserver<StatFsRes> responseObserver) {
        responseObserver.onNext(StatFsRes.newBuilder().setResult(StatFs.newBuilder()
                .setBlocks(1000)
                .setBlocksAvailable(1000)
                .setBlocksFree(1000)
                .setInodes(100)
                .setIoSize(100)
                .setBlockSize(1000)
                .build()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void fileInfo(FileInfoReq request, StreamObserver<FileInfoRes> responseObserver) {
        LOGGER.info("Calling fileInfo {}", request.getName());
        FileInfo file = fileTree.get(request.getName());
//        airavataFileService.handleFileInfoRequest(fileInfo, responseObserver);
        responseObserver.onNext(FileInfoRes.newBuilder().setResult(file).build());
        responseObserver.onCompleted();
    }

    @Override
    public void openDir(OpenDirReq request, StreamObserver<OpenDirRes> responseObserver) {
        LOGGER.info("Calling openDir {}", request.getName());
        responseObserver.onNext(OpenDirRes.newBuilder().setResult(OpenedDir.newBuilder().build()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void openFile(OpenFileReq request, StreamObserver<OpenFileRes> responseObserver) {
        LOGGER.info("Calling openFile {}", request.getName());
        responseObserver.onNext(OpenFileRes.newBuilder().setResult(OpenedFile.newBuilder().build()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void readDir(ReadDirReq request, StreamObserver<ReadDirRes> responseObserver) {
        LOGGER.info("Calling readDir {}", request.getName());
//        airavataFileService.handleReadDirRequest(readDirReq, responseObserver);
        responseObserver.onNext(ReadDirRes.newBuilder().addResult(
                DirEntry.newBuilder()
                    .setIsDir(false)
                    .setName("test.txt")
                    .setFileMode(777)
                    .setInfo(fileTree.get("/test.txt"))
                    .build()
                ).addResult(
                DirEntry.newBuilder()
                        .setIsDir(false)
                        .setName("case.txt")
                        .setFileMode(777)
                        .setInfo(fileTree.get("/case.txt"))
                        .build()
                ).build()
        );
        responseObserver.onCompleted();
    }

    @Override
    public void readFile(ReadFileReq request, StreamObserver<ReadFileRes> responseObserver) {
        LOGGER.info("Calling readFile {}", request.getName());
        responseObserver.onNext(ReadFileRes.newBuilder()
                .setResult(FileEntry.newBuilder()
                        .setDst(ByteString.copyFrom("Hellllo", Charset.defaultCharset())).build()).build());

        responseObserver.onCompleted();
    }

    @Override
    public void writeFile(WriteFileReq request, StreamObserver<WriteFileRes> responseObserver) {
        LOGGER.info("Calling writeFile {}", request.getName());
        responseObserver.onNext(WriteFileRes.newBuilder().setResult(true).build());
        responseObserver.onCompleted();
    }

    @Override
    public void setInodeAtt(SetInodeAttReq request, StreamObserver<SetInodeAttRes> responseObserver) {
        LOGGER.info("Calling setInodeAtt {}", request.getName());

        responseObserver.onNext(SetInodeAttRes.newBuilder().setResult(InodeAtt.newBuilder()
                .setAtime(Timestamp.newBuilder().setSeconds(System.currentTimeMillis()/ 1000).build())
                .setCtime(Timestamp.newBuilder().setSeconds(System.currentTimeMillis()/ 1000).build())
                .setMtime(Timestamp.newBuilder().setSeconds(System.currentTimeMillis()/ 1000).build())
                        .setFileMode(777)
                        .setSize(10800)
                .build()).build());

        responseObserver.onCompleted();
    }
}
