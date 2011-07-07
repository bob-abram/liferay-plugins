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

package com.liferay.knowledgebase.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KBTemplate service. Represents a row in the &quot;KBTemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.knowledgebase.model.impl.KBTemplateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.knowledgebase.model.impl.KBTemplateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KBTemplate
 * @see com.liferay.knowledgebase.model.impl.KBTemplateImpl
 * @see com.liferay.knowledgebase.model.impl.KBTemplateModelImpl
 * @generated
 */
public interface KBTemplateModel extends BaseModel<KBTemplate>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a k b template model instance should use the {@link KBTemplate} interface instead.
	 */

	/**
	 * Returns the primary key of this k b template.
	 *
	 * @return the primary key of this k b template
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this k b template.
	 *
	 * @param primaryKey the primary key of this k b template
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this k b template.
	 *
	 * @return the uuid of this k b template
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this k b template.
	 *
	 * @param uuid the uuid of this k b template
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the kb template ID of this k b template.
	 *
	 * @return the kb template ID of this k b template
	 */
	public long getKbTemplateId();

	/**
	 * Sets the kb template ID of this k b template.
	 *
	 * @param kbTemplateId the kb template ID of this k b template
	 */
	public void setKbTemplateId(long kbTemplateId);

	/**
	 * Returns the group ID of this k b template.
	 *
	 * @return the group ID of this k b template
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this k b template.
	 *
	 * @param groupId the group ID of this k b template
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this k b template.
	 *
	 * @return the company ID of this k b template
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this k b template.
	 *
	 * @param companyId the company ID of this k b template
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this k b template.
	 *
	 * @return the user ID of this k b template
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this k b template.
	 *
	 * @param userId the user ID of this k b template
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this k b template.
	 *
	 * @return the user uuid of this k b template
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this k b template.
	 *
	 * @param userUuid the user uuid of this k b template
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this k b template.
	 *
	 * @return the user name of this k b template
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this k b template.
	 *
	 * @param userName the user name of this k b template
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this k b template.
	 *
	 * @return the create date of this k b template
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this k b template.
	 *
	 * @param createDate the create date of this k b template
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this k b template.
	 *
	 * @return the modified date of this k b template
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this k b template.
	 *
	 * @param modifiedDate the modified date of this k b template
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this k b template.
	 *
	 * @return the title of this k b template
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this k b template.
	 *
	 * @param title the title of this k b template
	 */
	public void setTitle(String title);

	/**
	 * Returns the content of this k b template.
	 *
	 * @return the content of this k b template
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this k b template.
	 *
	 * @param content the content of this k b template
	 */
	public void setContent(String content);

	/**
	 * Returns the engine type of this k b template.
	 *
	 * @return the engine type of this k b template
	 */
	public int getEngineType();

	/**
	 * Sets the engine type of this k b template.
	 *
	 * @param engineType the engine type of this k b template
	 */
	public void setEngineType(int engineType);

	/**
	 * Returns the cacheable of this k b template.
	 *
	 * @return the cacheable of this k b template
	 */
	public boolean getCacheable();

	/**
	 * Returns <code>true</code> if this k b template is cacheable.
	 *
	 * @return <code>true</code> if this k b template is cacheable; <code>false</code> otherwise
	 */
	public boolean isCacheable();

	/**
	 * Sets whether this k b template is cacheable.
	 *
	 * @param cacheable the cacheable of this k b template
	 */
	public void setCacheable(boolean cacheable);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(KBTemplate kbTemplate);

	public int hashCode();

	public CacheModel<KBTemplate> toCacheModel();

	public KBTemplate toEscapedModel();

	public String toString();

	public String toXmlString();
}