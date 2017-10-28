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
			<Syain >
				<label>社員ID：</label>
				<input type="text" name="Syain_txt" />
			</Syain>
			<Birth>
				<label>生年月日：</label>
				<input type="text" name="Birth_From_txt"/>
				<label >～</label>
			 	<input type="text" name="Birth_To_txt /">
			</Birth>
			<Maejob>
				<label >前職：</label>
			 	<input type="text" name="Maejob_txt">
			</Maejob>
			<Position>
				<label>役職：</label>
			 	<select name="Poji_lst"></select>
			</Position>
			<Entday>
				<label>入社日：</label>
				<input type="text" name="Entday_From_txt">
			 	<label>～</label>
			 	<input type="text" name="Entday_To_txt">
			</Entday>
			<Field>
				<label>現場名：</label>
			 	<input type="text" name="Field_txt">
			</Field>
			<Phase>
				<label>フェーズ：</label>
		 		<select name="Phase_lst"></select>
			</Phase>
			<Prise>
				<label>単価：</label>
			 	<select name="Prise_lst"></select>
			</Prise>
		 	<Station>
		 		<label>最寄駅：</label>
			 	<select name="Station_lst_1"></select>
			 	<select name="Station_lst_2"></select>
			 	<select name="Station_lst_3"></select>
		 	</Station>
		 	<Address>
			 	<label>住所：</label>
			 	<select name="Station_lst_1"></select>
			 	<input type="submit" class="btn btn-default" value="検索" name="searchComGm003">
				<input type="submit" class="btn btn-default" value="戻る" name="searchComGm003">
		 	</Address>
		</div>
    	</form:form>
	</body>
</html>
