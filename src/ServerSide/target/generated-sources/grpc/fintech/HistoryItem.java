// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintech.proto

package fintech;

/**
 * Protobuf type {@code fintech.HistoryItem}
 */
public  final class HistoryItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:fintech.HistoryItem)
    HistoryItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistoryItem.newBuilder() to construct.
  private HistoryItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistoryItem() {
    partnerId_ = 0L;
    transferType_ = 0;
    amount_ = 0L;
    message_ = "";
    transferTime_ = 0L;
    username_ = "";
    fullName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HistoryItem(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            partnerId_ = input.readInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            transferType_ = rawValue;
            break;
          }
          case 24: {

            amount_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 40: {

            transferTime_ = input.readInt64();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            fullName_ = s;
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
    return fintech.FinTechProto.internal_static_fintech_HistoryItem_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return fintech.FinTechProto.internal_static_fintech_HistoryItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            fintech.HistoryItem.class, fintech.HistoryItem.Builder.class);
  }

  /**
   * Protobuf enum {@code fintech.HistoryItem.TransferType}
   */
  public enum TransferType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SEND = 0;</code>
     */
    SEND(0),
    /**
     * <code>RECEIVE = 1;</code>
     */
    RECEIVE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SEND = 0;</code>
     */
    public static final int SEND_VALUE = 0;
    /**
     * <code>RECEIVE = 1;</code>
     */
    public static final int RECEIVE_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TransferType valueOf(int value) {
      return forNumber(value);
    }

    public static TransferType forNumber(int value) {
      switch (value) {
        case 0: return SEND;
        case 1: return RECEIVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TransferType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TransferType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TransferType>() {
            public TransferType findValueByNumber(int number) {
              return TransferType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return fintech.HistoryItem.getDescriptor().getEnumTypes().get(0);
    }

    private static final TransferType[] VALUES = values();

    public static TransferType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TransferType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:fintech.HistoryItem.TransferType)
  }

  public static final int PARTNER_ID_FIELD_NUMBER = 1;
  private long partnerId_;
  /**
   * <pre>
   * Information of a user transfer money with it's partner
   * This history has an enum TransferType
   * If TransferType = SEND =&gt; user send money to partner
   * If TransferType = RECEIVE =&gt; user receive money from partner
   * </pre>
   *
   * <code>int64 partner_id = 1;</code>
   */
  public long getPartnerId() {
    return partnerId_;
  }

  public static final int TRANSFER_TYPE_FIELD_NUMBER = 2;
  private int transferType_;
  /**
   * <code>.fintech.HistoryItem.TransferType transfer_type = 2;</code>
   */
  public int getTransferTypeValue() {
    return transferType_;
  }
  /**
   * <code>.fintech.HistoryItem.TransferType transfer_type = 2;</code>
   */
  public fintech.HistoryItem.TransferType getTransferType() {
    fintech.HistoryItem.TransferType result = fintech.HistoryItem.TransferType.valueOf(transferType_);
    return result == null ? fintech.HistoryItem.TransferType.UNRECOGNIZED : result;
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private long amount_;
  /**
   * <code>int64 amount = 3;</code>
   */
  public long getAmount() {
    return amount_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * The message goes with a transaction
   * </pre>
   *
   * <code>string message = 4;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The message goes with a transaction
   * </pre>
   *
   * <code>string message = 4;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSFER_TIME_FIELD_NUMBER = 5;
  private long transferTime_;
  /**
   * <pre>
   * The time when the transfer executed
   * </pre>
   *
   * <code>int64 transfer_time = 5;</code>
   */
  public long getTransferTime() {
    return transferTime_;
  }

  public static final int USERNAME_FIELD_NUMBER = 6;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 6;</code>
   */
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 6;</code>
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FULL_NAME_FIELD_NUMBER = 7;
  private volatile java.lang.Object fullName_;
  /**
   * <code>string full_name = 7;</code>
   */
  public java.lang.String getFullName() {
    java.lang.Object ref = fullName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fullName_ = s;
      return s;
    }
  }
  /**
   * <code>string full_name = 7;</code>
   */
  public com.google.protobuf.ByteString
      getFullNameBytes() {
    java.lang.Object ref = fullName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fullName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (partnerId_ != 0L) {
      output.writeInt64(1, partnerId_);
    }
    if (transferType_ != fintech.HistoryItem.TransferType.SEND.getNumber()) {
      output.writeEnum(2, transferType_);
    }
    if (amount_ != 0L) {
      output.writeInt64(3, amount_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, message_);
    }
    if (transferTime_ != 0L) {
      output.writeInt64(5, transferTime_);
    }
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, username_);
    }
    if (!getFullNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, fullName_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partnerId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, partnerId_);
    }
    if (transferType_ != fintech.HistoryItem.TransferType.SEND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, transferType_);
    }
    if (amount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, amount_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, message_);
    }
    if (transferTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, transferTime_);
    }
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, username_);
    }
    if (!getFullNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, fullName_);
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
    if (!(obj instanceof fintech.HistoryItem)) {
      return super.equals(obj);
    }
    fintech.HistoryItem other = (fintech.HistoryItem) obj;

    boolean result = true;
    result = result && (getPartnerId()
        == other.getPartnerId());
    result = result && transferType_ == other.transferType_;
    result = result && (getAmount()
        == other.getAmount());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && (getTransferTime()
        == other.getTransferTime());
    result = result && getUsername()
        .equals(other.getUsername());
    result = result && getFullName()
        .equals(other.getFullName());
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
    hash = (37 * hash) + PARTNER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPartnerId());
    hash = (37 * hash) + TRANSFER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + transferType_;
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAmount());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + TRANSFER_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTransferTime());
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + FULL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFullName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static fintech.HistoryItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fintech.HistoryItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fintech.HistoryItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fintech.HistoryItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fintech.HistoryItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fintech.HistoryItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fintech.HistoryItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fintech.HistoryItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static fintech.HistoryItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static fintech.HistoryItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static fintech.HistoryItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fintech.HistoryItem parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(fintech.HistoryItem prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code fintech.HistoryItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:fintech.HistoryItem)
      fintech.HistoryItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return fintech.FinTechProto.internal_static_fintech_HistoryItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return fintech.FinTechProto.internal_static_fintech_HistoryItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              fintech.HistoryItem.class, fintech.HistoryItem.Builder.class);
    }

    // Construct using fintech.HistoryItem.newBuilder()
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
    public Builder clear() {
      super.clear();
      partnerId_ = 0L;

      transferType_ = 0;

      amount_ = 0L;

      message_ = "";

      transferTime_ = 0L;

      username_ = "";

      fullName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return fintech.FinTechProto.internal_static_fintech_HistoryItem_descriptor;
    }

    public fintech.HistoryItem getDefaultInstanceForType() {
      return fintech.HistoryItem.getDefaultInstance();
    }

    public fintech.HistoryItem build() {
      fintech.HistoryItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public fintech.HistoryItem buildPartial() {
      fintech.HistoryItem result = new fintech.HistoryItem(this);
      result.partnerId_ = partnerId_;
      result.transferType_ = transferType_;
      result.amount_ = amount_;
      result.message_ = message_;
      result.transferTime_ = transferTime_;
      result.username_ = username_;
      result.fullName_ = fullName_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof fintech.HistoryItem) {
        return mergeFrom((fintech.HistoryItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(fintech.HistoryItem other) {
      if (other == fintech.HistoryItem.getDefaultInstance()) return this;
      if (other.getPartnerId() != 0L) {
        setPartnerId(other.getPartnerId());
      }
      if (other.transferType_ != 0) {
        setTransferTypeValue(other.getTransferTypeValue());
      }
      if (other.getAmount() != 0L) {
        setAmount(other.getAmount());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getTransferTime() != 0L) {
        setTransferTime(other.getTransferTime());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getFullName().isEmpty()) {
        fullName_ = other.fullName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      fintech.HistoryItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (fintech.HistoryItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long partnerId_ ;
    /**
     * <pre>
     * Information of a user transfer money with it's partner
     * This history has an enum TransferType
     * If TransferType = SEND =&gt; user send money to partner
     * If TransferType = RECEIVE =&gt; user receive money from partner
     * </pre>
     *
     * <code>int64 partner_id = 1;</code>
     */
    public long getPartnerId() {
      return partnerId_;
    }
    /**
     * <pre>
     * Information of a user transfer money with it's partner
     * This history has an enum TransferType
     * If TransferType = SEND =&gt; user send money to partner
     * If TransferType = RECEIVE =&gt; user receive money from partner
     * </pre>
     *
     * <code>int64 partner_id = 1;</code>
     */
    public Builder setPartnerId(long value) {
      
      partnerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Information of a user transfer money with it's partner
     * This history has an enum TransferType
     * If TransferType = SEND =&gt; user send money to partner
     * If TransferType = RECEIVE =&gt; user receive money from partner
     * </pre>
     *
     * <code>int64 partner_id = 1;</code>
     */
    public Builder clearPartnerId() {
      
      partnerId_ = 0L;
      onChanged();
      return this;
    }

    private int transferType_ = 0;
    /**
     * <code>.fintech.HistoryItem.TransferType transfer_type = 2;</code>
     */
    public int getTransferTypeValue() {
      return transferType_;
    }
    /**
     * <code>.fintech.HistoryItem.TransferType transfer_type = 2;</code>
     */
    public Builder setTransferTypeValue(int value) {
      transferType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.fintech.HistoryItem.TransferType transfer_type = 2;</code>
     */
    public fintech.HistoryItem.TransferType getTransferType() {
      fintech.HistoryItem.TransferType result = fintech.HistoryItem.TransferType.valueOf(transferType_);
      return result == null ? fintech.HistoryItem.TransferType.UNRECOGNIZED : result;
    }
    /**
     * <code>.fintech.HistoryItem.TransferType transfer_type = 2;</code>
     */
    public Builder setTransferType(fintech.HistoryItem.TransferType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      transferType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.fintech.HistoryItem.TransferType transfer_type = 2;</code>
     */
    public Builder clearTransferType() {
      
      transferType_ = 0;
      onChanged();
      return this;
    }

    private long amount_ ;
    /**
     * <code>int64 amount = 3;</code>
     */
    public long getAmount() {
      return amount_;
    }
    /**
     * <code>int64 amount = 3;</code>
     */
    public Builder setAmount(long value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 amount = 3;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * The message goes with a transaction
     * </pre>
     *
     * <code>string message = 4;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The message goes with a transaction
     * </pre>
     *
     * <code>string message = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The message goes with a transaction
     * </pre>
     *
     * <code>string message = 4;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message goes with a transaction
     * </pre>
     *
     * <code>string message = 4;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message goes with a transaction
     * </pre>
     *
     * <code>string message = 4;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private long transferTime_ ;
    /**
     * <pre>
     * The time when the transfer executed
     * </pre>
     *
     * <code>int64 transfer_time = 5;</code>
     */
    public long getTransferTime() {
      return transferTime_;
    }
    /**
     * <pre>
     * The time when the transfer executed
     * </pre>
     *
     * <code>int64 transfer_time = 5;</code>
     */
    public Builder setTransferTime(long value) {
      
      transferTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time when the transfer executed
     * </pre>
     *
     * <code>int64 transfer_time = 5;</code>
     */
    public Builder clearTransferTime() {
      
      transferTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 6;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 6;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 6;</code>
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 6;</code>
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 6;</code>
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fullName_ = "";
    /**
     * <code>string full_name = 7;</code>
     */
    public java.lang.String getFullName() {
      java.lang.Object ref = fullName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string full_name = 7;</code>
     */
    public com.google.protobuf.ByteString
        getFullNameBytes() {
      java.lang.Object ref = fullName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string full_name = 7;</code>
     */
    public Builder setFullName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fullName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string full_name = 7;</code>
     */
    public Builder clearFullName() {
      
      fullName_ = getDefaultInstance().getFullName();
      onChanged();
      return this;
    }
    /**
     * <code>string full_name = 7;</code>
     */
    public Builder setFullNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fullName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:fintech.HistoryItem)
  }

  // @@protoc_insertion_point(class_scope:fintech.HistoryItem)
  private static final fintech.HistoryItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new fintech.HistoryItem();
  }

  public static fintech.HistoryItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistoryItem>
      PARSER = new com.google.protobuf.AbstractParser<HistoryItem>() {
    public HistoryItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new HistoryItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HistoryItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistoryItem> getParserForType() {
    return PARSER;
  }

  public fintech.HistoryItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

