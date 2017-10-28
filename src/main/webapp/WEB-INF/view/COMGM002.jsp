<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/COMGM002.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/js/COMGM002.js" />"></script>
		<title>COMGM002 メニュー画面</title>
	</head>
	<body>
	<header>
		<p>Arise MenuPage</p>
	</header>
	<div id="main">
		<spring:url value="/initComGm002" var="actionUrl"/>
    		<form:form modelAttribute="COMGM002Form">
    		<p class="form-title">メニュー画面</p>
    		<%-- <form:input path="user" /><br> --%>
		 	<p class="employeeList"><input type="submit" class="btn btn-default" value="社員情報一覧表示画面" name="goSijGm001" formaction="${actionUrl}"></p><br>
			<p class="employeeRegister"><input type="submit" class="btn btn-success" value="社員情報新規登録・編集画面" name="goSijGm002" formaction="${actionUrl}"></p><br>
			<p class="genbaList"><input type="submit" class="btn btn-info" value="現場情報一覧表示画面" name="goGbjGm001" formaction="${actionUrl}"></p><br>
			<p class="genbaRegister"><input type="submit" class="btn btn-warning" value="現場情報新規登録・編集画面" name="goGbjGm002" formaction="${actionUrl}"></p>
    		</form:form>
    	</div>
    	<footer>
    	</footer>
	</body>
</html>
