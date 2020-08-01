package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="TestServlet")
public class TestServlet extends HttpServlet {
    /**
     * 获取提交过来的 developer 参数，并把欢迎语句以 UTF-8 编码输出到客户端。
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String developer = request.getParameter("developer");
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("欢迎开发者" + developer);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    // 重写service方法会使doGet和doPost失效
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

}
