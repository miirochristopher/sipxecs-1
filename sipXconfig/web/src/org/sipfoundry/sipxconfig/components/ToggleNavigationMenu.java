/**
 * Copyright (c) 2018 eZuce, Inc. All rights reserved.
 *
 * This software is free software; you can redistribute it and/or modify it under
 * the terms of the Affero General Public License (AGPL) as published by the
 * Free Software Foundation; either version 3 of the License, or (at your option) any later version.
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 */
package org.sipfoundry.sipxconfig.components;

import org.apache.tapestry.annotations.InjectObject;
import org.sipfoundry.sipxconfig.feature.FeatureManager;

public abstract class ToggleNavigationMenu extends AdminNavigationMenu {
    
    @InjectObject("spring:featureManager")
    public abstract FeatureManager getFeatureManager();
    
    public boolean isOn(String featureId) {
        return AdminNavigation.getEnabledFeatures(getFeatureManager()).contains(featureId);
    }
}
