package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class demoviewpagepagination_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public int nullIntconv(String str) {
        int conv = 0;
        if (str == null) {
            str =
          "0";
}
else if ((str.trim()).equals(
            "null"))
{
str =
        "0";
}
else if (str.equals(
        
            ""))
{
str =
        
        "0";
}
try {
            conv = Integer.parseInt(str);
        } catch (Exception e) {
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
      out.write("\n");
      out.write("\n");
      out.write('\n');


    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbname = "demodatapro";
    String username = "root";
    String pswd = "";
    String drivername = "com.mysql.jdbc.Driver";
    try {
        Class.forName(drivername).newInstance();
        con = DriverManager.getConnection(url + dbname, username, pswd);
    } catch (Exception ex) {
        System.out.println("Not connected to database");
    }
        
    ResultSet 
    rsPagination = null;
ResultSet rsRowCnt = null;

    PreparedStatement psPagination = null;
    PreparedStatement psRowCnt = null;

    int iShowRows = 5; // Number of records show on per page
    int iTotalSearchRecords = 10; // Number of pages index shown

    int iTotalRows = nullIntconv(request.getParameter("iTotalRows"));
int iTotalPages = nullIntconv(request.getParameter("iTotalPages"));
int iPageNo = nullIntconv(request.getParameter("iPageNo"));
int cPageNo = nullIntconv(request.getParameter("cPageNo"));

int iStartResultNo = 0;
    int iEndResultNo = 0;

    if (iPageNo == 0) {
        iPageNo = 0;
    } else {
        iPageNo = Math.abs((iPageNo - 1) * iShowRows);
    }
    String sqlPagination ="SELECT SQL_CALC_FOUND_ROWS * FROM mydata order by name limit '"+iPageNo +"','"+iShowRows +"'";

psPagination = con.prepareStatement(sqlPagination);
    rsPagination = psPagination.executeQuery();

//// this will count total number of rows
    String sqlRowCnt ="SELECT FOUND_ROWS() as cnt FROM mydata";
psRowCnt = con.prepareStatement(sqlRowCnt);
    rsRowCnt = psRowCnt.executeQuery();

    if (rsRowCnt.next()) {
        iTotalRows = rsRowCnt.getInt("cnt");
}

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Pagination of JSP page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=?frm?>\n");
      out.write("            <input type=?hidden? name=?iPageNo? value=?");
      out.print(iPageNo);
      out.write("?>\n");
      out.write("            <input type=?hidden? name=?cPageNo? value=?");
      out.print(cPageNo);
      out.write("?>\n");
      out.write("            <input type=?hidden? name=?iShowRows? value=?");
      out.print(iShowRows);
      out.write("?>\n");
      out.write("            <table width=?100%? cellpadding=?0? cellspacing=?0? border=?1? >\n");
      out.write("                <tr>\n");
      out.write("                    <td>Id</td>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>Value</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    while (rsPagination.next()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rsPagination.getString("id"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rsPagination.getString("name"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rsPagination.getString("value"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("                ");

                //// calculate next record start record and end record
                try {
                        if (iTotalRows < (iPageNo + iShowRows)) {
                            iEndResultNo = iTotalRows;
                        } else {
                            iEndResultNo = (iPageNo + iShowRows);
                        }

                        iStartResultNo = (iPageNo + 1);
                        iTotalPages = ((int) (Math.ceil((double) iTotalRows / iShowRows)));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=?3?>\n");
      out.write("\n");
      out.write("                        0)\n");
      out.write("                        {\n");
      out.write("                        %>\n");
      out.write("                        &cPageNo=?>\n");
      out.write("                        ? style=?cursor:pointer;color: red?>\n");
      out.write("\n");
      out.write("                        ?>\n");
      out.write("                        iTotalSearchRecords && i\n");
      out.write("                        &cPageNo=?> >> Next\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    try {
        if (psPagination != null) {
            psPagination.close();
        }
        if (rsPagination != null) {
            rsPagination.close();
        }

        if (psRowCnt != null) {
            psRowCnt.close();
        }
        if (rsRowCnt != null) {
            rsRowCnt.close();
        }

        if (con!= null) 
        {
            con.close();
        }
    } catch (Exception e) {
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
