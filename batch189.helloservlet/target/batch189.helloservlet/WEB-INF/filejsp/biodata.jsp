<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Biodata</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<form>
		<input type="text" id="nama" name="nama"><br>
		<input type="text" id="alamat" name="alamat"><br>
		<input type="text" id="tanggalLahir" name="tanggalLahir"><br>
		<input type="button" value="Simpan" onclick="simpan()">
		<input type="button" value="Reset" onclick="ketikaKlik()">
	</form>
	<div id="daftarbiodata">
	</div>
<script>
function tampilkanData(d) {
	var s = '<table>';
	$(d).each(function(index, element) {
		s += '<tr>';
		s += '<td>'+element.nama+'</td>'
		s += '<td>'+element.alamat+'</td>'
		s += '</tr>';
	});
	s += '</table>';
	$('#daftarbiodata').html(s);
}
function loadData() {
	$.ajax({
		type: 'get',
		url: '../biodata-rest/',		
		success: function(d) {
			tampilkanData(d);
		}
	});
}
function simpan() {
	$.ajax({
		type: 'post',
		url: '../biodata-rest/',
		data: {
			nama: $('#nama').val(),
			alamat: $('#alamat').val(),
			tanggalLahir: $('#tanggalLahir').val()
		},
		success: function(d) {
			tampilkanData(d);
		},
		error: function() {
			
		}
	});
}
function ketikaKlik() {
	location='biodata-reset.html';
}

$(document).ready(function() {
	loadData();
});
</script>
</body>
</html>