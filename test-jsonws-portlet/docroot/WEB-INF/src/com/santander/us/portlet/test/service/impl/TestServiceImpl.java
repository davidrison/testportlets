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

package com.santander.us.portlet.test.service.impl;

import com.santander.us.portlet.test.service.base.TestServiceBaseImpl;

/**
 * The implementation of the test remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.santander.us.portlet.test.service.TestService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.santander.us.portlet.test.service.base.TestServiceBaseImpl
 * @see com.santander.us.portlet.test.service.TestServiceUtil
 */
public class TestServiceImpl extends TestServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.santander.us.portlet.test.service.TestServiceUtil} to access the test remote service.
	 */

	public String getName() {
		return "David";
	}
}