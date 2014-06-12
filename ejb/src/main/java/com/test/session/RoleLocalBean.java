package com.test.session;

import com.test.domain.RoleEntity;

import javax.ejb.Local;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nkhang
 * Date: 4/23/14
 * Time: 10:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Local
public interface RoleLocalBean {
    void save(RoleEntity roleEntity);

    List<RoleEntity> findAll();
}
