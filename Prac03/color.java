import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class color extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		String unm;
		ServletConfig config = getServletConfig();
		unm = config.getInitParameter("username");
		System.out.println("username :" +unm);
	//pintWriter writer = response.getWriter();

	}
	public void destroy()
	{
		System.out.println("servlet has been destroyed..");

	}


}