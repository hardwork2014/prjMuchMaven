<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
    <jsp:param name="title" value="首页"/>
    <jsp:param name="vendorCss" value="bootstrap/css/bootstrap.css"/>
</jsp:include>
<div>
    <h1>Have you senn the rain?</h1>
    <p>SomeBody told me long ago there's a calm before this storm. I know, It's been comin for some time.</p>
    <p> When it's over, so they say, it'll rain a sunny day. I know, Shinin down like water.</p>
    <p>I want to know, have you ever seen the rain?</p>
    <div style="position: relative; display: table; border-collapse: separate;">
        <span class="input-group-addon">田园</span>
        <input type="text" class="form-control input-lg" name="email" placeholder="jonsnow@knowsnothi.ng" />
    </div>
    <form action="/mailing-list" method="post">
        <p class="input-group">
            <span class="input-group-addon">@</span>
            <input type="text" class="form-control input-lg" name="email" placeholder="jonsnow@knowsnothi.ng" />
        </p>
        <p class="help-block"><small>We won't send you spam. Unsubscribe at any time.</small></p>
        <p>
            <button type="submit" class="btn btn-success btn-lg">Keep me posted</button>
        </p>
        </span>
    </form>
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp">
    <jsp:param name="vendorJs" value="bootstrap/js/bootstrap.js"/>
</jsp:include>