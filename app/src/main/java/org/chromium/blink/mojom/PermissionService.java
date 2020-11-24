// PermissionService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/permissions/permission.mojom
//

package org.chromium.blink.mojom;


public interface PermissionService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PermissionService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PermissionService, PermissionService.Proxy> MANAGER = PermissionService_Internal.MANAGER;


    void hasPermission(
PermissionDescriptor permission, 
HasPermissionResponse callback);

    interface HasPermissionResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void requestPermission(
PermissionDescriptor permission, boolean userGesture, 
RequestPermissionResponse callback);

    interface RequestPermissionResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void requestPermissions(
PermissionDescriptor[] permission, boolean userGesture, 
RequestPermissionsResponse callback);

    interface RequestPermissionsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<int[]> { }



    void revokePermission(
PermissionDescriptor permission, 
RevokePermissionResponse callback);

    interface RevokePermissionResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void addPermissionObserver(
PermissionDescriptor permission, int lastKnownStatus, PermissionObserver observer);


}