<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // Ensure a session is created
    session.setAttribute("initialized", "true");
%>
<html>
<body>
    <h2>Vulnerable Web Application for CVE-2025-24813</h2>
    <p>Session ID: <%= session.getId() %></p>
</body>
</html>
