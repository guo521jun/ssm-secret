<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="scripts/css/bootstrap.css" rel="stylesheet" type="text/css" />
<script src="scripts/js/bootstrap.js"></script>
<script src="scripts/jquery-3.2.1.slim.js"></script>
</head>
<body>
	<div class="container">
		<div>
			<button class="btn btn-info btn-lg"
				style="margin: 30px; margin-left: 30%" id="btn1">发送消息</button>
			<button class="btn btn-info btn-lg"
				style="margin: 30px; margin-left: 100px" id="btn2">浏览消息</button>
		</div>

		<div class="row">
			<div class="col-md-2"></div>
			<dir class="col-md-8">
			<form id="div1" action="encrytion">
				<div class="form-group">
					<label for="exampleInputEmail1">输入需要加密的信息</label> <input
						type="text" class="form-control" name="msg" placeholder="${encode.msg }">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">用户</label> <input
						type="text" class="form-control" name="user" placeholder="${encode.user }" >
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">接受方的公钥</label> <input
						type="text" class="form-control" name="pk" placeholder="${encode.pk }" readonly="readonly">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">加密后的结果</label> <input
						type="text" class="form-control" name="encode_msg" placeholder="${encode.encodeMsg }" readonly="readonly">
				</div>
				<center><button type="submit" class="btn btn-danger">Submit</button>
				<br><br>
				<button type="submit" class="btn btn-danger">发送</button></center>
			</form>

				<div id="div2" style="display: none">
					<div class="well">
						<center>
							<font size="5" color="red">未浏览的消息</font>
						</center>
					</div>

					<div class="row">
						<div class="col-md-4">
							<div style="width: 100px; height: 100px; background-color: red"></div>
						</div>
						<div class="col-md-4">
							<center>
								<button class="btn btn-success" style="margin-top: 23px">显示</button>
							</center>
						</div>
						<div class="col-md-4"></div>
					</div>

				</div>
			</dir>
		
		
		
		</div>
			<div class="col-md-2"></div>
		</div>
		

		
	<script type="text/javascript">
		$("#btn1").click(function(){
			$("#div1").show();
			$("#div2").hide();
		})
			
		$("#btn2").click(function(){
			$("#div2").show();
			$("#div1").hide();
		})
		
	</script>
</body>
</html>