<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
This is home
<sec:authorize access="hasAnyRole('ROLE_ADMIN')">
<a href="${pageContext.request.contextPath}/secure/biodata/biodata.html">Form biodata</a>
</sec:authorize>
</body>
</html>