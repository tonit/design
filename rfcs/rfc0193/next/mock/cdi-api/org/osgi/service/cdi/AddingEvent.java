/*
 * Copyright (c) OSGi Alliance (2017). All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.osgi.service.cdi;

import java.util.Map;
import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.ServiceReference;

/**
 * This interface is used in CDI Observer methods to watch OSGi service adding
 * events.
 *
 * @param <S> the service argument type.
 *
 * @author $Id$
 */
@ProviderType
public interface AddingEvent<S> {

	/**
	 * Obtain the service instance associated with this event.
	 *
	 * @return the service instance
	 */
	S getService();

	/**
	 * Obtain the service reference associated with this event.
	 *
	 * @return the service reference
	 */
	ServiceReference<S> getServiceReference();

	/**
	 * Obtain the service objects associated with this event.
	 *
	 * @return the service objects
	 */
	ReferenceServiceObjects<S> getServiceObjects();

	/**
	 * Obtain the service properties associated with this event.
	 *
	 * @return the service properties
	 */
	Map<String, ?> getServiceProperties();

	/**
	 * Subscribe an action to the "updated" service event.
	 *
	 * @param action to subscribe to the "updated" service event
	 */
	void onUpdate(Runnable action);

	/**
	 * Subscribe an action to the "removed" service event.
	 *
	 * @param action to subscribe to the "removed" service event
	 */
	void onRemove(Runnable action);

}
