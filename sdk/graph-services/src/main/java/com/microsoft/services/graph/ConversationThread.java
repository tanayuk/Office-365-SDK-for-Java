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
 * The type Conversation Thread.
*/
public class ConversationThread extends ODataBaseEntity {

    public ConversationThread(){
        setODataType("#Microsoft.Graph.ConversationThread");
    }

    private String Id;

    /**
    * Gets the Id.
    *
    * @return the String
    */
    public String getId() {
        return this.Id;
    }

    /**
    * Sets the Id.
    *
    * @param value the String
    */
    public void setId(String value) {
        this.Id = value;
        valueChanged("Id", value);

    }


    private java.util.List<Recipient> ToRecipients = null;



    /**
    * Gets the To Recipients.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getToRecipients() {
        return this.ToRecipients;
    }

    /**
    * Sets the To Recipients.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setToRecipients(java.util.List<Recipient> value) {
        this.ToRecipients = value;
        valueChanged("ToRecipients", value);

    }


    private java.util.List<Recipient> CcRecipients = null;



    /**
    * Gets the Cc Recipients.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getCcRecipients() {
        return this.CcRecipients;
    }

    /**
    * Sets the Cc Recipients.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setCcRecipients(java.util.List<Recipient> value) {
        this.CcRecipients = value;
        valueChanged("CcRecipients", value);

    }

    private String Preview;

    /**
    * Gets the Preview.
    *
    * @return the String
    */
    public String getPreview() {
        return this.Preview;
    }

    /**
    * Sets the Preview.
    *
    * @param value the String
    */
    public void setPreview(String value) {
        this.Preview = value;
        valueChanged("Preview", value);

    }


    private java.util.List<Post> Posts = null;



    /**
    * Gets the Posts.
    *
    * @return the java.util.List<Post>
    */
    public java.util.List<Post> getPosts() {
        return this.Posts;
    }

    /**
    * Sets the Posts.
    *
    * @param value the java.util.List<Post>
    */
    public void setPosts(java.util.List<Post> value) {
        this.Posts = value;
        valueChanged("Posts", value);

    }
}
