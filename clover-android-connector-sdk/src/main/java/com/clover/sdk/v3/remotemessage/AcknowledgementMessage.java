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

package com.clover.sdk.v3.remotemessage;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getSourceMessageId sourceMessageId}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class AcknowledgementMessage extends com.clover.sdk.v3.remotemessage.Message {

  /**
   * The remote message id that is being acknowledged
   */
  public java.lang.String getSourceMessageId() {
    return genClient.cacheGet(CacheKey.sourceMessageId);
  }

  /**
   * The list of message types
   */
  @Override
  public com.clover.sdk.v3.remotemessage.Method getMethod() {
    return genClient.cacheGet(CacheKey.method);
  }

  /**
   * The version of this message
   */
  @Override
  public java.lang.Integer getVersion() {
    return genClient.cacheGet(CacheKey.version);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AcknowledgementMessage> {
    sourceMessageId {
      @Override
      public Object extractValue(AcknowledgementMessage instance) {
        return instance.genClient.extractOther("sourceMessageId", java.lang.String.class);
      }
    },
    method {
      @Override
      public Object extractValue(AcknowledgementMessage instance) {
        return instance.genClient.extractEnum("method", com.clover.sdk.v3.remotemessage.Method.class);
      }
    },
    version {
      @Override
      public Object extractValue(AcknowledgementMessage instance) {
        return instance.genClient.extractOther("version", java.lang.Integer.class);
      }
    },
      ;
  }

  private GenericClient<AcknowledgementMessage> genClient;

  /**
  * Constructs a new empty instance.
  */
  public AcknowledgementMessage() {
    super(false);
    genClient = new GenericClient<AcknowledgementMessage>(this);
    this.setMethod(com.clover.sdk.v3.remotemessage.Method.ACK);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected AcknowledgementMessage(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AcknowledgementMessage(String json) throws IllegalArgumentException {
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
  public AcknowledgementMessage(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AcknowledgementMessage(AcknowledgementMessage src) {
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

    genClient.validateLength(getSourceMessageId(), 13);
  }

  /** Checks whether the 'sourceMessageId' field is set and is not null */
  public boolean isNotNullSourceMessageId() {
    return genClient.cacheValueIsNotNull(CacheKey.sourceMessageId);
  }

  /** Checks whether the 'method' field is set and is not null */
  @Override
  public boolean isNotNullMethod() {
    return genClient.cacheValueIsNotNull(CacheKey.method);
  }

  /** Checks whether the 'version' field is set and is not null */
  @Override
  public boolean isNotNullVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.version);
  }



  /** Checks whether the 'sourceMessageId' field has been set, however the value could be null */
  public boolean hasSourceMessageId() {
    return genClient.cacheHasKey(CacheKey.sourceMessageId);
  }

  /** Checks whether the 'method' field has been set, however the value could be null */
  @Override
  public boolean hasMethod() {
    return genClient.cacheHasKey(CacheKey.method);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  @Override
  public boolean hasVersion() {
    return genClient.cacheHasKey(CacheKey.version);
  }


  /**
   * Sets the field 'sourceMessageId'.
   */
  public AcknowledgementMessage setSourceMessageId(java.lang.String sourceMessageId) {
    return genClient.setOther(sourceMessageId, CacheKey.sourceMessageId);
  }

  /**
   * Sets the field 'method'.
   */
  @Override
  public Message setMethod(com.clover.sdk.v3.remotemessage.Method method) {
    return genClient.setOther(method, CacheKey.method);
  }

  /**
   * Sets the field 'version'.
   */
  @Override
  public Message setVersion(java.lang.Integer version) {
    return genClient.setOther(version, CacheKey.version);
  }


  /** Clears the 'sourceMessageId' field, the 'has' method for this field will now return false */
  public void clearSourceMessageId() {
    genClient.clear(CacheKey.sourceMessageId);
  }
  /** Clears the 'method' field, the 'has' method for this field will now return false */
  @Override
  public void clearMethod() {
    genClient.clear(CacheKey.method);
  }
  /** Clears the 'version' field, the 'has' method for this field will now return false */
  @Override
  public void clearVersion() {
    genClient.clear(CacheKey.version);
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
  public AcknowledgementMessage copyChanges() {
    AcknowledgementMessage copy = new AcknowledgementMessage();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AcknowledgementMessage src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AcknowledgementMessage(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<AcknowledgementMessage> CREATOR = new android.os.Parcelable.Creator<AcknowledgementMessage>() {
    @Override
    public AcknowledgementMessage createFromParcel(android.os.Parcel in) {
      AcknowledgementMessage instance = new AcknowledgementMessage(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AcknowledgementMessage[] newArray(int size) {
      return new AcknowledgementMessage[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AcknowledgementMessage> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AcknowledgementMessage>() {
    @Override
    public AcknowledgementMessage create(org.json.JSONObject jsonObject) {
      return new AcknowledgementMessage(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean SOURCEMESSAGEID_IS_REQUIRED = false;
    public static final long SOURCEMESSAGEID_MAX_LEN = 13;
    public static final boolean METHOD_IS_REQUIRED = false;
    public static final boolean VERSION_IS_REQUIRED = false;

  }

}
