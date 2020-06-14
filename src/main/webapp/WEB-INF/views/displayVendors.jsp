<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vendors Data</title>
</head>
<body>
<h3>Data for all Vendors listed below:</h3>
<table >
<tr>
<th>Id</th>
<th>Name</th>
<th>Code</th>
<th>Type</th>
</tr>

<c:forEach items="${vendorList}" var="vendor" >
 <tr>
<td> ${vendor.id}</td> 
<td> ${vendor.name}</td> 
<td> ${vendor.code}</td> 
<td> ${vendor.type}</td> 
<td><a href="deleteVendor?id=${vendor.id}">Delete</a></td>
<td><a href="showUpdate?id=${vendor.id}">Edit</a></td>

</tr>
</c:forEach>
</table>
<a href="showCreate">Add Vendor</a>
</body>
</html>