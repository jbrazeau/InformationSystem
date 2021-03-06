<%@ taglib
        uri="http://struts.apache.org/tags-html"
        prefix="html" %>
<%@ taglib
        uri="http://struts.apache.org/tags-bean"
        prefix="bean" %>
<%@ taglib
        uri="http://struts.apache.org/tags-logic"
        prefix="logic" %>
<%@ taglib 
        uri="http://displaytag.sf.net" 
        prefix="display" %>


<logic:messagesPresent>
   <bean:message key="errors.header"/>
   <ul>
   <html:messages id="error">
      <li><bean:write name="error"/></li>
   </html:messages>
   </ul>
   <bean:message key="errors.footer"/>
   <hr />
</logic:messagesPresent>

<html:form action="/manage/removecategory" method="POST">

<html:hidden property="event" value=""/>

<fieldset>
	<legend>Informations</legend>
	
	<table>
		<tr>
			<td>
				<html:link action="/manage/removecategory?event=unspecified">
					<bean:message key="RemoveCategory.select"/>
				</html:link>
			</td>
		</tr>
		<tr>
			<td><label for="hidden"><bean:message key="RemoveCategory.hidden"/></label> :</td>
			<td><html:text property="hidden" /></td>
		</tr>
		<tr>
			<td><label for="categoryDescription"><bean:message key="RemoveCategory.categoryDescription"/></label> :</td>
			<td><logic:iterate name="RemoveCategoryForm" id="categoryDescription_id" property="categoryDescription" /></td>
		</tr>
		<tr>
			<td><label for="logs"><bean:message key="RemoveCategory.logs"/></label> :</td>
			<td><logic:iterate name="RemoveCategoryForm" id="logs_id" property="logs" /></td>
		</tr>
	</table>
</fieldset>

<fieldset>
	<legend>Actions</legend>
	<table>
	</table>
</fieldset>

</html:form>