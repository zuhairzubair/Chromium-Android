// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: persisted_entity_data.proto

package org.chromium.components.sync.protocol;

public interface PersistedEntityDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.PersistedEntityData)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * See corresponding fields in SyncEntity for details.
   * </pre>
   *
   * <code>optional string name = 8;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * See corresponding fields in SyncEntity for details.
   * </pre>
   *
   * <code>optional string name = 8;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * See corresponding fields in SyncEntity for details.
   * </pre>
   *
   * <code>optional string name = 8;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
   */
  boolean hasSpecifics();
  /**
   * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
   */
  org.chromium.components.sync.protocol.EntitySpecifics getSpecifics();
}