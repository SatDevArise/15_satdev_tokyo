<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/css/layout.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/SIJGM002.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
 		<script src="<c:url value="/resources/js/SIJGM002.js" />"></script>
		<title>SIJGM002 社員情報新規登録・編集画面</title>
	</head>
	<body>
	<header>
		<h1>社員情報新規登録・編集画面</h1>
	</header>

	<div id="error_hyoji"></div>
	<spring:url value="/initSijGm002" var="actionUrl"/>
    	<form:form modelAttribute="SIJGM002Form" id="register" name = "SIJ002">
    		<input type="submit" class="btn btn-default" value="新規登録" name="entrySijGm002" formaction="${actionUrl}" onclick= "return formCheck()">
    		<input type="submit" class="btn btn-success" value="更新" name="updateSijGm002" formaction="${actionUrl}" onclick= "return formCheck()">
    		<input type="submit" class="btn btn-success" value="削除" name="deleteSijGm002" formaction="${actionUrl}" onclick="return confirmDelete()">
    		<input type="submit" class="btn btn-info" value="戻る" name="back" formaction="${actionUrl}">
    		<dl>
    			<dt>社員ID</dt>
    			<dd><form:input path="syainId" type="text" id="syainId" name="syainId" disabled="true"/></dd>
    			<dt>氏名</dt>
    			<dd><form:input path="name" type="text" id="name" name="name" /></dd>
    			<dt>生年月日</dt>
    			<dd><form:input path="seinengappi" type="text" id="seinengappi" name="seinengappi" /></dd>
    			<dt>住所</dt>
    			<dd><form:input path="address" type="text" id="address" name="address" /></dd>
    			<dt>最寄り駅</dt>
    			<dd><form:input path="moyoriStation1" type="text" id="moyoriStation1" name="moyoriStation1" />
    				<form:input path="moyoriStation2" type="text" id="moyoriStation2" name="moyoriStation2" />
    				<form:input path="moyoriStation3" type="text" id="moyoriStation3" name="moyoriStation3" />
    			</dd>
    			<dt>入社日</dt>
    			<dd><form:input path="hireDate" type="text" id="hireDate" name="hireDate" /></dd>
    			<dt>前職</dt>
    			<dd><form:input path="previous" type="text" id="previous" name="previous" /></dd>
    			<dt>出身地</dt>
    			<dd><form:input path="birthPlace" type="text" id="birthPlace" name="birthPlace" /></dd>
    			<dt>役職</dt>
    			<dd><form:input path="position" type="text" id="position" name="position" /></dd>
    			<dt>チーム</dt>
    			<dd><form:input path="teamName" type="text" id="teamName" name="teamName" /></dd>
    			<dt>フェーズ</dt>
    			<dd><form:input path="phase" type="text" id="phase" name="phase" /></dd>
    			<dt>単価</dt>
    			<dd><form:input path="tanka" type="number" id="tanka" name="tanka" /></dd>
    		</dl>

    		<input type="submit" class="btn btn-default" value="新規登録" name="entrySijGm002" formaction="${actionUrl}" onclick= "return formCheck()">
    		<input type="submit" class="btn btn-success" value="更新" name="updateSijGm002" formaction="${actionUrl}" onclick= "return formCheck()">
    		<input type="submit" class="btn btn-success" value="削除" name="deleteSijGm002" formaction="${actionUrl}" onclick="return confirmDelete()">
    		<input type="submit" class="btn btn-info" value="戻る" name="back" formaction="${actionUrl}">
    	</form:form>
	</body>
</html>