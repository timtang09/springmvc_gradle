<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>spring mvc + hibernate</title>
</head>
<body>
 

<h3>Contacts</h3>
<c:if  test="${!empty contactList}">
	<table class="data">
	<tr>
	    <th>id</th>
	    <th>name</th>
	    <th>email</th>
	</tr>
	<c:forEach items="${contactList}" var="contact">
	    <tr>
	        <td>${contact.id}</td>
	        <td>${contact.name}</td>
	        <td>${contact.email}</td>
	    </tr>
	</c:forEach>
	</table>
</c:if>
     
 
</body>
</html>