// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Properties of Dictionary objects.
 * </pre>
 *
 * Protobuf type {@code sync_pb.DictionarySpecifics}
 */
public  final class DictionarySpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        DictionarySpecifics, DictionarySpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.DictionarySpecifics)
    DictionarySpecificsOrBuilder {
  private DictionarySpecifics() {
    word_ = "";
  }
  private int bitField0_;
  public static final int WORD_FIELD_NUMBER = 1;
  private java.lang.String word_;
  /**
   * <pre>
   * A spelling which when typed is treated as a correctly spelled word.
   * </pre>
   *
   * <code>optional string word = 1;</code>
   */
  public boolean hasWord() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * A spelling which when typed is treated as a correctly spelled word.
   * </pre>
   *
   * <code>optional string word = 1;</code>
   */
  public java.lang.String getWord() {
    return word_;
  }
  /**
   * <pre>
   * A spelling which when typed is treated as a correctly spelled word.
   * </pre>
   *
   * <code>optional string word = 1;</code>
   */
  public com.google.protobuf.ByteString
      getWordBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(word_);
  }
  /**
   * <pre>
   * A spelling which when typed is treated as a correctly spelled word.
   * </pre>
   *
   * <code>optional string word = 1;</code>
   */
  private void setWord(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    word_ = value;
  }
  /**
   * <pre>
   * A spelling which when typed is treated as a correctly spelled word.
   * </pre>
   *
   * <code>optional string word = 1;</code>
   */
  private void clearWord() {
    bitField0_ = (bitField0_ & ~0x00000001);
    word_ = getDefaultInstance().getWord();
  }
  /**
   * <pre>
   * A spelling which when typed is treated as a correctly spelled word.
   * </pre>
   *
   * <code>optional string word = 1;</code>
   */
  private void setWordBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    word_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getWord());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getWord());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.DictionarySpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.DictionarySpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DictionarySpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.DictionarySpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DictionarySpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DictionarySpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DictionarySpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DictionarySpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DictionarySpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DictionarySpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.DictionarySpecifics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Properties of Dictionary objects.
   * </pre>
   *
   * Protobuf type {@code sync_pb.DictionarySpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.DictionarySpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.DictionarySpecifics)
      org.chromium.components.sync.protocol.DictionarySpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.DictionarySpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A spelling which when typed is treated as a correctly spelled word.
     * </pre>
     *
     * <code>optional string word = 1;</code>
     */
    public boolean hasWord() {
      return instance.hasWord();
    }
    /**
     * <pre>
     * A spelling which when typed is treated as a correctly spelled word.
     * </pre>
     *
     * <code>optional string word = 1;</code>
     */
    public java.lang.String getWord() {
      return instance.getWord();
    }
    /**
     * <pre>
     * A spelling which when typed is treated as a correctly spelled word.
     * </pre>
     *
     * <code>optional string word = 1;</code>
     */
    public com.google.protobuf.ByteString
        getWordBytes() {
      return instance.getWordBytes();
    }
    /**
     * <pre>
     * A spelling which when typed is treated as a correctly spelled word.
     * </pre>
     *
     * <code>optional string word = 1;</code>
     */
    public Builder setWord(
        java.lang.String value) {
      copyOnWrite();
      instance.setWord(value);
      return this;
    }
    /**
     * <pre>
     * A spelling which when typed is treated as a correctly spelled word.
     * </pre>
     *
     * <code>optional string word = 1;</code>
     */
    public Builder clearWord() {
      copyOnWrite();
      instance.clearWord();
      return this;
    }
    /**
     * <pre>
     * A spelling which when typed is treated as a correctly spelled word.
     * </pre>
     *
     * <code>optional string word = 1;</code>
     */
    public Builder setWordBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setWordBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.DictionarySpecifics)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.DictionarySpecifics();
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
        org.chromium.components.sync.protocol.DictionarySpecifics other = (org.chromium.components.sync.protocol.DictionarySpecifics) arg1;
        word_ = visitor.visitString(
            hasWord(), word_,
            other.hasWord(), other.word_);
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
                String s = input.readString();
                bitField0_ |= 0x00000001;
                word_ = s;
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.DictionarySpecifics.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.DictionarySpecifics)
  private static final org.chromium.components.sync.protocol.DictionarySpecifics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DictionarySpecifics();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.DictionarySpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DictionarySpecifics> PARSER;

  public static com.google.protobuf.Parser<DictionarySpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
