package org.obeonetwork.demo.weblog.ui.grant.forms;

// Start of user code for import 
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

// End of user code for import

/**
 * Implementation of <strong>GrantAdministrate Form</strong>
 * Scenario : Grant
 *
 */
public class GrantAdministrateForm extends ValidatorForm {
	private static final long serialVersionUID = 1L;

    /**
     * Attributes
     */
	public String hidden = null;
	public Collection moderators = new ArrayList();		
	public Collection admins = new ArrayList();		
	public Collection users = new ArrayList();		
	public String add = null;
	public String remove = null;

	/**
	 * Return hidden
	 * @return 
	 */
	 public String getHidden() {
		return hidden;
	}
	
	/**
	 * Set a value to parameter hidden.
	 * @param hidden 
	 */
	 public void setHidden(String hidden) {
		this.hidden = hidden;
	}
	/**
	 * Return moderators
	 * @return 
	 */
	 public Collection getModerators() {
		return moderators;
	}
	
	/**
	 * Set a value to parameter moderators.
	 * @param moderators 
	 */
	 public void setModerators(Collection moderators) {
		this.moderators = moderators;
	}
	/**
	 * Return admins
	 * @return 
	 */
	 public Collection getAdmins() {
		return admins;
	}
	
	/**
	 * Set a value to parameter admins.
	 * @param admins 
	 */
	 public void setAdmins(Collection admins) {
		this.admins = admins;
	}
	/**
	 * Return users
	 * @return 
	 */
	 public Collection getUsers() {
		return users;
	}
	
	/**
	 * Set a value to parameter users.
	 * @param users 
	 */
	 public void setUsers(Collection users) {
		this.users = users;
	}
	/**
	 * Return add
	 * @return 
	 */
	 public String getAdd() {
		return add;
	}
	
	/**
	 * Set a value to parameter add.
	 * @param add 
	 */
	 public void setAdd(String add) {
		this.add = add;
	}
	/**
	 * Return remove
	 * @return 
	 */
	 public String getRemove() {
		return remove;
	}
	
	/**
	 * Set a value to parameter remove.
	 * @param remove 
	 */
	 public void setRemove(String remove) {
		this.remove = remove;
	}

	/**
	 * Reset all properties to their default values.
	 *
	 * @param mapping The mapping used to select this instance
	 * @param request The servlet request we are processing
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.hidden = null;
		this.moderators.clear();
		this.admins.clear();
		this.users.clear();
		this.add = null;
		this.remove = null;
	}

// Start of user code for other methods  	
// End of user code
	
}