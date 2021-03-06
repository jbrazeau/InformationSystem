package org.obeonetwork.dsl.entity.gen.java.dao.tests.dao.block1.jdbc;

// Start of user code for import 
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import org.obeonetwork.fwk.dao.exception.DaoException;
import org.obeonetwork.dsl.entity.gen.java.dao.tests.fwk.dao.jdbc.Dsl.entity.gen.java.dao.testsConnectionUtils;
import org.obeonetwork.dsl.entity.gen.java.dao.tests.business.block1.Entity 1;

import org.obeonetwork.dsl.entity.gen.java.dao.tests.dao.block1.api.IEntity 1Dao;

// End of user code for import 

/**
 * This class provides the data access layer to the Entity 1 entity class.
 * This is the JDBC implementation.
 */
public class JdbcEntity 1Dao implements IEntity 1Dao {
    /**
     * Commons Logging instance.
     */
	private final static Log LOG = LogFactory.getLog(JdbcEntity 1Dao.class);;


	protected final static String TABLE_NAME = "ENTITY1";

	protected final static String ATTRIBUTE1 = "ATTRIBUTE1";
	protected final static String ATTTRIBUTE2 = "ATTTRIBUTE2";
	protected final static String ATTTRIBUTE3 = "ATTTRIBUTE3";
	protected final static String ATTTRIBUTE4 = "ATTTRIBUTE4";
	protected final static String ATTTRIBUTE5 = "ATTTRIBUTE5";
	protected final static String ATTTRIBUTE6 = "ATTTRIBUTE6";
	protected final static String ATTTRIBUTE7 = "ATTTRIBUTE7";
	
	// Start of user code specifics queries
	protected static final String CREATE_QUERY = 
		"INSERT INTO " + TABLE_NAME + 
		" (ID, ATTRIBUTE1, ATTTRIBUTE2, ATTTRIBUTE3, ATTTRIBUTE4, ATTTRIBUTE5, ATTTRIBUTE6, ATTTRIBUTE7) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
	protected static final String UPDATE_QUERY = 
		"UPDATE " + TABLE_NAME + 
		" SET  ATTRIBUTE1 = ?, ATTTRIBUTE2 = ?, ATTTRIBUTE3 = ?, ATTTRIBUTE4 = ?, ATTTRIBUTE5 = ?, ATTTRIBUTE6 = ?, ATTTRIBUTE7 = ?" +
		" WHERE ID = ?";
	
	protected static final String DELETE_QUERY = 
		"DELETE FROM " + TABLE_NAME + 
		" WHERE ID = ?";
		
	protected static final String FIND_ALL_QUERY = 
		"SELECT * FROM " + TABLE_NAME;
		
	protected static final String FIND_BY_ID = 
		"SELECT * FROM " + TABLE_NAME +
		" WHERE ID = ?";
		
	protected static final String FIND_BY_ATTRIBUTE1 = 
		"SELECT * FROM " + TABLE_NAME +
		" WHERE ATTRIBUTE1 = ?";
		
	protected static final String FIND_BY_ATTTRIBUTE2 = 
		"SELECT * FROM " + TABLE_NAME +
		" WHERE ATTTRIBUTE2 = ?";
		
	protected static final String FIND_BY_ATTTRIBUTE3 = 
		"SELECT * FROM " + TABLE_NAME +
		" WHERE ATTTRIBUTE3 = ?";
		
	protected static final String FIND_BY_ATTTRIBUTE4 = 
		"SELECT * FROM " + TABLE_NAME +
		" WHERE ATTTRIBUTE4 = ?";
		
	protected static final String FIND_BY_ATTTRIBUTE5 = 
		"SELECT * FROM " + TABLE_NAME +
		" WHERE ATTTRIBUTE5 = ?";
		
	protected static final String FIND_BY_ATTTRIBUTE6 = 
		"SELECT * FROM " + TABLE_NAME +
		" WHERE ATTTRIBUTE6 = ?";
		
