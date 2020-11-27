/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.net.test;
public interface IConnectionListener extends android.os.IInterface
{
    /** Default implementation for IConnectionListener. */
    public static class Default implements org.chromium.net.test.IConnectionListener
    {
        /**
         * When a new connection has been accepted by the server.
         *
         * @param socketId Unique as long as the socket is alive.
         */
        @Override public void acceptedSocket(long socketId) throws android.os.RemoteException
        {
        }
        /**
         * When data has been read on a socket.
         *
         * @param socketId Unique as long as the socket is alive.
         */
        @Override public void readFromSocket(long socketId) throws android.os.RemoteException
        {
        }
        @Override
        public android.os.IBinder asBinder() {
            return null;
        }
    }
    /** Local-side IPC implementation stub class. */
    public static abstract class Stub extends android.os.Binder implements org.chromium.net.test.IConnectionListener
    {
        private static final java.lang.String DESCRIPTOR = "org.chromium.net.test.IConnectionListener";
        /** Construct the stub at attach it to the interface. */
        public Stub()
        {
            this.attachInterface(this, DESCRIPTOR);
        }
        /**
         * Cast an IBinder object into an org.chromium.net.test.IConnectionListener interface,
         * generating a proxy if needed.
         */
        public static org.chromium.net.test.IConnectionListener asInterface(android.os.IBinder obj)
        {
            if ((obj==null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin!=null)&&(iin instanceof org.chromium.net.test.IConnectionListener))) {
                return ((org.chromium.net.test.IConnectionListener)iin);
            }
            return new org.chromium.net.test.IConnectionListener.Stub.Proxy(obj);
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
                case TRANSACTION_acceptedSocket:
                {
                    data.enforceInterface(descriptor);
                    long _arg0;
                    _arg0 = data.readLong();
                    this.acceptedSocket(_arg0);
                    return true;
                }
                case TRANSACTION_readFromSocket:
                {
                    data.enforceInterface(descriptor);
                    long _arg0;
                    _arg0 = data.readLong();
                    this.readFromSocket(_arg0);
                    return true;
                }
                default:
                {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }
        private static class Proxy implements org.chromium.net.test.IConnectionListener
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
            /**
             * When a new connection has been accepted by the server.
             *
             * @param socketId Unique as long as the socket is alive.
             */
            @Override public void acceptedSocket(long socketId) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeLong(socketId);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_acceptedSocket, _data, null, android.os.IBinder.FLAG_ONEWAY);
                    if (!_status && getDefaultImpl() != null) {
                        getDefaultImpl().acceptedSocket(socketId);
                        return;
                    }
                }
                finally {
                    _data.recycle();
                }
            }
            /**
             * When data has been read on a socket.
             *
             * @param socketId Unique as long as the socket is alive.
             */
            @Override public void readFromSocket(long socketId) throws android.os.RemoteException
            {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeLong(socketId);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_readFromSocket, _data, null, android.os.IBinder.FLAG_ONEWAY);
                    if (!_status && getDefaultImpl() != null) {
                        getDefaultImpl().readFromSocket(socketId);
                        return;
                    }
                }
                finally {
                    _data.recycle();
                }
            }
            public static org.chromium.net.test.IConnectionListener sDefaultImpl;
        }
        static final int TRANSACTION_acceptedSocket = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_readFromSocket = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        public static boolean setDefaultImpl(org.chromium.net.test.IConnectionListener impl) {
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
        public static org.chromium.net.test.IConnectionListener getDefaultImpl() {
            return Stub.Proxy.sDefaultImpl;
        }
    }
    /**
     * When a new connection has been accepted by the server.
     *
     * @param socketId Unique as long as the socket is alive.
     */
    public void acceptedSocket(long socketId) throws android.os.RemoteException;
    /**
     * When data has been read on a socket.
     *
     * @param socketId Unique as long as the socket is alive.
     */
    public void readFromSocket(long socketId) throws android.os.RemoteException;
}
