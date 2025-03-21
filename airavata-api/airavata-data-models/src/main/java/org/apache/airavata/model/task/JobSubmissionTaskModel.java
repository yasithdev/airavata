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
package org.apache.airavata.model.task;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.21.0)")
public class JobSubmissionTaskModel implements org.apache.thrift.TBase<JobSubmissionTaskModel, JobSubmissionTaskModel._Fields>, java.io.Serializable, Cloneable, Comparable<JobSubmissionTaskModel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobSubmissionTaskModel");

  private static final org.apache.thrift.protocol.TField JOB_SUBMISSION_PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("jobSubmissionProtocol", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MONITOR_MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("monitorMode", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField WALL_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("wallTime", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new JobSubmissionTaskModelStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new JobSubmissionTaskModelTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol jobSubmissionProtocol; // required
  private @org.apache.thrift.annotation.Nullable org.apache.airavata.model.appcatalog.computeresource.MonitorMode monitorMode; // required
  private int wallTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol
     */
    JOB_SUBMISSION_PROTOCOL((short)1, "jobSubmissionProtocol"),
    /**
     * 
     * @see org.apache.airavata.model.appcatalog.computeresource.MonitorMode
     */
    MONITOR_MODE((short)2, "monitorMode"),
    WALL_TIME((short)3, "wallTime");

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
        case 1: // JOB_SUBMISSION_PROTOCOL
          return JOB_SUBMISSION_PROTOCOL;
        case 2: // MONITOR_MODE
          return MONITOR_MODE;
        case 3: // WALL_TIME
          return WALL_TIME;
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
  private static final int __WALLTIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.WALL_TIME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_SUBMISSION_PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("jobSubmissionProtocol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol.class)));
    tmpMap.put(_Fields.MONITOR_MODE, new org.apache.thrift.meta_data.FieldMetaData("monitorMode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.airavata.model.appcatalog.computeresource.MonitorMode.class)));
    tmpMap.put(_Fields.WALL_TIME, new org.apache.thrift.meta_data.FieldMetaData("wallTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobSubmissionTaskModel.class, metaDataMap);
  }

  public JobSubmissionTaskModel() {
  }

  public JobSubmissionTaskModel(
    org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol jobSubmissionProtocol,
    org.apache.airavata.model.appcatalog.computeresource.MonitorMode monitorMode)
  {
    this();
    this.jobSubmissionProtocol = jobSubmissionProtocol;
    this.monitorMode = monitorMode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobSubmissionTaskModel(JobSubmissionTaskModel other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJobSubmissionProtocol()) {
      this.jobSubmissionProtocol = other.jobSubmissionProtocol;
    }
    if (other.isSetMonitorMode()) {
      this.monitorMode = other.monitorMode;
    }
    this.wallTime = other.wallTime;
  }

  @Override
  public JobSubmissionTaskModel deepCopy() {
    return new JobSubmissionTaskModel(this);
  }

  @Override
  public void clear() {
    this.jobSubmissionProtocol = null;
    this.monitorMode = null;
    setWallTimeIsSet(false);
    this.wallTime = 0;
  }

  /**
   * 
   * @see org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol getJobSubmissionProtocol() {
    return this.jobSubmissionProtocol;
  }

  /**
   * 
   * @see org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol
   */
  public void setJobSubmissionProtocol(@org.apache.thrift.annotation.Nullable org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol jobSubmissionProtocol) {
    this.jobSubmissionProtocol = jobSubmissionProtocol;
  }

  public void unsetJobSubmissionProtocol() {
    this.jobSubmissionProtocol = null;
  }

  /** Returns true if field jobSubmissionProtocol is set (has been assigned a value) and false otherwise */
  public boolean isSetJobSubmissionProtocol() {
    return this.jobSubmissionProtocol != null;
  }

  public void setJobSubmissionProtocolIsSet(boolean value) {
    if (!value) {
      this.jobSubmissionProtocol = null;
    }
  }

  /**
   * 
   * @see org.apache.airavata.model.appcatalog.computeresource.MonitorMode
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.airavata.model.appcatalog.computeresource.MonitorMode getMonitorMode() {
    return this.monitorMode;
  }

  /**
   * 
   * @see org.apache.airavata.model.appcatalog.computeresource.MonitorMode
   */
  public void setMonitorMode(@org.apache.thrift.annotation.Nullable org.apache.airavata.model.appcatalog.computeresource.MonitorMode monitorMode) {
    this.monitorMode = monitorMode;
  }

  public void unsetMonitorMode() {
    this.monitorMode = null;
  }

  /** Returns true if field monitorMode is set (has been assigned a value) and false otherwise */
  public boolean isSetMonitorMode() {
    return this.monitorMode != null;
  }

  public void setMonitorModeIsSet(boolean value) {
    if (!value) {
      this.monitorMode = null;
    }
  }

  public int getWallTime() {
    return this.wallTime;
  }

  public void setWallTime(int wallTime) {
    this.wallTime = wallTime;
    setWallTimeIsSet(true);
  }

  public void unsetWallTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WALLTIME_ISSET_ID);
  }

  /** Returns true if field wallTime is set (has been assigned a value) and false otherwise */
  public boolean isSetWallTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WALLTIME_ISSET_ID);
  }

  public void setWallTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WALLTIME_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case JOB_SUBMISSION_PROTOCOL:
      if (value == null) {
        unsetJobSubmissionProtocol();
      } else {
        setJobSubmissionProtocol((org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol)value);
      }
      break;

    case MONITOR_MODE:
      if (value == null) {
        unsetMonitorMode();
      } else {
        setMonitorMode((org.apache.airavata.model.appcatalog.computeresource.MonitorMode)value);
      }
      break;

    case WALL_TIME:
      if (value == null) {
        unsetWallTime();
      } else {
        setWallTime((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_SUBMISSION_PROTOCOL:
      return getJobSubmissionProtocol();

    case MONITOR_MODE:
      return getMonitorMode();

    case WALL_TIME:
      return getWallTime();

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
    case JOB_SUBMISSION_PROTOCOL:
      return isSetJobSubmissionProtocol();
    case MONITOR_MODE:
      return isSetMonitorMode();
    case WALL_TIME:
      return isSetWallTime();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof JobSubmissionTaskModel)
      return this.equals((JobSubmissionTaskModel)that);
    return false;
  }

  public boolean equals(JobSubmissionTaskModel that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_jobSubmissionProtocol = true && this.isSetJobSubmissionProtocol();
    boolean that_present_jobSubmissionProtocol = true && that.isSetJobSubmissionProtocol();
    if (this_present_jobSubmissionProtocol || that_present_jobSubmissionProtocol) {
      if (!(this_present_jobSubmissionProtocol && that_present_jobSubmissionProtocol))
        return false;
      if (!this.jobSubmissionProtocol.equals(that.jobSubmissionProtocol))
        return false;
    }

    boolean this_present_monitorMode = true && this.isSetMonitorMode();
    boolean that_present_monitorMode = true && that.isSetMonitorMode();
    if (this_present_monitorMode || that_present_monitorMode) {
      if (!(this_present_monitorMode && that_present_monitorMode))
        return false;
      if (!this.monitorMode.equals(that.monitorMode))
        return false;
    }

    boolean this_present_wallTime = true && this.isSetWallTime();
    boolean that_present_wallTime = true && that.isSetWallTime();
    if (this_present_wallTime || that_present_wallTime) {
      if (!(this_present_wallTime && that_present_wallTime))
        return false;
      if (this.wallTime != that.wallTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetJobSubmissionProtocol()) ? 131071 : 524287);
    if (isSetJobSubmissionProtocol())
      hashCode = hashCode * 8191 + jobSubmissionProtocol.getValue();

    hashCode = hashCode * 8191 + ((isSetMonitorMode()) ? 131071 : 524287);
    if (isSetMonitorMode())
      hashCode = hashCode * 8191 + monitorMode.getValue();

    hashCode = hashCode * 8191 + ((isSetWallTime()) ? 131071 : 524287);
    if (isSetWallTime())
      hashCode = hashCode * 8191 + wallTime;

    return hashCode;
  }

  @Override
  public int compareTo(JobSubmissionTaskModel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetJobSubmissionProtocol(), other.isSetJobSubmissionProtocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobSubmissionProtocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobSubmissionProtocol, other.jobSubmissionProtocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMonitorMode(), other.isSetMonitorMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMonitorMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.monitorMode, other.monitorMode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetWallTime(), other.isSetWallTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWallTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wallTime, other.wallTime);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("JobSubmissionTaskModel(");
    boolean first = true;

    sb.append("jobSubmissionProtocol:");
    if (this.jobSubmissionProtocol == null) {
      sb.append("null");
    } else {
      sb.append(this.jobSubmissionProtocol);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("monitorMode:");
    if (this.monitorMode == null) {
      sb.append("null");
    } else {
      sb.append(this.monitorMode);
    }
    first = false;
    if (isSetWallTime()) {
      if (!first) sb.append(", ");
      sb.append("wallTime:");
      sb.append(this.wallTime);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetJobSubmissionProtocol()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobSubmissionProtocol' is unset! Struct:" + toString());
    }

    if (!isSetMonitorMode()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'monitorMode' is unset! Struct:" + toString());
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

  private static class JobSubmissionTaskModelStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public JobSubmissionTaskModelStandardScheme getScheme() {
      return new JobSubmissionTaskModelStandardScheme();
    }
  }

  private static class JobSubmissionTaskModelStandardScheme extends org.apache.thrift.scheme.StandardScheme<JobSubmissionTaskModel> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, JobSubmissionTaskModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_SUBMISSION_PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobSubmissionProtocol = org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol.findByValue(iprot.readI32());
              struct.setJobSubmissionProtocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MONITOR_MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.monitorMode = org.apache.airavata.model.appcatalog.computeresource.MonitorMode.findByValue(iprot.readI32());
              struct.setMonitorModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WALL_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.wallTime = iprot.readI32();
              struct.setWallTimeIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, JobSubmissionTaskModel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobSubmissionProtocol != null) {
        oprot.writeFieldBegin(JOB_SUBMISSION_PROTOCOL_FIELD_DESC);
        oprot.writeI32(struct.jobSubmissionProtocol.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.monitorMode != null) {
        oprot.writeFieldBegin(MONITOR_MODE_FIELD_DESC);
        oprot.writeI32(struct.monitorMode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetWallTime()) {
        oprot.writeFieldBegin(WALL_TIME_FIELD_DESC);
        oprot.writeI32(struct.wallTime);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobSubmissionTaskModelTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public JobSubmissionTaskModelTupleScheme getScheme() {
      return new JobSubmissionTaskModelTupleScheme();
    }
  }

  private static class JobSubmissionTaskModelTupleScheme extends org.apache.thrift.scheme.TupleScheme<JobSubmissionTaskModel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobSubmissionTaskModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.jobSubmissionProtocol.getValue());
      oprot.writeI32(struct.monitorMode.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetWallTime()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetWallTime()) {
        oprot.writeI32(struct.wallTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobSubmissionTaskModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.jobSubmissionProtocol = org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol.findByValue(iprot.readI32());
      struct.setJobSubmissionProtocolIsSet(true);
      struct.monitorMode = org.apache.airavata.model.appcatalog.computeresource.MonitorMode.findByValue(iprot.readI32());
      struct.setMonitorModeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.wallTime = iprot.readI32();
        struct.setWallTimeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

