<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>

</head>
<body>
 
<h2>Producto Manager</h2>
<c:url var="addAction" value="/producto/add" ></c:url>

<form:form action="${addAction}" commandName="producto" modelAttribute="producto">


<h3>${message}</h3>

 <c:if test="${!empty producto.nombre}">
    <tr>
        <td>
            <form:label path="id">
                <spring:message text="ID"/>
            </form:label>
        </td>
        <td>
            <form:input path="id" readonly="true" size="8"  disabled="true" /><br>
            <form:hidden path="id" />
        </td> 
    </tr>
    </c:if>
 
 NOMBRE: <form:input path="nombre"/><br>
 <form:errors path="nombre"/>
     
 PRECIO: <form:input path="precio"/><br>
 <form:errors path="precio"/>
                   

 <c:if test="${!empty producto.nombre}">
                <input type="submit"
                    value="<spring:message text="Edit Producto"/>" />
            </c:if>

<c:if test="${empty producto.nombre}">
                <input type="submit"
                    value="<spring:message text="Add Producto"/>" />
            </c:if>
</form:form>
     

    <h3>Products</h3>
<table class="data" border="1">
<tr>
    <th>ID</th>
    <th>NOMBRE</th>
    <th>PRECIO</th>
    <th>REMOVE</th>
    <th>EDIT</th>
</tr>
<c:forEach items="${productoList}" var="producto">
    <tr>
        <td>${producto.id}</td>
        <td>${producto.nombre}</td>
        <td>${producto.precio}</td>
	<td><a href="<c:url value='/delete/${producto.id}'/>">Delete</a></td>
	<td><a href="<c:url value='/edit/${producto.id}'/>">Edit</a></td>
    </tr>
</c:forEach>
</table>     
</body>
</html>