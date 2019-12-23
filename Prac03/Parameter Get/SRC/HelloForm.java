import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloForm extends HttpServlet {

  // Method to handle GET method request.
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
	  String title = "Using GET Method to Read Form Data";
      String docType =
      "\n";
      out.println(docType +"\n" + "First Name: "+request.getParameter("first_name") + "\n" + "Last Name: " + request.getParameter("last_name") + "\n" + "");
  }


}