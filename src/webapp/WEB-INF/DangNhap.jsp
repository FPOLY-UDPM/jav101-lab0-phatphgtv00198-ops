<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<html>
<head>
    <title>Dang Nhap</title>
</head>
<body>
    <h2>Chào mừng bạn đến với trang JSP mẫu</h2>
    <%-- Code của bạn ở đây --%>

    <h2>Đăng nhập</h2>
        <form action="xuly_dangnhap" method="post">
            Email/ username: <input name="txt_username"><br>
            Mật khẩu: <input name="txt_password" type="password"><br>
            <button type="submit">Login</button>
        </form>

</body>
</html>