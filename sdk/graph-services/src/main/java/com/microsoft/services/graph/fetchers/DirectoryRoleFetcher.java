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
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  DirectoryRole
 .
 */
public class DirectoryRoleFetcher extends OrcEntityFetcher<DirectoryRole,DirectoryRoleOperations> 
                                     implements Readable<DirectoryRole> {

     /**
     * Instantiates a new DirectoryRoleFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public DirectoryRoleFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, DirectoryRole.class, DirectoryRoleOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DirectoryRoleFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DirectoryRoleFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
     /**
     * Gets members.
     *
     * @return the members
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getMembers() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("members", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets member.
     *
     * @return the member
     */
    public DirectoryObjectFetcher getMember(String id){
         return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("members", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

     /**
     * Gets member of.
     *
     * @return the member of
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getMemberOf() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("memberOf", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets member of.
     *
     * @return the member of
     */
    public DirectoryObjectFetcher getMemberOf(String id){
         return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("memberOf", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

     /**
     * Gets owners.
     *
     * @return the owners
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getOwners() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("owners", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public DirectoryObjectFetcher getOwner(String id){
         return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("owners", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

     /**
     * Gets owned objects.
     *
     * @return the owned objects
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getOwnedObjects() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("ownedObjects", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets owned object.
     *
     * @return the owned object
     */
    public DirectoryObjectFetcher getOwnedObject(String id){
         return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("ownedObjects", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

}
