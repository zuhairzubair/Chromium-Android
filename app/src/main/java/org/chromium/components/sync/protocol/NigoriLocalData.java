// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nigori_local_data.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Sync proto to store Nigori data in storage. Proto should be encrypted with
 * os_crypt before storing it somewhere, because it contains sensitive data (
 * nigori_model.cryptographer_data.key_bag and nigori_model.keystore_keys).
 * </pre>
 *
 * Protobuf type {@code sync_pb.NigoriLocalData}
 */
public  final class NigoriLocalData extends
    com.google.protobuf.GeneratedMessageLite<
        NigoriLocalData, NigoriLocalData.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.NigoriLocalData)
    NigoriLocalDataOrBuilder {
  private NigoriLocalData() {
  }
  private int bitField0_;
  public static final int MODEL_TYPE_STATE_FIELD_NUMBER = 1;
  private org.chromium.components.sync.protocol.ModelTypeState modelTypeState_;
  /**
   * <pre>
   * Global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  public boolean hasModelTypeState() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * Global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  public org.chromium.components.sync.protocol.ModelTypeState getModelTypeState() {
    return modelTypeState_ == null ? org.chromium.components.sync.protocol.ModelTypeState.getDefaultInstance() : modelTypeState_;
  }
  /**
   * <pre>
   * Global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  private void setModelTypeState(org.chromium.components.sync.protocol.ModelTypeState value) {
    if (value == null) {
      throw new NullPointerException();
    }
    modelTypeState_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * Global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  private void setModelTypeState(
      org.chromium.components.sync.protocol.ModelTypeState.Builder builderForValue) {
    modelTypeState_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  private void mergeModelTypeState(org.chromium.components.sync.protocol.ModelTypeState value) {
    if (modelTypeState_ != null &&
        modelTypeState_ != org.chromium.components.sync.protocol.ModelTypeState.getDefaultInstance()) {
      modelTypeState_ =
        org.chromium.components.sync.protocol.ModelTypeState.newBuilder(modelTypeState_).mergeFrom(value).buildPartial();
    } else {
      modelTypeState_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  private void clearModelTypeState() {  modelTypeState_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int ENTITY_METADATA_FIELD_NUMBER = 2;
  private org.chromium.components.sync.protocol.EntityMetadata entityMetadata_;
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  public boolean hasEntityMetadata() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  public org.chromium.components.sync.protocol.EntityMetadata getEntityMetadata() {
    return entityMetadata_ == null ? org.chromium.components.sync.protocol.EntityMetadata.getDefaultInstance() : entityMetadata_;
  }
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  private void setEntityMetadata(org.chromium.components.sync.protocol.EntityMetadata value) {
    if (value == null) {
      throw new NullPointerException();
    }
    entityMetadata_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  private void setEntityMetadata(
      org.chromium.components.sync.protocol.EntityMetadata.Builder builderForValue) {
    entityMetadata_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  private void mergeEntityMetadata(org.chromium.components.sync.protocol.EntityMetadata value) {
    if (entityMetadata_ != null &&
        entityMetadata_ != org.chromium.components.sync.protocol.EntityMetadata.getDefaultInstance()) {
      entityMetadata_ =
        org.chromium.components.sync.protocol.EntityMetadata.newBuilder(entityMetadata_).mergeFrom(value).buildPartial();
    } else {
      entityMetadata_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  private void clearEntityMetadata() {  entityMetadata_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int NIGORI_MODEL_FIELD_NUMBER = 3;
  private org.chromium.components.sync.protocol.NigoriModel nigoriModel_;
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  public boolean hasNigoriModel() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  public org.chromium.components.sync.protocol.NigoriModel getNigoriModel() {
    return nigoriModel_ == null ? org.chromium.components.sync.protocol.NigoriModel.getDefaultInstance() : nigoriModel_;
  }
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  private void setNigoriModel(org.chromium.components.sync.protocol.NigoriModel value) {
    if (value == null) {
      throw new NullPointerException();
    }
    nigoriModel_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  private void setNigoriModel(
      org.chromium.components.sync.protocol.NigoriModel.Builder builderForValue) {
    nigoriModel_ = builderForValue.build();
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  private void mergeNigoriModel(org.chromium.components.sync.protocol.NigoriModel value) {
    if (nigoriModel_ != null &&
        nigoriModel_ != org.chromium.components.sync.protocol.NigoriModel.getDefaultInstance()) {
      nigoriModel_ =
        org.chromium.components.sync.protocol.NigoriModel.newBuilder(nigoriModel_).mergeFrom(value).buildPartial();
    } else {
      nigoriModel_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  private void clearNigoriModel() {  nigoriModel_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getModelTypeState());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getEntityMetadata());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, getNigoriModel());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getModelTypeState());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEntityMetadata());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getNigoriModel());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.NigoriLocalData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Sync proto to store Nigori data in storage. Proto should be encrypted with
   * os_crypt before storing it somewhere, because it contains sensitive data (
   * nigori_model.cryptographer_data.key_bag and nigori_model.keystore_keys).
   * </pre>
   *
   * Protobuf type {@code sync_pb.NigoriLocalData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.NigoriLocalData, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.NigoriLocalData)
      org.chromium.components.sync.protocol.NigoriLocalDataOrBuilder {
    // Construct using org.chromium.components.sync.protocol.NigoriLocalData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    public boolean hasModelTypeState() {
      return instance.hasModelTypeState();
    }
    /**
     * <pre>
     * Global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    public org.chromium.components.sync.protocol.ModelTypeState getModelTypeState() {
      return instance.getModelTypeState();
    }
    /**
     * <pre>
     * Global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    public Builder setModelTypeState(org.chromium.components.sync.protocol.ModelTypeState value) {
      copyOnWrite();
      instance.setModelTypeState(value);
      return this;
      }
    /**
     * <pre>
     * Global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    public Builder setModelTypeState(
        org.chromium.components.sync.protocol.ModelTypeState.Builder builderForValue) {
      copyOnWrite();
      instance.setModelTypeState(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    public Builder mergeModelTypeState(org.chromium.components.sync.protocol.ModelTypeState value) {
      copyOnWrite();
      instance.mergeModelTypeState(value);
      return this;
    }
    /**
     * <pre>
     * Global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    public Builder clearModelTypeState() {  copyOnWrite();
      instance.clearModelTypeState();
      return this;
    }

    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    public boolean hasEntityMetadata() {
      return instance.hasEntityMetadata();
    }
    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    public org.chromium.components.sync.protocol.EntityMetadata getEntityMetadata() {
      return instance.getEntityMetadata();
    }
    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    public Builder setEntityMetadata(org.chromium.components.sync.protocol.EntityMetadata value) {
      copyOnWrite();
      instance.setEntityMetadata(value);
      return this;
      }
    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    public Builder setEntityMetadata(
        org.chromium.components.sync.protocol.EntityMetadata.Builder builderForValue) {
      copyOnWrite();
      instance.setEntityMetadata(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    public Builder mergeEntityMetadata(org.chromium.components.sync.protocol.EntityMetadata value) {
      copyOnWrite();
      instance.mergeEntityMetadata(value);
      return this;
    }
    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    public Builder clearEntityMetadata() {  copyOnWrite();
      instance.clearEntityMetadata();
      return this;
    }

    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    public boolean hasNigoriModel() {
      return instance.hasNigoriModel();
    }
    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    public org.chromium.components.sync.protocol.NigoriModel getNigoriModel() {
      return instance.getNigoriModel();
    }
    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    public Builder setNigoriModel(org.chromium.components.sync.protocol.NigoriModel value) {
      copyOnWrite();
      instance.setNigoriModel(value);
      return this;
      }
    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    public Builder setNigoriModel(
        org.chromium.components.sync.protocol.NigoriModel.Builder builderForValue) {
      copyOnWrite();
      instance.setNigoriModel(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    public Builder mergeNigoriModel(org.chromium.components.sync.protocol.NigoriModel value) {
      copyOnWrite();
      instance.mergeNigoriModel(value);
      return this;
    }
    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    public Builder clearNigoriModel() {  copyOnWrite();
      instance.clearNigoriModel();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.NigoriLocalData)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.NigoriLocalData();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.components.sync.protocol.NigoriLocalData other = (org.chromium.components.sync.protocol.NigoriLocalData) arg1;
        modelTypeState_ = visitor.visitMessage(modelTypeState_, other.modelTypeState_);
        entityMetadata_ = visitor.visitMessage(entityMetadata_, other.entityMetadata_);
        nigoriModel_ = visitor.visitMessage(nigoriModel_, other.nigoriModel_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                org.chromium.components.sync.protocol.ModelTypeState.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = modelTypeState_.toBuilder();
                }
                modelTypeState_ = input.readMessage(org.chromium.components.sync.protocol.ModelTypeState.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(modelTypeState_);
                  modelTypeState_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                org.chromium.components.sync.protocol.EntityMetadata.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = entityMetadata_.toBuilder();
                }
                entityMetadata_ = input.readMessage(org.chromium.components.sync.protocol.EntityMetadata.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(entityMetadata_);
                  entityMetadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 26: {
                org.chromium.components.sync.protocol.NigoriModel.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = nigoriModel_.toBuilder();
                }
                nigoriModel_ = input.readMessage(org.chromium.components.sync.protocol.NigoriModel.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(nigoriModel_);
                  nigoriModel_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.NigoriLocalData.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:sync_pb.NigoriLocalData)
  private static final org.chromium.components.sync.protocol.NigoriLocalData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new NigoriLocalData();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.NigoriLocalData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<NigoriLocalData> PARSER;

  public static com.google.protobuf.Parser<NigoriLocalData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

