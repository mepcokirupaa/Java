import java.util.*;
import javax.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Servletdb extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html>\n"+
		"<head><title>Servlet Database Connectivity</title></head>\n"+
		"<body>\n"+
		"<h1>Servlet JDBC</h1>\n");
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class Found");
		}
		catch(ClassNotFoundException e){
			System.out.print("Error"+e);
		}
		try{
			//out.println("Try entered"+"<br>");
			//System.out.println("\n");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cst","root","");
			//out.print("success"+con);
			stmt=con.createStatement();
			out.println("<table border='1'>");
		    out.println("<tr><th>Location</th>"+
			            "<th>Checkin</th>"+
						"<th>Checkout</th>"+
						"<th>Rooms</th>"+
						"<th>Adults</th>"+
						"<th>Children</th></tr>");
				String Location1=req.getParameter("locations");
				String date1=req.getParameter("date1");
				String date2=req.getParameter("date2");
                try{
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date checkinDate = sdf.parse(req.getParameter("date1"));
                    Date checkOutDate =  new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("date2"));
                    int Rooms1=Integer.parseInt(req.getParameter("room"));
                    int Adults1=Integer.parseInt(req.getParameter("adult"));
                    int Children1=Integer.parseInt(req.getParameter("child"));
                    String sql1="insert into avail values(?,?,?,?,?,?)";
                    PreparedStatement pstmt=null;
                    pstmt=con.prepareStatement(sql1);
                    pstmt.setString(1,Location1);			 
                    pstmt.setInt(2,Rooms1);
                    pstmt.setInt(3,Adults1);
                    pstmt.setInt(4,Children1);
                    pstmt.setString(5,date1);
					pstmt.setString(6,date2);
                    //pstmt.setString(6,"2017-02-27");
					pstmt.executeUpdate();
				}
				catch(Exception e){
					out.println("Error"+e);
				}
				String sql="select *from avail";
			rs=stmt.executeQuery(sql);				
			while(rs.next()){
				//out.print("Connected");
				String Location=rs.getString("location");
				Date date=rs.getDate("checkin");
				Date cdate=rs.getDate("checkout");
				int Rooms=rs.getInt("rooms");
				int Adults=rs.getInt("adults");
				int Children=rs.getInt("children");
			    out.println("<tr>");
				out.println("<td>"+Location+"</td>");
				out.println("<td>"+date+"</td>");
				out.println("<td>"+cdate+"</td>");
				out.println("<td>"+Rooms+"</td>");
				out.println("<td>"+Adults+"</td>");
				out.println("<td>"+Children+"</td>");
				out.println("</tr>");
				//out.println("</table>");
                //out.println("----------------------------------"+"<br>");
			}
			out.println("</table>");
			out.println("</body></html>");
		    
		    rs.close();
            stmt.close();
            con.close();	
		}
		catch(SQLException se) {
			se.printStackTrace();
			out.println("Not Connected\n"+"<br>");
			out.println("Please Connect it!!!!\n"+"<br>");
		}
	   out.close();
	}
}