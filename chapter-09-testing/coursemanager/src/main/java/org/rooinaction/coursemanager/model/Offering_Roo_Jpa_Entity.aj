// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rooinaction.coursemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import org.rooinaction.coursemanager.model.Offering;

privileged aspect Offering_Roo_Jpa_Entity {
    
    declare @type: Offering: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Offering.id;
    
    @Version
    @Column(name = "version")
    private Integer Offering.version;
    
    public Long Offering.getId() {
        return this.id;
    }
    
    public void Offering.setId(Long id) {
        this.id = id;
    }
    
    public Integer Offering.getVersion() {
        return this.version;
    }
    
    public void Offering.setVersion(Integer version) {
        this.version = version;
    }
    
}
