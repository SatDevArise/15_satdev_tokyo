<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/js/SIJGM002.js" />"></script>
		<title>SIJGM002 社員情報新規登録・編集画面</title>
	</head>
	<body>
	    <spring:url value="/initSijGm002" var="actionUrl"/>
    	<form:form modelAttribute="SIJGM002Form">
    		<form:input path="user" />
    		<input type="submit" class="btn btn-default" value="新規登録" name="entrySijGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-success" value="更新" name="updateSijGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-info" value="戻る" name="backComGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-warning" value="戻る" name="backSijGm001" formaction="${actionUrl}">
    	</form:form>
	</body>
</html>
