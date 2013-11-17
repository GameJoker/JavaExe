<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ page import="fr.esigelec.projetStruts.dto.*,java.util.*,org.apache.commons.lang.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>famille</title>
</head>
<body>
<h1>Liste des famille :</h1>
<div>
<%
List<Personne> l=(List<Personne>)request.getAttribute("liste");
for(Personne p:l){ %>
<%=p.getId()%> - <%=StringEscapeUtils.escapeHtml(p.toString()) %>
<a href="SupprimerPersonne.do?id=<%=p.getId() %>" title="supprimer">X</a><br/>

<%} %>
<a href="RetourIndex.do">Ajouter une nouvelle personne</a>
</div>
<div>
</body>
</html>