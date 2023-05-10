<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car  List</title>
  <style>
      /* Add some basic styling */
      body {
        font-family: sans-serif;
        margin: 0;
        padding: 0;
      }
      header {
        background-color: #333;
        color: #fff;
        padding: 1em;
      }
      main {
        padding: 1em;
      }
      input[type="text"], input[type="number"], input[type="file"], textarea {
        display: block;
        margin-bottom: 1em;
      }
      input[type="submit"], input[type="reset"] {
        background-color: #333;
        color: #fff;
        padding: 0.5em 1em;
        border: none;
        border-radius: 4px;
        cursor: pointer;
      }
      input[type="submit"]:hover, input[type="reset"]:hover {
        background-color: #555;
      }
    </style>
</head>
<body>
    <h2>Add a Car</h2>
      <form action="addnewcar.jsp" method="POST">
	<label for="year">Year:</label>
	<input type="number" id="year" name="year" min="1900" max="2099" required>
        <label for="make">Make:</label>
        <input type="text" id="make" name="make" required>
        <label for="model">Model:</label>
        <input type="text" id="model" name="model" required>
        <label for="color">Color:</label>
        <input type="text" id="color" name="color" required>
        <label for="mileage">Mileage:</label>
        <input type="number" id="mileage" name="mileage" min="0" required>
        <input type="submit" value="Add Car">
      </form>
      
      <hr>
      
      <h2>Delete a Car</h2>
      <form action="removecar.jsp" method="POST">
        <label for="deletemake">Make:</label>
        <input type="text" id="deletemake" name="deletemake" required>
        <label for="deletemodel">Model:</label>
        <input type="text" id="deletemodel" name="deletemodel" required>
        <input type="reset" value="Clear">
        <input type="submit" value="Delete Car">
      </form>
	<h1> Car List</h1>
	Id       |    Make		|		Model |   Year    | Color    | Mileage<br/>
	------------------------------------------------------------------------------<br/>
	
	<c:forEach var="car" items="${carsList}">
		${car.id}	|	${car.make}	|	${car.model} | ${car.year}  | ${car.color}  | ${car.mileage}   
</br>
	</c:forEach>
	
<br/>
Above should display the list of cars in the system...
</body>
</html>