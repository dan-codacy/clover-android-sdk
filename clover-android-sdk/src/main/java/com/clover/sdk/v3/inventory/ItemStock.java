/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2019 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.inventory;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * The class is used to update the item stock.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getItem item}</li>
 * <li>{@link #getStockCount stockCount}</li>
 * <li>{@link #getQuantity quantity}</li>
 * <li>{@link #getModifiedTime modifiedTime}</li>
 * </ul>
 * <p>
 * @see com.clover.sdk.v3.inventory.IInventoryService
 */
@SuppressWarnings("all")
public class ItemStock extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Reference to an item
   */
  public com.clover.sdk.v3.base.Reference getItem() {
    return genClient.cacheGet(CacheKey.item);
  }

  /**
   * DEPRECATED: use quantity instead
   */
  public java.lang.Long getStockCount() {
    return genClient.cacheGet(CacheKey.stockCount);
  }

  /**
   * Current count of this item in stock
   */
  public java.lang.Double getQuantity() {
    return genClient.cacheGet(CacheKey.quantity);
  }

  public java.lang.Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    item
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.base.Reference.JSON_CREATOR)),
    stockCount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    quantity
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Double.class)),
    modifiedTime
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
      ;

    private final com.clover.sdk.extractors.ExtractionStrategy extractionStrategy;

    private CacheKey(com.clover.sdk.extractors.ExtractionStrategy s) {
      extractionStrategy = s;
    }

    @Override
    public com.clover.sdk.extractors.ExtractionStrategy getExtractionStrategy() {
      return extractionStrategy;
    }
  }

  private final GenericClient<ItemStock> genClient;

  /**
   * Constructs a new empty instance.
   */
  public ItemStock() {
    genClient = new GenericClient<ItemStock>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected ItemStock(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public ItemStock(String json) throws IllegalArgumentException {
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
  public ItemStock(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public ItemStock(ItemStock src) {
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

    if (getStockCount() != null && ( getStockCount() < 0)) throw new IllegalArgumentException("Invalid value for 'getStockCount()'");
  }

  /** Checks whether the 'item' field is set and is not null */
  public boolean isNotNullItem() {
    return genClient.cacheValueIsNotNull(CacheKey.item);
  }

  /** Checks whether the 'stockCount' field is set and is not null */
  public boolean isNotNullStockCount() {
    return genClient.cacheValueIsNotNull(CacheKey.stockCount);
  }

  /** Checks whether the 'quantity' field is set and is not null */
  public boolean isNotNullQuantity() {
    return genClient.cacheValueIsNotNull(CacheKey.quantity);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }



  /** Checks whether the 'item' field has been set, however the value could be null */
  public boolean hasItem() {
    return genClient.cacheHasKey(CacheKey.item);
  }

  /** Checks whether the 'stockCount' field has been set, however the value could be null */
  public boolean hasStockCount() {
    return genClient.cacheHasKey(CacheKey.stockCount);
  }

  /** Checks whether the 'quantity' field has been set, however the value could be null */
  public boolean hasQuantity() {
    return genClient.cacheHasKey(CacheKey.quantity);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }


  /**
   * Sets the field 'item'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public ItemStock setItem(com.clover.sdk.v3.base.Reference item) {
    return genClient.setRecord(item, CacheKey.item);
  }

  /**
   * Sets the field 'stockCount'.
   */
  public ItemStock setStockCount(java.lang.Long stockCount) {
    return genClient.setOther(stockCount, CacheKey.stockCount);
  }

  /**
   * Sets the field 'quantity'.
   */
  public ItemStock setQuantity(java.lang.Double quantity) {
    return genClient.setOther(quantity, CacheKey.quantity);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public ItemStock setModifiedTime(java.lang.Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }


  /** Clears the 'item' field, the 'has' method for this field will now return false */
  public void clearItem() {
    genClient.clear(CacheKey.item);
  }
  /** Clears the 'stockCount' field, the 'has' method for this field will now return false */
  public void clearStockCount() {
    genClient.clear(CacheKey.stockCount);
  }
  /** Clears the 'quantity' field, the 'has' method for this field will now return false */
  public void clearQuantity() {
    genClient.clear(CacheKey.quantity);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
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
  public ItemStock copyChanges() {
    ItemStock copy = new ItemStock();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(ItemStock src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new ItemStock(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<ItemStock> CREATOR = new android.os.Parcelable.Creator<ItemStock>() {
    @Override
    public ItemStock createFromParcel(android.os.Parcel in) {
      ItemStock instance = new ItemStock(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public ItemStock[] newArray(int size) {
      return new ItemStock[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<ItemStock> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<ItemStock>() {
    @Override
    public ItemStock create(org.json.JSONObject jsonObject) {
      return new ItemStock(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ITEM_IS_REQUIRED = false;
    public static final boolean STOCKCOUNT_IS_REQUIRED = false;
    public static final long STOCKCOUNT_MIN = 0;
    public static final boolean QUANTITY_IS_REQUIRED = false;
    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;

  }

}
