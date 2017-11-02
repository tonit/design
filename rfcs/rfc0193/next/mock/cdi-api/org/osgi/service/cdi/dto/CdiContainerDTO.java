/*
 * Copyright (c) OSGi Alliance (2016, 2017). All Rights Reserved.
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

package org.osgi.service.cdi.dto;

import org.osgi.dto.DTO;
import org.osgi.framework.dto.BundleDTO;
import org.osgi.service.cdi.dto.model.CdiContainerModelDTO;

/**
 * Description of a CDI container.
 *
 * @NotThreadSafe
 * @author $Id$
 */
public class CdiContainerDTO extends DTO {
    /**
     *
     */
    public CdiContainerModelDTO model;

    /**
     * The bundle declaring the CDI container.
     */
    public BundleDTO bundle;

    /**
     * The extension dependencies of this CDI container.
     */
    public ExtensionDTO[] extensions;

    /**
     * The factory components defined in this CDI container.
     */
    public ComponentFactoryDTO[] componentFactories;
}
