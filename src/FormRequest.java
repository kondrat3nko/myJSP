import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by VladYA on 08.07.2015.
 */
@WebServlet(name = "FormRequest")
public class FormRequest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performTask(request,response);
    }

    private void performTask(HttpServletRequest request, HttpServletResponse response) {
        RequestOutput.generate(response,request);
    }


}
