<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>	
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JMTBanking</title>
<link rel="stylesheet" type="text/css" href="/style.css" media="all">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
</head>
<body>

<div id="container">
	<h1 id="header">JMTBanking</h1>
	<div id="notification">
		<% if (request.getAttribute("error") != null) {
		Exception e = (Exception) request.getAttribute("error");
		out.println("<div id=\"error\">Error: " + e.getMessage() + "</div>");
		} %>
	</div>
	<div id="content">