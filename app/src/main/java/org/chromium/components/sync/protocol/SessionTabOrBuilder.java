// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: session_specifics.proto

package org.chromium.components.sync.protocol;

public interface SessionTabOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.SessionTab)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Unique (to the owner) id for this tab.
   * </pre>
   *
   * <code>optional int32 tab_id = 1 [default = -1];</code>
   */
  boolean hasTabId();
  /**
   * <pre>
   * Unique (to the owner) id for this tab.
   * </pre>
   *
   * <code>optional int32 tab_id = 1 [default = -1];</code>
   */
  int getTabId();

  /**
   * <pre>
   * The unique id for the window this tab belongs to.
   * </pre>
   *
   * <code>optional int32 window_id = 2;</code>
   */
  boolean hasWindowId();
  /**
   * <pre>
   * The unique id for the window this tab belongs to.
   * </pre>
   *
   * <code>optional int32 window_id = 2;</code>
   */
  int getWindowId();

  /**
   * <pre>
   * Visual index of the tab within its window. There may be gaps in these
   * values.
   * </pre>
   *
   * <code>optional int32 tab_visual_index = 3 [default = -1];</code>
   */
  boolean hasTabVisualIndex();
  /**
   * <pre>
   * Visual index of the tab within its window. There may be gaps in these
   * values.
   * </pre>
   *
   * <code>optional int32 tab_visual_index = 3 [default = -1];</code>
   */
  int getTabVisualIndex();

  /**
   * <pre>
   * Identifies the index of the current navigation in navigations. For
   * example, if this is 2 it means the current navigation is navigations[2].
   * </pre>
   *
   * <code>optional int32 current_navigation_index = 4 [default = -1];</code>
   */
  boolean hasCurrentNavigationIndex();
  /**
   * <pre>
   * Identifies the index of the current navigation in navigations. For
   * example, if this is 2 it means the current navigation is navigations[2].
   * </pre>
   *
   * <code>optional int32 current_navigation_index = 4 [default = -1];</code>
   */
  int getCurrentNavigationIndex();

  /**
   * <pre>
   * True if the tab is pinned.
   * </pre>
   *
   * <code>optional bool pinned = 5 [default = false];</code>
   */
  boolean hasPinned();
  /**
   * <pre>
   * True if the tab is pinned.
   * </pre>
   *
   * <code>optional bool pinned = 5 [default = false];</code>
   */
  boolean getPinned();

  /**
   * <pre>
   * If non-empty, this tab is an app tab and this is the id of the extension.
   * </pre>
   *
   * <code>optional string extension_app_id = 6;</code>
   */
  boolean hasExtensionAppId();
  /**
   * <pre>
   * If non-empty, this tab is an app tab and this is the id of the extension.
   * </pre>
   *
   * <code>optional string extension_app_id = 6;</code>
   */
  java.lang.String getExtensionAppId();
  /**
   * <pre>
   * If non-empty, this tab is an app tab and this is the id of the extension.
   * </pre>
   *
   * <code>optional string extension_app_id = 6;</code>
   */
  com.google.protobuf.ByteString
      getExtensionAppIdBytes();

  /**
   * <pre>
   * Tabs are navigated, and the navigation data is here.
   * </pre>
   *
   * <code>repeated .sync_pb.TabNavigation navigation = 7;</code>
   */
  java.util.List<org.chromium.components.sync.protocol.TabNavigation> 
      getNavigationList();
  /**
   * <pre>
   * Tabs are navigated, and the navigation data is here.
   * </pre>
   *
   * <code>repeated .sync_pb.TabNavigation navigation = 7;</code>
   */
  org.chromium.components.sync.protocol.TabNavigation getNavigation(int index);
  /**
   * <pre>
   * Tabs are navigated, and the navigation data is here.
   * </pre>
   *
   * <code>repeated .sync_pb.TabNavigation navigation = 7;</code>
   */
  int getNavigationCount();

  /**
   * <pre>
   * The favicon for the current url the tab is displaying. Either empty
   * or a valid PNG encoded favicon.
   * </pre>
   *
   * <code>optional bytes favicon = 8 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasFavicon();
  /**
   * <pre>
   * The favicon for the current url the tab is displaying. Either empty
   * or a valid PNG encoded favicon.
   * </pre>
   *
   * <code>optional bytes favicon = 8 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString getFavicon();

  /**
   * <code>optional .sync_pb.SessionTab.FaviconType favicon_type = 9 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasFaviconType();
  /**
   * <code>optional .sync_pb.SessionTab.FaviconType favicon_type = 9 [deprecated = true];</code>
   */
  @java.lang.Deprecated org.chromium.components.sync.protocol.SessionTab.FaviconType getFaviconType();

  /**
   * <pre>
   * The url of the actual favicon (as opposed to the page using the favicon).
   * </pre>
   *
   * <code>optional string favicon_source = 11 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasFaviconSource();
  /**
   * <pre>
   * The url of the actual favicon (as opposed to the page using the favicon).
   * </pre>
   *
   * <code>optional string favicon_source = 11 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getFaviconSource();
  /**
   * <pre>
   * The url of the actual favicon (as opposed to the page using the favicon).
   * </pre>
   *
   * <code>optional string favicon_source = 11 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getFaviconSourceBytes();

  /**
   * <pre>
   * Ids of the currently assigned variations which should be sent to sync.
   * </pre>
   *
   * <code>repeated uint64 variation_id = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<java.lang.Long> getVariationIdList();
  /**
   * <pre>
   * Ids of the currently assigned variations which should be sent to sync.
   * </pre>
   *
   * <code>repeated uint64 variation_id = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getVariationIdCount();
  /**
   * <pre>
   * Ids of the currently assigned variations which should be sent to sync.
   * </pre>
   *
   * <code>repeated uint64 variation_id = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated long getVariationId(int index);
}
