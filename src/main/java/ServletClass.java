import entity.User;
import service.AccountService;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Servlet")
public class ServletClass extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        int numOfId = 1;
        UserService userService = new UserService();
        AccountService accountService = new AccountService();

        User user = userService.getUserById(numOfId);
        pw.println("<h1><em> Using getUserById() method, " + "userId is " + numOfId + ":</em> </h1>");
        pw.println(user);
        pw.println("<h1><em> Using getAllAccounts() method: </em></h1>");

        List<Integer> list = accountService.getAllAccounts();
        for (Integer a : list)
            pw.println(a + "<br>");
        pw.println("<br><a href=\"index.jsp\">back to \"Index page\"</a>");
    }
}