	protected static final String FIND_BY_ATTTRIBUTE7 = 
		"SELECT * FROM " + TABLE_NAME +
		" WHERE ATTTRIBUTE7 = ?";
		
	
	
	// End of user code

	protected Collection<Entity 1> createList(ResultSet rs) throws DaoException {
		Collection<Entity 1> result = new ArrayList<Entity 1>();
		Entity 1 entity 1 = null;
		while (rs.next()) {
			entity 1 = new Entity 1();
			entity 1.setId(rs.getString("ID"));
			entity 1.setAttribute1( rs.getBoolean(ATTRIBUTE1) );
			entity 1.setAtttribute2( rs.getDate(ATTTRIBUTE2) );
			entity 1.setAtttribute3( rs.getDouble(ATTTRIBUTE3) );
			entity 1.setAtttribute4( rs.getString(ATTTRIBUTE4) );
			entity 1.setAtttribute5( rs.getFloat(ATTTRIBUTE5) );
			entity 1.setAtttribute6( rs.getInteger(ATTTRIBUTE6) );
			entity 1.setAtttribute7( rs.getString(ATTTRIBUTE7) );

			result.add(entity 1);
		}
		return result;
	}

	public void createEntity 1(Entity 1 element) throws DaoException {
		LOG.debug("Creating Entity 1");
		Connection cnx = null;
		PreparedStatement statement = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(CREATE_QUERY);
			element.setId(UUID.randomUUID().toString());
			statement.setString(1, element.getId());
			// Start of user code create
			statement.setBoolean(2, element.getAttribute1());
			statement.setDate(3, new Date(element.getAtttribute2().getTime()));
			statement.setString(4, element.getAtttribute3());			
			statement.setString(5, element.getAtttribute4());			
			statement.setDouble(6, element.getAtttribute5());
			statement.setInt(7, element.getAtttribute6());
			statement.setString(8, element.getAtttribute7());
			// End of user code

			statement.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	
	public void updateEntity 1(Entity 1 element) throws DaoException {
		LOG.debug("Updating Entity 1");
		Connection cnx = null;
		PreparedStatement statement = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(UPDATE_QUERY);
			// Start of user code update
			statement.setBoolean(1, element.getAttribute1());
			statement.setDate(2, new Date(element.getAtttribute2().getTime()));
			statement.setString(3, element.getAtttribute3());			
			statement.setString(4, element.getAtttribute4());			
			statement.setDouble(5, element.getAtttribute5());
			statement.setInt(6, element.getAtttribute6());
			statement.setString(7, element.getAtttribute7());
			// End of user code
			statement.setString(8,element.getId());
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	
	public void deleteEntity 1(Entity 1 element) throws DaoException {
		LOG.debug("Deleting Entity 1");
		Connection cnx = null;
		PreparedStatement statement = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(DELETE_QUERY);
			statement.setString(1, element.getId());
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	
	public Collection<Entity 1> findAllEntity 1s() throws DaoException {
		LOG.debug("Find all Entity 1");
		Connection cnx = null;
		Statement statement = null;
		ResultSet rs = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.createStatement();
			rs = statement.executeQuery(FIND_ALL_QUERY);

			Collection<Entity 1> result = createList(rs);
			return result;
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(rs!=null){rs.close();}
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}	
	
	public Entity 1 findEntity 1ById(String id) throws DaoException {
		LOG.debug("Find Entity 1 by Id");
		Connection cnx = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(FIND_BY_ID);
			statement.setString(1,id);			
			rs = statement.executeQuery();
			Entity 1 result = new Entity 1();
			result.setId(id);
			if (rs.next()) {
				result.setAttribute1( rs.getBoolean(ATTRIBUTE1) );
				result.setAtttribute2( rs.getDate(ATTTRIBUTE2) );
				result.setAtttribute3( rs.getDouble(ATTTRIBUTE3) );
				result.setAtttribute4( rs.getString(ATTTRIBUTE4) );
				result.setAtttribute5( rs.getFloat(ATTTRIBUTE5) );
				result.setAtttribute6( rs.getInteger(ATTTRIBUTE6) );
				result.setAtttribute7( rs.getString(ATTTRIBUTE7) );
			}
			return result;
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(rs!=null){rs.close();}
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	
	public Collection<Entity 1> findEntity 1sByAttribute1(Boolean attribute1) throws DaoException {
		LOG.debug("Find Entity 1 by Attribute1");
		Connection cnx = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(FIND_BY_ATTRIBUTE1);
			statement.setBoolean(1,attribute1);
			rs = statement.executeQuery();

			Collection<Entity 1> result = createList(rs);
			return result;
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(rs!=null){rs.close();}
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	
	public Collection<Entity 1> findEntity 1sByAtttribute2(Date atttribute2) throws DaoException {
		LOG.debug("Find Entity 1 by Atttribute2");
		Connection cnx = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(FIND_BY_ATTTRIBUTE2);
			statement.setDate(1,atttribute2);
			rs = statement.executeQuery();

			Collection<Entity 1> result = createList(rs);
			return result;
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(rs!=null){rs.close();}
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	
	public Collection<Entity 1> findEntity 1sByAtttribute3(Double atttribute3) throws DaoException {
		LOG.debug("Find Entity 1 by Atttribute3");
		Connection cnx = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(FIND_BY_ATTTRIBUTE3);
			statement.setString(1,atttribute3);
			rs = statement.executeQuery();

			Collection<Entity 1> result = createList(rs);
			return result;
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(rs!=null){rs.close();}
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	
	public Collection<Entity 1> findEntity 1sByAtttribute4(String atttribute4) throws DaoException {
		LOG.debug("Find Entity 1 by Atttribute4");
		Connection cnx = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(FIND_BY_ATTTRIBUTE4);
			statement.setString(1,atttribute4);
			rs = statement.executeQuery();

			Collection<Entity 1> result = createList(rs);
			return result;
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(rs!=null){rs.close();}
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	
	public Collection<Entity 1> findEntity 1sByAtttribute5(Float atttribute5) throws DaoException {
		LOG.debug("Find Entity 1 by Atttribute5");
		Connection cnx = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(FIND_BY_ATTTRIBUTE5);
			statement.setDouble(1,atttribute5);
			rs = statement.executeQuery();

			Collection<Entity 1> result = createList(rs);
			return result;
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(rs!=null){rs.close();}
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	
	public Collection<Entity 1> findEntity 1sByAtttribute6(Integer atttribute6) throws DaoException {
		LOG.debug("Find Entity 1 by Atttribute6");
		Connection cnx = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(FIND_BY_ATTTRIBUTE6);
			statement.setInt(1,atttribute6);
			rs = statement.executeQuery();

			Collection<Entity 1> result = createList(rs);
			return result;
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(rs!=null){rs.close();}
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	
	public Collection<Entity 1> findEntity 1sByAtttribute7(String atttribute7) throws DaoException {
		LOG.debug("Find Entity 1 by Atttribute7");
		Connection cnx = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		try {
			cnx = Dsl.entity.gen.java.dao.testsConnectionUtils.getInstance().getConnection();
			statement = cnx.prepareStatement(FIND_BY_ATTTRIBUTE7);
			statement.setString(1,atttribute7);
			rs = statement.executeQuery();

			Collection<Entity 1> result = createList(rs);
			return result;
		} catch (SQLException e) {
			throw new DaoException("Erreur requete", e);
		} finally {
			try {
				if(rs!=null){rs.close();}
				if(statement!=null){statement.close();}
				if(cnx!=null){cnx.close();}
			} catch (SQLException e) {
				throw new DaoException("Erreur de fermeture JDBC", e);
			}
		}
	}
	


	//Start of user code
	//End of user code
}