<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Biodata</title>
</head>
<body>
	<form method="post" action="simpan.awi">
		<input type="text" name="nama"><br>
		<input type="text" name="alamat"><br>
		<input type="submit" value="simpan">
	</form>
	Hello ${namaku}
</body>
</html>