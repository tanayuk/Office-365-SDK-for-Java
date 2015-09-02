/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Alternative Security Id.
*/
public class AlternativeSecurityId extends ODataBaseEntity {

    public AlternativeSecurityId(){
        setODataType("#Microsoft.Graph.AlternativeSecurityId");
    }

    private Integer type;

    /**
    * Gets the type.
    *
    * @return the Integer
    */
    public Integer getType() {
        return this.type; 
    }

    /**
    * Sets the type.
    *
    * @param value the Integer
    */
    public void setType(Integer value) { 
        this.type = value;
        valueChanged("type", value);

    }

    private String identityProvider;

    /**
    * Gets the identity Provider.
    *
    * @return the String
    */
    public String getIdentityProvider() {
        return this.identityProvider; 
    }

    /**
    * Sets the identity Provider.
    *
    * @param value the String
    */
    public void setIdentityProvider(String value) { 
        this.identityProvider = value;
        valueChanged("identityProvider", value);

    }

    private byte[] key;

    /**
    * Gets the key.
    *
    * @return the byte[]
    */
    public byte[] getKey() {
        return this.key; 
    }

    /**
    * Sets the key.
    *
    * @param value the byte[]
    */
    public void setKey(byte[] value) { 
        this.key = value;
        valueChanged("key", value);

    }
}
