package az.ada.cal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InfoServlet", value = "/info-servlet")
public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String browserName = request.getHeader("User-Agent");
        String OS = System.getProperty("os.name");
        response.setContentType("text/html");
        request.setAttribute("brw",browserName);
        request.setAttribute("os",OS);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/info.jsp");
        requestDispatcher.forward(request, response);
    }
}
