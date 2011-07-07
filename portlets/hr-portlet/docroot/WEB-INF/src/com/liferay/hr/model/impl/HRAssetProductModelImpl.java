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

import com.liferay.hr.model.HRAssetProduct;
import com.liferay.hr.model.HRAssetProductModel;

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
 * The base model implementation for the HRAssetProduct service. Represents a row in the &quot;HRAssetProduct&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.hr.model.HRAssetProductModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HRAssetProductImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRAssetProductImpl
 * @see com.liferay.hr.model.HRAssetProduct
 * @see com.liferay.hr.model.HRAssetProductModel
 * @generated
 */
public class HRAssetProductModelImpl extends BaseModelImpl<HRAssetProduct>
	implements HRAssetProductModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a h r asset product model instance should use the {@link com.liferay.hr.model.HRAssetProduct} interface instead.
	 */
	public static final String TABLE_NAME = "HRAssetProduct";
	public static final Object[][] TABLE_COLUMNS = {
			{ "hrAssetProductId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "hrAssetVendorId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table HRAssetProduct (hrAssetProductId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,hrAssetVendorId LONG,name VARCHAR(75) null,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table HRAssetProduct";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.hr.model.HRAssetProduct"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.hr.model.HRAssetProduct"),
			true);

	public Class<?> getModelClass() {
		return HRAssetProduct.class;
	}

	public String getModelClassName() {
		return HRAssetProduct.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.hr.model.HRAssetProduct"));

	public HRAssetProductModelImpl() {
	}

	public long getPrimaryKey() {
		return _hrAssetProductId;
	}

	public void setPrimaryKey(long primaryKey) {
		setHrAssetProductId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_hrAssetProductId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getHrAssetProductId() {
		return _hrAssetProductId;
	}

	public void setHrAssetProductId(long hrAssetProductId) {
		_hrAssetProductId = hrAssetProductId;
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

	public long getHrAssetVendorId() {
		return _hrAssetVendorId;
	}

	public void setHrAssetVendorId(long hrAssetVendorId) {
		_hrAssetVendorId = hrAssetVendorId;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public HRAssetProduct toEscapedModel() {
		if (isEscapedModel()) {
			return (HRAssetProduct)this;
		}
		else {
			if (_escapedModelProxy == null) {
				_escapedModelProxy = (HRAssetProduct)Proxy.newProxyInstance(_classLoader,
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
					HRAssetProduct.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		HRAssetProductImpl hrAssetProductImpl = new HRAssetProductImpl();

		hrAssetProductImpl.setHrAssetProductId(getHrAssetProductId());
		hrAssetProductImpl.setGroupId(getGroupId());
		hrAssetProductImpl.setCompanyId(getCompanyId());
		hrAssetProductImpl.setUserId(getUserId());
		hrAssetProductImpl.setUserName(getUserName());
		hrAssetProductImpl.setCreateDate(getCreateDate());
		hrAssetProductImpl.setModifiedDate(getModifiedDate());
		hrAssetProductImpl.setHrAssetVendorId(getHrAssetVendorId());
		hrAssetProductImpl.setName(getName());
		hrAssetProductImpl.setDescription(getDescription());

		hrAssetProductImpl.resetOriginalValues();

		return hrAssetProductImpl;
	}

	public int compareTo(HRAssetProduct hrAssetProduct) {
		long primaryKey = hrAssetProduct.getPrimaryKey();

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

		HRAssetProduct hrAssetProduct = null;

		try {
			hrAssetProduct = (HRAssetProduct)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = hrAssetProduct.getPrimaryKey();

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
	public CacheModel<HRAssetProduct> toCacheModel() {
		HRAssetProductCacheModel hrAssetProductCacheModel = new HRAssetProductCacheModel();

		hrAssetProductCacheModel.hrAssetProductId = getHrAssetProductId();

		hrAssetProductCacheModel.groupId = getGroupId();

		hrAssetProductCacheModel.companyId = getCompanyId();

		hrAssetProductCacheModel.userId = getUserId();

		hrAssetProductCacheModel.userName = getUserName();

		String userName = hrAssetProductCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			hrAssetProductCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			hrAssetProductCacheModel.createDate = createDate.getTime();
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			hrAssetProductCacheModel.modifiedDate = modifiedDate.getTime();
		}

		hrAssetProductCacheModel.hrAssetVendorId = getHrAssetVendorId();

		hrAssetProductCacheModel.name = getName();

		String name = hrAssetProductCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			hrAssetProductCacheModel.name = null;
		}

		hrAssetProductCacheModel.description = getDescription();

		String description = hrAssetProductCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			hrAssetProductCacheModel.description = null;
		}

		return hrAssetProductCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{hrAssetProductId=");
		sb.append(getHrAssetProductId());
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
		sb.append(", hrAssetVendorId=");
		sb.append(getHrAssetVendorId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.hr.model.HRAssetProduct");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>hrAssetProductId</column-name><column-value><![CDATA[");
		sb.append(getHrAssetProductId());
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
			"<column><column-name>hrAssetVendorId</column-name><column-value><![CDATA[");
		sb.append(getHrAssetVendorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HRAssetProduct.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			HRAssetProduct.class
		};
	private long _hrAssetProductId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _hrAssetVendorId;
	private String _name;
	private String _description;
	private transient ExpandoBridge _expandoBridge;
	private HRAssetProduct _escapedModelProxy;
}