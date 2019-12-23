import java.sql.*;
import java.util.*;

class jdbc
{
	 static final String driver = "com.mysql.jdbc.Driver";
	 static final String url = "jdbc:mysql://localhost:3308/employee_master";

	  static final String user = "root";
	  static final String pass = "";

	 public static void main(String a[])
	 {
		 	Connection con = null;
		 	Statement stmt = null;

			 try{
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("connecting to database....");

			con = DriverManager.getConnection(url,user,pass);

			System.out.println("creating statments..");
			stmt = con.createStatement();

			String query;

		//	query = "SELECT * FROM emp_detail";

		//	query = "SELECT * FROM emp_detail order By emp_code";

		//	query = "SELECT emp_id FROM emp_detail";

			query = "DELETE emp_detail where emp_id = 10";


			ResultSet rs = stmt.executeUpdate(query);
			//System.out.println("deleted records..:"+rs);


		/*while(rs.next())
		{	//System.out.println(rs.getInt(1))
			int id = rs.getInt("emp_id");
			String fnm = rs.getString("emp_fname");
			String mnm = rs.getString("emp_mname");
			String lnm = rs.getString("emp_lname");
			int cd = rs.getInt("emp_code");
			String add = rs.getString("emp_address");
			int pic = rs.getInt("emp_pincode");
			int phn = rs.getInt("emp_phone");
			String gen = rs.getString("emp_gender");




			System.out.println("printing employeee id.."+id);
			System.out.println("printing employeee first name.."+fnm);
			System.out.println("printing employeee last name.."+mnm);
			System.out.println("printing employeee code.."+lnm);
			System.out.println("printing employeee address.."+cd);
			System.out.println("printing employeee pin-code."+add);
			System.out.println("printing employeee phone.."+pic);
			System.out.println("printing employeee id.."+phn);
			System.out.println("printing employeee gender.."+gen);
		}*/


		rs.close();
		stmt.close();
		con.close();
		}
	 catch(SQLException se){
		System.out.println("...."+se);
	 }
	 catch(Exception e){
	 		System.out.println("--"+e);
	 }


	 }


}
