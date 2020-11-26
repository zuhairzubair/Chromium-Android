// Directory.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/services/filesystem/public/mojom/directory.mojom
//

package org.chromium.filesystem.mojom;


public interface Directory extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends Directory, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<Directory, Directory.Proxy> MANAGER = Directory_Internal.MANAGER;


    void read(

ReadResponse callback);

    interface ReadResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, DirectoryEntry[]> { }



    void openFile(
String path, org.chromium.mojo.bindings.InterfaceRequest<File> file, int openFlags, 
OpenFileResponse callback);

    interface OpenFileResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void openFileHandle(
String path, int openFlags, 
OpenFileHandleResponse callback);

    interface OpenFileHandleResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, org.chromium.mojo_base.mojom.File> { }



    void openFileHandles(
FileOpenDetails[] files, 
OpenFileHandlesResponse callback);

    interface OpenFileHandlesResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<FileOpenResult[]> { }



    void openDirectory(
String path, org.chromium.mojo.bindings.InterfaceRequest<Directory> directory, int openFlags, 
OpenDirectoryResponse callback);

    interface OpenDirectoryResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void rename(
String path, String newPath, 
RenameResponse callback);

    interface RenameResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void replace(
String path, String newPath, 
ReplaceResponse callback);

    interface ReplaceResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void delete(
String path, int deleteFlags, 
DeleteResponse callback);

    interface DeleteResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void exists(
String path, 
ExistsResponse callback);

    interface ExistsResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Boolean> { }



    void isWritable(
String path, 
IsWritableResponse callback);

    interface IsWritableResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Boolean> { }



    void flush(

FlushResponse callback);

    interface FlushResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void statFile(
String path, 
StatFileResponse callback);

    interface StatFileResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, FileInformation> { }



    void clone(
org.chromium.mojo.bindings.InterfaceRequest<Directory> directory);



    void readEntireFile(
String path, 
ReadEntireFileResponse callback);

    interface ReadEntireFileResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, byte[]> { }



    void writeFile(
String path, byte[] data, 
WriteFileResponse callback);

    interface WriteFileResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


}
