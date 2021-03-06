package org.obeonetwork.sample.associations;

// Start of user code for import 
import java.util.Collection;

import org.obeonetwork.fwk.dao.exception.DaoException;
import org.obeonetwork.sample.associations.Class0101END;

// End of user code for import

/**
 * This class provides the data access layer to the Class_01_01_END entity class.<br/>
 * This is the interface which represent the contrat of the DAO access.
 */
public interface IClass0101ENDDao {

	/**
	 * Create a new element.
	 * @param class0101END Element to create.
	 * @throws DaoException If a Dao problem occurs.
	 */
	public void createClass0101END(Class0101END class0101END) throws DaoException;

	/**
	 * Update an existing element.
	 * @param class0101END Element to update. 
     *            If the element has an id, it may use it.
	 * @throws DaoException If a Dao problem occurs.
	 */
	public void updateClass0101END(Class0101END class0101END) throws DaoException;

	/**
	 * Delete an element.
     * Only id can be used to find which element must be deleted.
	 * @param class0101END Element which will be delete. 
	 * @throws DaoException If a Dao problem occurs.
	 */
	public void deleteClass0101END(Class0101END class0101END) throws DaoException;

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter.
	 * @throws DaoException If a Dao problem occurs.
	 */
	public Collection<Class0101END> findAllClass0101ENDs() throws DaoException;

	/**
	 * Find one entity by its primary key.
     * @param id The PK of the entity.
	 * @return The entity found.
	 * @throws DaoException If a Dao problem occurs.
	 */
	public Class0101END findClass0101ENDById(String id) throws DaoException;

	//Start of user code for technicals dao access api
	//End of user code for technical dao access api
}