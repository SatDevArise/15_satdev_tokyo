<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/GBJGM002.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/js/GBJGM002.js" />"></script>
		<title>GBJGM002 現場情報新規登録・編集画面</title>
	</head>
	<body>
	<header>
		<p>現場情報新規登録・編集画面</p>
	</header>
	<spring:url value="/initGbjGm002" var="actionUrl"/>
    	<form:form modelAttribute="GBJGM002Form" id="register">
    	    		<dl>
    			<dt>現場ID</dt>
    			<dd><input type="text" id="genba_id" name="genba_id" disabled></dd>
    			<dt>現場名</dt>
    			<dd><input type="text" id="genba_na" name="genba_na"></dd>
    			<dt>住所</dt>
    			<dd><input type="text" id="address" name="address"></dd>
    			<dt>最寄り駅</dt>
    			<dd><input type="text" id="moyori_1_station" name="moyori_1_station"></dd>
    			<dt>最寄り駅2</dt>
    			<dd><input type="text" id="moyori_2_station" name="moyori_2_station"></dd>
    			<dt>最寄り駅3</dt>
    			<dd><input type="text" id="moyori_3_station" name="moyori_3_station"></dd>
    			<dt>作業内容</dt>
    			<dd><input type="number" id="work" name="work"></dd>
    			<dt>フェーズ</dt>
    			<dd><input type="text" id="phase" name="phase"></dd>
    		</dl>
    		<input type="submit" class="btn btn-default" value="新規登録" name="entryGbjGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-success" value="更新" name="updateGbjGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-success" value="削除" name="deleteGbjGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-info" value="戻る" name="backComGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-warning" value="戻る" name="backGbjGm001" formaction="${actionUrl}">
    	</form:form>
	</body>
</html>
