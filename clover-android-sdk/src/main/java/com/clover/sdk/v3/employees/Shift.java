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

package com.clover.sdk.v3.employees;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getEmployee employee}</li>
 * <li>{@link #getCashTipsCollected cashTipsCollected}</li>
 * <li>{@link #getServerBanking serverBanking}</li>
 * <li>{@link #getInTime inTime}</li>
 * <li>{@link #getOverrideInTime overrideInTime}</li>
 * <li>{@link #getOverrideInEmployee overrideInEmployee}</li>
 * <li>{@link #getOutTime outTime}</li>
 * <li>{@link #getOverrideOutTime overrideOutTime}</li>
 * <li>{@link #getOverrideOutEmployee overrideOutEmployee}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class Shift extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * The employee that worked this shift
   */
  public com.clover.sdk.v3.employees.Employee getEmployee() {
    return genClient.cacheGet(CacheKey.employee);
  }

  /**
   * Amount of cash tips collected
   */
  public java.lang.Long getCashTipsCollected() {
    return genClient.cacheGet(CacheKey.cashTipsCollected);
  }

  /**
   * Whether the employee used server banking
   */
  public java.lang.Boolean getServerBanking() {
    return genClient.cacheGet(CacheKey.serverBanking);
  }

  /**
   * Clock in time
   */
  public java.lang.Long getInTime() {
    return genClient.cacheGet(CacheKey.inTime);
  }

  /**
   * Overridden clock in time
   */
  public java.lang.Long getOverrideInTime() {
    return genClient.cacheGet(CacheKey.overrideInTime);
  }

  /**
   * The employee who overrode the clock in time
   */
  public com.clover.sdk.v3.employees.Employee getOverrideInEmployee() {
    return genClient.cacheGet(CacheKey.overrideInEmployee);
  }

  /**
   * Clock out time
   */
  public java.lang.Long getOutTime() {
    return genClient.cacheGet(CacheKey.outTime);
  }

  /**
   * Overridden clock out time
   */
  public java.lang.Long getOverrideOutTime() {
    return genClient.cacheGet(CacheKey.overrideOutTime);
  }

  /**
   * The employee who overrode the clock out time
   */
  public com.clover.sdk.v3.employees.Employee getOverrideOutEmployee() {
    return genClient.cacheGet(CacheKey.overrideOutEmployee);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Shift> {
    id {
      @Override
      public Object extractValue(Shift instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    employee {
      @Override
      public Object extractValue(Shift instance) {
        return instance.genClient.extractRecord("employee", com.clover.sdk.v3.employees.Employee.JSON_CREATOR);
      }
    },
    cashTipsCollected {
      @Override
      public Object extractValue(Shift instance) {
        return instance.genClient.extractOther("cashTipsCollected", java.lang.Long.class);
      }
    },
    serverBanking {
      @Override
      public Object extractValue(Shift instance) {
        return instance.genClient.extractOther("serverBanking", java.lang.Boolean.class);
      }
    },
    inTime {
      @Override
      public Object extractValue(Shift instance) {
        return instance.genClient.extractOther("inTime", java.lang.Long.class);
      }
    },
    overrideInTime {
      @Override
      public Object extractValue(Shift instance) {
        return instance.genClient.extractOther("overrideInTime", java.lang.Long.class);
      }
    },
    overrideInEmployee {
      @Override
      public Object extractValue(Shift instance) {
        return instance.genClient.extractRecord("overrideInEmployee", com.clover.sdk.v3.employees.Employee.JSON_CREATOR);
      }
    },
    outTime {
      @Override
      public Object extractValue(Shift instance) {
        return instance.genClient.extractOther("outTime", java.lang.Long.class);
      }
    },
    overrideOutTime {
      @Override
      public Object extractValue(Shift instance) {
        return instance.genClient.extractOther("overrideOutTime", java.lang.Long.class);
      }
    },
    overrideOutEmployee {
      @Override
      public Object extractValue(Shift instance) {
        return instance.genClient.extractRecord("overrideOutEmployee", com.clover.sdk.v3.employees.Employee.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<Shift> genClient;

  /**
  * Constructs a new empty instance.
  */
  public Shift() {
    genClient = new GenericClient<Shift>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected Shift(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Shift(String json) throws IllegalArgumentException {
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
  public Shift(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Shift(Shift src) {
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
    genClient.validateLength(getId(), 13);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'employee' field is set and is not null */
  public boolean isNotNullEmployee() {
    return genClient.cacheValueIsNotNull(CacheKey.employee);
  }

  /** Checks whether the 'cashTipsCollected' field is set and is not null */
  public boolean isNotNullCashTipsCollected() {
    return genClient.cacheValueIsNotNull(CacheKey.cashTipsCollected);
  }

  /** Checks whether the 'serverBanking' field is set and is not null */
  public boolean isNotNullServerBanking() {
    return genClient.cacheValueIsNotNull(CacheKey.serverBanking);
  }

  /** Checks whether the 'inTime' field is set and is not null */
  public boolean isNotNullInTime() {
    return genClient.cacheValueIsNotNull(CacheKey.inTime);
  }

  /** Checks whether the 'overrideInTime' field is set and is not null */
  public boolean isNotNullOverrideInTime() {
    return genClient.cacheValueIsNotNull(CacheKey.overrideInTime);
  }

  /** Checks whether the 'overrideInEmployee' field is set and is not null */
  public boolean isNotNullOverrideInEmployee() {
    return genClient.cacheValueIsNotNull(CacheKey.overrideInEmployee);
  }

  /** Checks whether the 'outTime' field is set and is not null */
  public boolean isNotNullOutTime() {
    return genClient.cacheValueIsNotNull(CacheKey.outTime);
  }

  /** Checks whether the 'overrideOutTime' field is set and is not null */
  public boolean isNotNullOverrideOutTime() {
    return genClient.cacheValueIsNotNull(CacheKey.overrideOutTime);
  }

  /** Checks whether the 'overrideOutEmployee' field is set and is not null */
  public boolean isNotNullOverrideOutEmployee() {
    return genClient.cacheValueIsNotNull(CacheKey.overrideOutEmployee);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'employee' field has been set, however the value could be null */
  public boolean hasEmployee() {
    return genClient.cacheHasKey(CacheKey.employee);
  }

  /** Checks whether the 'cashTipsCollected' field has been set, however the value could be null */
  public boolean hasCashTipsCollected() {
    return genClient.cacheHasKey(CacheKey.cashTipsCollected);
  }

  /** Checks whether the 'serverBanking' field has been set, however the value could be null */
  public boolean hasServerBanking() {
    return genClient.cacheHasKey(CacheKey.serverBanking);
  }

  /** Checks whether the 'inTime' field has been set, however the value could be null */
  public boolean hasInTime() {
    return genClient.cacheHasKey(CacheKey.inTime);
  }

  /** Checks whether the 'overrideInTime' field has been set, however the value could be null */
  public boolean hasOverrideInTime() {
    return genClient.cacheHasKey(CacheKey.overrideInTime);
  }

  /** Checks whether the 'overrideInEmployee' field has been set, however the value could be null */
  public boolean hasOverrideInEmployee() {
    return genClient.cacheHasKey(CacheKey.overrideInEmployee);
  }

  /** Checks whether the 'outTime' field has been set, however the value could be null */
  public boolean hasOutTime() {
    return genClient.cacheHasKey(CacheKey.outTime);
  }

  /** Checks whether the 'overrideOutTime' field has been set, however the value could be null */
  public boolean hasOverrideOutTime() {
    return genClient.cacheHasKey(CacheKey.overrideOutTime);
  }

  /** Checks whether the 'overrideOutEmployee' field has been set, however the value could be null */
  public boolean hasOverrideOutEmployee() {
    return genClient.cacheHasKey(CacheKey.overrideOutEmployee);
  }


  /**
   * Sets the field 'id'.
   */
  public Shift setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'employee'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Shift setEmployee(com.clover.sdk.v3.employees.Employee employee) {
    return genClient.setRecord(employee, CacheKey.employee);
  }

  /**
   * Sets the field 'cashTipsCollected'.
   */
  public Shift setCashTipsCollected(java.lang.Long cashTipsCollected) {
    return genClient.setOther(cashTipsCollected, CacheKey.cashTipsCollected);
  }

  /**
   * Sets the field 'serverBanking'.
   */
  public Shift setServerBanking(java.lang.Boolean serverBanking) {
    return genClient.setOther(serverBanking, CacheKey.serverBanking);
  }

  /**
   * Sets the field 'inTime'.
   */
  public Shift setInTime(java.lang.Long inTime) {
    return genClient.setOther(inTime, CacheKey.inTime);
  }

  /**
   * Sets the field 'overrideInTime'.
   */
  public Shift setOverrideInTime(java.lang.Long overrideInTime) {
    return genClient.setOther(overrideInTime, CacheKey.overrideInTime);
  }

  /**
   * Sets the field 'overrideInEmployee'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Shift setOverrideInEmployee(com.clover.sdk.v3.employees.Employee overrideInEmployee) {
    return genClient.setRecord(overrideInEmployee, CacheKey.overrideInEmployee);
  }

  /**
   * Sets the field 'outTime'.
   */
  public Shift setOutTime(java.lang.Long outTime) {
    return genClient.setOther(outTime, CacheKey.outTime);
  }

  /**
   * Sets the field 'overrideOutTime'.
   */
  public Shift setOverrideOutTime(java.lang.Long overrideOutTime) {
    return genClient.setOther(overrideOutTime, CacheKey.overrideOutTime);
  }

  /**
   * Sets the field 'overrideOutEmployee'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Shift setOverrideOutEmployee(com.clover.sdk.v3.employees.Employee overrideOutEmployee) {
    return genClient.setRecord(overrideOutEmployee, CacheKey.overrideOutEmployee);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'employee' field, the 'has' method for this field will now return false */
  public void clearEmployee() {
    genClient.clear(CacheKey.employee);
  }
  /** Clears the 'cashTipsCollected' field, the 'has' method for this field will now return false */
  public void clearCashTipsCollected() {
    genClient.clear(CacheKey.cashTipsCollected);
  }
  /** Clears the 'serverBanking' field, the 'has' method for this field will now return false */
  public void clearServerBanking() {
    genClient.clear(CacheKey.serverBanking);
  }
  /** Clears the 'inTime' field, the 'has' method for this field will now return false */
  public void clearInTime() {
    genClient.clear(CacheKey.inTime);
  }
  /** Clears the 'overrideInTime' field, the 'has' method for this field will now return false */
  public void clearOverrideInTime() {
    genClient.clear(CacheKey.overrideInTime);
  }
  /** Clears the 'overrideInEmployee' field, the 'has' method for this field will now return false */
  public void clearOverrideInEmployee() {
    genClient.clear(CacheKey.overrideInEmployee);
  }
  /** Clears the 'outTime' field, the 'has' method for this field will now return false */
  public void clearOutTime() {
    genClient.clear(CacheKey.outTime);
  }
  /** Clears the 'overrideOutTime' field, the 'has' method for this field will now return false */
  public void clearOverrideOutTime() {
    genClient.clear(CacheKey.overrideOutTime);
  }
  /** Clears the 'overrideOutEmployee' field, the 'has' method for this field will now return false */
  public void clearOverrideOutEmployee() {
    genClient.clear(CacheKey.overrideOutEmployee);
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
  public Shift copyChanges() {
    Shift copy = new Shift();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Shift src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Shift(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<Shift> CREATOR = new android.os.Parcelable.Creator<Shift>() {
    @Override
    public Shift createFromParcel(android.os.Parcel in) {
      Shift instance = new Shift(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Shift[] newArray(int size) {
      return new Shift[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Shift> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Shift>() {
    @Override
    public Shift create(org.json.JSONObject jsonObject) {
      return new Shift(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean EMPLOYEE_IS_REQUIRED = false;
    public static final boolean CASHTIPSCOLLECTED_IS_REQUIRED = false;
    public static final long CASHTIPSCOLLECTED_MAX_LEN = 127;
    public static final boolean SERVERBANKING_IS_REQUIRED = false;
    public static final boolean INTIME_IS_REQUIRED = false;
    public static final boolean OVERRIDEINTIME_IS_REQUIRED = false;
    public static final boolean OVERRIDEINEMPLOYEE_IS_REQUIRED = false;
    public static final boolean OUTTIME_IS_REQUIRED = false;
    public static final boolean OVERRIDEOUTTIME_IS_REQUIRED = false;
    public static final boolean OVERRIDEOUTEMPLOYEE_IS_REQUIRED = false;

  }

}
