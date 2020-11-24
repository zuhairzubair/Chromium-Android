// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/wire/response.proto

package org.chromium.components.feed.core.proto.wire;

public final class ResponseProto {
  private ResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ResponseOrBuilder extends 
      // @@protoc_insertion_point(interface_extends:components.feed.core.proto.wire.Response)
       com.google.protobuf.GeneratedMessageLite.
            ExtendableMessageOrBuilder<
                Response, Response.Builder> {

    /**
     * <code>optional .components.feed.core.proto.wire.Response.ResponseVersion response_version = 1;</code>
     */
    boolean hasResponseVersion();
    /**
     * <code>optional .components.feed.core.proto.wire.Response.ResponseVersion response_version = 1;</code>
     */
    org.chromium.components.feed.core.proto.wire.ResponseProto.Response.ResponseVersion getResponseVersion();
  }
  /**
   * <pre>
   * Top level response message.
   * </pre>
   *
   * Protobuf type {@code components.feed.core.proto.wire.Response}
   */
  public  static final class Response extends
      com.google.protobuf.GeneratedMessageLite.ExtendableMessage<
        Response, Response.Builder> implements
      // @@protoc_insertion_point(message_implements:components.feed.core.proto.wire.Response)
      ResponseOrBuilder {
    private Response() {
    }
    /**
     * <pre>
     * Supported versions of response messages are specified as extensions to
     * the top-level response message.  An enum is used to denote the expected
     * extensions for this response.
     * </pre>
     *
     * Protobuf enum {@code components.feed.core.proto.wire.Response.ResponseVersion}
     */
    public enum ResponseVersion
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>UNKNOWN_RESPONSE_VERSION = 0;</code>
       */
      UNKNOWN_RESPONSE_VERSION(0),
      /**
       * <code>FEED_RESPONSE = 1;</code>
       */
      FEED_RESPONSE(1),
      ;

      /**
       * <code>UNKNOWN_RESPONSE_VERSION = 0;</code>
       */
      public static final int UNKNOWN_RESPONSE_VERSION_VALUE = 0;
      /**
       * <code>FEED_RESPONSE = 1;</code>
       */
      public static final int FEED_RESPONSE_VALUE = 1;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ResponseVersion valueOf(int value) {
        return forNumber(value);
      }

      public static ResponseVersion forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN_RESPONSE_VERSION;
          case 1: return FEED_RESPONSE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ResponseVersion>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ResponseVersion> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ResponseVersion>() {
              public ResponseVersion findValueByNumber(int number) {
                return ResponseVersion.forNumber(number);
              }
            };

      private final int value;

      private ResponseVersion(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:components.feed.core.proto.wire.Response.ResponseVersion)
    }

