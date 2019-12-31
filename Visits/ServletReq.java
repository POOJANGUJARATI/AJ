import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ServletReq extends HttpServlet
{
	int visit;
	public void init()
	{
		visit=0;
	}

	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		visit++;
		String user = req.getParameter("user");
		PrintWriter out = res.getWriter();
		out.println("Welcome "+user);
		out.println("Visits : "+visit);

	}



}