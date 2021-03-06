// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_commands.proto

package org.chromium.components.sync.protocol;

public interface CustomNudgeDelayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.CustomNudgeDelay)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Datatype id.
   * </pre>
   *
   * <code>optional int32 datatype_id = 1;</code>
   */
  boolean hasDatatypeId();
  /**
   * <pre>
   * Datatype id.
   * </pre>
   *
   * <code>optional int32 datatype_id = 1;</code>
   */
  int getDatatypeId();

  /**
   * <pre>
   * Delay in milliseconds.
   * </pre>
   *
   * <code>optional int32 delay_ms = 2;</code>
   */
  boolean hasDelayMs();
  /**
   * <pre>
   * Delay in milliseconds.
   * </pre>
   *
   * <code>optional int32 delay_ms = 2;</code>
   */
  int getDelayMs();
}
