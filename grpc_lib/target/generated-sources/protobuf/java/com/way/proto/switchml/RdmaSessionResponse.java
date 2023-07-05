// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: switchml.proto

package com.way.proto.switchml;

/**
 * Protobuf type {@code com.way.proto.switchml.RdmaSessionResponse}
 */
public final class RdmaSessionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.way.proto.switchml.RdmaSessionResponse)
    RdmaSessionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RdmaSessionResponse.newBuilder() to construct.
  private RdmaSessionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RdmaSessionResponse() {
    qpns_ = emptyIntList();
    psns_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RdmaSessionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RdmaSessionResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            sessionId_ = input.readUInt64();
            break;
          }
          case 16: {

            mac_ = input.readUInt64();
            break;
          }
          case 24: {

            ipv4_ = input.readUInt32();
            break;
          }
          case 32: {

            rkey_ = input.readUInt32();
            break;
          }
          case 40: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              qpns_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            qpns_.addInt(input.readUInt32());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              qpns_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              qpns_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 48: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              psns_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            psns_.addInt(input.readUInt32());
            break;
          }
          case 50: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              psns_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              psns_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        qpns_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        psns_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.way.proto.switchml.switchmlProto.internal_static_com_way_proto_switchml_RdmaSessionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.way.proto.switchml.switchmlProto.internal_static_com_way_proto_switchml_RdmaSessionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.way.proto.switchml.RdmaSessionResponse.class, com.way.proto.switchml.RdmaSessionResponse.Builder.class);
  }

  public static final int SESSION_ID_FIELD_NUMBER = 1;
  private long sessionId_;
  /**
   * <code>uint64 session_id = 1;</code>
   * @return The sessionId.
   */
  @java.lang.Override
  public long getSessionId() {
    return sessionId_;
  }

  public static final int MAC_FIELD_NUMBER = 2;
  private long mac_;
  /**
   * <code>uint64 mac = 2;</code>
   * @return The mac.
   */
  @java.lang.Override
  public long getMac() {
    return mac_;
  }

  public static final int IPV4_FIELD_NUMBER = 3;
  private int ipv4_;
  /**
   * <code>uint32 ipv4 = 3;</code>
   * @return The ipv4.
   */
  @java.lang.Override
  public int getIpv4() {
    return ipv4_;
  }

  public static final int RKEY_FIELD_NUMBER = 4;
  private int rkey_;
  /**
   * <code>uint32 rkey = 4;</code>
   * @return The rkey.
   */
  @java.lang.Override
  public int getRkey() {
    return rkey_;
  }

  public static final int QPNS_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.IntList qpns_;
  /**
   * <code>repeated uint32 qpns = 5;</code>
   * @return A list containing the qpns.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getQpnsList() {
    return qpns_;
  }
  /**
   * <code>repeated uint32 qpns = 5;</code>
   * @return The count of qpns.
   */
  public int getQpnsCount() {
    return qpns_.size();
  }
  /**
   * <code>repeated uint32 qpns = 5;</code>
   * @param index The index of the element to return.
   * @return The qpns at the given index.
   */
  public int getQpns(int index) {
    return qpns_.getInt(index);
  }
  private int qpnsMemoizedSerializedSize = -1;

  public static final int PSNS_FIELD_NUMBER = 6;
  private com.google.protobuf.Internal.IntList psns_;
  /**
   * <code>repeated uint32 psns = 6;</code>
   * @return A list containing the psns.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getPsnsList() {
    return psns_;
  }
  /**
   * <code>repeated uint32 psns = 6;</code>
   * @return The count of psns.
   */
  public int getPsnsCount() {
    return psns_.size();
  }
  /**
   * <code>repeated uint32 psns = 6;</code>
   * @param index The index of the element to return.
   * @return The psns at the given index.
   */
  public int getPsns(int index) {
    return psns_.getInt(index);
  }
  private int psnsMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (sessionId_ != 0L) {
      output.writeUInt64(1, sessionId_);
    }
    if (mac_ != 0L) {
      output.writeUInt64(2, mac_);
    }
    if (ipv4_ != 0) {
      output.writeUInt32(3, ipv4_);
    }
    if (rkey_ != 0) {
      output.writeUInt32(4, rkey_);
    }
    if (getQpnsList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(qpnsMemoizedSerializedSize);
    }
    for (int i = 0; i < qpns_.size(); i++) {
      output.writeUInt32NoTag(qpns_.getInt(i));
    }
    if (getPsnsList().size() > 0) {
      output.writeUInt32NoTag(50);
      output.writeUInt32NoTag(psnsMemoizedSerializedSize);
    }
    for (int i = 0; i < psns_.size(); i++) {
      output.writeUInt32NoTag(psns_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, sessionId_);
    }
    if (mac_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, mac_);
    }
    if (ipv4_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, ipv4_);
    }
    if (rkey_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, rkey_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < qpns_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(qpns_.getInt(i));
      }
      size += dataSize;
      if (!getQpnsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      qpnsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < psns_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(psns_.getInt(i));
      }
      size += dataSize;
      if (!getPsnsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      psnsMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.way.proto.switchml.RdmaSessionResponse)) {
      return super.equals(obj);
    }
    com.way.proto.switchml.RdmaSessionResponse other = (com.way.proto.switchml.RdmaSessionResponse) obj;

    if (getSessionId()
        != other.getSessionId()) return false;
    if (getMac()
        != other.getMac()) return false;
    if (getIpv4()
        != other.getIpv4()) return false;
    if (getRkey()
        != other.getRkey()) return false;
    if (!getQpnsList()
        .equals(other.getQpnsList())) return false;
    if (!getPsnsList()
        .equals(other.getPsnsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSessionId());
    hash = (37 * hash) + MAC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMac());
    hash = (37 * hash) + IPV4_FIELD_NUMBER;
    hash = (53 * hash) + getIpv4();
    hash = (37 * hash) + RKEY_FIELD_NUMBER;
    hash = (53 * hash) + getRkey();
    if (getQpnsCount() > 0) {
      hash = (37 * hash) + QPNS_FIELD_NUMBER;
      hash = (53 * hash) + getQpnsList().hashCode();
    }
    if (getPsnsCount() > 0) {
      hash = (37 * hash) + PSNS_FIELD_NUMBER;
      hash = (53 * hash) + getPsnsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.way.proto.switchml.RdmaSessionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.way.proto.switchml.RdmaSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.way.proto.switchml.RdmaSessionResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.way.proto.switchml.RdmaSessionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.way.proto.switchml.RdmaSessionResponse)
      com.way.proto.switchml.RdmaSessionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.way.proto.switchml.switchmlProto.internal_static_com_way_proto_switchml_RdmaSessionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.way.proto.switchml.switchmlProto.internal_static_com_way_proto_switchml_RdmaSessionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.way.proto.switchml.RdmaSessionResponse.class, com.way.proto.switchml.RdmaSessionResponse.Builder.class);
    }

    // Construct using com.way.proto.switchml.RdmaSessionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sessionId_ = 0L;

      mac_ = 0L;

      ipv4_ = 0;

      rkey_ = 0;

      qpns_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      psns_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.way.proto.switchml.switchmlProto.internal_static_com_way_proto_switchml_RdmaSessionResponse_descriptor;
    }

    @java.lang.Override
    public com.way.proto.switchml.RdmaSessionResponse getDefaultInstanceForType() {
      return com.way.proto.switchml.RdmaSessionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.way.proto.switchml.RdmaSessionResponse build() {
      com.way.proto.switchml.RdmaSessionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.way.proto.switchml.RdmaSessionResponse buildPartial() {
      com.way.proto.switchml.RdmaSessionResponse result = new com.way.proto.switchml.RdmaSessionResponse(this);
      int from_bitField0_ = bitField0_;
      result.sessionId_ = sessionId_;
      result.mac_ = mac_;
      result.ipv4_ = ipv4_;
      result.rkey_ = rkey_;
      if (((bitField0_ & 0x00000001) != 0)) {
        qpns_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.qpns_ = qpns_;
      if (((bitField0_ & 0x00000002) != 0)) {
        psns_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.psns_ = psns_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.way.proto.switchml.RdmaSessionResponse) {
        return mergeFrom((com.way.proto.switchml.RdmaSessionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.way.proto.switchml.RdmaSessionResponse other) {
      if (other == com.way.proto.switchml.RdmaSessionResponse.getDefaultInstance()) return this;
      if (other.getSessionId() != 0L) {
        setSessionId(other.getSessionId());
      }
      if (other.getMac() != 0L) {
        setMac(other.getMac());
      }
      if (other.getIpv4() != 0) {
        setIpv4(other.getIpv4());
      }
      if (other.getRkey() != 0) {
        setRkey(other.getRkey());
      }
      if (!other.qpns_.isEmpty()) {
        if (qpns_.isEmpty()) {
          qpns_ = other.qpns_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureQpnsIsMutable();
          qpns_.addAll(other.qpns_);
        }
        onChanged();
      }
      if (!other.psns_.isEmpty()) {
        if (psns_.isEmpty()) {
          psns_ = other.psns_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensurePsnsIsMutable();
          psns_.addAll(other.psns_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.way.proto.switchml.RdmaSessionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.way.proto.switchml.RdmaSessionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long sessionId_ ;
    /**
     * <code>uint64 session_id = 1;</code>
     * @return The sessionId.
     */
    @java.lang.Override
    public long getSessionId() {
      return sessionId_;
    }
    /**
     * <code>uint64 session_id = 1;</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(long value) {
      
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 session_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      
      sessionId_ = 0L;
      onChanged();
      return this;
    }

    private long mac_ ;
    /**
     * <code>uint64 mac = 2;</code>
     * @return The mac.
     */
    @java.lang.Override
    public long getMac() {
      return mac_;
    }
    /**
     * <code>uint64 mac = 2;</code>
     * @param value The mac to set.
     * @return This builder for chaining.
     */
    public Builder setMac(long value) {
      
      mac_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 mac = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMac() {
      
      mac_ = 0L;
      onChanged();
      return this;
    }

    private int ipv4_ ;
    /**
     * <code>uint32 ipv4 = 3;</code>
     * @return The ipv4.
     */
    @java.lang.Override
    public int getIpv4() {
      return ipv4_;
    }
    /**
     * <code>uint32 ipv4 = 3;</code>
     * @param value The ipv4 to set.
     * @return This builder for chaining.
     */
    public Builder setIpv4(int value) {
      
      ipv4_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 ipv4 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpv4() {
      
      ipv4_ = 0;
      onChanged();
      return this;
    }

    private int rkey_ ;
    /**
     * <code>uint32 rkey = 4;</code>
     * @return The rkey.
     */
    @java.lang.Override
    public int getRkey() {
      return rkey_;
    }
    /**
     * <code>uint32 rkey = 4;</code>
     * @param value The rkey to set.
     * @return This builder for chaining.
     */
    public Builder setRkey(int value) {
      
      rkey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 rkey = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRkey() {
      
      rkey_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList qpns_ = emptyIntList();
    private void ensureQpnsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        qpns_ = mutableCopy(qpns_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 qpns = 5;</code>
     * @return A list containing the qpns.
     */
    public java.util.List<java.lang.Integer>
        getQpnsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(qpns_) : qpns_;
    }
    /**
     * <code>repeated uint32 qpns = 5;</code>
     * @return The count of qpns.
     */
    public int getQpnsCount() {
      return qpns_.size();
    }
    /**
     * <code>repeated uint32 qpns = 5;</code>
     * @param index The index of the element to return.
     * @return The qpns at the given index.
     */
    public int getQpns(int index) {
      return qpns_.getInt(index);
    }
    /**
     * <code>repeated uint32 qpns = 5;</code>
     * @param index The index to set the value at.
     * @param value The qpns to set.
     * @return This builder for chaining.
     */
    public Builder setQpns(
        int index, int value) {
      ensureQpnsIsMutable();
      qpns_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 qpns = 5;</code>
     * @param value The qpns to add.
     * @return This builder for chaining.
     */
    public Builder addQpns(int value) {
      ensureQpnsIsMutable();
      qpns_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 qpns = 5;</code>
     * @param values The qpns to add.
     * @return This builder for chaining.
     */
    public Builder addAllQpns(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureQpnsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, qpns_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 qpns = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearQpns() {
      qpns_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList psns_ = emptyIntList();
    private void ensurePsnsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        psns_ = mutableCopy(psns_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated uint32 psns = 6;</code>
     * @return A list containing the psns.
     */
    public java.util.List<java.lang.Integer>
        getPsnsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(psns_) : psns_;
    }
    /**
     * <code>repeated uint32 psns = 6;</code>
     * @return The count of psns.
     */
    public int getPsnsCount() {
      return psns_.size();
    }
    /**
     * <code>repeated uint32 psns = 6;</code>
     * @param index The index of the element to return.
     * @return The psns at the given index.
     */
    public int getPsns(int index) {
      return psns_.getInt(index);
    }
    /**
     * <code>repeated uint32 psns = 6;</code>
     * @param index The index to set the value at.
     * @param value The psns to set.
     * @return This builder for chaining.
     */
    public Builder setPsns(
        int index, int value) {
      ensurePsnsIsMutable();
      psns_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 psns = 6;</code>
     * @param value The psns to add.
     * @return This builder for chaining.
     */
    public Builder addPsns(int value) {
      ensurePsnsIsMutable();
      psns_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 psns = 6;</code>
     * @param values The psns to add.
     * @return This builder for chaining.
     */
    public Builder addAllPsns(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensurePsnsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, psns_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 psns = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPsns() {
      psns_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.way.proto.switchml.RdmaSessionResponse)
  }

  // @@protoc_insertion_point(class_scope:com.way.proto.switchml.RdmaSessionResponse)
  private static final com.way.proto.switchml.RdmaSessionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.way.proto.switchml.RdmaSessionResponse();
  }

  public static com.way.proto.switchml.RdmaSessionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RdmaSessionResponse>
      PARSER = new com.google.protobuf.AbstractParser<RdmaSessionResponse>() {
    @java.lang.Override
    public RdmaSessionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RdmaSessionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RdmaSessionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RdmaSessionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.way.proto.switchml.RdmaSessionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

