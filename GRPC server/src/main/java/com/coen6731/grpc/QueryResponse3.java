// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services3.proto

package com.coen6731.grpc;

/**
 * <pre>
 * Define the QueryResponse message with specified fields
 * </pre>
 *
 * Protobuf type {@code QueryResponse3}
 */
public  final class QueryResponse3 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:QueryResponse3)
    QueryResponse3OrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryResponse3.newBuilder() to construct.
  private QueryResponse3(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryResponse3() {
    year_ = "";
    type_ = "";
    length_ = "";
    economicalStates_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryResponse3(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            year_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            length_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            economicalStates_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.coen6731.grpc.Services3.internal_static_QueryResponse3_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coen6731.grpc.Services3.internal_static_QueryResponse3_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.coen6731.grpc.QueryResponse3.class, com.coen6731.grpc.QueryResponse3.Builder.class);
  }

  public static final int YEAR_FIELD_NUMBER = 1;
  private volatile java.lang.Object year_;
  /**
   * <code>string year = 1;</code>
   */
  public java.lang.String getYear() {
    java.lang.Object ref = year_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      year_ = s;
      return s;
    }
  }
  /**
   * <code>string year = 1;</code>
   */
  public com.google.protobuf.ByteString
      getYearBytes() {
    java.lang.Object ref = year_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      year_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 2;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LENGTH_FIELD_NUMBER = 3;
  private volatile java.lang.Object length_;
  /**
   * <code>string length = 3;</code>
   */
  public java.lang.String getLength() {
    java.lang.Object ref = length_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      length_ = s;
      return s;
    }
  }
  /**
   * <code>string length = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLengthBytes() {
    java.lang.Object ref = length_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      length_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ECONOMICAL_STATES_FIELD_NUMBER = 4;
  private volatile java.lang.Object economicalStates_;
  /**
   * <code>string economical_states = 4;</code>
   */
  public java.lang.String getEconomicalStates() {
    java.lang.Object ref = economicalStates_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      economicalStates_ = s;
      return s;
    }
  }
  /**
   * <code>string economical_states = 4;</code>
   */
  public com.google.protobuf.ByteString
      getEconomicalStatesBytes() {
    java.lang.Object ref = economicalStates_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      economicalStates_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getYearBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, year_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (!getLengthBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, length_);
    }
    if (!getEconomicalStatesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, economicalStates_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getYearBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, year_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (!getLengthBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, length_);
    }
    if (!getEconomicalStatesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, economicalStates_);
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
    if (!(obj instanceof com.coen6731.grpc.QueryResponse3)) {
      return super.equals(obj);
    }
    com.coen6731.grpc.QueryResponse3 other = (com.coen6731.grpc.QueryResponse3) obj;

    boolean result = true;
    result = result && getYear()
        .equals(other.getYear());
    result = result && getType()
        .equals(other.getType());
    result = result && getLength()
        .equals(other.getLength());
    result = result && getEconomicalStates()
        .equals(other.getEconomicalStates());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getYear().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getLength().hashCode();
    hash = (37 * hash) + ECONOMICAL_STATES_FIELD_NUMBER;
    hash = (53 * hash) + getEconomicalStates().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.coen6731.grpc.QueryResponse3 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coen6731.grpc.QueryResponse3 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coen6731.grpc.QueryResponse3 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coen6731.grpc.QueryResponse3 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coen6731.grpc.QueryResponse3 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coen6731.grpc.QueryResponse3 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coen6731.grpc.QueryResponse3 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coen6731.grpc.QueryResponse3 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coen6731.grpc.QueryResponse3 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.coen6731.grpc.QueryResponse3 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coen6731.grpc.QueryResponse3 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coen6731.grpc.QueryResponse3 parseFrom(
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
  public static Builder newBuilder(com.coen6731.grpc.QueryResponse3 prototype) {
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
   * <pre>
   * Define the QueryResponse message with specified fields
   * </pre>
   *
   * Protobuf type {@code QueryResponse3}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:QueryResponse3)
      com.coen6731.grpc.QueryResponse3OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coen6731.grpc.Services3.internal_static_QueryResponse3_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coen6731.grpc.Services3.internal_static_QueryResponse3_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.coen6731.grpc.QueryResponse3.class, com.coen6731.grpc.QueryResponse3.Builder.class);
    }

    // Construct using com.coen6731.grpc.QueryResponse3.newBuilder()
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
      year_ = "";

      type_ = "";

      length_ = "";

      economicalStates_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coen6731.grpc.Services3.internal_static_QueryResponse3_descriptor;
    }

    @java.lang.Override
    public com.coen6731.grpc.QueryResponse3 getDefaultInstanceForType() {
      return com.coen6731.grpc.QueryResponse3.getDefaultInstance();
    }

    @java.lang.Override
    public com.coen6731.grpc.QueryResponse3 build() {
      com.coen6731.grpc.QueryResponse3 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.coen6731.grpc.QueryResponse3 buildPartial() {
      com.coen6731.grpc.QueryResponse3 result = new com.coen6731.grpc.QueryResponse3(this);
      result.year_ = year_;
      result.type_ = type_;
      result.length_ = length_;
      result.economicalStates_ = economicalStates_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.coen6731.grpc.QueryResponse3) {
        return mergeFrom((com.coen6731.grpc.QueryResponse3)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.coen6731.grpc.QueryResponse3 other) {
      if (other == com.coen6731.grpc.QueryResponse3.getDefaultInstance()) return this;
      if (!other.getYear().isEmpty()) {
        year_ = other.year_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getLength().isEmpty()) {
        length_ = other.length_;
        onChanged();
      }
      if (!other.getEconomicalStates().isEmpty()) {
        economicalStates_ = other.economicalStates_;
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
      com.coen6731.grpc.QueryResponse3 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.coen6731.grpc.QueryResponse3) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object year_ = "";
    /**
     * <code>string year = 1;</code>
     */
    public java.lang.String getYear() {
      java.lang.Object ref = year_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        year_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string year = 1;</code>
     */
    public com.google.protobuf.ByteString
        getYearBytes() {
      java.lang.Object ref = year_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        year_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string year = 1;</code>
     */
    public Builder setYear(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      year_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string year = 1;</code>
     */
    public Builder clearYear() {
      
      year_ = getDefaultInstance().getYear();
      onChanged();
      return this;
    }
    /**
     * <code>string year = 1;</code>
     */
    public Builder setYearBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      year_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 2;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object length_ = "";
    /**
     * <code>string length = 3;</code>
     */
    public java.lang.String getLength() {
      java.lang.Object ref = length_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        length_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string length = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLengthBytes() {
      java.lang.Object ref = length_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        length_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string length = 3;</code>
     */
    public Builder setLength(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      length_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string length = 3;</code>
     */
    public Builder clearLength() {
      
      length_ = getDefaultInstance().getLength();
      onChanged();
      return this;
    }
    /**
     * <code>string length = 3;</code>
     */
    public Builder setLengthBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      length_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object economicalStates_ = "";
    /**
     * <code>string economical_states = 4;</code>
     */
    public java.lang.String getEconomicalStates() {
      java.lang.Object ref = economicalStates_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        economicalStates_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string economical_states = 4;</code>
     */
    public com.google.protobuf.ByteString
        getEconomicalStatesBytes() {
      java.lang.Object ref = economicalStates_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        economicalStates_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string economical_states = 4;</code>
     */
    public Builder setEconomicalStates(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      economicalStates_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string economical_states = 4;</code>
     */
    public Builder clearEconomicalStates() {
      
      economicalStates_ = getDefaultInstance().getEconomicalStates();
      onChanged();
      return this;
    }
    /**
     * <code>string economical_states = 4;</code>
     */
    public Builder setEconomicalStatesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      economicalStates_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:QueryResponse3)
  }

  // @@protoc_insertion_point(class_scope:QueryResponse3)
  private static final com.coen6731.grpc.QueryResponse3 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.coen6731.grpc.QueryResponse3();
  }

  public static com.coen6731.grpc.QueryResponse3 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryResponse3>
      PARSER = new com.google.protobuf.AbstractParser<QueryResponse3>() {
    @java.lang.Override
    public QueryResponse3 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryResponse3(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryResponse3> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryResponse3> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.coen6731.grpc.QueryResponse3 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

