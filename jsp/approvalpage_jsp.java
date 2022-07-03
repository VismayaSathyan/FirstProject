package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class approvalpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Approval List</title>\n");
      out.write("       <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css\" /> \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js\"> </script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            h2,a{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            table, th, td {\n");
      out.write("                border: 2px solid black;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                text-align: left;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("                padding-left: 15px;\n");
      out.write("                padding-right: 15px;\n");
      out.write("                font-family: cursive;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            #table{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 25%;\n");
      out.write("                left: 21%;\n");
      out.write("                font-family: cursive;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            th{\n");
      out.write("                font-size: 16px;\n");
      out.write("                background-color:#6ab0a2;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <header style=\"background-color: #46915b;\">\n");
      out.write("\n");
      out.write("                <nav  style=\"text-align:right;background-color:black; height: 100px; padding-top: 0.1px; padding-right: 30px;\">\n");
      out.write("                    <h2 style=\"text-align:center; font-family:cursive;\">APPROVE FACULTY LIST</h2>\n");
      out.write("                    <a class=\"btn btn-danger\" style=\"padding-left:20px; font-size: 16px;  font-family:cursive;\" href=\"admin.jsp\">Home</a>\n");
      out.write("                    <a class=\"btn btn-danger\" style=\"padding-left:20px; font-size: 16px;  font-family:cursive;\" href=\"manageusers.jsp\">Manage Faculty   </a>\n");
      out.write("                    <a class=\"btn btn-danger\" style=\"padding-left:20px; font-size: 16px; font-family:cursive;\" href=\"stulogin.html\">Logout</a>\n");
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

                String strquery = "SELECT * FROM studata WHERE status='pending'";
                PreparedStatement sta = con.prepareStatement(strquery);
                ResultSet rs = sta.executeQuery(strquery);
            
      out.write("\n");
      out.write("            <table id=\"tableID\" class=\"display\">\n");
      out.write("                <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>First_name</th><br/>\n");
      out.write("                <th>Last_name</th>\n");
      out.write("                <th>Dob</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Phone</th>\n");
      out.write("                <th style=\"text-align:center\" colspan=\"2\">Action</th>\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("                ");

                    while (rs.next()) {
                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( rs.getString(1).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print( rs.getString(2).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print( rs.getString(3).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print( rs.getString(4).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print( rs.getString(5).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <a class=\"btn btn-warning\" href=\"userstat.jsp?email=");
      out.print( rs.getString(4).toString());
      out.write("\">Accept</a>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <a class=\"btn btn-info\" href=\"userstatdele.jsp?email=");
      out.print( rs.getString(4).toString());
      out.write("\">Reject</a>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tbody>\n");
      out.write("                ");

                    }
                    //out.print("Hi "+session_u_name);
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("             <script>\n");
      out.write("  \n");
      out.write("        /* Initialization of datatable */\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $('#tableID').DataTable({ });\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
