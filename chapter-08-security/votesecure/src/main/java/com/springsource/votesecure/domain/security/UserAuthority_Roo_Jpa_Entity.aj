// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.votesecure.domain.security;

import com.springsource.votesecure.domain.security.UserAuthority;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect UserAuthority_Roo_Jpa_Entity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long UserAuthority.id;
    
    @Version
    @Column(name = "version")
    private Integer UserAuthority.version;
    
    public Long UserAuthority.getId() {
        return this.id;
    }
    
    public void UserAuthority.setId(Long id) {
        this.id = id;
    }
    
    public Integer UserAuthority.getVersion() {
        return this.version;
    }
    
    public void UserAuthority.setVersion(Integer version) {
        this.version = version;
    }
    
}
