<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<title>imageView</title>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- <script type="text/javascript">
					$(document).ready(function () {
						$("#sort3").click(function () {
							ajaxSort3();
						});
					});

				</script>

				<script type="text/javascript">
					$(document).ready(function () {
						$("#sort4").click(function () {
							ajaxSort4();
						});
					});

				</script>

				<script type="text/javascript">
					$(document).ready(function () {
						$("#sort5").click(function () {
							ajaxSort5();
						});
					});

				</script> -->

<script type="text/javascript">
	if ('${msg}') {
		var msg = '${msg}';
		alert(msg);
	}
</script>
<!-- <script>
					function ajaxSort5() {
						$.ajax({

							url: "/ajaxSort5",
							type: "POST",
							data: {
								col: "sort5"
							},
							success: function (result) {

								$("#fileUpload").empty();
								var form = "<form action='/upload5' method='post' enctype='multipart/form-data'><input type='file' name='uploadFile' id='upFile' /><button style='margin-left: 330px;' type='submit'>파일업로드</button></form>";
								$("#fileUpload").append(form);

								$("#imgView").empty();
								for (i = 0; i < result.length; i++) {
									var tag = "<img width='100' height='100' src = 'img/sort5/" + result[i].imgTitle + "'/>";

									$('#imgView').append(tag);

								}
							},
							error: function (request, status, error) {
								alert("code = " + request.status + "message = " + request.responseText + "error = " + error);
							}
						});
					}
				</script>
				<script>
					function ajaxSort4() {
						$.ajax({

							url: "/ajaxSort4",
							type: "POST",
							data: {
								col: "sort4"
							},
							success: function (result) {

								$("#imgView").empty();
								for (i = 0; i < result.length; i++) {
									var tag = "<img width='200' height='200' src = 'img/sort4/" + result[i].imgTitle + "'/>";

									$('#imgView').append(tag);

								}
								$("#fileUpload").empty();
								var form = "<form action='/upload4' method='post' enctype='multipart/form-data'><input type='file' name='uploadFile' id='upFile' /><button style='margin-left: 330px;' type='submit'>파일업로드</button></form>";
								$("#fileUpload").append(form);

							},
							error: function (request, status, error) {
								alert("code = " + request.status + "message = " + request.responseText + "error = " + error);
							}
						});
					}
				</script>
				<script>
					function ajaxSort3() {
						$.ajax({

							url: "/ajaxSort3",
							type: "POST",
							data: {
								col: "sort3"
							},
							success: function (result) {

								$("#imgView").empty();
								for (i = 0; i < result.length; i++) {
									var tag = "<img width='300' height='300' src = 'img/sort3/" + result[i].imgTitle + "'/>";

									$('#imgView').append(tag);

								}
								$("#fileUpload").empty();
								var form = "<form action='/upload3' method='post' enctype='multipart/form-data'><input type='file' name='uploadFile' id='upFile' /><button style='margin-left: 330px;' type='submit'>파일업로드</button></form>";
								$("#fileUpload").append(form);

							},
							error: function (request, status, error) {
								alert("code = " + request.status + "message = " + request.responseText + "error = " + error);
							}
						});
					}
				</script> -->
</head>

<body>
	<div style="display: inline-block">
		<button type="button" onclick="location.href='/sort3'">sort3</button>
		<button type="button" onclick="location.href='/sort4'">sort4</button>
		<button type="button" onclick="location.href='/sort5'">sort5</button>
	</div>

	<div id="fileUpload" style="display: inline-block">
		<form action="/upload5" method="post" enctype="multipart/form-data">
			<input type="file" name="uploadFile" id="upFile" />
			<button style="margin-left: 330px;" type="submit">파일업로드</button>
		</form>
	</div>

	<br>

	<div id="imgView">
		<c:forEach items="${imgList}" var="imgList">
			<img src="img/sort5/${imgList.imgTitle}" width="100" height="100" />
		</c:forEach>
	</div>

</body>

</html>