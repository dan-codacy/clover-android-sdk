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

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getName name}</li>
 * <li>{@link #getModel model}</li>
 * <li>{@link #getSerial serial}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class DeviceInfo extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Name of the device (if entered)
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  public java.lang.String getModel() {
    return genClient.cacheGet(CacheKey.model);
  }

  public java.lang.String getSerial() {
    return genClient.cacheGet(CacheKey.serial);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<DeviceInfo> {
    name {
      @Override
      public Object extractValue(DeviceInfo instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    model {
      @Override
      public Object extractValue(DeviceInfo instance) {
        return instance.genClient.extractOther("model", java.lang.String.class);
      }
    },
    serial {
      @Override
      public Object extractValue(DeviceInfo instance) {
        return instance.genClient.extractOther("serial", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<DeviceInfo> genClient;

  /**
  * Constructs a new empty instance.
  */
  public DeviceInfo() {
    genClient = new GenericClient<DeviceInfo>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected DeviceInfo(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public DeviceInfo(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public DeviceInfo(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public DeviceInfo(DeviceInfo src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
    genClient.validateLength(getName(), 127);

    genClient.validateLength(getModel(), 64);

    genClient.validateLength(getSerial(), 32);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'model' field is set and is not null */
  public boolean isNotNullModel() {
    return genClient.cacheValueIsNotNull(CacheKey.model);
  }

  /** Checks whether the 'serial' field is set and is not null */
  public boolean isNotNullSerial() {
    return genClient.cacheValueIsNotNull(CacheKey.serial);
  }



  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'model' field has been set, however the value could be null */
  public boolean hasModel() {
    return genClient.cacheHasKey(CacheKey.model);
  }

  /** Checks whether the 'serial' field has been set, however the value could be null */
  public boolean hasSerial() {
    return genClient.cacheHasKey(CacheKey.serial);
  }


  /**
   * Sets the field 'name'.
   */
  public DeviceInfo setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'model'.
   */
  public DeviceInfo setModel(java.lang.String model) {
    return genClient.setOther(model, CacheKey.model);
  }

  /**
   * Sets the field 'serial'.
   */
  public DeviceInfo setSerial(java.lang.String serial) {
    return genClient.setOther(serial, CacheKey.serial);
  }


  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'model' field, the 'has' method for this field will now return false */
  public void clearModel() {
    genClient.clear(CacheKey.model);
  }
  /** Clears the 'serial' field, the 'has' method for this field will now return false */
  public void clearSerial() {
    genClient.clear(CacheKey.serial);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public DeviceInfo copyChanges() {
    DeviceInfo copy = new DeviceInfo();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(DeviceInfo src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new DeviceInfo(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<DeviceInfo> CREATOR = new android.os.Parcelable.Creator<DeviceInfo>() {
    @Override
    public DeviceInfo createFromParcel(android.os.Parcel in) {
      DeviceInfo instance = new DeviceInfo(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public DeviceInfo[] newArray(int size) {
      return new DeviceInfo[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<DeviceInfo> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<DeviceInfo>() {
    @Override
    public DeviceInfo create(org.json.JSONObject jsonObject) {
      return new DeviceInfo(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean NAME_IS_REQUIRED = false;
    public static final long NAME_MAX_LEN = 127;
    public static final boolean MODEL_IS_REQUIRED = false;
    public static final long MODEL_MAX_LEN = 64;
    public static final boolean SERIAL_IS_REQUIRED = false;
    public static final long SERIAL_MAX_LEN = 32;

  }

}
