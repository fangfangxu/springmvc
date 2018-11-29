<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SKJ-05A14-0022
  Date: 2018/11/21
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<!-- 显示错误信息 -->
<%--<c:if test="${allErrors!=null }">--%>
    <%--<c:forEach items="${allErrors }" var="error">--%>
        <%--${ error.defaultMessage}<br/>--%>
    <%--</c:forEach>--%>
<%--</c:if>--%>
<%--<c:if test="${userAcc!=null }">--%>

        <%--${ userAcc.username}<br/>--%>

<%--</c:if>--%>
<%--<@ModelAttribute:数据回显测试>--%>
<table>
    <tr>
<td>
    商品名称：<input name="itemsCustom.name" />
    商品类型：
    <select name="itemtype">
        <c:forEach items="${aaa}" var="itemtype">
            <option value="${itemtype.key }">${itemtype.value }</option>
        </c:forEach>
    </select>
</td>
    </tr>
</table>

</body>
</html>
