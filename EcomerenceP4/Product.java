import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Product extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter out = res.getWriter();
		ServletConfig config = getServletConfig();

		String usr = config.getInitParameter("Username");
		String pas = config.getInitParameter("Password");

		String user = req.getParameter("user");
		String pass = req.getParameter("pass");

		if(user.equals(usr) && pass.equals(pas))
		{
			 RequestDispatcher rd=req.getRequestDispatcher("Product.html");
        		rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
        	rd.include(req, res);
		}
	}
}