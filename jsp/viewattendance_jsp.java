package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewattendance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Student Attendance List</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("\t\t  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\t\t  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color:white;\n");
      out.write("            }\n");
      out.write("            table, th, td {\n");
      out.write("            border: 4px solid peru;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            text-align: left;\n");
      out.write("            padding-top: 20px;\n");
      out.write("            padding-bottom: 20px;\n");
      out.write("            padding-left: 5px;\n");
      out.write("            padding-right: 5px;\n");
      out.write("                           }\n");
      out.write("    #table{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 25%;\n");
      out.write("    left:37%;\n");
      out.write("    }\n");
      out.write("    td{\n");
      out.write("    background-color: white;\n");
      out.write("    }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image:url('studentimg.jpg')\">\n");
      out.write("         <div style=\"background-color:wheat;\">\n");
      out.write("             <header>\n");
      out.write("                \n");
      out.write("                <nav  style=\"text-align:right; height: 102px; padding-top: 10px; padding-right: 30px;\">\n");
      out.write("                    <h2 style=\"text-align:center; padding-top: 10px; font-family:alice;\">MANAGE STUDENT LIST</h2>\n");
      out.write("                    <a  style=\"padding-left:20px; color: black;\" href=\"Welcome.jsp\">Home</a>\n");
      out.write("                    <a  style=\"padding-left:20px; color: black;\" href=\"#\">View Marks</a>\n");
      out.write("                    <!--<a  style=\"padding-left:20px; color: black;\" href=\"usermanage.jsp\">Manage StudentsInfo</a>-->\n");
      out.write("                    <a  style=\"padding-left:20px; color: black;\" href=\"newstudentlogin.jsp\">Logout</a>\n");
      out.write("                </nav>\n");
      out.write("             </header>\n");
      out.write("         </div>\n");
      out.write("\t<div id=\"table\">\n");
      out.write("            ");

                Connection con=null; 
    String url="jdbc:mysql://localhost:3306/";
    String dbname="studentdb";
    String username="root";
    String pswd="";
    String drivername="com.mysql.jdbc.Driver";
        try
    {
     Class.forName(drivername).newInstance();
     con=DriverManager.getConnection(url+dbname,username,pswd);
 }
 catch(Exception ex)
 {
System.out.println("Not connected to database");
 }
 
        //String registerno= request.getParameter("roll");
        
String strquery= "SELECT * FROM fstudata";
PreparedStatement sta= con.prepareStatement(strquery);
    ResultSet rs =sta.executeQuery(strquery);
                
      out.write("\n");
      out.write("            <table>\n");
      out.write("            <tr style=\"background-color: paleturquoise\">\n");
      out.write("                <th>Register Number</th><br/>\n");
      out.write("                <th>Attendance</th>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");

                while(rs.next())
                        {
              
      out.write("\n");
      out.write("                        \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( rs.getString(8).toString() );
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td>");
      out.print( rs.getString(7).toString() );
      out.write("</td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");

            }
              
                    //out.print("Hi "+session_u_name);
            
      out.write("\n");
      out.write("            <!--<tr>\n");
      out.write("                <td>Ruby</td>\n");
      out.write("                <td>lang</td>\n");
      out.write("                <td>ruby@gmail.com</td>\n");
      out.write("                <td>19-07-2001</td>\n");
      out.write("                <td>7019748323</td>\n");
      out.write("                <td>iopiopip</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Pepper</td>\n");
      out.write("                <td>Potts</td>\n");
      out.write("                <td>Pepper@gmail.com</td>\n");
      out.write("                <td>18-02-2020</td>\n");
      out.write("                <td>7019748322</td>\n");
      out.write("                <td>iopiopiy</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Emma</td>\n");
      out.write("                <td>lango</td>\n");
      out.write("                <td>emma@gmail.com</td>\n");
      out.write("                <td>12-05-2003</td>\n");
      out.write("                <td>7019748321</td>\n");
      out.write("                <td>iopiopir</td>\n");
      out.write("            </tr>-->\n");
      out.write("        </table>\n");
      out.write("       </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
