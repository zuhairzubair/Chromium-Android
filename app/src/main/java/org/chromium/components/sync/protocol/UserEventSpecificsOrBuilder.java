// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_event_specifics.proto

package org.chromium.components.sync.protocol;

public interface UserEventSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.UserEventSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Time of event, as measured by client in microseconds since Windows epoch.
   * </pre>
   *
   * <code>optional int64 event_time_usec = 1;</code>
   */
  boolean hasEventTimeUsec();
  /**
   * <pre>
   * Time of event, as measured by client in microseconds since Windows epoch.
   * </pre>
   *
   * <code>optional int64 event_time_usec = 1;</code>
   */
  long getEventTimeUsec();

  /**
   * <pre>
   * The |global_id| field of the associated navigation, if there is one.
   * </pre>
   *
   * <code>optional int64 navigation_id = 2;</code>
   */
  boolean hasNavigationId();
  /**
   * <pre>
   * The |global_id| field of the associated navigation, if there is one.
   * </pre>
   *
   * <code>optional int64 navigation_id = 2;</code>
   */
  long getNavigationId();

  /**
   * <pre>
   * On startup we generate a new random id to identify which FieldTrialEvents
   * other events belonged to.
   * </pre>
   *
   * <code>optional fixed64 session_id = 3;</code>
   */
  boolean hasSessionId();
  /**
   * <pre>
   * On startup we generate a new random id to identify which FieldTrialEvents
   * other events belonged to.
   * </pre>
   *
   * <code>optional fixed64 session_id = 3;</code>
   */
  long getSessionId();

  /**
   * <code>optional .sync_pb.UserEventSpecifics.Test test_event = 8;</code>
   */
  boolean hasTestEvent();
  /**
   * <code>optional .sync_pb.UserEventSpecifics.Test test_event = 8;</code>
   */
  org.chromium.components.sync.protocol.UserEventSpecifics.Test getTestEvent();

  /**
   * <code>optional .sync_pb.UserEventSpecifics.FieldTrial field_trial_event = 9;</code>
   */
  boolean hasFieldTrialEvent();
  /**
   * <code>optional .sync_pb.UserEventSpecifics.FieldTrial field_trial_event = 9;</code>
   */
  org.chromium.components.sync.protocol.UserEventSpecifics.FieldTrial getFieldTrialEvent();

  /**
   * <code>optional .sync_pb.UserEventSpecifics.LanguageDetection language_detection_event = 10;</code>
   */
  boolean hasLanguageDetectionEvent();
  /**
   * <code>optional .sync_pb.UserEventSpecifics.LanguageDetection language_detection_event = 10;</code>
   */
  org.chromium.components.sync.protocol.UserEventSpecifics.LanguageDetection getLanguageDetectionEvent();

  /**
   * <code>optional .sync_pb.UserEventSpecifics.Translation translation_event = 11;</code>
   */
  boolean hasTranslationEvent();
  /**
   * <code>optional .sync_pb.UserEventSpecifics.Translation translation_event = 11;</code>
   */
  org.chromium.components.sync.protocol.UserEventSpecifics.Translation getTranslationEvent();

  /**
   * <code>optional .sync_pb.UserEventSpecifics.UserConsent user_consent = 12;</code>
   */
  boolean hasUserConsent();
  /**
   * <code>optional .sync_pb.UserEventSpecifics.UserConsent user_consent = 12;</code>
   */
  org.chromium.components.sync.protocol.UserEventSpecifics.UserConsent getUserConsent();

  /**
   * <pre>
   * Happens when a user types their Google account password on another site.
   * </pre>
   *
   * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 104;</code>
   */
  boolean hasGaiaPasswordReuseEvent();
  /**
   * <pre>
   * Happens when a user types their Google account password on another site.
   * </pre>
   *
   * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 104;</code>
   */
  org.chromium.components.sync.protocol.GaiaPasswordReuse getGaiaPasswordReuseEvent();

  /**
   * <code>optional .sync_pb.UserEventSpecifics.GaiaPasswordCaptured gaia_password_captured_event = 15;</code>
   */
  boolean hasGaiaPasswordCapturedEvent();
  /**
   * <code>optional .sync_pb.UserEventSpecifics.GaiaPasswordCaptured gaia_password_captured_event = 15;</code>
   */
  org.chromium.components.sync.protocol.UserEventSpecifics.GaiaPasswordCaptured getGaiaPasswordCapturedEvent();

  public org.chromium.components.sync.protocol.UserEventSpecifics.EventCase getEventCase();
}