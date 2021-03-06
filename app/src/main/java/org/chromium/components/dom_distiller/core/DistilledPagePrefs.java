// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.dom_distiller.core;

import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeMethods;

import java.util.HashMap;
import java.util.Map;

/**
 * Wrapper for the dom_distiller::DistilledPagePrefs.
 */
@JNINamespace("dom_distiller::android")
public final class DistilledPagePrefs {

    private final long mDistilledPagePrefsAndroid;
    private Map<Observer, DistilledPagePrefsObserverWrapper> mObserverMap;

    /**
     * Observer interface for observing DistilledPagePrefs changes.
     */
    public interface Observer {
        void onChangeFontFamily(@FontFamily int font);
        void onChangeTheme(@Theme int theme);
        void onChangeFontScaling(float scaling);
    }

    /**
     * Wrapper for dom_distiller::android::DistilledPagePrefsObserverAndroid.
     */
    static class DistilledPagePrefsObserverWrapper {
        private final Observer mDistilledPagePrefsObserver;
        private final long mNativeDistilledPagePrefsObserverAndroidPtr;

        public DistilledPagePrefsObserverWrapper(Observer observer) {
            mNativeDistilledPagePrefsObserverAndroidPtr =
                    org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().initObserverAndroid(this);
            mDistilledPagePrefsObserver = observer;
        }

        @CalledByNative("DistilledPagePrefsObserverWrapper")
        private void onChangeFontFamily(@FontFamily int fontFamily) {
            mDistilledPagePrefsObserver.onChangeFontFamily(fontFamily);
        }

        @CalledByNative("DistilledPagePrefsObserverWrapper")
        private void onChangeTheme(@Theme int theme) {
            mDistilledPagePrefsObserver.onChangeTheme(theme);
        }

        @CalledByNative("DistilledPagePrefsObserverWrapper")
        private void onChangeFontScaling(float scaling) {
            mDistilledPagePrefsObserver.onChangeFontScaling(scaling);
        }

        public void destroy() {
            org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().destroyObserverAndroid(
                    mNativeDistilledPagePrefsObserverAndroidPtr);
        }

        public long getNativePtr() {
            return mNativeDistilledPagePrefsObserverAndroidPtr;
        }
    }

    DistilledPagePrefs(long distilledPagePrefsPtr) {
        mDistilledPagePrefsAndroid =
                org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().init(DistilledPagePrefs.this, distilledPagePrefsPtr);
        mObserverMap = new HashMap<Observer, DistilledPagePrefsObserverWrapper>();
    }

    /*
     * Adds the observer to listen to changes in DistilledPagePrefs.
     * @return whether the observerMap was changed as a result of the call.
     */
    public boolean addObserver(Observer obs) {
        if (mObserverMap.containsKey(obs)) return false;
        DistilledPagePrefsObserverWrapper wrappedObserver =
                new DistilledPagePrefsObserverWrapper(obs);
        org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().addObserver(mDistilledPagePrefsAndroid, DistilledPagePrefs.this,
                wrappedObserver.getNativePtr());
        mObserverMap.put(obs, wrappedObserver);
        return true;
    }

    /*
     * Removes the observer and unregisters it from DistilledPagePrefs changes.
     * @return whether the observer was removed as a result of the call.
     */
    public boolean removeObserver(Observer obs) {
        DistilledPagePrefsObserverWrapper wrappedObserver = mObserverMap.remove(obs);
        if (wrappedObserver == null) return false;
        org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().removeObserver(mDistilledPagePrefsAndroid,
                DistilledPagePrefs.this, wrappedObserver.getNativePtr());
        wrappedObserver.destroy();
        return true;
    }

    public void setFontFamily(@FontFamily int fontFamily) {
        org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().setFontFamily(
                mDistilledPagePrefsAndroid, DistilledPagePrefs.this, fontFamily);
    }

    public @FontFamily int getFontFamily() {
        return org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().getFontFamily(
                mDistilledPagePrefsAndroid, DistilledPagePrefs.this);
    }

    public void setTheme(@Theme int theme) {
        org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().setTheme(
                mDistilledPagePrefsAndroid, DistilledPagePrefs.this, theme);
    }

    public @Theme int getTheme() {
        return org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().getTheme(
                mDistilledPagePrefsAndroid, DistilledPagePrefs.this);
    }

    public void setFontScaling(float scaling) {
        org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().setFontScaling(
                mDistilledPagePrefsAndroid, DistilledPagePrefs.this, scaling);
    }

    public float getFontScaling() {
        return org.chromium.components.dom_distiller.core.DistilledPagePrefsJni.get().getFontScaling(
                mDistilledPagePrefsAndroid, DistilledPagePrefs.this);
    }

    @NativeMethods
    interface Natives {
        long init(DistilledPagePrefs caller, long distilledPagePrefPtr);
        void setFontFamily(
                long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller, int fontFamily);
        int getFontFamily(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller);
        void setTheme(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller, int theme);
        int getTheme(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller);
        void setFontScaling(
                long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller, float scaling);
        float getFontScaling(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller);
        void addObserver(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller,
                long nativeObserverPtr);
        void removeObserver(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller,
                long nativeObserverPtr);
        long initObserverAndroid(DistilledPagePrefsObserverWrapper caller);
        void destroyObserverAndroid(long nativeDistilledPagePrefsObserverAndroid);
    }
}
