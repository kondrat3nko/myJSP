import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by VladYA on 08.07.2015.
 */
public class RequestOutput {
    public static void  generate (HttpServletResponse resp, HttpServletRequest req){
        String name, value;
        resp.setContentType("text/html");
        try {
            PrintWriter out = resp.getWriter();
            out.print("<HTML><HEAD>");
            out.print("<title>Результат</title>");
            out.print("</head><body>");
            out.print("<table border=3");

            Enumeration names = req.getParameterNames();
            while (names.hasMoreElements()){
                name=(String)names.nextElement();
                value=req.getParameterValues(name)[0];
                out.print("<tr>");
                out.print("<td>"+name+"</td>");
                out.print("<td>"+ value + "</td>");
                out.print("</tr>");
            }
            out.print("</table></body></HTML>");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
