<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>
        员工列表
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
<div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>员工管理</cite></a>
              <a><cite>员工列表</cite></a>
            </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="queryAllStaffs" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <form class="layui-form x-center" action="queryStaffByName" style="width:50%">
        <div class="layui-form-pane" style="margin-top: 15px;">
            <div class="layui-form-item">

                <label class="layui-form-label">员工</label>
                <div class="layui-input-inline" style="width:400px">
                    <input type="text" name="staff_name"  placeholder="输入员工姓名" autocomplete="off" class="layui-input">
                </div>


                <div class="layui-input-inline" style="width:80px">
                    <button class="layui-btn"  name="search" ><i class="layui-icon">&#xe615;</i></button>
                </div>

            </div>
        </div>
    </form>
    <xblock><button  class="layui-btn" onclick="window.location.href='toAddStaff'"><i class="layui-icon">&#xe608;</i>添加</button><span class="x-right" style="line-height:40px"></span></xblock>
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                选择
            </th>

            <th>
                员工工号
            </th>
            <th>
                员工姓名
            </th>
            <th>
                员工性别
            </th>
            <th>
                职位
            </th>
            <th>
                入职日期
            </th>
            <th>
                工资
            </th>
            <th>
                操作
            </th>
        </tr>
        </thead>
        <tbody>
        <#if staffs ?? && (staffs?size>0)>
            <#list staffs as staff>
                <tr>
                <td>
                    <input type="checkbox" value="1" name="">
                </td>
                <td>
                    ${staff.staff_id}
                </td>
                <td>
                    ${staff.staff_name}
                </td>

                <td>
                    ${staff.staff_sex}
                </td>
                <td>
                    ${staff.position.position_name}
                </td>
                <td>
                    ${staff.staff_date?date}
                </td>
                <td>
                    ${staff.staff_wage}
                </td>

                <td class="td-manage">

                    <a title="编辑" href="toUpdateStaff?staff_id=${staff.staff_id}"
                       class="ml-5" style="text-decoration:none">
                        <i class="layui-icon">&#xe642;</i>
                    </a>

                    <a title="删除" href="doDeleteStaff?staff_id=${staff.staff_id}"  onclick="return confirm('确认删除吗?');"
                       style="text-decoration:none">
                        <i class="layui-icon">&#xe640;</i>
                    </a>
                </td>
            </#list>
        <#else >
            <tr>
                <td colspan="6" align="center">对不起，没有查询到相关记录!!!</td>
            </tr>

        </#if>
        </tr>
        </tbody>
    </table>

    <div id="page"></div>
</div>
<script src="./lib/layui/layui.js" charset="utf-8"></script>
<script src="./js/x-layui.js" charset="utf-8"></script>
<script>
    layui.use(['laydate','element','laypage','layer'], function(){
        $ = layui.jquery;//jquery

        lement = layui.element();//面包导航
        laypage = layui.laypage;//分页
        layer = layui.layer;//弹出层

        //以上模块根据需要引入

        laypage({
            cont: 'page'
            ,pages: 100
            ,first: 1
            ,last: 100
            ,prev: '<em><</em>'
            ,next: '<em>></em>'
        });



    });


    /*用户-添加*/

    function department_add(title,url,w,h){
        x_admin_show(title,url,w,h);
    }


    function department_search(){
        "form".attr("action","queryPositionByName").submit();
    }

    function member_del (title,url,id,w,h) {
        x_admin_show(title,url,w,h);
    }
    // 用户-编辑
    function member_edit (title,url,id,w,h) {
        x_admin_show(title,url,w,h);
    }
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