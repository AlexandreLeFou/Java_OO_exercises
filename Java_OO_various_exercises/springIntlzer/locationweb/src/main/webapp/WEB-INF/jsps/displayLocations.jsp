<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html >

<html>
<head>
    <style>
        table, th, td {
            border: 3px solid black;
        }


    </style>
    <meta http-equiv="Content-Type" content="text/html" ; charset=UTF-8">
    <title>View all records</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<h2>Locations:</h2>
<table>
    <tr>
        <th>id</th>
        <th>code</th>
        <th>name</th>
        <th>type</th>
        
    </tr>


      <c:forEach items="${locations}" var="location">
      <tr>
        <td>${location.id}</td>
        <td>${location.code}</td>
        <td>${location.name}</td>
        <td>${location.type}</td>


          <td>  <a href="deleteLocation?id=${location.id}">   Delete row</a></td>
          <td>  <a href="updateLocation?id=${location.id}">   Update row</a></td>

      </c:forEach>
    </tr>
</table>
<br><br><br>
<a href="showCreate"> Add a New Entry </a>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>


</body>
</html>