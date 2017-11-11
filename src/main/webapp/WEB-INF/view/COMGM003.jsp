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

				<label class="hidarizoroe">社員ID：<input type="text" name="Syain_txt" /></label>

				<label >生年月日：<input type="text" name="Birth_From_txt"/>
				～<input class="Birth_I" type="text" name="Birth_To_txt /">
				</label>

				<label class="hidarizoroe">前職：<input type="text" name="Maejob_txt"></label>

				<label>役職：<select name="Poji_lst"></select></label>

				<label>入社日：<input type="text" name="Entday_From_txt">
				～<input type="text" name="Entday_To_txt"></label>

				<label>現場名：<input type="text" name="Field_txt"></label>

				<label class="hidarizoroe">フェーズ：<select name="Phase_lst"></select></label>

				<label>単価：<input type="text" name="Prise_lst"></input></label>

		 		<label>最寄駅：
		 		<input type="text" name="Station_lst_1"></input>
			 	<input type="text" name="Station_lst_2"></input>
			 	<input type="text" name="Station_lst_3"></input>
			 	</label>

			 	<label>住所：
			 	<input id="Address" type="text" name="Address"></input>

			 	</label>
			 	<input type="submit" class="btn btn-default" value="検索" name="searchComGm003">
				<input type="submit" class="btn btn-default" value="戻る" name="searchComGm003">

		</div>
    	</form:form>
	</body>
</html>
