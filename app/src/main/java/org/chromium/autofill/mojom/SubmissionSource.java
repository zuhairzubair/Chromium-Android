package org.chromium.autofill.mojom;

public final class SubmissionSource {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int NONE = 0;
    public static final int SAME_DOCUMENT_NAVIGATION = 1;
    public static final int XHR_SUCCEEDED = 2;
    public static final int FRAME_DETACHED = 3;
    public static final int DOM_MUTATION_AFTER_XHR = 4;
    public static final int PROBABLY_FORM_SUBMITTED = 5;
    public static final int FORM_SUBMISSION = 6;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 6;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 6;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private SubmissionSource() {}
}
