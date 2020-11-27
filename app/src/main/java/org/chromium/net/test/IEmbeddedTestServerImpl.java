/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.net.test;
public interface IEmbeddedTestServerImpl extends android.os.IInterface
{
    /** Default implementation for IEmbeddedTestServerImpl. */
    public static class Default implements org.chromium.net.test.IEmbeddedTestServerImpl
    {
        /** Initialize the native object. */
        @Override public boolean initializeNative(boolean https) throws android.os.RemoteException
        {
            return false;
        }
        /** Start the server.
         *
         *  @param port The port to use for the server, 0 to auto-select an unused port.
         *  @return Whether the server was successfully started.
         */
        @Override public boolean start(int port) throws android.os.RemoteException
        {
            return false;
        }
        /** Get the path of the server's root certificate.
         *
         *  @return The pathname of a PEM file containing the server's root certificate.
         */
        @Override public java.lang.String getRootCertPemPath() throws android.os.RemoteException
        {
            return null;
        }
        /** Add the default handlers and serve files from the provided directory relative to the
         *  external storage directory.
         *
         *  @param directoryPath The path of the directory from which files should be served, relative
         *      to the external storage directory.
         */
        @Override public void addDefaultHandlers(java.lang.String directoryPath) throws android.os.RemoteException
        {
        }
        /** Configure the server to use a particular type of SSL certificate.
         *
         * @param serverCertificate The type of certificate the server should use.
         */
        @Override public void setSSLConfig(int serverCertificate) throws android.os.RemoteException
        {
        }
        /** Serve files from the provided directory.
         *
         *  @param directoryPath The path of the directory from which files should be served.
         */
        @Override public void serveFilesFromDirectory(java.lang.String directoryPath) throws android.os.RemoteException
        {
        }
        /** Get the full URL for the given relative URL.
         *
         *  @param relativeUrl The relative URL for which a full URL should be returned.
         *  @return The URL as a String.
         */
        @Override public java.lang.String getURL(java.lang.String relativeUrl) throws android.os.RemoteException
        {
            return null;
        }
        /** Get the full URL for the given relative URL. Similar to the above method but uses the given
         *  hostname instead of 127.0.0.1. The hostname should be resolved to 127.0.0.1.
         *
         *  @param hostName The host name which should be used.
         *  @param relativeUrl The relative URL for which a full URL should be returned.
         *  @return The URL as a String.
         */
        @Override public java.lang.String getURLWithHostName(java.lang.String hostName, java.lang.String relativeUrl) throws android.os.RemoteException
        {
            return null;
        }
        /** Shut down the server.
         *
         *  @return Whether the server was successfully shut down.
         */
        @Override public boolean shutdownAndWaitUntilComplete() throws android.os.RemoteException
        {
            return false;
        }
        /** Destroy the native object. */
        @Override public void destroy() throws android.os.RemoteException
        {
        }
        /** Set a connection listener. Must be called before {@link start()}. */
        @Override public void setConnectionListener(org.chromium.net.test.IConnectionListener callback) throws android.os.RemoteException
        {
        }
        @Override
        public android.os.IBinder asBinder() {
            return null;
        }
    }
    /** Local-side IPC implementation stub class. */
    public static abstract class Stub extends android.os.Binder implements org.chromium.net.test.IEmbeddedTestServerImpl
    {
        private static final java.lang.String DESCRIPTOR = "org.chromium.net.test.IEmbeddedTestServerImpl";
        /** Construct the stub at attach it to the interface. */
        public Stub()
        {
            this.attachInterface(this, DESCRIPTOR);
        }
        /**
         * Cast an IBinder object into an org.chromium.net.test.IEmbeddedTestServerImpl interface,
         * generating a proxy if needed.
         */
        public static org.chromium.net.test.IEmbeddedTestServerImpl asInterface(android.os.IBinder obj)
        {
            if ((obj==null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin!=null)&&(iin instanceof org.chromium.net.test.IEmbeddedTestServerImpl))) {
                return ((org.chromium.net.test.IEmbeddedTestServerImpl)iin);
            }
            return new org.chromium.net.test.IEmbeddedTestServerImpl.Stub.Proxy(obj);
        }
        @Override public android.os.IBinder asBinder()
        {
            return this;
        }
        @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
        {
            java.lang.String descriptor = DESCRIPTOR;
            switch (code)
            {
                case INTERFACE_TRANSACTION:
                {
                    reply.writeString(descriptor);
                    return true;
                }
                case TRANSACTION_initializeNative:
                {
                    data.enforceInterface(descriptor);
                    boolean _arg0;
                    _arg0 = (0!=data.readInt());
                    boolean _result = this.initializeNative(_arg0);
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_start:
                {
                    data.enforceInterface(descriptor);
                    int _arg0;
                    _arg0 = data.readInt();
                    boolean _result = this.start(_arg0);
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_getRootCertPemPath:
                {
                    data.enforceInterface(descriptor);
                    java.lang.String _result = this.getRootCertPemPath();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_addDefaultHandlers:
                {
                    data.enforceInterface(descriptor);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    this.addDefaultHandlers(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setSSLConfig:
                {
                    data.enforceInterface(descriptor);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.setSSLConfig(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_serveFilesFromDirectory:
                {
                    data.enforceInterface(descriptor);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    this.serveFilesFromDirectory(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getURL:
                {
                    data.enforceInterface(descriptor);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    java.lang.String _result = this.getURL(_arg0);
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getURLWithHostName:
                {
                    data.enforceInterface(descriptor);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    java.lang.String _arg1;
                    _arg1 = data.readString();
                    java.lang.String _result = this.getURLWithHostName(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_shutdownAndWaitUntilComplete:
                {
                    data.enforceInterface(descriptor);
                    boolean _result = this.shutdownAndWaitUntilComplete();
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_destroy:
                {
                    data.enforceInterface(descriptor);
                    this.destroy();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setConnectionListener:
                {
                    data.enforceInterface(descriptor);
                    org.chromium.net.test.IConnectionListener _arg0;
                    _arg0 = org.chromium.net.test.IConnectionListener.Stub.asInterface(data.readStrongBinder());
                    this.setConnectionListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                default:
                {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }
        private static class Proxy implements org.chromium.net.test.IEmbeddedTestServerImpl
        {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder remote)
            {
                mRemote = remote;
            }
            @Override public android.os.IBinder asBinder()
            {
                return mRemote;
            }
            public java.lang.String getInterfaceDescriptor()
            {
                return DESCRIPTOR;
            }
            /** Initialize the native object. */
            @Override public boolean initializeNative(boolean https) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((https)?(1):(0)));
                    boolean _status = mRemote.transact(Stub.TRANSACTION_initializeNative, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        return getDefaultImpl().initializeNative(https);
                    }
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /** Start the server.
             *
             *  @param port The port to use for the server, 0 to auto-select an unused port.
             *  @return Whether the server was successfully started.
             */
            @Override public boolean start(int port) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(port);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_start, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        return getDefaultImpl().start(port);
                    }
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /** Get the path of the server's root certificate.
             *
             *  @return The pathname of a PEM file containing the server's root certificate.
             */
            @Override public java.lang.String getRootCertPemPath() throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.lang.String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_getRootCertPemPath, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        return getDefaultImpl().getRootCertPemPath();
                    }
                    _reply.readException();
                    _result = _reply.readString();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /** Add the default handlers and serve files from the provided directory relative to the
             *  external storage directory.
             *
             *  @param directoryPath The path of the directory from which files should be served, relative
             *      to the external storage directory.
             */
            @Override public void addDefaultHandlers(java.lang.String directoryPath) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(directoryPath);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_addDefaultHandlers, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        getDefaultImpl().addDefaultHandlers(directoryPath);
                        return;
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            /** Configure the server to use a particular type of SSL certificate.
             *
             * @param serverCertificate The type of certificate the server should use.
             */
            @Override public void setSSLConfig(int serverCertificate) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(serverCertificate);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_setSSLConfig, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        getDefaultImpl().setSSLConfig(serverCertificate);
                        return;
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            /** Serve files from the provided directory.
             *
             *  @param directoryPath The path of the directory from which files should be served.
             */
            @Override public void serveFilesFromDirectory(java.lang.String directoryPath) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(directoryPath);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_serveFilesFromDirectory, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        getDefaultImpl().serveFilesFromDirectory(directoryPath);
                        return;
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            /** Get the full URL for the given relative URL.
             *
             *  @param relativeUrl The relative URL for which a full URL should be returned.
             *  @return The URL as a String.
             */
            @Override public java.lang.String getURL(java.lang.String relativeUrl) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.lang.String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(relativeUrl);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_getURL, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        return getDefaultImpl().getURL(relativeUrl);
                    }
                    _reply.readException();
                    _result = _reply.readString();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /** Get the full URL for the given relative URL. Similar to the above method but uses the given
             *  hostname instead of 127.0.0.1. The hostname should be resolved to 127.0.0.1.
             *
             *  @param hostName The host name which should be used.
             *  @param relativeUrl The relative URL for which a full URL should be returned.
             *  @return The URL as a String.
             */
            @Override public java.lang.String getURLWithHostName(java.lang.String hostName, java.lang.String relativeUrl) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.lang.String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(hostName);
                    _data.writeString(relativeUrl);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_getURLWithHostName, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        return getDefaultImpl().getURLWithHostName(hostName, relativeUrl);
                    }
                    _reply.readException();
                    _result = _reply.readString();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /** Shut down the server.
             *
             *  @return Whether the server was successfully shut down.
             */
            @Override public boolean shutdownAndWaitUntilComplete() throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_shutdownAndWaitUntilComplete, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        return getDefaultImpl().shutdownAndWaitUntilComplete();
                    }
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /** Destroy the native object. */
            @Override public void destroy() throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_destroy, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        getDefaultImpl().destroy();
                        return;
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            /** Set a connection listener. Must be called before {@link start()}. */
            @Override public void setConnectionListener(org.chromium.net.test.IConnectionListener callback) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
                    boolean _status = mRemote.transact(Stub.TRANSACTION_setConnectionListener, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        getDefaultImpl().setConnectionListener(callback);
                        return;
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            public static org.chromium.net.test.IEmbeddedTestServerImpl sDefaultImpl;
        }
        static final int TRANSACTION_initializeNative = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_start = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_getRootCertPemPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_addDefaultHandlers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_setSSLConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_serveFilesFromDirectory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_getURL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_getURLWithHostName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_shutdownAndWaitUntilComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_destroy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_setConnectionListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
        public static boolean setDefaultImpl(org.chromium.net.test.IEmbeddedTestServerImpl impl) {
            // Only one user of this interface can use this function
            // at a time. This is a heuristic to detect if two different
            // users in the same process use this function.
            if (Stub.Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl != null) {
                Stub.Proxy.sDefaultImpl = impl;
                return true;
            }
            return false;
        }
        public static org.chromium.net.test.IEmbeddedTestServerImpl getDefaultImpl() {
            return Stub.Proxy.sDefaultImpl;
        }
    }
    /** Initialize the native object. */
    public boolean initializeNative(boolean https) throws android.os.RemoteException;
    /** Start the server.
     *
     *  @param port The port to use for the server, 0 to auto-select an unused port.
     *  @return Whether the server was successfully started.
     */
    public boolean start(int port) throws android.os.RemoteException;
    /** Get the path of the server's root certificate.
     *
     *  @return The pathname of a PEM file containing the server's root certificate.
     */
    public java.lang.String getRootCertPemPath() throws android.os.RemoteException;
    /** Add the default handlers and serve files from the provided directory relative to the
     *  external storage directory.
     *
     *  @param directoryPath The path of the directory from which files should be served, relative
     *      to the external storage directory.
     */
    public void addDefaultHandlers(java.lang.String directoryPath) throws android.os.RemoteException;
    /** Configure the server to use a particular type of SSL certificate.
     *
     * @param serverCertificate The type of certificate the server should use.
     */
    public void setSSLConfig(int serverCertificate) throws android.os.RemoteException;
    /** Serve files from the provided directory.
     *
     *  @param directoryPath The path of the directory from which files should be served.
     */
    public void serveFilesFromDirectory(java.lang.String directoryPath) throws android.os.RemoteException;
    /** Get the full URL for the given relative URL.
     *
     *  @param relativeUrl The relative URL for which a full URL should be returned.
     *  @return The URL as a String.
     */
    public java.lang.String getURL(java.lang.String relativeUrl) throws android.os.RemoteException;
    /** Get the full URL for the given relative URL. Similar to the above method but uses the given
     *  hostname instead of 127.0.0.1. The hostname should be resolved to 127.0.0.1.
     *
     *  @param hostName The host name which should be used.
     *  @param relativeUrl The relative URL for which a full URL should be returned.
     *  @return The URL as a String.
     */
    public java.lang.String getURLWithHostName(java.lang.String hostName, java.lang.String relativeUrl) throws android.os.RemoteException;
    /** Shut down the server.
     *
     *  @return Whether the server was successfully shut down.
     */
    public boolean shutdownAndWaitUntilComplete() throws android.os.RemoteException;
    /** Destroy the native object. */
    public void destroy() throws android.os.RemoteException;
    /** Set a connection listener. Must be called before {@link start()}. */
    public void setConnectionListener(org.chromium.net.test.IConnectionListener callback) throws android.os.RemoteException;
}
