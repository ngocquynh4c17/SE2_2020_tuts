<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- Include the JSTL Core library in JSP --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Clothes Shop</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
		<div class="container">
		    <br>
			<h3 class="text-center">Shirt List</h3>
            <br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Style</th>
						<th>Name</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
				    <%-- c:forEach => basic iteration tag --%>
					<c:forEach var="shirt" items="${listShirt}">
						<tr>
						    <%-- c:out => for expressions --%>
							<td><c:out value="${shirt.shirtID}" /></td>
							<td><c:out value="${shirt.shirtStyle}" /></td>
							<td><c:out value="${shirt.shirtName}" /></td>
							<td><c:out value="${shirt.Price}" /></td>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<div class="container">
		    <br>
			<h3 class="text-center">Dress List</h3>
            <br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Style</th>
						<th>Name</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
				    <%-- c:forEach => basic iteration tag --%>
					<c:forEach var="dress" items="${listDress}">
						<tr>
						    <%-- c:out => for expressions --%>
							<td><c:out value="${dress.dressID}" /></td>
							<td><c:out value="${dress.dressStyle}" /></td>
							<td><c:out value="${dress.dressName}" /></td>
							<td><c:out value="${dress.Price}" /></td>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<div class="container">
		    <br>
			<h3 class="text-center">Accessories List</h3>
            <br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Style</th>
						<th>Name</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
				    <%-- c:forEach => basic iteration tag --%>
					<c:forEach var="acess" items="${listAcess}">
						<tr>
						    <%-- c:out => for expressions --%>
							<td><c:out value="${acess.acessID}" /></td>
							<td><c:out value="${acess.acessStyle}" /></td>
							<td><c:out value="${acess.acessName}" /></td>
							<td><c:out value="${acess.Price}" /></td>
					</c:forEach>
				</tbody>
			</table>
		</div>
</body>
</html>
