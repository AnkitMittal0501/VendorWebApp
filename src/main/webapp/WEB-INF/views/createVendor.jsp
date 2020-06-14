<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Vendor</title>
</head>
<body>
<form action="savevendor" method="post">
<pre>
Id: <input type="text" name="id" />
Name: <input type="text" name="name" />
Code: <input type = "text" name="code" />
Type:<select name="type">
<option value="Regular" >Regular</option>
<option value="Contract" >Contract</option>

</select>
<input type="submit" value="save"/>
</pre>

</form>
${msg}
<a href="displayVendors">View All</a>
</body>
</html>