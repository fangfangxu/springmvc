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
    <title>Title</title>
</head>
<body>
<!-- 显示错误信息 -->
<%--<c:if test="${allErrors!=null }">--%>
    <%--<c:forEach items="${allErrors }" var="error">--%>
        <%--${ error.defaultMessage}<br/>--%>
    <%--</c:forEach>--%>
<%--</c:if>--%>
<c:if test="${abc!=null }">

        ${ abc}<br/>

</c:if>



</body>
</html>
