package com.test.business;

import com.test.domain.RoleEntity;

import javax.ejb.Local;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nkhang
 * Date: 6/10/14
 * Time: 4:53 PM
 * To change this template use File | Settings | File Templates.
 */
@Local
public interface RoleManagementLocalBean {
    Boolean saveRole();
    List<RoleEntity> getAllRoles();
}
