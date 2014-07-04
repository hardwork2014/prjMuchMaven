<%--
  Created by IntelliJ IDEA.
  User: PC-S510
  Date: 14-6-10
  Time: 下午3:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <div>
        <c:forEach items="${articleList}" var="article">
            <h1>${article.title}</h1>
            <p style="margin-left: 30px">${article.remark}</p>
        </c:forEach>
    </div>
</body>
</html>
