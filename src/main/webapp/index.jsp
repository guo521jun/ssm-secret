<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="scripts/css/bootstrap.css" rel="stylesheet" type="text/css" />
<script src="scripts/jquery-3.2.1.slim.js"></script>
<script src="scripts/js/bootstrap.js"></script>
<style type="text/css">
body {
	margin-top: 15px
}
</style>
</head>

<body>
	<div class="container">

		<div class="row" style="margin-top: 20px">
			<div class="col-md-7">
				<img alt="" src="images/1.jpg" height=400px width="600px">
			</div>
			<div class="col-md-5" style="margin-top: 10px">


				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Welcome</h3>
					</div>

					<div style="padding: 20px">
						<button class="btn btn-success" style="margin-left: 10px"
							id="btn1">登陆</button>
						<button class="btn btn-success smodal" style="margin-left: 170px"
							id="btn2">注册</button>

						
						<div id="mmm" class='modal fade'>
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<div class="close" data-dismiss='modal'>&times;</div>
										<h3>用户注册界面</h3>
									</div>
									<div class="modal-body">
										<h4>欢迎用户注册</h4>
										<form action="register" method="POST">
											<div class="form-group">
												<label>用户名称</label> <input class="form-control"
													placeholder="Name" name="user">
											</div>
											<div class="form-group" width=100%>
												<label>登陆密码</label> <input type="password"
													class="form-control" placeholder="Password" name="password">
											</div>
											<button type="submit" class="btn btn-danger" id="btn3">Submit</button>

										</form>
									</div>
									<div class="modal-footer">
										<button class='btn btn-default' data-dismiss='modal'>close</button>
									</div>
								</div>
							</div>
						</div>











					</div>
					<div class="panel-body">
						<form action="login" method="POST">
							<div class="form-group">
								<label>用户名称</label> <input class="form-control"
									placeholder="" name="user">
							</div>
							<div class="form-group" width=100%>
								<label>登陆密码</label> <input type="password" class="form-control"
									placeholder="" name="password">
							</div>

							<button type="submit" class="btn btn-danger" id="btn3">Submit</button>

						</form>
					</div>
				</div>
			</div>

		</div>












		<script type="text/javascript">
			$("#btn2").click(function() {
				$("#btn3").html("注册");
				$('#mmm').modal('show')
			});

			$("#btn1").click(function() {
				$("#btn3").html("登陆");
			});
		</script>
</body>
</html>