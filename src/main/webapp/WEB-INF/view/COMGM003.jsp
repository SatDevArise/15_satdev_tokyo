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

				<label class="hidarizoroe">社員ID：<input type="text" name="syain_id" /></label>

				<label >生年月日：<input type="text" name="seinengappi_from"/>
				～<input class="Birth_I" type="text" name="seinengappi_to "/>
				</label>

				<label class="hidarizoroe">前職：<input type="text" name="previous"></label>

				<label>役職：<select name="psition"></select></label>

				<label>入社日：<input type="text" name="Enyusyabi_from">
				～<input type="text" name="nyusyabi_to"></label>

				<label>チーム：<input type="text" name="team_na"></label>

				<label>現場名：<input type="text" name="genba_na"></label>

				<label class="hidarizoroe">フェーズ：<select name="phase"></select></label>

				<label>単価：<input type="text" name="tanka"></input></label>

		 		<label>最寄駅：
		 		<input type="text" name="moyori_1_station"></input>
			 	<input type="text" name="moyori_2_station"></input>
			 	<input type="text" name="moyori_3_station"></input>
			 	</label>

			 	<label>住所：
			 	<input id="Address" type="text" name="address"></input>

			 	</label>
			 	<input type="submit" class="btn btn-default" value="検索" name="seach_btn">
				<input type="submit" class="btn btn-default" value="戻る" name="back_btn">

		</div>
    	</form:form>
	</body>
</html>
