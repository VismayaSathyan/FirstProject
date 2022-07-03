package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewmarks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Student Marks List</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color:white;\n");
      out.write("            }\n");
      out.write("            table, th, td {\n");
      out.write("                border: 2px solid black;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                text-align: left;\n");
      out.write("                padding-top: 20px;\n");
      out.write("                padding-bottom: 20px;\n");
      out.write("                padding-left: 20px;\n");
      out.write("                padding-right: 20px;\n");
      out.write("            }\n");
      out.write("            #table{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 25%;\n");
      out.write("                left:23.2%;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                background-color: #6ab0a2;\n");
      out.write("                font-family: cursive;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"background-color:black;\">\n");
      out.write("            <header>\n");
      out.write("\n");
      out.write("                <nav  style=\"text-align:right; height: 102px; padding-top:1px; padding-right:30px;\">\n");
      out.write("                    <h2 style=\"text-align:center; padding-top: 1px; font-family:cursive; color:white;\">MARKS</h2>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: white;font-family: cursive\" href=\"stuwelcomepage.jsp\">Home</a>\n");
      out.write("                    <a class=\"btn btn-danger\" style=\"padding-left:20px; color: white;font-family: cursive\" href=\"viewattendance.jsp\">View Attendance</a>\n");
      out.write("                    <a class=\"btn btn-info\" style=\"padding-left:20px; color: white;font-family: cursive\" href=\"newstudentlogin.jsp\">Logout</a>\n");
      out.write("                </nav>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"table\">\n");
      out.write("            ");

                Connection con = null;
                String url = "jdbc:mysql://localhost:3306/";
                String dbname = "studentdb";
                String username = "root";
                String pswd = "";
                String drivername = "com.mysql.jdbc.Driver";
                try {
                    Class.forName(drivername).newInstance();
                    con = DriverManager.getConnection(url + dbname, username, pswd);
                } catch (Exception ex) {
                    System.out.println("Not connected to database");
                }

                //String registerno= request.getParameter("regno");
                String uname = (String) session.getAttribute("user");
                String regno = "";
                String strquery = "SELECT Registerno FROM fstudata WHERE userID='" + uname + "' ";
                PreparedStatement sta = con.prepareStatement(strquery);
                ResultSet rs = sta.executeQuery();
                while (rs.next()) {
                    regno = rs.getString("Registerno");
                }

                String strquerya = "SELECT * FROM stumarks WHERE regno='" + regno + "' ";
                PreparedStatement st = con.prepareStatement(strquerya);
                ResultSet rsa = st.executeQuery();
            
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr style=\"background-color: paleturquoise\">\n");
      out.write("\n");
      out.write("                    <th>Register Number</th><br/>\n");
      out.write("                <th>Kannada</th>\n");
      out.write("                <th>English</th>\n");
      out.write("                <th>Hindi</th>\n");
      out.write("                <th>Maths</th>\n");
      out.write("                <th>Science</th>\n");
      out.write("                <th>Social</th>\n");
      out.write("                <th>Percentage</th>\n");
      out.write("                <th>Grade</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");

                    while (rsa.next()) {
                
      out.write("\n");
      out.write("                          <!--<td>");
//regno=rs.getString("Registerno"); 
      out.write("</td>-->\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( rsa.getString(1).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print( rsa.getString(2).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print( rsa.getString(3).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print( rsa.getString(4).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print( rsa.getString(5).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print( rsa.getString(6).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print( rsa.getString(7).toString());
      out.write("</td>\n");
      out.write("                    ");

                       /* String kan = rsa.getString("kannada");
                        String eng = rsa.getString("english");
                        String hin = rsa.getString("hindi");
                        String mat = rsa.getString("maths");
                        String sci = rsa.getString("science");
                        String soc = rsa.getString("social");

                        int kanm = Integer.parseInt(kan);
                        int engm = Integer.parseInt(eng);
                        int hinm = Integer.parseInt(hin);
                        int matm = Integer.parseInt(mat);
                        int scim = Integer.parseInt(sci);
                        int socm = Integer.parseInt(soc);

                        int total = kanm + engm + hinm + matm + scim + socm;
                        int avg = (total) / 6;
                        int percentage = avg;
                        String perc = String.valueOf(percentage);*/

                    
      out.write("\n");
      out.write("                    <td> ");
      out.print( rsa.getString(8).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td> ");
      out.print( rsa.getString(9).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }

                    out.print("Hello   "+uname+"  Your  Marks  Are  As  Follows:");

      out.write("\n");
      out.write("<script>\n");
      out.write("    out.println();\n");
      out.write("    </script>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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
