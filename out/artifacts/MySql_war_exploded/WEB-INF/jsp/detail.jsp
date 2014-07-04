<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp" %>
<%
    request.setCharacterEncoding("UTF-8");
%>

<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
    <jsp:param name="title" value="详情页"/>
    <jsp:param name="vendorCss" value="/bootstrap/css/bootstrap.css"/>
</jsp:include>

<div>
    <select onchange="change(this)">
        <c:forEach items="${districtList}" var="district">
            <option value="${district.districtSpelling}">《《 ${district.districtName} 》》</option>
            <c:forEach items="${district.plateList}" var="plate">
                &nbsp;&nbsp;&nbsp;&nbsp;<option value="${plate.plateSpelling}">${plate.plateName}</option>
            </c:forEach>
        </c:forEach>
    </select>
</div>

<jsp:include page="/WEB-INF/jsp/common/_foot.jsp">
    <jsp:param name="vendorJs" value="/bootstrap/js/bootstrap.js"/>
</jsp:include>