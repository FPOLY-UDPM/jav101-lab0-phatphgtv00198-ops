package fpoly.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/xuly_dangnhap")
public class DangNhap extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Thông tin tài khoản mẫu trong hệ thống
        String db_user = "fpoly";
        String db_pass = "123";

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String username = req.getParameter("txt_username").trim();
        String password = req.getParameter("txt_password").trim();

        if (username == null || username.isEmpty()
                || password == null || password.isEmpty()) {
            resp.getWriter().println("<h2>Vui lòng điền đầy đủ thông tin đăng nhập!</h2>");
        } else {
            if (username.equals(db_user)) {
                if (password.equals(db_pass)) {
                    // Tình huống 1: Tên đăng nhập khớp, thành công
                    resp.getWriter().println("<h2>Chúc mừng " + username + ", bạn đã đăng nhập thành công!</h2>");
                } else {
                    // Tình huống 2: Đăng nhập không thành công
                    resp.getWriter().println("<h2>Đăng nhập không thành công!</h2>");
                }
            } else {
                // Tình huống 3: Chưa có tài khoản (Username không tồn tại)
                resp.getWriter().println("<h2>Đăng nhập không thành công: Tài khoản '" + username + "' chưa tồn tại trong hệ thống!</h2>");
            }
        }
    }

}