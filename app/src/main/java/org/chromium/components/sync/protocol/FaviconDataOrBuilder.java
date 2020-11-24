// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: favicon_image_specifics.proto

package org.chromium.components.sync.protocol;

public interface FaviconDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.FaviconData)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The image data for the favicon (PNG encoded).
   * </pre>
   *
   * <code>optional bytes favicon = 1;</code>
   */
  boolean hasFavicon();
  /**
   * <pre>
   * The image data for the favicon (PNG encoded).
   * </pre>
   *
   * <code>optional bytes favicon = 1;</code>
   */
  com.google.protobuf.ByteString getFavicon();

  /**
   * <pre>
   * The favicon dimensions.
   * </pre>
   *
   * <code>optional int32 width = 2;</code>
   */
  boolean hasWidth();
  /**
   * <pre>
   * The favicon dimensions.
   * </pre>
   *
   * <code>optional int32 width = 2;</code>
   */
  int getWidth();

  /**
   * <code>optional int32 height = 3;</code>
   */
  boolean hasHeight();
  /**
   * <code>optional int32 height = 3;</code>
   */
  int getHeight();
}