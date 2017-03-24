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

package com.clover.sdk.v3.billing;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getYear year}</li>
 * <li>{@link #getMonth month}</li>
 * <li>{@link #getAmount amount}</li>
 * <li>{@link #getTax tax}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class Statement extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.Integer getYear() {
    return genClient.cacheGet(CacheKey.year);
  }

  public java.lang.Integer getMonth() {
    return genClient.cacheGet(CacheKey.month);
  }

  public java.lang.Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }

  public java.lang.Long getTax() {
    return genClient.cacheGet(CacheKey.tax);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Statement> {
    year {
      @Override
      public Object extractValue(Statement instance) {
        return instance.genClient.extractOther("year", java.lang.Integer.class);
      }
    },
    month {
      @Override
      public Object extractValue(Statement instance) {
        return instance.genClient.extractOther("month", java.lang.Integer.class);
      }
    },
    amount {
      @Override
      public Object extractValue(Statement instance) {
        return instance.genClient.extractOther("amount", java.lang.Long.class);
      }
    },
    tax {
      @Override
      public Object extractValue(Statement instance) {
        return instance.genClient.extractOther("tax", java.lang.Long.class);
      }
    },
      ;
  }

  private GenericClient<Statement> genClient;

  /**
  * Constructs a new empty instance.
  */
  public Statement() {
    genClient = new GenericClient<Statement>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected Statement(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Statement(String json) throws IllegalArgumentException {
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
  public Statement(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Statement(Statement src) {
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

  /** Checks whether the 'year' field is set and is not null */
  public boolean isNotNullYear() {
    return genClient.cacheValueIsNotNull(CacheKey.year);
  }

  /** Checks whether the 'month' field is set and is not null */
  public boolean isNotNullMonth() {
    return genClient.cacheValueIsNotNull(CacheKey.month);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'tax' field is set and is not null */
  public boolean isNotNullTax() {
    return genClient.cacheValueIsNotNull(CacheKey.tax);
  }



  /** Checks whether the 'year' field has been set, however the value could be null */
  public boolean hasYear() {
    return genClient.cacheHasKey(CacheKey.year);
  }

  /** Checks whether the 'month' field has been set, however the value could be null */
  public boolean hasMonth() {
    return genClient.cacheHasKey(CacheKey.month);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'tax' field has been set, however the value could be null */
  public boolean hasTax() {
    return genClient.cacheHasKey(CacheKey.tax);
  }


  /**
   * Sets the field 'year'.
   */
  public Statement setYear(java.lang.Integer year) {
    return genClient.setOther(year, CacheKey.year);
  }

  /**
   * Sets the field 'month'.
   */
  public Statement setMonth(java.lang.Integer month) {
    return genClient.setOther(month, CacheKey.month);
  }

  /**
   * Sets the field 'amount'.
   */
  public Statement setAmount(java.lang.Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'tax'.
   */
  public Statement setTax(java.lang.Long tax) {
    return genClient.setOther(tax, CacheKey.tax);
  }


  /** Clears the 'year' field, the 'has' method for this field will now return false */
  public void clearYear() {
    genClient.clear(CacheKey.year);
  }
  /** Clears the 'month' field, the 'has' method for this field will now return false */
  public void clearMonth() {
    genClient.clear(CacheKey.month);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'tax' field, the 'has' method for this field will now return false */
  public void clearTax() {
    genClient.clear(CacheKey.tax);
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
  public Statement copyChanges() {
    Statement copy = new Statement();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Statement src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Statement(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<Statement> CREATOR = new android.os.Parcelable.Creator<Statement>() {
    @Override
    public Statement createFromParcel(android.os.Parcel in) {
      Statement instance = new Statement(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Statement[] newArray(int size) {
      return new Statement[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Statement> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Statement>() {
    @Override
    public Statement create(org.json.JSONObject jsonObject) {
      return new Statement(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean YEAR_IS_REQUIRED = false;
    public static final boolean MONTH_IS_REQUIRED = false;
    public static final boolean AMOUNT_IS_REQUIRED = false;
    public static final boolean TAX_IS_REQUIRED = false;

  }

}
