/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.santander.us.portlet.test.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TestLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TestLocalService
 * @generated
 */
public class TestLocalServiceWrapper implements TestLocalService,
	ServiceWrapper<TestLocalService> {
	public TestLocalServiceWrapper(TestLocalService testLocalService) {
		_testLocalService = testLocalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _testLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_testLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _testLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TestLocalService getWrappedTestLocalService() {
		return _testLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTestLocalService(TestLocalService testLocalService) {
		_testLocalService = testLocalService;
	}

	@Override
	public TestLocalService getWrappedService() {
		return _testLocalService;
	}

	@Override
	public void setWrappedService(TestLocalService testLocalService) {
		_testLocalService = testLocalService;
	}

	private TestLocalService _testLocalService;
}