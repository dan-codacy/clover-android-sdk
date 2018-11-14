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
 * <li>{@link #getRequestId requestId}</li>
 * <li>{@link #getOrderId orderId}</li>
 * <li>{@link #getCreditId creditId}</li>
 * <li>{@link #getExtras extras}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class VoidCreditRequest extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Identifier for the request
   */
  public java.lang.String getRequestId() {
    return genClient.cacheGet(CacheKey.requestId);
  }

  /**
   * Unique identifier
   */
  public java.lang.String getOrderId() {
    return genClient.cacheGet(CacheKey.orderId);
  }

  /**
   * Unique identifier
   */
  public java.lang.String getCreditId() {
    return genClient.cacheGet(CacheKey.creditId);
  }

  /**
   * Extra pass-through data used by external systems.
   */
  public java.util.Map<java.lang.String,java.lang.String> getExtras() {
    return genClient.cacheGet(CacheKey.extras);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<VoidCreditRequest> {
    requestId {
      @Override
      public Object extractValue(VoidCreditRequest instance) {
        return instance.genClient.extractOther("requestId", java.lang.String.class);
      }
    },
    orderId {
      @Override
      public Object extractValue(VoidCreditRequest instance) {
        return instance.genClient.extractOther("orderId", java.lang.String.class);
      }
    },
    creditId {
      @Override
      public Object extractValue(VoidCreditRequest instance) {
        return instance.genClient.extractOther("creditId", java.lang.String.class);
      }
    },
    extras {
      @Override
      public Object extractValue(VoidCreditRequest instance) {
        return instance.genClient.extractMap("extras");
      }
    },
    ;
  }

  private GenericClient<VoidCreditRequest> genClient;

  /**
   * Constructs a new empty instance.
   */
  public VoidCreditRequest() {
    genClient = new GenericClient<VoidCreditRequest>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected VoidCreditRequest(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public VoidCreditRequest(String json) throws IllegalArgumentException {
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
  public VoidCreditRequest(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public VoidCreditRequest(VoidCreditRequest src) {
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
    genClient.validateLength(getRequestId(), 13);

    genClient.validateLength(getOrderId(), 13);

    genClient.validateLength(getCreditId(), 13);
  }

  /** Checks whether the 'requestId' field is set and is not null */
  public boolean isNotNullRequestId() {
    return genClient.cacheValueIsNotNull(CacheKey.requestId);
  }

  /** Checks whether the 'orderId' field is set and is not null */
  public boolean isNotNullOrderId() {
    return genClient.cacheValueIsNotNull(CacheKey.orderId);
  }

  /** Checks whether the 'creditId' field is set and is not null */
  public boolean isNotNullCreditId() {
    return genClient.cacheValueIsNotNull(CacheKey.creditId);
  }

  /** Checks whether the 'extras' field is set and is not null */
  public boolean isNotNullExtras() {
    return genClient.cacheValueIsNotNull(CacheKey.extras);
  }

  /** Checks whether the 'extras' field is set and is not null and is not empty */
  public boolean isNotEmptyExtras() { return isNotNullExtras() && !getExtras().isEmpty(); }



  /** Checks whether the 'requestId' field has been set, however the value could be null */
  public boolean hasRequestId() {
    return genClient.cacheHasKey(CacheKey.requestId);
  }

  /** Checks whether the 'orderId' field has been set, however the value could be null */
  public boolean hasOrderId() {
    return genClient.cacheHasKey(CacheKey.orderId);
  }

  /** Checks whether the 'creditId' field has been set, however the value could be null */
  public boolean hasCreditId() {
    return genClient.cacheHasKey(CacheKey.creditId);
  }

  /** Checks whether the 'extras' field has been set, however the value could be null */
  public boolean hasExtras() {
    return genClient.cacheHasKey(CacheKey.extras);
  }


  /**
   * Sets the field 'requestId'.
   */
  public VoidCreditRequest setRequestId(java.lang.String requestId) {
    return genClient.setOther(requestId, CacheKey.requestId);
  }

  /**
   * Sets the field 'orderId'.
   */
  public VoidCreditRequest setOrderId(java.lang.String orderId) {
    return genClient.setOther(orderId, CacheKey.orderId);
  }

  /**
   * Sets the field 'creditId'.
   */
  public VoidCreditRequest setCreditId(java.lang.String creditId) {
    return genClient.setOther(creditId, CacheKey.creditId);
  }

  /**
   * Sets the field 'extras'.
   */
  public VoidCreditRequest setExtras(java.util.Map<java.lang.String,java.lang.String> extras) {
    return genClient.setOther(extras, CacheKey.extras);
  }


  /** Clears the 'requestId' field, the 'has' method for this field will now return false */
  public void clearRequestId() {
    genClient.clear(CacheKey.requestId);
  }
  /** Clears the 'orderId' field, the 'has' method for this field will now return false */
  public void clearOrderId() {
    genClient.clear(CacheKey.orderId);
  }
  /** Clears the 'creditId' field, the 'has' method for this field will now return false */
  public void clearCreditId() {
    genClient.clear(CacheKey.creditId);
  }
  /** Clears the 'extras' field, the 'has' method for this field will now return false */
  public void clearExtras() {
    genClient.clear(CacheKey.extras);
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
  public VoidCreditRequest copyChanges() {
    VoidCreditRequest copy = new VoidCreditRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(VoidCreditRequest src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new VoidCreditRequest(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<VoidCreditRequest> CREATOR = new android.os.Parcelable.Creator<VoidCreditRequest>() {
    @Override
    public VoidCreditRequest createFromParcel(android.os.Parcel in) {
      VoidCreditRequest instance = new VoidCreditRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public VoidCreditRequest[] newArray(int size) {
      return new VoidCreditRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<VoidCreditRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<VoidCreditRequest>() {
    @Override
    public VoidCreditRequest create(org.json.JSONObject jsonObject) {
      return new VoidCreditRequest(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean REQUESTID_IS_REQUIRED = false;
    public static final long REQUESTID_MAX_LEN = 13;
    public static final boolean ORDERID_IS_REQUIRED = false;
    public static final long ORDERID_MAX_LEN = 13;
    public static final boolean CREDITID_IS_REQUIRED = false;
    public static final long CREDITID_MAX_LEN = 13;
    public static final boolean EXTRAS_IS_REQUIRED = false;

  }

}
