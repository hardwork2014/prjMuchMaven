<%@ include file="/WEB-INF/jsp/common/_includes.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js">
<head>
    <title>${param.title }</title>
    <meta name="viewport" content="width=device-width">
    <c:if test="${not empty param.vendorCss}">
        <c:forTokens var="vendorCss" items="${param.vendorCss}" delims="|,">
            <c:if test="${not empty vendorCss}">
                <link href="/static/vendor/${vendorCss}" rel="stylesheet"/>
            </c:if>
        </c:forTokens>
    </c:if>
</head>
<body>
