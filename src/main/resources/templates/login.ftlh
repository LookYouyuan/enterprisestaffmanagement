<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
	<meta http-equiv="Pragma" content="no-cache"> 
	<meta http-equiv="Cache-Control" content="no-cache"> 
	<meta http-equiv="Expires" content="0"> 
	<title>企业员工管理系统</title>
	<link href="css/login.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="login_box">
      <form action="doLogin" method="post">
      <div class="login_l_img"><img src="images/login-img.png" /></div>
      <div class="login">
          <div class="login_logo"><a href="#"><img src="images/login_logo.png" /></a></div>
          <div class="login_name">
               <p>后台管理系统</p>
          </div>
          <form method="post">
              <input name="username" type="text"  value="用户名" onfocus="this.value=''" onblur="if(this.value==''){this.value='用户名'}">
              <span id="password_text" onclick="this.style.display='none';document.getElementById('password').style.display='block';document.getElementById('password').focus().select();" >
                  密码
              </span>
              <input name="password" type="password" id="password" style="display:none;" onblur="if(this.value==''){document.getElementById('password_text').style.display='block';this.style.display='none'};"/>
              <input id=doLogin value="登录" style="width:100%;" type="submit" name=doLogin>
              <div style="color:#8b0000;text-align:center" >
                  <p>
                      <#if msg??>
                          对不起，用户名或密码错误！
                          <#--${msg}-->
                      </#if>
                  </p>
              </div>


          </form>
      </div>
      <div class="copyright">高金满-黄学成 版权所有©2016-2018 技术支持电话：000-00000000</div>
      </form>
</div>
</body>
</html>
