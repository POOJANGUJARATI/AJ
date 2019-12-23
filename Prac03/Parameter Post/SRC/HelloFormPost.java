import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloFormPost extends HttpServlet {

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
      out.println(docType +"\n" + "First Name: "+request.getParameter("first_name") + "\n" + "Last Name: " + request.getParameter("last_name") +
       "\n\n\n\n"   +"<li><b>Maths Flag : </b>: "  + request.getParameter("maths") +
       "\n" +"<li><b>Physics Flag: </b>: "   + request.getParameter("physics") +
       "\n" +"<li><b>Chemistry Flag: </b>: "
                + request.getParameter("chemistry") + "\n" + "");
  }

 // Method to handle POST method request.
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
     doGet(request, response);
  }

}