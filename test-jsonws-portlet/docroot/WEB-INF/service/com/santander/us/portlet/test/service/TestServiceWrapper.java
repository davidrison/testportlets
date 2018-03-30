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
 * Provides a wrapper for {@link TestService}.
 *
 * @author Brian Wing Shun Chan
 * @see TestService
 * @generated
 */
public class TestServiceWrapper implements TestService,
	ServiceWrapper<TestService> {
	public TestServiceWrapper(TestService testService) {
		_testService = testService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _testService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_testService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _testService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.lang.String getName() {
		return _testService.getName();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TestService getWrappedTestService() {
		return _testService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTestService(TestService testService) {
		_testService = testService;
	}

	@Override
	public TestService getWrappedService() {
		return _testService;
	}

	@Override
	public void setWrappedService(TestService testService) {
		_testService = testService;
	}

	private TestService _testService;
}