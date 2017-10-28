<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/COMGM001.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/js/COMGM001.js" />"></script>
		<title>COMGM001 ログイン画面</title>
	</head>
	<body>
	<header>
		<p>Arise LoginPage</p>
	</header>
	<div id="main">
		<p class="form-title">Login</p>
		<spring:url value="/initComGm001" var="actionUrl"/>
    		<form:form modelAttribute="COMGM001Form" name="loginForm"  onsubmit="return formCheck()">
    			<p>UserID</p>
    			<p class="id"><input type="text" class="userId" name="userId"></p>
    			<p>PassWord</p>
    			<p class="pass"><input type="password" class="password" name="password"></p>
    			<p id="error_hyoji"></p>
    			<p class="submit"><input type="submit" class="btn btn-primary" value="確定" name="entryComGm001" formaction="${actionUrl}"></p>
   	 	</form:form>
   	 </div>
   	 <footer>
   	 </footer>
	</body>
</html>
