package org.obeonetwork.demo.weblog.ui.main.forms;

// Start of user code for import 
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

// End of user code for import

/**
 * Implementation of <strong>ViewComments Form</strong>
 * Scenario : ViewComments
 *
 */
public class ViewCommentsForm extends ValidatorForm {
	private static final long serialVersionUID = 1L;

    /**
     * Attributes
     */
	public String email = null;
	public String content = null;
	public Collection log = new ArrayList();		
	public Collection comments = new ArrayList();		
	public String name = null;
	public String website = null;

	/**
	 * Return email
	 * @return 
	 */
	 public String getEmail() {
		return email;
	}
	
	/**
	 * Set a value to parameter email.
	 * @param email 
	 */
	 public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Return content
	 * @return 
	 */
	 public String getContent() {
		return content;
	}
	
	/**
	 * Set a value to parameter content.
	 * @param content 
	 */
	 public void setContent(String content) {
		this.content = content;
	}
	/**
	 * Return log
	 * @return 
	 */
	 public Collection getLog() {
		return log;
	}
	
	/**
	 * Set a value to parameter log.
	 * @param log 
	 */
	 public void setLog(Collection log) {
		this.log = log;
	}
	/**
	 * Return comments
	 * @return 
	 */
	 public Collection getComments() {
		return comments;
	}
	
	/**
	 * Set a value to parameter comments.
	 * @param comments 
	 */
	 public void setComments(Collection comments) {
		this.comments = comments;
	}
	/**
	 * Return name
	 * @return 
	 */
	 public String getName() {
		return name;
	}
	
	/**
	 * Set a value to parameter name.
	 * @param name 
	 */
	 public void setName(String name) {
		this.name = name;
	}
	/**
	 * Return website
	 * @return 
	 */
	 public String getWebsite() {
		return website;
	}
	
	/**
	 * Set a value to parameter website.
	 * @param website 
	 */
	 public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * Reset all properties to their default values.
	 *
	 * @param mapping The mapping used to select this instance
	 * @param request The servlet request we are processing
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.email = null;
		this.content = null;
		this.log.clear();
		this.comments.clear();
		this.name = null;
		this.website = null;
	}

// Start of user code for other methods  	
// End of user code
	
}