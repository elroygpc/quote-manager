<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

   
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">	    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	    <meta name="description" content="">
	    <meta name="author" content="">
		
		<title>Quote Manager</title>
		
		<!-- Bootstrap Version 3.3.7 CSS-->
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css"/>" />
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap-theme.css"/>" />
		
		<!-- JavaScript -->
		<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
		<script src="<c:url value="/resources/js/jquery-3.2.1.js"/>"></script>
		
		
		
		<style>
			body {
    			padding-top: 50px;
			}	
			.starter-template {
			    padding: 40px 15px;
			    text-align: center;
			}
		</style>
	</head>
<body>

<!-- NAVBAR
================================================== -->
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
    	<div class="navbar-header">
        	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            	<span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
          	</button>
         	<a class="navbar-brand" href="#">Quote Manager</a>
        </div><!--/.nav-header -->
        
        <div id="navbar" class="collapse navbar-collapse">
        	<ul class="nav navbar-nav">
	            <li class="active"><a href="#">Home</a></li>
	            <li><a href="#about">About</a></li>
	            <li><a href="#contact">Contact</a></li>
          	</ul>
        </div><!--/.nav-collapse -->
	</div><!-- .container -->
</nav>