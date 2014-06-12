package com.test.session.impl;

import com.test.domain.RoleEntity;
import com.test.session.RoleLocalBean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nkhang
 * Date: 4/23/14
 * Time: 10:45 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "RoleSessionEJB")
public class RoleSessionBean implements RoleLocalBean {

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @PersistenceContext(unitName = "core-data")
    protected EntityManager entityManager;

    @Override
    public void save(RoleEntity roleEntity) {
        entityManager.persist(roleEntity);
    }

    @Override
    public List<RoleEntity> findAll() {
        return entityManager.createQuery("FROM RoleEntity").getResultList();
    }
}
