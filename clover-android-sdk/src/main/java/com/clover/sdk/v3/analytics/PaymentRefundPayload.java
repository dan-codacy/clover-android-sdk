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

package com.clover.sdk.v3.analytics;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getMerchant merchant}</li>
 * <li>{@link #getCardTransaction cardTransaction}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PaymentRefundPayload extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.base.Reference getMerchant() {
    return genClient.cacheGet(CacheKey.merchant);
  }

  public com.clover.sdk.v3.payments.CardTransaction getCardTransaction() {
    return genClient.cacheGet(CacheKey.cardTransaction);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PaymentRefundPayload> {
    merchant {
      @Override
      public Object extractValue(PaymentRefundPayload instance) {
        return instance.genClient.extractRecord("merchant", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    cardTransaction {
      @Override
      public Object extractValue(PaymentRefundPayload instance) {
        return instance.genClient.extractRecord("cardTransaction", com.clover.sdk.v3.payments.CardTransaction.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<PaymentRefundPayload> genClient;

  /**
  * Constructs a new empty instance.
  */
  public PaymentRefundPayload() {
    genClient = new GenericClient<PaymentRefundPayload>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected PaymentRefundPayload(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PaymentRefundPayload(String json) throws IllegalArgumentException {
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
  public PaymentRefundPayload(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PaymentRefundPayload(PaymentRefundPayload src) {
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
  }

  /** Checks whether the 'merchant' field is set and is not null */
  public boolean isNotNullMerchant() {
    return genClient.cacheValueIsNotNull(CacheKey.merchant);
  }

  /** Checks whether the 'cardTransaction' field is set and is not null */
  public boolean isNotNullCardTransaction() {
    return genClient.cacheValueIsNotNull(CacheKey.cardTransaction);
  }



  /** Checks whether the 'merchant' field has been set, however the value could be null */
  public boolean hasMerchant() {
    return genClient.cacheHasKey(CacheKey.merchant);
  }

  /** Checks whether the 'cardTransaction' field has been set, however the value could be null */
  public boolean hasCardTransaction() {
    return genClient.cacheHasKey(CacheKey.cardTransaction);
  }


  /**
   * Sets the field 'merchant'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentRefundPayload setMerchant(com.clover.sdk.v3.base.Reference merchant) {
    return genClient.setRecord(merchant, CacheKey.merchant);
  }

  /**
   * Sets the field 'cardTransaction'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentRefundPayload setCardTransaction(com.clover.sdk.v3.payments.CardTransaction cardTransaction) {
    return genClient.setRecord(cardTransaction, CacheKey.cardTransaction);
  }


  /** Clears the 'merchant' field, the 'has' method for this field will now return false */
  public void clearMerchant() {
    genClient.clear(CacheKey.merchant);
  }
  /** Clears the 'cardTransaction' field, the 'has' method for this field will now return false */
  public void clearCardTransaction() {
    genClient.clear(CacheKey.cardTransaction);
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
  public PaymentRefundPayload copyChanges() {
    PaymentRefundPayload copy = new PaymentRefundPayload();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PaymentRefundPayload src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PaymentRefundPayload(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PaymentRefundPayload> CREATOR = new android.os.Parcelable.Creator<PaymentRefundPayload>() {
    @Override
    public PaymentRefundPayload createFromParcel(android.os.Parcel in) {
      PaymentRefundPayload instance = new PaymentRefundPayload(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PaymentRefundPayload[] newArray(int size) {
      return new PaymentRefundPayload[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PaymentRefundPayload> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PaymentRefundPayload>() {
    @Override
    public PaymentRefundPayload create(org.json.JSONObject jsonObject) {
      return new PaymentRefundPayload(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean MERCHANT_IS_REQUIRED = false;
    public static final boolean CARDTRANSACTION_IS_REQUIRED = false;

  }

}
