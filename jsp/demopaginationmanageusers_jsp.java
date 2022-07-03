package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class demopaginationmanageusers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public int nullIntconv(String str)
    {
    int conv=0;
    if(str==null)
    {
    str="0";
    }
    else if((str.trim()).equals("null"))
    {
    str="0";
    }
    else if(str.equals(""))
    {
    str="0";
    }
    try{
    conv=Integer.parseInt(str);
    }
    catch(Exception e)
    {
    }
    return conv;
    }
    
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("     \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <title>Manage List</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <style>\n");
      out.write("                body{\n");
      out.write("                    background-color:white;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                table, th, td {\n");
      out.write("                    border: 2px solid black;\n");
      out.write("                    border-collapse: collapse;\n");
      out.write("                    text-align: left;\n");
      out.write("                    padding-top: 20px;\n");
      out.write("                    padding-bottom: 20px;\n");
      out.write("                    padding-left: 5px;\n");
      out.write("                    padding-right: 5px;\n");
      out.write("                    font-family: cursive;\n");
      out.write("                }\n");
      out.write("                #table{\n");
      out.write("                    position: absolute;\n");
      out.write("                    top: 25%;\n");
      out.write("                    left: 25%;\n");
      out.write("                }\n");
      out.write("                td{\n");
      out.write("                    background-color: white;\n");
      out.write("                }\n");
      out.write("                h2{\n");
      out.write("                    color: white;\n");
      out.write("                }\n");
      out.write("                th{\n");
      out.write("                    font-size: 16px;\n");
      out.write("                    background-color:#6ab0a2;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("        </head>\n");
      out.write("        <body class=\"pagination-section\">\n");
      out.write("            <div>\n");
      out.write("                <header style=\"background-color: #46915b;\">\n");
      out.write("\n");
      out.write("                    <nav  style=\"text-align:right;background-color:black; height: 100px; padding-top: 0.1px; padding-right: 30px;\">\n");
      out.write("                        <h2 style=\"text-align:center; font-family:cursive;\">MANAGE FACULTY LIST</h2>\n");
      out.write("                        <a  class=\"btn btn-danger\" style=\"padding-left:20px; font-size: 16px;  font-family:cursive;\" href=\"admin.jsp\">Home</a>\n");
      out.write("                        <a  class=\"btn btn-danger\" style=\"padding-left:20px; font-size: 16px;  font-family:cursive;\" href=\"approvalpage.jsp\">Approve Faculty</a>\n");
      out.write("                        <a  class=\"btn btn-danger\" style=\"padding-left:20px; font-size: 16px;  font-family:cursive;\" href=\"stulogin.html\">Logout</a>\n");
      out.write("                    </nav>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"table\">\n");
      out.write("                ");

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

                    ResultSet rsPagination = null;
                        ResultSet rsRowCnt = null;

                        PreparedStatement psPagination=null;
                        PreparedStatement psRowCnt=null;

                        int iShowRows=5; // Number of records show on per page
                        int iTotalSearchRecords=10; // Number of pages index shown

                        int iTotalRows=nullIntconv(request.getParameter("iTotalRows"));
                        int iTotalPages=nullIntconv(request.getParameter("iTotalPages"));
                        int iPageNo=nullIntconv(request.getParameter("iPageNo"));
                        int cPageNo=nullIntconv(request.getParameter("cPageNo"));

                        int iStartResultNo=0;
                        int iEndResultNo=0;

                        if(iPageNo==0)
                        {
                        iPageNo=0;
                        }
                        else{
                        iPageNo=Math.abs((iPageNo-1)*iShowRows);
                        }
                        String sqlPagination="SELECT SQL_CALC_FOUND_ROWS * FROM studata order by name limit '"+iPageNo+"','"+iShowRows+"'";

                        psPagination=con.prepareStatement(sqlPagination);
                        rsPagination=psPagination.executeQuery();

                        //// this will count total number of rows
                        String sqlRowCnt="SELECT FOUND_ROWS() FROM studata WHERE status='yes'";
                        psRowCnt=con.prepareStatement(sqlRowCnt);
                        rsRowCnt=psRowCnt.executeQuery();

                        if(rsRowCnt.next())
                        {
                        iTotalRows=rsRowCnt.getInt("cnt");
                        }
                
      out.write("\n");
      out.write("                <input type=\"hidden\" name=\"iPageNo\" value=\"");
      out.print(iPageNo);
      out.write("\">\n");
      out.write("                <input type=\"hidden\" name=\"cPageNo\" value=\"");
      out.print(cPageNo);
      out.write("\">\n");
      out.write("                <input type=\"hidden\" name=\"iShowRows\" value=\"");
      out.print(iShowRows);
      out.write("\">\n");
      out.write("                <table>\n");
      out.write("                    <tr style=\"background-color: paleturquoise\">\n");
      out.write("                        <th>First_name</th><br/>\n");
      out.write("                    <th>Last_name</th>\n");
      out.write("                    <th>Dob</th>\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Phone</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        while (rsPagination.next()) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( rsPagination.getString(1).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print( rsPagination.getString(2).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print( rsPagination.getString(3).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print( rsPagination.getString(4).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print( rsPagination.getString(5).toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                            <a class=\"btn btn-warning\" href=\"userdele.jsp?email= ");
      out.print( rsPagination.getString(4).toString());
      out.write("\">Delete</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    ");

    //// calculate next record start record and end record
    try{
    if(iTotalRows<(iPageNo+iShowRows))
    {
    iEndResultNo=iTotalRows;
    }
    else
    {
    iEndResultNo=(iPageNo+iShowRows);
    }

    iStartResultNo=(iPageNo+1);
    iTotalPages=((int)(Math.ceil((double)iTotalRows/iShowRows)));

    }
    catch(Exception e)
    {
    e.printStackTrace();
    }

    
      out.write("\n");
      out.write("    <tr>\n");
      out.write("    <td colspan=\"3\">\n");
      out.write("\n");
      out.write("    0)\n");
      out.write("    {\n");
      out.write("    %>\n");
      out.write("    &cPageNo=\">\n");
      out.write("    ? style=?cursor:pointer;color: red?>\n");
      out.write("\n");
      out.write("    ?>\n");
      out.write("    iTotalSearchRecords && i\n");
      out.write("    &cPageNo=?> >> Next\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
      out.write("    ");

    try{
    if(psPagination!=null){
    psPagination.close();
    }
    if(rsPagination!=null){
    rsPagination.close();
    }

    if(psRowCnt!=null){
    psRowCnt.close();
    }
    if(rsRowCnt!=null){
    rsRowCnt.close();
    }

    if(con!=null){
    con.close();
    }
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
    
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
