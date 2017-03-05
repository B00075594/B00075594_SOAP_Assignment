<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%><%@taglib
	uri="http://java.sun.com/jsf/core" prefix="f"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.util.ArrayList" %>
<%@page import = "java.util.List" %>
<%@page import = "servicemgr.ServiceImplementationService" %>
<%@page import = "servicemgr.ServiceImplementation" %>
<%@page import = "servicemgr.Student" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Rachel's Student Files</title>
	</head>
	<body>
	
		<f:view>
			<h:form style="height: 360px; " action = "POST">
				<h:commandButton value="Show All" id="btnShow" action="show" name = "button"><f:actionListener /></h:commandButton>
				<h:commandButton id="btnCreate" value="Create" action="create" name = "button"><f:actionListener /></h:commandButton>
				<br>
				<br>
				<br>
				<h:inputText id="txtId" value="Id"></h:inputText>
				<br>
				<br>
				<br>
				<h:inputText id="txtName" value="Name"></h:inputText>
				<br>
				<br>
				<br>
				<h:inputText id="tbnAge" value="Age" style="age"></h:inputText>
				<br>
				<br>
				<br>
				<h:selectOneListbox id="courseChildcare" value="Childcare" size="childcare">
					<f:selectItem id="courseScience" itemLabel="Computer Science" itemValue="science" />
					<f:selectItem itemLabel="Childcare" itemValue="childcare" id="courseChildcare" />
					<f:selectItem itemLabel="Engineering" itemValue="engineering" id="courseEngineering" />
					<f:selectItem itemLabel="Sports Management" itemValue="sportsMgnt" id="courseSports" />
					<f:selectItem itemLabel="Horticultusre" itemValue="horticulture" id="courseHorticulture" />
					<f:selectItem itemLabel="Nursing" itemValue="nursing" id="courseNursing" />
				</h:selectOneListbox>
				<br>
				<br>
				<h:dataTable border="1" id="id" value="ID">
					<h:column id="column1">
						<f:facet name="header">
							<h:outputText value="ID" id="id"></h:outputText>
						</f:facet>
					</h:column>
					<h:column id="column2">
						<f:facet name="header">
							<h:outputText value="Name" id="name"></h:outputText>
						</f:facet>
					</h:column>
					<h:column id="column3">
						<f:facet name="header">
							<h:outputText id="age" value="Age"></h:outputText>
						</f:facet>
					</h:column>
					<h:column id="column4">
						<f:facet name="header">
							<h:outputText id="course" value="Course"></h:outputText>
						</f:facet>
					</h:column>
				</h:dataTable>
				<br>
				<br>
				<br>
				<h:commandButton id="btnUpdate" value="Update" action="update" name = "button"><f:actionListener /></h:commandButton>
				<h:commandButton value="Delete" action="delete" id="btnDelete" name = "button"><f:actionListener /></h:commandButton>   
			</h:form>
		</f:view>
	</body>
</html>

<%
	Student student = new Student();
	List<Student> listOfStudents = new ArrayList<Student>();
	
	ServiceImplementationService service = new ServiceImplementationService();
	ServiceImplementation connection = service.getServiceImplementationPort();
	
	String buttonPressed = request.getParameter("button");

	String age = request.getParameter("age");
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String course = request.getParameter("course");
	
	if (buttonPressed.equals("Delete")){
		listOfStudents = connection.delete(id);
		out.println("DELETED!!!!!!!!!!!!!!!!!");
	}
		
	else if(buttonPressed.equals("Update")){
		//
	}
		
	else if(buttonPressed.equals("Show")){
		//
	}
	
	else if(buttonPressed.equals("Create")){
		//
	}
	else
		out.println("ERROR");
		
%>