    private int bitField0_;
    public static final int RESPONSE_VERSION_FIELD_NUMBER = 1;
    private int responseVersion_;
    /**
     * <code>optional .components.feed.core.proto.wire.Response.ResponseVersion response_version = 1;</code>
     */
    public boolean hasResponseVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .components.feed.core.proto.wire.Response.ResponseVersion response_version = 1;</code>
     */
    public org.chromium.components.feed.core.proto.wire.ResponseProto.Response.ResponseVersion getResponseVersion() {
      org.chromium.components.feed.core.proto.wire.ResponseProto.Response.ResponseVersion result = org.chromium.components.feed.core.proto.wire.ResponseProto.Response.ResponseVersion.forNumber(responseVersion_);
      return result == null ? org.chromium.components.feed.core.proto.wire.ResponseProto.Response.ResponseVersion.UNKNOWN_RESPONSE_VERSION : result;
    }
    /**
     * <code>optional .components.feed.core.proto.wire.Response.ResponseVersion response_version = 1;</code>
     */
    private void setResponseVersion(org.chromium.components.feed.core.proto.wire.ResponseProto.Response.ResponseVersion value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      responseVersion_ = value.getNumber();
    }
    /**
     * <code>optional .components.feed.core.proto.wire.Response.ResponseVersion response_version = 1;</code>
     */
    private void clearResponseVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      responseVersion_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageLite
        .ExtendableMessage<org.chromium.components.feed.core.proto.wire.ResponseProto.Response, org.chromium.components.feed.core.proto.wire.ResponseProto.Response.Builder>
          .ExtensionWriter extensionWriter =
            newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, responseVersion_);
      }
      extensionWriter.writeUntil(536870912, output);
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, responseVersion_);
      }
      size += extensionsSerializedSize();
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.wire.ResponseProto.Response prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     * Top level response message.
     * </pre>
     *
     * Protobuf type {@code components.feed.core.proto.wire.Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<
          org.chromium.components.feed.core.proto.wire.ResponseProto.Response, Builder> implements
        // @@protoc_insertion_point(builder_implements:components.feed.core.proto.wire.Response)
        org.chromium.components.feed.core.proto.wire.ResponseProto.ResponseOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.wire.ResponseProto.Response.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .components.feed.core.proto.wire.Response.ResponseVersion response_version = 1;</code>
       */
      public boolean hasResponseVersion() {
        return instance.hasResponseVersion();
      }
      /**
       * <code>optional .components.feed.core.proto.wire.Response.ResponseVersion response_version = 1;</code>
       */
      public org.chromium.components.feed.core.proto.wire.ResponseProto.Response.ResponseVersion getResponseVersion() {
        return instance.getResponseVersion();
      }
      /**
       * <code>optional .components.feed.core.proto.wire.Response.ResponseVersion response_version = 1;</code>
       */
      public Builder setResponseVersion(org.chromium.components.feed.core.proto.wire.ResponseProto.Response.ResponseVersion value) {
        copyOnWrite();
        instance.setResponseVersion(value);
        return this;
      }
      /**
       * <code>optional .components.feed.core.proto.wire.Response.ResponseVersion response_version = 1;</code>
       */
      public Builder clearResponseVersion() {
        copyOnWrite();
        instance.clearResponseVersion();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:components.feed.core.proto.wire.Response)
    }
    private byte memoizedIsInitialized = -1;
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.wire.ResponseProto.Response();
        }
        case IS_INITIALIZED: {
          byte isInitialized = memoizedIsInitialized;
          if (isInitialized == 1) return DEFAULT_INSTANCE;
          if (isInitialized == 0) return null;

          boolean shouldMemoize = ((Boolean) arg0).booleanValue();
          if (!extensionsAreInitialized()) {
            if (shouldMemoize) {
              memoizedIsInitialized = 0;
            }
            return null;
          }
          if (shouldMemoize) memoizedIsInitialized = 1;
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
          org.chromium.components.feed.core.proto.wire.ResponseProto.Response other = (org.chromium.components.feed.core.proto.wire.ResponseProto.Response) arg1;
          responseVersion_ = visitor.visitInt(hasResponseVersion(), responseVersion_,
              other.hasResponseVersion(), other.responseVersion_);
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
                  if (!parseUnknownField(getDefaultInstanceForType(),
                                         input, extensionRegistry, tag)) {
                    done = true;
                  }
                  break;
                }
                case 8: {
                  int rawValue = input.readEnum();
                  org.chromium.components.feed.core.proto.wire.ResponseProto.Response.ResponseVersion value = org.chromium.components.feed.core.proto.wire.ResponseProto.Response.ResponseVersion.forNumber(rawValue);
                  if (value == null) {
                    super.mergeVarintField(1, rawValue);
                  } else {
                    bitField0_ |= 0x00000001;
                    responseVersion_ = rawValue;
                  }
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
          if (PARSER == null) {    synchronized (org.chromium.components.feed.core.proto.wire.ResponseProto.Response.class) {
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


    // @@protoc_insertion_point(class_scope:components.feed.core.proto.wire.Response)
    private static final org.chromium.components.feed.core.proto.wire.ResponseProto.Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Response();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static org.chromium.components.feed.core.proto.wire.ResponseProto.Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Response> PARSER;

    public static com.google.protobuf.Parser<Response> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}