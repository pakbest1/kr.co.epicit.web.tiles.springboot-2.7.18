<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1, maximum-scal=1, user-scalable=no" />
<!-- <title>사이트 제목</title> -->
<style>/*
.header {
	background-color: red;
	height: 150px;
}

.contents {
	background-color: green;
	height: 500px;
}

.footer {
	background-color: blue;
	height: 100px;
}
*/</style>
</head>
<body>
<!-- Page Header -->
<tiles:insertAttribute name="header" />
<!-- /Page Header -->

<!-- Page Contents -->
<tiles:insertAttribute name="body" />
<!-- /Page Contents -->

<!-- Page Footer -->
<tiles:insertAttribute name="footer" />
<!-- /Page Footer -->
</body>
</html>