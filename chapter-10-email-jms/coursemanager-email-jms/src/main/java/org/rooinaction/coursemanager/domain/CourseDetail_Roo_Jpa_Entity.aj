// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rooinaction.coursemanager.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import org.rooinaction.coursemanager.domain.CourseDetail;

privileged aspect CourseDetail_Roo_Jpa_Entity {
    
    declare @type: CourseDetail: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long CourseDetail.id;
    
    @Version
    @Column(name = "version")
    private Integer CourseDetail.version;
    
    public Long CourseDetail.getId() {
        return this.id;
    }
    
    public void CourseDetail.setId(Long id) {
        this.id = id;
    }
    
    public Integer CourseDetail.getVersion() {
        return this.version;
    }
    
    public void CourseDetail.setVersion(Integer version) {
        this.version = version;
    }
    
}
