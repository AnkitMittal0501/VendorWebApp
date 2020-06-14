<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>SA
<head>
<meta charset="ISO-8859-1">
<title>Create Vendor</title>
</head>
<body>
<form action="updateVendor" method="post">
<pre>
Id: <input type="text" name="id" value="${vendor.id}" readonly/>
Name: <input type="text" name="name"  value="${vendor.name}"/>
Code: <input type = "text" name="code" value="${vendor.code}" />
Type:<select name="type">
<option ${vendor.type == 'Regular'?'selected':'' } >Regular</option>
<option ${vendor.type == 'Contract'?'selected':'' } >Contract</option>

</select>
Save :<input type="submit" value="save"/>
</pre>

</form>

</body>
</html>