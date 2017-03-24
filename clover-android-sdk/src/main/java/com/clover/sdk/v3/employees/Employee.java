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
 * <li>{@link #getName name}</li>
 * <li>{@link #getNickname nickname}</li>
 * <li>{@link #getCustomId customId}</li>
 * <li>{@link #getEmail email}</li>
 * <li>{@link #getInviteSent inviteSent}</li>
 * <li>{@link #getClaimedTime claimedTime}</li>
 * <li>{@link #getDeletedTime deletedTime}</li>
 * <li>{@link #getPin pin}</li>
 * <li>{@link #getUnhashedPin unhashedPin}</li>
 * <li>{@link #getRole role}</li>
 * <li>{@link #getRoles roles}</li>
 * <li>{@link #getIsOwner isOwner}</li>
 * <li>{@link #getShifts shifts}</li>
 * <li>{@link #getPayments payments}</li>
 * <li>{@link #getOrders orders}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class Employee extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Full name of the employee
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  /**
   * Nickname of the employee (shows up on receipts)
   */
  public java.lang.String getNickname() {
    return genClient.cacheGet(CacheKey.nickname);
  }

  /**
   * Custom ID of the employee
   */
  public java.lang.String getCustomId() {
    return genClient.cacheGet(CacheKey.customId);
  }

  /**
   * Email of the employee (optional)
   */
  public java.lang.String getEmail() {
    return genClient.cacheGet(CacheKey.email);
  }

  /**
   * Returns true if this employee was sent an invite to activate their account
   */
  public java.lang.Boolean getInviteSent() {
    return genClient.cacheGet(CacheKey.inviteSent);
  }

  /**
   * Timestamp of when this employee claimed their account
   */
  public java.lang.Long getClaimedTime() {
    return genClient.cacheGet(CacheKey.claimedTime);
  }

  /**
   * Timestamp of when this employee was deleted
   */
  public java.lang.Long getDeletedTime() {
    return genClient.cacheGet(CacheKey.deletedTime);
  }

  /**
   * Employee PIN (hashed)
   */
  public java.lang.String getPin() {
    return genClient.cacheGet(CacheKey.pin);
  }

  /**
   * Employee PIN
   */
  public java.lang.String getUnhashedPin() {
    return genClient.cacheGet(CacheKey.unhashedPin);
  }

  /**
   * Employee System Role
   */
  public com.clover.sdk.v3.employees.AccountRole getRole() {
    return genClient.cacheGet(CacheKey.role);
  }

  public java.util.List<com.clover.sdk.v3.base.Reference> getRoles() {
    return genClient.cacheGet(CacheKey.roles);
  }

  /**
   * Returns true if this employee is the owner account for this merchant
   */
  public java.lang.Boolean getIsOwner() {
    return genClient.cacheGet(CacheKey.isOwner);
  }

  /**
   * This employee's shifts
   */
  public java.util.List<com.clover.sdk.v3.base.Reference> getShifts() {
    return genClient.cacheGet(CacheKey.shifts);
  }

  /**
   * This employee's payments
   */
  public java.util.List<com.clover.sdk.v3.base.Reference> getPayments() {
    return genClient.cacheGet(CacheKey.payments);
  }

  /**
   * This employee's orders
   */
  public java.util.List<com.clover.sdk.v3.base.Reference> getOrders() {
    return genClient.cacheGet(CacheKey.orders);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Employee> {
    id {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    nickname {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("nickname", java.lang.String.class);
      }
    },
    customId {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("customId", java.lang.String.class);
      }
    },
    email {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("email", java.lang.String.class);
      }
    },
    inviteSent {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("inviteSent", java.lang.Boolean.class);
      }
    },
    claimedTime {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("claimedTime", java.lang.Long.class);
      }
    },
    deletedTime {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("deletedTime", java.lang.Long.class);
      }
    },
    pin {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("pin", java.lang.String.class);
      }
    },
    unhashedPin {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("unhashedPin", java.lang.String.class);
      }
    },
    role {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractEnum("role", com.clover.sdk.v3.employees.AccountRole.class);
      }
    },
    roles {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractListRecord("roles", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    isOwner {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractOther("isOwner", java.lang.Boolean.class);
      }
    },
    shifts {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractListRecord("shifts", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    payments {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractListRecord("payments", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    orders {
      @Override
      public Object extractValue(Employee instance) {
        return instance.genClient.extractListRecord("orders", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<Employee> genClient;

  /**
  * Constructs a new empty instance.
  */
  public Employee() {
    genClient = new GenericClient<Employee>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected Employee(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Employee(String json) throws IllegalArgumentException {
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
  public Employee(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Employee(Employee src) {
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

    genClient.validateNull(getName(), "name");
    genClient.validateLength(getName(), 127);

    genClient.validateLength(getNickname(), 127);

    genClient.validateLength(getCustomId(), 127);

    genClient.validateLength(getEmail(), 127);

    genClient.validateLength(getUnhashedPin(), 8);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'nickname' field is set and is not null */
  public boolean isNotNullNickname() {
    return genClient.cacheValueIsNotNull(CacheKey.nickname);
  }

  /** Checks whether the 'customId' field is set and is not null */
  public boolean isNotNullCustomId() {
    return genClient.cacheValueIsNotNull(CacheKey.customId);
  }

  /** Checks whether the 'email' field is set and is not null */
  public boolean isNotNullEmail() {
    return genClient.cacheValueIsNotNull(CacheKey.email);
  }

  /** Checks whether the 'inviteSent' field is set and is not null */
  public boolean isNotNullInviteSent() {
    return genClient.cacheValueIsNotNull(CacheKey.inviteSent);
  }

  /** Checks whether the 'claimedTime' field is set and is not null */
  public boolean isNotNullClaimedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.claimedTime);
  }

  /** Checks whether the 'deletedTime' field is set and is not null */
  public boolean isNotNullDeletedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.deletedTime);
  }

  /** Checks whether the 'pin' field is set and is not null */
  public boolean isNotNullPin() {
    return genClient.cacheValueIsNotNull(CacheKey.pin);
  }

  /** Checks whether the 'unhashedPin' field is set and is not null */
  public boolean isNotNullUnhashedPin() {
    return genClient.cacheValueIsNotNull(CacheKey.unhashedPin);
  }

  /** Checks whether the 'role' field is set and is not null */
  public boolean isNotNullRole() {
    return genClient.cacheValueIsNotNull(CacheKey.role);
  }

  /** Checks whether the 'roles' field is set and is not null */
  public boolean isNotNullRoles() {
    return genClient.cacheValueIsNotNull(CacheKey.roles);
  }

  /** Checks whether the 'roles' field is set and is not null and is not empty */
  public boolean isNotEmptyRoles() { return isNotNullRoles() && !getRoles().isEmpty(); }

  /** Checks whether the 'isOwner' field is set and is not null */
  public boolean isNotNullIsOwner() {
    return genClient.cacheValueIsNotNull(CacheKey.isOwner);
  }

  /** Checks whether the 'shifts' field is set and is not null */
  public boolean isNotNullShifts() {
    return genClient.cacheValueIsNotNull(CacheKey.shifts);
  }

  /** Checks whether the 'shifts' field is set and is not null and is not empty */
  public boolean isNotEmptyShifts() { return isNotNullShifts() && !getShifts().isEmpty(); }

  /** Checks whether the 'payments' field is set and is not null */
  public boolean isNotNullPayments() {
    return genClient.cacheValueIsNotNull(CacheKey.payments);
  }

  /** Checks whether the 'payments' field is set and is not null and is not empty */
  public boolean isNotEmptyPayments() { return isNotNullPayments() && !getPayments().isEmpty(); }

  /** Checks whether the 'orders' field is set and is not null */
  public boolean isNotNullOrders() {
    return genClient.cacheValueIsNotNull(CacheKey.orders);
  }

  /** Checks whether the 'orders' field is set and is not null and is not empty */
  public boolean isNotEmptyOrders() { return isNotNullOrders() && !getOrders().isEmpty(); }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'nickname' field has been set, however the value could be null */
  public boolean hasNickname() {
    return genClient.cacheHasKey(CacheKey.nickname);
  }

  /** Checks whether the 'customId' field has been set, however the value could be null */
  public boolean hasCustomId() {
    return genClient.cacheHasKey(CacheKey.customId);
  }

  /** Checks whether the 'email' field has been set, however the value could be null */
  public boolean hasEmail() {
    return genClient.cacheHasKey(CacheKey.email);
  }

  /** Checks whether the 'inviteSent' field has been set, however the value could be null */
  public boolean hasInviteSent() {
    return genClient.cacheHasKey(CacheKey.inviteSent);
  }

  /** Checks whether the 'claimedTime' field has been set, however the value could be null */
  public boolean hasClaimedTime() {
    return genClient.cacheHasKey(CacheKey.claimedTime);
  }

  /** Checks whether the 'deletedTime' field has been set, however the value could be null */
  public boolean hasDeletedTime() {
    return genClient.cacheHasKey(CacheKey.deletedTime);
  }

  /** Checks whether the 'pin' field has been set, however the value could be null */
  public boolean hasPin() {
    return genClient.cacheHasKey(CacheKey.pin);
  }

  /** Checks whether the 'unhashedPin' field has been set, however the value could be null */
  public boolean hasUnhashedPin() {
    return genClient.cacheHasKey(CacheKey.unhashedPin);
  }

  /** Checks whether the 'role' field has been set, however the value could be null */
  public boolean hasRole() {
    return genClient.cacheHasKey(CacheKey.role);
  }

  /** Checks whether the 'roles' field has been set, however the value could be null */
  public boolean hasRoles() {
    return genClient.cacheHasKey(CacheKey.roles);
  }

  /** Checks whether the 'isOwner' field has been set, however the value could be null */
  public boolean hasIsOwner() {
    return genClient.cacheHasKey(CacheKey.isOwner);
  }

  /** Checks whether the 'shifts' field has been set, however the value could be null */
  public boolean hasShifts() {
    return genClient.cacheHasKey(CacheKey.shifts);
  }

  /** Checks whether the 'payments' field has been set, however the value could be null */
  public boolean hasPayments() {
    return genClient.cacheHasKey(CacheKey.payments);
  }

  /** Checks whether the 'orders' field has been set, however the value could be null */
  public boolean hasOrders() {
    return genClient.cacheHasKey(CacheKey.orders);
  }


  /**
   * Sets the field 'id'.
   */
  public Employee setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public Employee setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'nickname'.
   */
  public Employee setNickname(java.lang.String nickname) {
    return genClient.setOther(nickname, CacheKey.nickname);
  }

  /**
   * Sets the field 'customId'.
   */
  public Employee setCustomId(java.lang.String customId) {
    return genClient.setOther(customId, CacheKey.customId);
  }

  /**
   * Sets the field 'email'.
   */
  public Employee setEmail(java.lang.String email) {
    return genClient.setOther(email, CacheKey.email);
  }

  /**
   * Sets the field 'inviteSent'.
   */
  public Employee setInviteSent(java.lang.Boolean inviteSent) {
    return genClient.setOther(inviteSent, CacheKey.inviteSent);
  }

  /**
   * Sets the field 'claimedTime'.
   */
  public Employee setClaimedTime(java.lang.Long claimedTime) {
    return genClient.setOther(claimedTime, CacheKey.claimedTime);
  }

  /**
   * Sets the field 'deletedTime'.
   */
  public Employee setDeletedTime(java.lang.Long deletedTime) {
    return genClient.setOther(deletedTime, CacheKey.deletedTime);
  }

  /**
   * Sets the field 'pin'.
   */
  public Employee setPin(java.lang.String pin) {
    return genClient.setOther(pin, CacheKey.pin);
  }

  /**
   * Sets the field 'unhashedPin'.
   */
  public Employee setUnhashedPin(java.lang.String unhashedPin) {
    return genClient.setOther(unhashedPin, CacheKey.unhashedPin);
  }

  /**
   * Sets the field 'role'.
   */
  public Employee setRole(com.clover.sdk.v3.employees.AccountRole role) {
    return genClient.setOther(role, CacheKey.role);
  }

  /**
   * Sets the field 'roles'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Employee setRoles(java.util.List<com.clover.sdk.v3.base.Reference> roles) {
    return genClient.setArrayRecord(roles, CacheKey.roles);
  }

  /**
   * Sets the field 'isOwner'.
   */
  public Employee setIsOwner(java.lang.Boolean isOwner) {
    return genClient.setOther(isOwner, CacheKey.isOwner);
  }

  /**
   * Sets the field 'shifts'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Employee setShifts(java.util.List<com.clover.sdk.v3.base.Reference> shifts) {
    return genClient.setArrayRecord(shifts, CacheKey.shifts);
  }

  /**
   * Sets the field 'payments'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Employee setPayments(java.util.List<com.clover.sdk.v3.base.Reference> payments) {
    return genClient.setArrayRecord(payments, CacheKey.payments);
  }

  /**
   * Sets the field 'orders'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Employee setOrders(java.util.List<com.clover.sdk.v3.base.Reference> orders) {
    return genClient.setArrayRecord(orders, CacheKey.orders);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'nickname' field, the 'has' method for this field will now return false */
  public void clearNickname() {
    genClient.clear(CacheKey.nickname);
  }
  /** Clears the 'customId' field, the 'has' method for this field will now return false */
  public void clearCustomId() {
    genClient.clear(CacheKey.customId);
  }
  /** Clears the 'email' field, the 'has' method for this field will now return false */
  public void clearEmail() {
    genClient.clear(CacheKey.email);
  }
  /** Clears the 'inviteSent' field, the 'has' method for this field will now return false */
  public void clearInviteSent() {
    genClient.clear(CacheKey.inviteSent);
  }
  /** Clears the 'claimedTime' field, the 'has' method for this field will now return false */
  public void clearClaimedTime() {
    genClient.clear(CacheKey.claimedTime);
  }
  /** Clears the 'deletedTime' field, the 'has' method for this field will now return false */
  public void clearDeletedTime() {
    genClient.clear(CacheKey.deletedTime);
  }
  /** Clears the 'pin' field, the 'has' method for this field will now return false */
  public void clearPin() {
    genClient.clear(CacheKey.pin);
  }
  /** Clears the 'unhashedPin' field, the 'has' method for this field will now return false */
  public void clearUnhashedPin() {
    genClient.clear(CacheKey.unhashedPin);
  }
  /** Clears the 'role' field, the 'has' method for this field will now return false */
  public void clearRole() {
    genClient.clear(CacheKey.role);
  }
  /** Clears the 'roles' field, the 'has' method for this field will now return false */
  public void clearRoles() {
    genClient.clear(CacheKey.roles);
  }
  /** Clears the 'isOwner' field, the 'has' method for this field will now return false */
  public void clearIsOwner() {
    genClient.clear(CacheKey.isOwner);
  }
  /** Clears the 'shifts' field, the 'has' method for this field will now return false */
  public void clearShifts() {
    genClient.clear(CacheKey.shifts);
  }
  /** Clears the 'payments' field, the 'has' method for this field will now return false */
  public void clearPayments() {
    genClient.clear(CacheKey.payments);
  }
  /** Clears the 'orders' field, the 'has' method for this field will now return false */
  public void clearOrders() {
    genClient.clear(CacheKey.orders);
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
  public Employee copyChanges() {
    Employee copy = new Employee();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Employee src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Employee(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<Employee> CREATOR = new android.os.Parcelable.Creator<Employee>() {
    @Override
    public Employee createFromParcel(android.os.Parcel in) {
      Employee instance = new Employee(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Employee[] newArray(int size) {
      return new Employee[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Employee> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Employee>() {
    @Override
    public Employee create(org.json.JSONObject jsonObject) {
      return new Employee(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 127;
    public static final boolean NICKNAME_IS_REQUIRED = false;
    public static final long NICKNAME_MAX_LEN = 127;
    public static final boolean CUSTOMID_IS_REQUIRED = false;
    public static final long CUSTOMID_MAX_LEN = 127;
    public static final boolean EMAIL_IS_REQUIRED = false;
    public static final long EMAIL_MAX_LEN = 127;
    public static final boolean INVITESENT_IS_REQUIRED = false;
    public static final boolean CLAIMEDTIME_IS_REQUIRED = false;
    public static final boolean DELETEDTIME_IS_REQUIRED = false;
    public static final boolean PIN_IS_REQUIRED = false;
    public static final boolean UNHASHEDPIN_IS_REQUIRED = false;
    public static final long UNHASHEDPIN_MAX_LEN = 8;
    public static final boolean ROLE_IS_REQUIRED = false;
    public static final boolean ROLES_IS_REQUIRED = false;
    public static final boolean ISOWNER_IS_REQUIRED = false;
    public static final boolean SHIFTS_IS_REQUIRED = false;
    public static final boolean PAYMENTS_IS_REQUIRED = false;
    public static final boolean ORDERS_IS_REQUIRED = false;

  }

}
