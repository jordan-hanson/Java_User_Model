package com.lambdaschool.usermodel.models;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

// YOu can use this as a standard boiler plate when we make this in other projects.

// ABSTRACT CLASS IS THE PARENT CLASS YOU HAVE TO TELL THE JPA THAT IS WHAT I WANT TO DO WITH @MAPPEDSUPERCLASS
// It will save and be utilized for all the models.
@MappedSuperclass
//Entity listeners see the change in the fields below to know if they need to be modified or changed.
//The work is something you can look up and understand what it does and offer.
//Add the entiity listner annotation @createdby for the fields to know what it is listening for.
@EntityListeners(AuditingEntityListener.class)
// Parent class fields
// Use abstract class instead of public so only the models have access to it.
// This class is so we can add additional fields when children need it.
abstract class Auditable
{
//    use protected so the children know  of them but stay within the family

    @CreatedBy
    protected String createdBy;

//    with Created Date you have to include what we want to look at the timestamp, date, or time.
//    specify with @temporal(temporaltype.thetypespecifiedhere)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createdDate;

    @LastModifiedBy
    protected String lastmodiefiedBy;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastmodifieddate;

//    Put in getters if a client needs to see it. Don't do them to keep jackson from displaying it on the JSON.
}

// Right now it will put in the createdBy a username but right now it won't so make a service create UserAuditingImpl
