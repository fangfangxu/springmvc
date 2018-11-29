<%--
  Created by IntelliJ IDEA.
  User: SKJ-05A14-0022
  Date: 2018/11/28
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>json交互测试</title>
    <script type="text/javascript" src="./js/jquery-1.4.4.min.js"  charset="utf-8"></script>
    <script type="text/javascript">
        //(1)请求json，输出是json
        function requestJson(){
         //使用jquery的ajax提交json串，对输出的json结果进行解析。
            $.ajax({
                type:'post',
                url:'${pageContext.request.contextPath }/requestJson',

                contentType:'application/json;charset=utf-8',
                //数据格式是json串，商品信息
                data:'{"username":"徐方方","sex":"女"}',
                success:function(data){//返回json结果
                    alert(data);
                }

            });

        }
        //(2)请求key/value，输出是json
        function responseJson(){
            $.ajax({
                type:'post',
                url:'${pageContext.request.contextPath }/itemsView/1',
                //请求是key/value这里不需要指定contentType，因为默认就 是key/value类型
                contentType:'application/x-www-form-urlencoded;charset=utf-8',
                //数据格式是json串，商品信息
                success:function(data){//返回json结果
                    alert(data);
                }

            });
        }
    </script>
</head>
<body >
欢迎光临，徐方方！
<br/>
<input type="button" onclick="requestJson()" value="请求json，输出是json"/>
<input type="button" onclick="responseJson()" value="请求key/value，输出是json"/>

</body>
</html>
