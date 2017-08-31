<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<html>

	<head>
		<title>Home</title>
	</head>

	<body>
		<form action="register" method="get">
			name: <input type="text" name="name"><br><br> 
			phone no:<input type="text" name="phno"><br><br>
			<input type="submit" value="Register"> <br><br>
		</form>

		<form action="show" method="get">
			<input type="submit" value="Show">
		</form>

		<form action="delete" method="get">
			ID: <input type="text" name="id"><br><br>
			<input type="submit" value="Delete">
		</form>
		
		<table>
			<tr>
				<th> ID </th>
				<th> Name</th>
				<th> Phno </th>
			</tr>
			<c:forEach items="${show_data}" var="datalist">
				<tr>
					<td>${datalist.id}</td>
					<td>${datalist.name}</td>
					<td>${datalist.phno}</td>
				</tr>
			</c:forEach>
		</table>
	</body>

	</html>