<!DOCTYPE html>
<html>
    
    <head>
        <meta charset="utf-8">
        <title>
            添加日程
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
            <form class="layui-form" action="doAddSchedule">

                <div class="layui-form-item">
                    <label for="L_city" class="layui-form-label">
                        <span class="x-red">*</span>
                        日程
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_city" name="s_name" autocomplete="off" placeholder="日程"
                        class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>不能为空
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                        <span class="x-red">*</span>
                        所属部门</label>
                    <div class="layui-input-inline" >
                        <select name="s_department_id">
                            <option value="0">--请选择--</option>
                            <#if departments ?? && (departments?size>0)>
                            <#list departments as department>

                                <option value="${department.de_id}">${department.de_name}</option>

                            </#list>
                            <#else >
                            </#if>

                        </select>
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>不能为空
                    </div>
                </div>

                <div class="layui-form-item">

                    <label class="layui-form-label">日期</label>
                    <div class="layui-input-inline">
                        <input class="layui-input" name="s_date" placeholder="日期" id="LAY_demorange_s">
                    </div>


                </div>

                <div class="layui-form-item">
                    <label for="L_sign" class="layui-form-label">
                    </label>
                    <button  class="layui-btn" key="set-mine" lay-filter="save" lay-submit onclick="location.replace(document.referrer);">
                        保存
                    </button>
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
                    min: '1099-06-16 23:59:59'
                    ,max: '2099-06-16 23:59:59'
                    ,istoday: false
                    ,choose: function(datas){
                        end.min = datas; //开始日选好后，重置结束日的最小日期
                        end.start = datas //将结束日的初始值设定为开始日
                    }
                };

                var end = {
                    min: '1099-06-16 23:59:59'
                    ,max: '2099-06-16 23:59:59'
                    ,istoday: false
                    ,choose: function(datas){
                        start.max = datas; //结束日选好后，重置开始日的最大日期
                    }
                };

                document.getElementById('LAY_demorange_s').onclick = function(){
                    start.elem = this;
                    laydate(start);
                }
                document.getElementById('LAY_demorange_e').onclick = function(){
                    end.elem = this
                    laydate(end);
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