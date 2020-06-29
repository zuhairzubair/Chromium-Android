package org.chromium.chrome.browser.database;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SQLiteCursorJni implements SQLiteCursor.Natives {
  private static SQLiteCursor.Natives testInstance;

  public static final JniStaticTestMocker<SQLiteCursor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.database.SQLiteCursor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.database.SQLiteCursor.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void destroy(long nativeSQLiteCursor, SQLiteCursor caller) {
    N.MMXVRMHD(nativeSQLiteCursor, caller);
  }

  @Override
  public int getCount(long nativeSQLiteCursor, SQLiteCursor caller) {
    return (int)N.MYg7mvxo(nativeSQLiteCursor, caller);
  }

  @Override
  public String[] getColumnNames(long nativeSQLiteCursor, SQLiteCursor caller) {
    return (String[])N.MzRUX52l(nativeSQLiteCursor, caller);
  }

  @Override
  public int getColumnType(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (int)N.Mj53Fcpg(nativeSQLiteCursor, caller, column);
  }

  @Override
  public String getString(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (String)N.M0zQNAFQ(nativeSQLiteCursor, caller, column);
  }

  @Override
  public byte[] getBlob(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (byte[])N.M$y5OMoQ(nativeSQLiteCursor, caller, column);
  }

  @Override
  public boolean isNull(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (boolean)N.M4VrFfY5(nativeSQLiteCursor, caller, column);
  }

  @Override
  public long getLong(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (long)N.MvGp3edK(nativeSQLiteCursor, caller, column);
  }

  @Override
  public int getInt(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (int)N.MlsHIYMp(nativeSQLiteCursor, caller, column);
  }

  @Override
  public double getDouble(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (double)N.MwhZ6Q97(nativeSQLiteCursor, caller, column);
  }

  @Override
  public int moveTo(long nativeSQLiteCursor, SQLiteCursor caller, int newPosition) {
    return (int)N.MiTQIBC9(nativeSQLiteCursor, caller, newPosition);
  }

  public static SQLiteCursor.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.database.SQLiteCursor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SQLiteCursorJni();
  }
}
