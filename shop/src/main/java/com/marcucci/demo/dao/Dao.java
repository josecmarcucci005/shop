package com.marcucci.demo.dao;

import java.util.List;

import com.marcucci.demo.orm.entities.PersistenceEntity;

/**
 * 
 * @author Jose Gonzalez Marcucci
 * 
 * This interface define the basic Dao interface 
 *
 */
public interface Dao < E extends PersistenceEntity > {
	
	/**
	 * This method retrieves an element by id
	 * 
	 * @param id
	 * @return E
	 */
	E findById(final long id);

	/**
	 * This method retrieves all saved element
	 * @return List E
	 */
    List<E> findAll();
    
    /**
     * This method saves or update an element in data base 
     * 
     * @param entity
     * @return E persisted element
     */
    E saveOrUpdate(E entity);
    
    /**
     * This method deletes an element in the database 
     *
     * @param entity
     */
    void delete(E entity );

}
