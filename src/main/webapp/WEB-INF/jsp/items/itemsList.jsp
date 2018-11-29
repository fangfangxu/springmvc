<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/uploadpic.action" method="post" enctype="multipart/form-data">

    查询条件：
    <table width="100%" border=1>
        <tr>
            <td><input type="submit" value="查询"/></td>
        </tr>
    </table>
    商品列表：
    <table width="100%" border=1>
        <tr>
            <td>商品图片</td>
            <td>
                <c:if test="${items.pic !=null}">
                    <img src="/pic/${items.pic}" width=100 height=100/>
                    <br/>
                </c:if>
                <input type="file"  name="items_pic"/>
            </td>
        </tr>
        <%--<tr>--%>
            <%--&lt;%&ndash;<td>序号</td>&ndash;%&gt;--%>
            <%--<td>用户名</td>--%>
            <%--<td>出生日期</td>--%>
            <%--<td>性别</td>--%>
            <%--<td>居住地址</td>--%>
        <%--</tr>--%>

        <%--<c:forEach items="${itemsList }" var="item">--%>
        <%--<tr>--%>
            <%--<td><input type="checkbox" name="items_id" value="${item.id}"/></td>--%>
            <%--<td>${item.username }</td>--%>
            <%--<td>${item.sex }</td>--%>
            <%--<td><fmt:formatDate value="${item.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/></td>--%>
            <%--<td>${item.address }</td>--%>
        <%--</tr>--%>
        <%--</c:forEach>--%>
        <%--<c:forEach items="${userAccList}" var="item" varStatus="status">--%>
            <%--<tr>--%>

                <%--<td><input name="userAccList[${status.index}].username" value="${item.username }"/></td>--%>
                <%--<td><input name="userAccList[${status.index}].address" value="${item.address }"/></td>--%>
                <%--<td><input name="userAccList[${status.index}].birthday" value="<fmt:formatDate value="${item.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>--%>
                <%--<td><input name="userAccList[${status.index}].sex" value="${item.sex }"/></td>--%>

            <%--</tr>--%>
        <%--</c:forEach>--%>


    </table>
</form>

</body>
</html>
