package com.marcucci.demo.orm.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import com.marcucci.demo.orm.PersistenceCONST;


/**
 * 
 * @author Jose Gonzalez Marcucci
 *
 */

@MappedSuperclass
public abstract class AbstractPersistentEntity implements PersistenceEntity,
		Serializable {

	/**
	 * Default version ID for serialization version management.
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= PersistenceCONST.ENTITY_ID_COLUMN)
	private Long id;

	@Version
	@Column(name = PersistenceCONST.ENTITY_VERSION_COLUMN)
	private int version = 0;

	public Long getId() {
		return this.id;
	}

	/**
	 * Sets the primary key identifier.
	 * 
	 * @param id
	 *            Primary key identifier.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Returns the version number (used by Hibernate to manage optimistic
	 * locking).
	 * 
	 * @return version Version number.
	 */
	public int getVersion() {
		return this.version;
	}

	/**
	 * <b>IMPORTANT NOTE:</b> The version property must <em>never</em> be
	 * altered by the application in any way. To artificially increase the
	 * version number see the LockMode.WRITE in the Hibernate reference manual.
	 * 
	 * @param version
	 *            Version number.
	 */
	public void setVersion(final int version) {
		this.version = version;
	}

}
