// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: switchml.proto

package com.way.proto.switchml;

/**
 * Protobuf type {@code com.way.proto.switchml.UdpSessionRequest}
 */
public final class UdpSessionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.way.proto.switchml.UdpSessionRequest)
    UdpSessionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UdpSessionRequest.newBuilder() to construct.
  private UdpSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UdpSessionRequest() {
    packetSize_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UdpSessionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UdpSessionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            rank_ = input.readUInt32();
            break;
          }
          case 24: {

            numWorkers_ = input.readUInt32();
            break;
          }
          case 32: {

            mac_ = input.readUInt64();
            break;
          }
          case 40: {

            ipv4_ = input.readUInt32();
            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            packetSize_ = rawValue;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.way.proto.switchml.switchmlProto.internal_static_com_way_proto_switchml_UdpSessionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.way.proto.switchml.switchmlProto.internal_static_com_way_proto_switchml_UdpSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.way.proto.switchml.UdpSessionRequest.class, com.way.proto.switchml.UdpSessionRequest.Builder.class);
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

  public static final int RANK_FIELD_NUMBER = 2;
  private int rank_;
  /**
   * <code>uint32 rank = 2;</code>
   * @return The rank.
   */
  @java.lang.Override
  public int getRank() {
    return rank_;
  }

  public static final int NUM_WORKERS_FIELD_NUMBER = 3;
  private int numWorkers_;
  /**
   * <code>uint32 num_workers = 3;</code>
   * @return The numWorkers.
   */
  @java.lang.Override
  public int getNumWorkers() {
    return numWorkers_;
  }

  public static final int MAC_FIELD_NUMBER = 4;
  private long mac_;
  /**
   * <code>uint64 mac = 4;</code>
   * @return The mac.
   */
  @java.lang.Override
  public long getMac() {
    return mac_;
  }

  public static final int IPV4_FIELD_NUMBER = 5;
  private int ipv4_;
  /**
   * <code>uint32 ipv4 = 5;</code>
   * @return The ipv4.
   */
  @java.lang.Override
  public int getIpv4() {
    return ipv4_;
  }

  public static final int PACKET_SIZE_FIELD_NUMBER = 7;
  private int packetSize_;
  /**
   * <code>.com.way.proto.switchml.PacketSize packet_size = 7;</code>
   * @return The enum numeric value on the wire for packetSize.
   */
  @java.lang.Override public int getPacketSizeValue() {
    return packetSize_;
  }
  /**
   * <code>.com.way.proto.switchml.PacketSize packet_size = 7;</code>
   * @return The packetSize.
   */
  @java.lang.Override public com.way.proto.switchml.PacketSize getPacketSize() {
    @SuppressWarnings("deprecation")
    com.way.proto.switchml.PacketSize result = com.way.proto.switchml.PacketSize.valueOf(packetSize_);
    return result == null ? com.way.proto.switchml.PacketSize.UNRECOGNIZED : result;
  }

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
    if (sessionId_ != 0L) {
      output.writeUInt64(1, sessionId_);
    }
    if (rank_ != 0) {
      output.writeUInt32(2, rank_);
    }
    if (numWorkers_ != 0) {
      output.writeUInt32(3, numWorkers_);
    }
    if (mac_ != 0L) {
      output.writeUInt64(4, mac_);
    }
    if (ipv4_ != 0) {
      output.writeUInt32(5, ipv4_);
    }
    if (packetSize_ != com.way.proto.switchml.PacketSize.MTU_128.getNumber()) {
      output.writeEnum(7, packetSize_);
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
    if (rank_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, rank_);
    }
    if (numWorkers_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, numWorkers_);
    }
    if (mac_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, mac_);
    }
    if (ipv4_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, ipv4_);
    }
    if (packetSize_ != com.way.proto.switchml.PacketSize.MTU_128.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, packetSize_);
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
    if (!(obj instanceof com.way.proto.switchml.UdpSessionRequest)) {
      return super.equals(obj);
    }
    com.way.proto.switchml.UdpSessionRequest other = (com.way.proto.switchml.UdpSessionRequest) obj;

    if (getSessionId()
        != other.getSessionId()) return false;
    if (getRank()
        != other.getRank()) return false;
    if (getNumWorkers()
        != other.getNumWorkers()) return false;
    if (getMac()
        != other.getMac()) return false;
    if (getIpv4()
        != other.getIpv4()) return false;
    if (packetSize_ != other.packetSize_) return false;
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
    hash = (37 * hash) + RANK_FIELD_NUMBER;
    hash = (53 * hash) + getRank();
    hash = (37 * hash) + NUM_WORKERS_FIELD_NUMBER;
    hash = (53 * hash) + getNumWorkers();
    hash = (37 * hash) + MAC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMac());
    hash = (37 * hash) + IPV4_FIELD_NUMBER;
    hash = (53 * hash) + getIpv4();
    hash = (37 * hash) + PACKET_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + packetSize_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.way.proto.switchml.UdpSessionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.way.proto.switchml.UdpSessionRequest parseFrom(
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
  public static Builder newBuilder(com.way.proto.switchml.UdpSessionRequest prototype) {
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
   * Protobuf type {@code com.way.proto.switchml.UdpSessionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.way.proto.switchml.UdpSessionRequest)
      com.way.proto.switchml.UdpSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.way.proto.switchml.switchmlProto.internal_static_com_way_proto_switchml_UdpSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.way.proto.switchml.switchmlProto.internal_static_com_way_proto_switchml_UdpSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.way.proto.switchml.UdpSessionRequest.class, com.way.proto.switchml.UdpSessionRequest.Builder.class);
    }

    // Construct using com.way.proto.switchml.UdpSessionRequest.newBuilder()
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

      rank_ = 0;

      numWorkers_ = 0;

      mac_ = 0L;

      ipv4_ = 0;

      packetSize_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.way.proto.switchml.switchmlProto.internal_static_com_way_proto_switchml_UdpSessionRequest_descriptor;
    }

    @java.lang.Override
    public com.way.proto.switchml.UdpSessionRequest getDefaultInstanceForType() {
      return com.way.proto.switchml.UdpSessionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.way.proto.switchml.UdpSessionRequest build() {
      com.way.proto.switchml.UdpSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.way.proto.switchml.UdpSessionRequest buildPartial() {
      com.way.proto.switchml.UdpSessionRequest result = new com.way.proto.switchml.UdpSessionRequest(this);
      result.sessionId_ = sessionId_;
      result.rank_ = rank_;
      result.numWorkers_ = numWorkers_;
      result.mac_ = mac_;
      result.ipv4_ = ipv4_;
      result.packetSize_ = packetSize_;
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
      if (other instanceof com.way.proto.switchml.UdpSessionRequest) {
        return mergeFrom((com.way.proto.switchml.UdpSessionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.way.proto.switchml.UdpSessionRequest other) {
      if (other == com.way.proto.switchml.UdpSessionRequest.getDefaultInstance()) return this;
      if (other.getSessionId() != 0L) {
        setSessionId(other.getSessionId());
      }
      if (other.getRank() != 0) {
        setRank(other.getRank());
      }
      if (other.getNumWorkers() != 0) {
        setNumWorkers(other.getNumWorkers());
      }
      if (other.getMac() != 0L) {
        setMac(other.getMac());
      }
      if (other.getIpv4() != 0) {
        setIpv4(other.getIpv4());
      }
      if (other.packetSize_ != 0) {
        setPacketSizeValue(other.getPacketSizeValue());
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
      com.way.proto.switchml.UdpSessionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.way.proto.switchml.UdpSessionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private int rank_ ;
    /**
     * <code>uint32 rank = 2;</code>
     * @return The rank.
     */
    @java.lang.Override
    public int getRank() {
      return rank_;
    }
    /**
     * <code>uint32 rank = 2;</code>
     * @param value The rank to set.
     * @return This builder for chaining.
     */
    public Builder setRank(int value) {
      
      rank_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 rank = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRank() {
      
      rank_ = 0;
      onChanged();
      return this;
    }

    private int numWorkers_ ;
    /**
     * <code>uint32 num_workers = 3;</code>
     * @return The numWorkers.
     */
    @java.lang.Override
    public int getNumWorkers() {
      return numWorkers_;
    }
    /**
     * <code>uint32 num_workers = 3;</code>
     * @param value The numWorkers to set.
     * @return This builder for chaining.
     */
    public Builder setNumWorkers(int value) {
      
      numWorkers_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 num_workers = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumWorkers() {
      
      numWorkers_ = 0;
      onChanged();
      return this;
    }

    private long mac_ ;
    /**
     * <code>uint64 mac = 4;</code>
     * @return The mac.
     */
    @java.lang.Override
    public long getMac() {
      return mac_;
    }
    /**
     * <code>uint64 mac = 4;</code>
     * @param value The mac to set.
     * @return This builder for chaining.
     */
    public Builder setMac(long value) {
      
      mac_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 mac = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMac() {
      
      mac_ = 0L;
      onChanged();
      return this;
    }

    private int ipv4_ ;
    /**
     * <code>uint32 ipv4 = 5;</code>
     * @return The ipv4.
     */
    @java.lang.Override
    public int getIpv4() {
      return ipv4_;
    }
    /**
     * <code>uint32 ipv4 = 5;</code>
     * @param value The ipv4 to set.
     * @return This builder for chaining.
     */
    public Builder setIpv4(int value) {
      
      ipv4_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 ipv4 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpv4() {
      
      ipv4_ = 0;
      onChanged();
      return this;
    }

    private int packetSize_ = 0;
    /**
     * <code>.com.way.proto.switchml.PacketSize packet_size = 7;</code>
     * @return The enum numeric value on the wire for packetSize.
     */
    @java.lang.Override public int getPacketSizeValue() {
      return packetSize_;
    }
    /**
     * <code>.com.way.proto.switchml.PacketSize packet_size = 7;</code>
     * @param value The enum numeric value on the wire for packetSize to set.
     * @return This builder for chaining.
     */
    public Builder setPacketSizeValue(int value) {
      
      packetSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.way.proto.switchml.PacketSize packet_size = 7;</code>
     * @return The packetSize.
     */
    @java.lang.Override
    public com.way.proto.switchml.PacketSize getPacketSize() {
      @SuppressWarnings("deprecation")
      com.way.proto.switchml.PacketSize result = com.way.proto.switchml.PacketSize.valueOf(packetSize_);
      return result == null ? com.way.proto.switchml.PacketSize.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.way.proto.switchml.PacketSize packet_size = 7;</code>
     * @param value The packetSize to set.
     * @return This builder for chaining.
     */
    public Builder setPacketSize(com.way.proto.switchml.PacketSize value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      packetSize_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.way.proto.switchml.PacketSize packet_size = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearPacketSize() {
      
      packetSize_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.way.proto.switchml.UdpSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:com.way.proto.switchml.UdpSessionRequest)
  private static final com.way.proto.switchml.UdpSessionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.way.proto.switchml.UdpSessionRequest();
  }

  public static com.way.proto.switchml.UdpSessionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UdpSessionRequest>
      PARSER = new com.google.protobuf.AbstractParser<UdpSessionRequest>() {
    @java.lang.Override
    public UdpSessionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UdpSessionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UdpSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UdpSessionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.way.proto.switchml.UdpSessionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
