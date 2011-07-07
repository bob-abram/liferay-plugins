/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.hr.model.impl;

import com.liferay.hr.model.HRTimeSheetHoursPerDay;
import com.liferay.hr.model.HRTimeSheetHoursPerDayModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the HRTimeSheetHoursPerDay service. Represents a row in the &quot;HRTimeSheetHoursPerDay&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.hr.model.HRTimeSheetHoursPerDayModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HRTimeSheetHoursPerDayImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRTimeSheetHoursPerDayImpl
 * @see com.liferay.hr.model.HRTimeSheetHoursPerDay
 * @see com.liferay.hr.model.HRTimeSheetHoursPerDayModel
 * @generated
 */
public class HRTimeSheetHoursPerDayModelImpl extends BaseModelImpl<HRTimeSheetHoursPerDay>
	implements HRTimeSheetHoursPerDayModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a h r time sheet hours per day model instance should use the {@link com.liferay.hr.model.HRTimeSheetHoursPerDay} interface instead.
	 */
	public static final String TABLE_NAME = "HRTimeSheetHoursPerDay";
	public static final Object[][] TABLE_COLUMNS = {
			{ "hrTimeSheetHoursPerDayId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "hrOfficeId", Types.BIGINT },
			{ "hoursPerDay", Types.DOUBLE }
		};
	public static final String TABLE_SQL_CREATE = "create table HRTimeSheetHoursPerDay (hrTimeSheetHoursPerDayId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,hrOfficeId LONG,hoursPerDay DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table HRTimeSheetHoursPerDay";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.hr.model.HRTimeSheetHoursPerDay"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.hr.model.HRTimeSheetHoursPerDay"),
			true);

	public Class<?> getModelClass() {
		return HRTimeSheetHoursPerDay.class;
	}

	public String getModelClassName() {
		return HRTimeSheetHoursPerDay.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.hr.model.HRTimeSheetHoursPerDay"));

	public HRTimeSheetHoursPerDayModelImpl() {
	}

	public long getPrimaryKey() {
		return _hrTimeSheetHoursPerDayId;
	}

	public void setPrimaryKey(long primaryKey) {
		setHrTimeSheetHoursPerDayId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_hrTimeSheetHoursPerDayId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getHrTimeSheetHoursPerDayId() {
		return _hrTimeSheetHoursPerDayId;
	}

	public void setHrTimeSheetHoursPerDayId(long hrTimeSheetHoursPerDayId) {
		_hrTimeSheetHoursPerDayId = hrTimeSheetHoursPerDayId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getHrOfficeId() {
		return _hrOfficeId;
	}

	public void setHrOfficeId(long hrOfficeId) {
		_hrOfficeId = hrOfficeId;
	}

	public double getHoursPerDay() {
		return _hoursPerDay;
	}

	public void setHoursPerDay(double hoursPerDay) {
		_hoursPerDay = hoursPerDay;
	}

	@Override
	public HRTimeSheetHoursPerDay toEscapedModel() {
		if (isEscapedModel()) {
			return (HRTimeSheetHoursPerDay)this;
		}
		else {
			if (_escapedModelProxy == null) {
				_escapedModelProxy = (HRTimeSheetHoursPerDay)Proxy.newProxyInstance(_classLoader,
						_escapedModelProxyInterfaces,
						new AutoEscapeBeanHandler(this));
			}

			return _escapedModelProxy;
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					HRTimeSheetHoursPerDay.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		HRTimeSheetHoursPerDayImpl hrTimeSheetHoursPerDayImpl = new HRTimeSheetHoursPerDayImpl();

		hrTimeSheetHoursPerDayImpl.setHrTimeSheetHoursPerDayId(getHrTimeSheetHoursPerDayId());
		hrTimeSheetHoursPerDayImpl.setGroupId(getGroupId());
		hrTimeSheetHoursPerDayImpl.setCompanyId(getCompanyId());
		hrTimeSheetHoursPerDayImpl.setUserId(getUserId());
		hrTimeSheetHoursPerDayImpl.setUserName(getUserName());
		hrTimeSheetHoursPerDayImpl.setCreateDate(getCreateDate());
		hrTimeSheetHoursPerDayImpl.setModifiedDate(getModifiedDate());
		hrTimeSheetHoursPerDayImpl.setHrOfficeId(getHrOfficeId());
		hrTimeSheetHoursPerDayImpl.setHoursPerDay(getHoursPerDay());

		hrTimeSheetHoursPerDayImpl.resetOriginalValues();

		return hrTimeSheetHoursPerDayImpl;
	}

	public int compareTo(HRTimeSheetHoursPerDay hrTimeSheetHoursPerDay) {
		long primaryKey = hrTimeSheetHoursPerDay.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		HRTimeSheetHoursPerDay hrTimeSheetHoursPerDay = null;

		try {
			hrTimeSheetHoursPerDay = (HRTimeSheetHoursPerDay)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = hrTimeSheetHoursPerDay.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<HRTimeSheetHoursPerDay> toCacheModel() {
		HRTimeSheetHoursPerDayCacheModel hrTimeSheetHoursPerDayCacheModel = new HRTimeSheetHoursPerDayCacheModel();

		hrTimeSheetHoursPerDayCacheModel.hrTimeSheetHoursPerDayId = getHrTimeSheetHoursPerDayId();

		hrTimeSheetHoursPerDayCacheModel.groupId = getGroupId();

		hrTimeSheetHoursPerDayCacheModel.companyId = getCompanyId();

		hrTimeSheetHoursPerDayCacheModel.userId = getUserId();

		hrTimeSheetHoursPerDayCacheModel.userName = getUserName();

		String userName = hrTimeSheetHoursPerDayCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			hrTimeSheetHoursPerDayCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			hrTimeSheetHoursPerDayCacheModel.createDate = createDate.getTime();
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			hrTimeSheetHoursPerDayCacheModel.modifiedDate = modifiedDate.getTime();
		}

		hrTimeSheetHoursPerDayCacheModel.hrOfficeId = getHrOfficeId();

		hrTimeSheetHoursPerDayCacheModel.hoursPerDay = getHoursPerDay();

		return hrTimeSheetHoursPerDayCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{hrTimeSheetHoursPerDayId=");
		sb.append(getHrTimeSheetHoursPerDayId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", hrOfficeId=");
		sb.append(getHrOfficeId());
		sb.append(", hoursPerDay=");
		sb.append(getHoursPerDay());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.hr.model.HRTimeSheetHoursPerDay");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>hrTimeSheetHoursPerDayId</column-name><column-value><![CDATA[");
		sb.append(getHrTimeSheetHoursPerDayId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrOfficeId</column-name><column-value><![CDATA[");
		sb.append(getHrOfficeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoursPerDay</column-name><column-value><![CDATA[");
		sb.append(getHoursPerDay());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HRTimeSheetHoursPerDay.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			HRTimeSheetHoursPerDay.class
		};
	private long _hrTimeSheetHoursPerDayId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _hrOfficeId;
	private double _hoursPerDay;
	private transient ExpandoBridge _expandoBridge;
	private HRTimeSheetHoursPerDay _escapedModelProxy;
}