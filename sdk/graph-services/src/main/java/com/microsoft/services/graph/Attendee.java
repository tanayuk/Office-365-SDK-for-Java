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
 * The type Attendee.
*/
public class Attendee extends ODataBaseEntity {

    public Attendee(){
        setODataType("#Microsoft.Graph.Attendee");
    }

    private EmailAddress EmailAddress;

    /**
    * Gets the Email Address.
    *
    * @return the EmailAddress
    */
    public EmailAddress getEmailAddress() {
        return this.EmailAddress; 
    }

    /**
    * Sets the Email Address.
    *
    * @param value the EmailAddress
    */
    public void setEmailAddress(EmailAddress value) { 
        this.EmailAddress = value;
        valueChanged("EmailAddress", value);

    }

    private ResponseStatus Status;

    /**
    * Gets the Status.
    *
    * @return the ResponseStatus
    */
    public ResponseStatus getStatus() {
        return this.Status; 
    }

    /**
    * Sets the Status.
    *
    * @param value the ResponseStatus
    */
    public void setStatus(ResponseStatus value) { 
        this.Status = value;
        valueChanged("Status", value);

    }

    private AttendeeType Type;

    /**
    * Gets the Type.
    *
    * @return the AttendeeType
    */
    public AttendeeType getType() {
        return this.Type; 
    }

    /**
    * Sets the Type.
    *
    * @param value the AttendeeType
    */
    public void setType(AttendeeType value) { 
        this.Type = value;
        valueChanged("Type", value);

    }
}
