import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class OnServletConfig extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");

        ServletConfig conf=getServletConfig();

        String s1=conf.getInitParameter("n1");
        String s2=conf.getInitParameter("n2");

        pw.println("n1 value is " +s1+ " and n2 is " +s2);
        if(s1.equals("100"))
        	res.sendRedirect("/SendRedirectEx/DisplayHeader");



       pw.close();
    }
}