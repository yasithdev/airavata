/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "group_manager_model_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace apache { namespace airavata { namespace model { namespace group {

int _kResourceTypeValues[] = {
  ResourceType::PROJECT,
  ResourceType::EXPERIMENT,
  ResourceType::DATA,
  ResourceType::APPLICATION_DEPLOYMENT,
  ResourceType::GROUP_RESOURCE_PROFILE,
  ResourceType::CREDENTIAL_TOKEN,
  ResourceType::OTHER
};
const char* _kResourceTypeNames[] = {
  "PROJECT",
  "EXPERIMENT",
  "DATA",
  "APPLICATION_DEPLOYMENT",
  "GROUP_RESOURCE_PROFILE",
  "CREDENTIAL_TOKEN",
  "OTHER"
};
const std::map<int, const char*> _ResourceType_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(7, _kResourceTypeValues, _kResourceTypeNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));

int _kResourcePermissionTypeValues[] = {
  ResourcePermissionType::WRITE,
  ResourcePermissionType::READ,
  ResourcePermissionType::OWNER,
  ResourcePermissionType::MANAGE_SHARING
};
const char* _kResourcePermissionTypeNames[] = {
  "WRITE",
  "READ",
  "OWNER",
  "MANAGE_SHARING"
};
const std::map<int, const char*> _ResourcePermissionType_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(4, _kResourcePermissionTypeValues, _kResourcePermissionTypeNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));


GroupModel::~GroupModel() throw() {
}


void GroupModel::__set_id(const std::string& val) {
  this->id = val;
__isset.id = true;
}

void GroupModel::__set_name(const std::string& val) {
  this->name = val;
__isset.name = true;
}

void GroupModel::__set_ownerId(const std::string& val) {
  this->ownerId = val;
__isset.ownerId = true;
}

void GroupModel::__set_description(const std::string& val) {
  this->description = val;
__isset.description = true;
}

void GroupModel::__set_members(const std::vector<std::string> & val) {
  this->members = val;
__isset.members = true;
}

void GroupModel::__set_admins(const std::vector<std::string> & val) {
  this->admins = val;
__isset.admins = true;
}

uint32_t GroupModel::read(::apache::thrift::protocol::TProtocol* iprot) {

  apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->id);
          this->__isset.id = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->name);
          this->__isset.name = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->ownerId);
          this->__isset.ownerId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->description);
          this->__isset.description = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->members.clear();
            uint32_t _size0;
            ::apache::thrift::protocol::TType _etype3;
            xfer += iprot->readListBegin(_etype3, _size0);
            this->members.resize(_size0);
            uint32_t _i4;
            for (_i4 = 0; _i4 < _size0; ++_i4)
            {
              xfer += iprot->readString(this->members[_i4]);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.members = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->admins.clear();
            uint32_t _size5;
            ::apache::thrift::protocol::TType _etype8;
            xfer += iprot->readListBegin(_etype8, _size5);
            this->admins.resize(_size5);
            uint32_t _i9;
            for (_i9 = 0; _i9 < _size5; ++_i9)
            {
              xfer += iprot->readString(this->admins[_i9]);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.admins = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t GroupModel::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("GroupModel");

  if (this->__isset.id) {
    xfer += oprot->writeFieldBegin("id", ::apache::thrift::protocol::T_STRING, 1);
    xfer += oprot->writeString(this->id);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.name) {
    xfer += oprot->writeFieldBegin("name", ::apache::thrift::protocol::T_STRING, 2);
    xfer += oprot->writeString(this->name);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.ownerId) {
    xfer += oprot->writeFieldBegin("ownerId", ::apache::thrift::protocol::T_STRING, 3);
    xfer += oprot->writeString(this->ownerId);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.description) {
    xfer += oprot->writeFieldBegin("description", ::apache::thrift::protocol::T_STRING, 4);
    xfer += oprot->writeString(this->description);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.members) {
    xfer += oprot->writeFieldBegin("members", ::apache::thrift::protocol::T_LIST, 5);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRING, static_cast<uint32_t>(this->members.size()));
      std::vector<std::string> ::const_iterator _iter10;
      for (_iter10 = this->members.begin(); _iter10 != this->members.end(); ++_iter10)
      {
        xfer += oprot->writeString((*_iter10));
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.admins) {
    xfer += oprot->writeFieldBegin("admins", ::apache::thrift::protocol::T_LIST, 6);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRING, static_cast<uint32_t>(this->admins.size()));
      std::vector<std::string> ::const_iterator _iter11;
      for (_iter11 = this->admins.begin(); _iter11 != this->admins.end(); ++_iter11)
      {
        xfer += oprot->writeString((*_iter11));
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(GroupModel &a, GroupModel &b) {
  using ::std::swap;
  swap(a.id, b.id);
  swap(a.name, b.name);
  swap(a.ownerId, b.ownerId);
  swap(a.description, b.description);
  swap(a.members, b.members);
  swap(a.admins, b.admins);
  swap(a.__isset, b.__isset);
}

GroupModel::GroupModel(const GroupModel& other12) {
  id = other12.id;
  name = other12.name;
  ownerId = other12.ownerId;
  description = other12.description;
  members = other12.members;
  admins = other12.admins;
  __isset = other12.__isset;
}
GroupModel& GroupModel::operator=(const GroupModel& other13) {
  id = other13.id;
  name = other13.name;
  ownerId = other13.ownerId;
  description = other13.description;
  members = other13.members;
  admins = other13.admins;
  __isset = other13.__isset;
  return *this;
}
void GroupModel::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "GroupModel(";
  out << "id="; (__isset.id ? (out << to_string(id)) : (out << "<null>"));
  out << ", " << "name="; (__isset.name ? (out << to_string(name)) : (out << "<null>"));
  out << ", " << "ownerId="; (__isset.ownerId ? (out << to_string(ownerId)) : (out << "<null>"));
  out << ", " << "description="; (__isset.description ? (out << to_string(description)) : (out << "<null>"));
  out << ", " << "members="; (__isset.members ? (out << to_string(members)) : (out << "<null>"));
  out << ", " << "admins="; (__isset.admins ? (out << to_string(admins)) : (out << "<null>"));
  out << ")";
}

}}}} // namespace
