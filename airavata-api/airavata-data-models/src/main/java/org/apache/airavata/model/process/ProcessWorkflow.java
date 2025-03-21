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
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.process;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.21.0)")
public class ProcessWorkflow implements org.apache.thrift.TBase<ProcessWorkflow, ProcessWorkflow._Fields>, java.io.Serializable, Cloneable, Comparable<ProcessWorkflow> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProcessWorkflow");

  private static final org.apache.thrift.protocol.TField PROCESS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("processId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField WORKFLOW_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("workflowId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CREATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("creationTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProcessWorkflowStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProcessWorkflowTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String processId; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String workflowId; // required
  private long creationTime; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String type; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROCESS_ID((short)1, "processId"),
    WORKFLOW_ID((short)2, "workflowId"),
    CREATION_TIME((short)3, "creationTime"),
    TYPE((short)4, "type");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROCESS_ID
          return PROCESS_ID;
        case 2: // WORKFLOW_ID
          return WORKFLOW_ID;
        case 3: // CREATION_TIME
          return CREATION_TIME;
        case 4: // TYPE
          return TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CREATIONTIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CREATION_TIME,_Fields.TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROCESS_ID, new org.apache.thrift.meta_data.FieldMetaData("processId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WORKFLOW_ID, new org.apache.thrift.meta_data.FieldMetaData("workflowId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("creationTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProcessWorkflow.class, metaDataMap);
  }

  public ProcessWorkflow() {
  }

  public ProcessWorkflow(
    java.lang.String processId,
    java.lang.String workflowId)
  {
    this();
    this.processId = processId;
    this.workflowId = workflowId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProcessWorkflow(ProcessWorkflow other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProcessId()) {
      this.processId = other.processId;
    }
    if (other.isSetWorkflowId()) {
      this.workflowId = other.workflowId;
    }
    this.creationTime = other.creationTime;
    if (other.isSetType()) {
      this.type = other.type;
    }
  }

  @Override
  public ProcessWorkflow deepCopy() {
    return new ProcessWorkflow(this);
  }

  @Override
  public void clear() {
    this.processId = null;
    this.workflowId = null;
    setCreationTimeIsSet(false);
    this.creationTime = 0;
    this.type = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getProcessId() {
    return this.processId;
  }

  public void setProcessId(@org.apache.thrift.annotation.Nullable java.lang.String processId) {
    this.processId = processId;
  }

  public void unsetProcessId() {
    this.processId = null;
  }

  /** Returns true if field processId is set (has been assigned a value) and false otherwise */
  public boolean isSetProcessId() {
    return this.processId != null;
  }

  public void setProcessIdIsSet(boolean value) {
    if (!value) {
      this.processId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getWorkflowId() {
    return this.workflowId;
  }

  public void setWorkflowId(@org.apache.thrift.annotation.Nullable java.lang.String workflowId) {
    this.workflowId = workflowId;
  }

  public void unsetWorkflowId() {
    this.workflowId = null;
  }

  /** Returns true if field workflowId is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkflowId() {
    return this.workflowId != null;
  }

  public void setWorkflowIdIsSet(boolean value) {
    if (!value) {
      this.workflowId = null;
    }
  }

  public long getCreationTime() {
    return this.creationTime;
  }

  public void setCreationTime(long creationTime) {
    this.creationTime = creationTime;
    setCreationTimeIsSet(true);
  }

  public void unsetCreationTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  /** Returns true if field creationTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreationTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  public void setCreationTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATIONTIME_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getType() {
    return this.type;
  }

  public void setType(@org.apache.thrift.annotation.Nullable java.lang.String type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PROCESS_ID:
      if (value == null) {
        unsetProcessId();
      } else {
        setProcessId((java.lang.String)value);
      }
      break;

    case WORKFLOW_ID:
      if (value == null) {
        unsetWorkflowId();
      } else {
        setWorkflowId((java.lang.String)value);
      }
      break;

    case CREATION_TIME:
      if (value == null) {
        unsetCreationTime();
      } else {
        setCreationTime((java.lang.Long)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PROCESS_ID:
      return getProcessId();

    case WORKFLOW_ID:
      return getWorkflowId();

    case CREATION_TIME:
      return getCreationTime();

    case TYPE:
      return getType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PROCESS_ID:
      return isSetProcessId();
    case WORKFLOW_ID:
      return isSetWorkflowId();
    case CREATION_TIME:
      return isSetCreationTime();
    case TYPE:
      return isSetType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ProcessWorkflow)
      return this.equals((ProcessWorkflow)that);
    return false;
  }

  public boolean equals(ProcessWorkflow that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_processId = true && this.isSetProcessId();
    boolean that_present_processId = true && that.isSetProcessId();
    if (this_present_processId || that_present_processId) {
      if (!(this_present_processId && that_present_processId))
        return false;
      if (!this.processId.equals(that.processId))
        return false;
    }

    boolean this_present_workflowId = true && this.isSetWorkflowId();
    boolean that_present_workflowId = true && that.isSetWorkflowId();
    if (this_present_workflowId || that_present_workflowId) {
      if (!(this_present_workflowId && that_present_workflowId))
        return false;
      if (!this.workflowId.equals(that.workflowId))
        return false;
    }

    boolean this_present_creationTime = true && this.isSetCreationTime();
    boolean that_present_creationTime = true && that.isSetCreationTime();
    if (this_present_creationTime || that_present_creationTime) {
      if (!(this_present_creationTime && that_present_creationTime))
        return false;
      if (this.creationTime != that.creationTime)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetProcessId()) ? 131071 : 524287);
    if (isSetProcessId())
      hashCode = hashCode * 8191 + processId.hashCode();

    hashCode = hashCode * 8191 + ((isSetWorkflowId()) ? 131071 : 524287);
    if (isSetWorkflowId())
      hashCode = hashCode * 8191 + workflowId.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreationTime()) ? 131071 : 524287);
    if (isSetCreationTime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(creationTime);

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ProcessWorkflow other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetProcessId(), other.isSetProcessId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcessId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processId, other.processId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetWorkflowId(), other.isSetWorkflowId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkflowId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workflowId, other.workflowId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCreationTime(), other.isSetCreationTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreationTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creationTime, other.creationTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessWorkflow(");
    boolean first = true;

    sb.append("processId:");
    if (this.processId == null) {
      sb.append("null");
    } else {
      sb.append(this.processId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("workflowId:");
    if (this.workflowId == null) {
      sb.append("null");
    } else {
      sb.append(this.workflowId);
    }
    first = false;
    if (isSetCreationTime()) {
      if (!first) sb.append(", ");
      sb.append("creationTime:");
      sb.append(this.creationTime);
      first = false;
    }
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetProcessId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'processId' is unset! Struct:" + toString());
    }

    if (!isSetWorkflowId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'workflowId' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProcessWorkflowStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public ProcessWorkflowStandardScheme getScheme() {
      return new ProcessWorkflowStandardScheme();
    }
  }

  private static class ProcessWorkflowStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProcessWorkflow> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, ProcessWorkflow struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROCESS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.processId = iprot.readString();
              struct.setProcessIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WORKFLOW_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.workflowId = iprot.readString();
              struct.setWorkflowIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CREATION_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.creationTime = iprot.readI64();
              struct.setCreationTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, ProcessWorkflow struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.processId != null) {
        oprot.writeFieldBegin(PROCESS_ID_FIELD_DESC);
        oprot.writeString(struct.processId);
        oprot.writeFieldEnd();
      }
      if (struct.workflowId != null) {
        oprot.writeFieldBegin(WORKFLOW_ID_FIELD_DESC);
        oprot.writeString(struct.workflowId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreationTime()) {
        oprot.writeFieldBegin(CREATION_TIME_FIELD_DESC);
        oprot.writeI64(struct.creationTime);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeString(struct.type);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProcessWorkflowTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public ProcessWorkflowTupleScheme getScheme() {
      return new ProcessWorkflowTupleScheme();
    }
  }

  private static class ProcessWorkflowTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProcessWorkflow> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProcessWorkflow struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.processId);
      oprot.writeString(struct.workflowId);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCreationTime()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCreationTime()) {
        oprot.writeI64(struct.creationTime);
      }
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProcessWorkflow struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.processId = iprot.readString();
      struct.setProcessIdIsSet(true);
      struct.workflowId = iprot.readString();
      struct.setWorkflowIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.creationTime = iprot.readI64();
        struct.setCreationTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

