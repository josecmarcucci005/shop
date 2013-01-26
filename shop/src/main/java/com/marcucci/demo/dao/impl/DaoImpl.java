package com.marcucci.demo.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.JpaCallback;

import com.marcucci.demo.dao.Dao;
import com.marcucci.demo.orm.PersistenceCONST;
import com.marcucci.demo.orm.entities.PersistenceEntity;

public class DaoImpl<E extends PersistenceEntity> implements Dao<E> {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private Class<E> domainClass;
	
	private JpaTemplate template;
	
	@SuppressWarnings({ "unchecked", "restriction" })
	@PostConstruct
	public void setUpDao() {
		
		if (domainClass == null) {
			domainClass = (Class<E>) ((ParameterizedType) getClass()
					.getGenericSuperclass()).getActualTypeArguments()[0];
		}
		if (template == null) {
			template = new JpaTemplate(entityManager);
		}
	}
	
	public JpaTemplate getJPAtemplate() {
		return template;
	}
	
	public E findById(final long id) {
		return template.execute(new JpaCallback<E>() {
			@SuppressWarnings("unchecked")
			public E doInJpa(EntityManager em) throws PersistenceException  {
				Criteria criteria = getSession().createCriteria(domainClass);
				criteria.add(Restrictions.eq(PersistenceCONST.ENTITY_ID_COLUMN, id));
				return (E) criteria.uniqueResult();
			}
		});
	}

    public List<E> findAll() {
    	return template.execute(new JpaCallback<List<E>>() {
			@SuppressWarnings("unchecked")
			public List<E> doInJpa(EntityManager em) throws PersistenceException  {
				Criteria criteria = getSession().createCriteria(domainClass);
				return criteria.list();
			}
		});
    } 
    
    public E saveOrUpdate(E entity) {
    	return template.merge(entity);
    }
    
    public void delete(E entity ) {
    	template.remove(entity);
    }
    
    public Session getSession() {
    	return (Session) entityManager.getDelegate();
    }
}
