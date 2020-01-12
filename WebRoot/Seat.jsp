<!DOCTYPE html>
<%@ page language="java"
	import="java.util.*,com.java.Dao.*,com.java.been.*"
	pageEncoding="utf-8"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>选座</title>
		<style type="text/css">
			*{
				margin: 0;
				padding: 0;
			}
			#c1{
				padding-left:4%;
				margin-left:7%;
				width:80%;
				border-left:1px solid;
				border-right:1px solid;
			}
			.c11{
				background-color:limegreen;
				display: inline-block;
				width: 40px;
				height:40px;
				border-radius:10px;
				border:0;
				margin:20px 15px 0 15px;
			}
			#c11:hover{
				background-color:darkgreen;
			}
			#fang{
				display: inline-block;
				margin-left:550px;
				font-size: 50px;
			}
			#c{
				width: 80px;
				height:40px;
				display: inline-block;
				/*margin-top:20px;*/
				font-size:20px;
			}
			#foot p{
				display: inline-block;
				margin-top: 20px;
				margin-left:30%;
				color:black;
			}
		     #buy a{
		     	display: inline-block;
		     	width: 73px;
		     	height: 27px;
		     	border: 0;
		     	padding-left:7px;
		     	padding-top: 5px;
		     	margin-top: 2%;
		     	margin-left: 80%;
		     	border-style: none;
		     	border-radius:10px;
		     	text-decoration: none;
		     	font-size:16px;
		     	background-color: lawngreen;
		     }
		     #buy a:hover{
		     	background-color:red;
		     	color: white;
		     }
		</style>
		<script type="text/javascript">
			
			window.onload = function(){
				var button1=document.getElementsByClassName("c11");
				for(var i=0;i<button1.length;i++){
					button1[i].num=i;
                	button1[i].onclick=function(){
                	var j=this.num;
					button1[j].style.backgroundColor="white"
					button1[j].style.backgroundImage="url(img/seat.png)"
                }	
			}
				for(var i=0;i<button1.length;i++){
					button1[i].num=i;
                	button1[i].ondblclick=function(){
                	var j=this.num;
					button1[j].style.backgroundColor="lawngreen";
					button1[j].style.backgroundImage="";
                }	
			}
			}
		</script>
	</head>
	<body>
		<p id="fang">放映区</p>
		<div id="c1">
		<p id="c">第一排：</p>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		</div>
		<div id="c1">
		<p id="c">第二排：</p>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<!--<button class="c11"></button>
		<button class="c11"></button>-->
		</div>
		<div id="c1">
		<p id="c">第三排：</p>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		</div>
		<div id="c1">
		<p id="c">第四排：</p>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<!--<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>-->
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		</div>
		<div id="c1">
		<p id="c">第五排：</p>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		<button class="c11"></button>
		</div>
		<div id="foot">
			<p>温馨提示：取消选座请双击座位，感谢您的配合，祝您生活愉快！</p>
		</div>
		<div id="buy"><a href="buy.html">确认支付</a></div>
	</body>
</html>
