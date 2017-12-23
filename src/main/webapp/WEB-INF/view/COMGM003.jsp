<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/COMGM003.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/js/COMGM003.js" />"></script>
		<title>COMGM003 検索共通画面</title>
	</head>
	<body>
	   <spring:url value="/initComGm003" var="actionUrl"/>
    	<form:form modelAttribute="COMGM003Form">
		<div>

			<label class="hidarizoroe">社員ID：<form:input path="syainId"/></label>

			<label>生年月日：<form:input path="seinengappiFrom"/>
			～<form:input class="Birth_I" path="seinengappiTo"/>
			</label>

			<label class="hidarizoroe">前職：<form:input path="previous"/></label>

			<label>役職：<select name="psition"></select></label>

			<label>入社日：<form:input path="nyusyabiFrom"/>
			～<form:input path="nyusyabiTo"/></label>

 			<label>チーム：<form:input path="teamNa"/></label>

			<%-- <label>現場名：<form:input path="genbaNa"/></label> --%>

			<label class="hidarizoroe">フェーズ：<form:select path="phase"/></label>

			<label>単価：<form:input path="tanka"/></label>

			<label>最寄駅：
			<form:input path="moyori1Station"/>
			<form:input path="moyori2Station"/>
			<form:input path="moyori3Station"/>
			</label>

			<label>住所：
			<form:input id="Address" path="address"/>
			</label>

			<input type="submit" class="btn btn-default" value="検索" name="searchComGm003">
			<input type="submit" class="btn btn-default" value="戻る" name="back_btn">

	</div>
    </form:form>
	</body>
</html>
