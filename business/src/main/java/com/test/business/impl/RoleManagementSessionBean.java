package com.test.business.impl;

import com.test.business.RoleManagementLocalBean;
import com.test.domain.RoleEntity;
import com.test.session.RoleLocalBean;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nkhang
 * Date: 6/10/14
 * Time: 4:53 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "RoleManagementSessionEJB")
public class RoleManagementSessionBean implements RoleManagementLocalBean {

    @EJB
    private RoleLocalBean roleLocalBean;

    @Override
    public Boolean saveRole() {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setName("Role 1");
        roleEntity.setCode("ROLE1");
        roleLocalBean.save(roleEntity);
        return true;
    }

    @Override
    public List<RoleEntity> getAllRoles() {
        List<RoleEntity> roles = roleLocalBean.findAll();
        return roles;
    }
}
