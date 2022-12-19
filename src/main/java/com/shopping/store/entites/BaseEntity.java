package com.shopping.store.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @JsonIgnore
    @Column(name = "is_deleted")
    private boolean deleted;


    @JsonIgnore
    @Column(name = "date_created")
    private Timestamp dateCreated = new Timestamp(System.currentTimeMillis());

    @JsonIgnore
    @Column(name = "date_modified",nullable = true)
    private Timestamp dateModified;
}
