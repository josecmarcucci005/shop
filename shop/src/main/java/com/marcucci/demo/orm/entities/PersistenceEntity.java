package com.marcucci.demo.orm.entities;

public interface PersistenceEntity {

    /**
     * Returns the primary key identifier.
     * 
     * @return id Primary key identifier.
     */
    Long getId();

    /**
     * Sets the primary key identifier. WARNING: Setting the identifier is
     * usually delegated to the database. Implementations may throw an exception
     * if you attempt to set this value manually. 
     * 
     * @param id Primary key identifier.
     */
    void setId(Long id);

    /**
     * Returns the version number, (can be used to manage optimistic locking).
     * 
     * @return version Version number.
     */
    int getVersion();

    /**
     * Sets the version number, (can be used to manage optimistic locking).
     * 
     * @param version  Version number.
     */
    void setVersion(int version);

}
