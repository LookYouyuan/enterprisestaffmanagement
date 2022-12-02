<!DOCTYPE html>
<html>
    
    <head>
        <meta charset="utf-8">
        <title>
            修改密码
        </title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <link rel="stylesheet" href="./css/x-admin.css" media="all">
    </head>
    
    <body>
        <div class="x-body">
            <form class="layui-form x-center" action="doUpdatePassword" style="width:25%">
                <div  style="margin-top: 100px;">

                    <#--<div >
                        <input type="hidden" name = "user_id" value="${user_id}">
                    </div>-->
                    <div >
                        <input type="hidden" name = "username" value="${user.username}">
                    </div>

                    <div class="layui-form-item">
                        <label for="L_city" class="layui-form-label">
                            <span class="x-red">*</span>

                        </label>
                        <div class="layui-input-inline" >
                            <input type="password" id="L_city" name="password" autocomplete="off" placeholder="原密码"
                                   class="layui-input">
                        </div>

                    </div>

                    <div class="layui-form-item">
                        <label for="L_city" class="layui-form-label">
                            <span class="x-red">*</span>

                        </label>
                        <div class="layui-input-inline">
                            <input type="password" id="L_city" name="newpw" autocomplete="off" placeholder="新密码"
                                   class="layui-input">
                        </div>

                    </div>

                    <div class="layui-form-item">
                        <label for="L_sign" class="layui-form-label">
                        </label>
                        <div class="layui-input-inline">
                            <button  class="layui-btn" key="set-mine" lay-filter="save" lay-submit>
                                确定
                            </button>
                        </div>
                    </div>
                    <div class="layui-form-item">

                        <p style="text-align:center;">
                            <#if msg??>
                            &nbsp; &nbsp; &nbsp; &nbsp;对不起，修改密码失败！
                            </#if>
                        </p>


                    </div>
                </div>
            </form>
        </div>
        <script src="./lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="./js/x-layui.js" charset="utf-8">
        </script>
        <script>
            layui.use(['laydate','form','layer'], function(){
                $ = layui.jquery;
                laydate = layui.laydate;
              var form = layui.form()
              ,layer = layui.layer;
              var start = {
                min: '1099-06-16 00:00:00'
                ,max: '2099-06-16 23:59:59'
                ,istoday: false
              };

              document.getElementById('date').onclick = function(){
                start.elem = this;
                laydate(start);
              }


            });
        </script>
        <script>
        var _hmt = _hmt || [];
        (function() {
          var hm = document.createElement("script");
          hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
          var s = document.getElementsByTagName("script")[0]; 
          s.parentNode.insertBefore(hm, s);
        })();
        </script>
    </body>

</html>