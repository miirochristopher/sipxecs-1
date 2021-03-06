/*
 *
 *
 * Copyright (C) 2007 Pingtel Corp., certain elements licensed under a Contributor Agreement.
 * Contributors retain copyright to elements licensed under a Contributor Agreement.
 * Licensed to the User under the LGPL license.
 *
 *
 */
package org.sipfoundry.sipxconfig.components;

import java.util.Collection;

import org.apache.tapestry.BaseComponent;
import org.apache.tapestry.annotations.ComponentClass;
import org.apache.tapestry.annotations.InjectObject;
import org.apache.tapestry.annotations.Parameter;
import org.sipfoundry.commons.diddb.DidPoolService;

@ComponentClass(allowBody = true, allowInformalParameters = false)
public abstract class ItemCommon extends BaseComponent {
    @Parameter(required = true)
    public abstract Object getItem();
    @Parameter(required = false, defaultValue = "true")
    public abstract boolean getUseName();
    
    @InjectObject(value = "spring:didPoolService")
    public abstract DidPoolService getDidPoolService();
    
    public abstract Collection getNextDids();

    public abstract void setNextDids(Collection nextDids);
    
    public void buildNextDids() {        
        setNextDids(getDidPoolService().buildNextDids());
    }    
}
