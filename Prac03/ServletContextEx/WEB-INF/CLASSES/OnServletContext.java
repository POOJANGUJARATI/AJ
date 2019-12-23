import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class OnServletContext extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");

	/*	//  1st way to create Context object
		ServletConfig conf = getServletConfig();
		ServletContext context = conf.getServletContext();*/

        //  2nd way to create Context object
        ServletContext context=getServletContext();


         //  3rd way to create Context object
        //ServletContext ctx = req.getServletContext();

        String s1=context.getInitParameter("n1");
        String s2=context.getInitParameter("n2");

        pw.println("n1 value is " +s1+ " and n2 is " +s2);

       pw.close();
    }
}