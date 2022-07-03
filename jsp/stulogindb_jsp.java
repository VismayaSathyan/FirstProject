package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class stulogindb_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String uname = request.getParameter("uname");
    String password1 = request.getParameter("pswd");
    session.setAttribute("user", uname);

    /*String inquery="INSERT INTO ldata VALUES('"+uname+"','"+email+"','"+password+"')";
PreparedStatement st= con.prepareStatement(inquery);
    st.executeUpdate();*/
    String querya = "SELECT * FROM fstudata WHERE userID='" + uname + "' AND password='" + password1 + "'";
    PreparedStatement sta = con.prepareStatement(querya);
    //sta.setString(1, uname);
    //sta.setString(2, password1);
    ResultSet rs = sta.executeQuery();
     
    while(rs.next())
    {
        if (rs.getString(15).equals(uname) && rs.getString(16).equals(password1))
        {
            out.println("<script>alert('login successful')</script>");


      out.write("\n");
      out.write("<script>\n");
      out.write("    window.location = 'stuwelcomepage.jsp';\n");
      out.write("    //window.location='Welcome.jsp';\n");
      out.write("</script> \n");
      } else {
    out.println("<script>alert('Please enter the valid details')</script>");

      out.write("\n");
      out.write("<script>\n");
      out.write("    window.location = 'newstudentlogin.jsp';\n");
      out.write("</script> \n");

    }
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
