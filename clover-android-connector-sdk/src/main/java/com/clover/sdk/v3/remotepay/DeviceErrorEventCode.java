/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.remotepay;

import android.os.Parcelable;
import android.os.Parcel;

/**
 * This is an auto-generated Clover data enum.
 */
@SuppressWarnings("all")
public enum DeviceErrorEventCode implements Parcelable {
  InvalidConfig, IoSyncFailed, GetString, InvalidEndpoint, AbortEndpoint, DeviceIoControl, GetOverlappedResult, ReceiveThreadTerminated, WriteFailed, ReadFailed, IoControlMessage, CancelIoFailed, IoCancelled, IoTimedOut, IoEndpointGlobalCancelRedo, GetDeviceKeyValueFailed, SetDeviceKeyValueFailed, Win32Error, DeviceAllreadyLocked, EndpointAllreadyLocked, DeviceNotFound, UserAborted, InvalidParam, AccessDenied, ResourceBusy, Overflow, PipeError, Interrupted, InsufficientMemory, NotSupported, UnknownError, MonoApiError, None, Success, Ok, SendNotificationFailure, NotConnected;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<DeviceErrorEventCode> CREATOR = new Creator<DeviceErrorEventCode>() {
    @Override
    public DeviceErrorEventCode createFromParcel(final Parcel source) {
      return DeviceErrorEventCode.valueOf(source.readString());
    }

    @Override
    public DeviceErrorEventCode[] newArray(final int size) {
      return new DeviceErrorEventCode[size];
    }
  };
}
