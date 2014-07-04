<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp" %>

<script src="/static/jquery/jquery-1.11.1.js"/>
<c:if test="${ not empty param.vendorJs}">
    <c:forTokens var="vendorJs" items="${param.vendorJs}" delims="|," >
        <c:if test="${not empty vendorJs}">
            <script type="text/javascript" src="/static/vendor/${vendorJs}?version=${config.version}"></script>
        </c:if>
    </c:forTokens>
</c:if>
</body>
</html>
