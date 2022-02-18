package az.ada.cal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalServlet", value = "/cal-servlet")
public class CalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request
                .getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.write("<div style='margin:0 auto;width: 50%; text-align:center; color:green'>");
        try {
            Double firstDigit = Double.parseDouble(req.getParameter("firstDigit"));
            Double secondDigit = Double.parseDouble(req.getParameter("secondDigit"));
            String operation = req.getParameter("operation");
            double result = 0;
            if (operation.equals("+")){
                result = firstDigit+secondDigit;
                out.write("<h2>Result is " + result+"</h2>");
            }
            else if (operation.equals("-")){
                result = firstDigit-secondDigit;
                out.write("<h2>Result is " + result+"</h2>");
            }
            else if (operation.equals("*")){
                result = firstDigit*secondDigit;
                out.write("<h2>Result is " + result+"</h2>");
            }
            else if (operation.equals("/")){
                if (secondDigit==0){
                    out.write("Second digit should not be zero");
                }
                else {
                    result = firstDigit/secondDigit;
                    out.write("<h2>Result is " + result+"</h2>");
                }
            }
            else {
                out.write("<p>Please, select the operation</p>");
            }
            out.write("<a href='cal-servlet'>Return back</a><br>");
            out.write("<a href='info-servlet'>USER INFO</a>");
            out.write("</div>");
        }
        catch (Exception ex){
            out.write("<h3 style='color:danger'>Please, enter only digits, fill all inputs, and select the operation</h3>");
            out.write("<a href='cal-servlet'>Return back</a>");
            out.write("</div>");
        }
    }
}
