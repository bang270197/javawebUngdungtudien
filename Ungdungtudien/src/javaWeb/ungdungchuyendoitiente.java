package javaWeb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ungdungchuyendoitiente",urlPatterns = "/translate")
public class ungdungchuyendoitiente extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String search = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        String result = dictionary.get(search);
        if (result != null) {
            writer.println("<h2>word: " + search+"</h2>");
            writer.println("<h2>Result: " + result+"</h2>");
        } else {
            writer.println("Not found");
        }
        writer.println("<html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
