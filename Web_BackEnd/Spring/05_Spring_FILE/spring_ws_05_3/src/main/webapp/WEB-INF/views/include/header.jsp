<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%-- User를 사용하기 위해 dto 패키지를 import 한다. --%>
<%@ page import="com.ssafy.ws.model.dto.*"%>
<%-- jstl의 core 라이브러리를 사용하기 위해 taglib를 이용한다. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--절대경로를 쉽게 사용하기 위해 session에 root를 key로 컨텍스트 루트 경로를 저장해둔다. --%>
<c:set value="${pageContext.request.contextPath }" scope="session" var="root"></c:set>

<%-- bootstrap 관련 코드를 등록한다. --%>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
<%-- 프로젝트에서 정의한 CSS를 참조할 때 resources 경로를 참조한다. --%>
<link rel="stylesheet" href="${root }/resources/css/common.css">
<style>
</style>
<div class="container">
	<img src="${root }/resources/img/ssafy_logo.png" id="ssafy_logo">
	<h1 class="display-4 text-center">도서 관리</h1>
	<br>
	<!-- 코드작성 -->
</div>