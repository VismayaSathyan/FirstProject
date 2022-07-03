package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class studb_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String dob = request.getParameter("dob");
    String email = request.getParameter("email");
    String password = request.getParameter("pswd");
    String phone = request.getParameter("phone");
    String code= request.getParameter("code");
    String users = "Faculty";

    String querya = "SELECT COUNT(*) FROM studata WHERE email='" + email + "' AND faculty_code='"+code+"'";
    PreparedStatement st = con.prepareStatement(querya);
    ResultSet rs = st.executeQuery(querya);
    int count = 0;
    while(rs.next())
    {
        count++;
    }
    if (count==0) {
        int i = st.executeUpdate("INSERT INTO studata (firstname, lastname, dob, email, phone, passwordd, faculty_code, status, users) VALUES('" + fname + "','" + lname + "','" + dob + "','" + email + "','" + phone + "','" + password + "','"+code+"','pending','Faculty')");
        out.println("<script>alert('data stored')</script>");

      out.write("\n");
      out.write("<script>\n");
      out.write("    window.location = 'stulogin.html';\n");
      out.write("</script>\n");

    } else {
        out.println("<script>alert('Email/ Code already exists')</script>");

      out.write("\n");
      out.write("<script>\n");
      out.write("    window.location = 'registration.html';\n");
      out.write("</script>\n");

    }
    /*String query="INSERT INTO userdataa VALUES('"+fname+"','"+lname+"','"+dob+"','"+email+"','"+password+"','"+phone+"')";
PreparedStatement st= con.prepareStatement(query);
st.executeUpdate();*/

      out.write("\n");
      out.write("<!--<script>\n");
      out.write("alert('data stored');\n");
      out.write("</script>-->\n");
      out.write("\n");
      out.write("<!--<label>");
      out.print(fname);
      out.write("</label>\n");
      out.write("<label>");
      out.print(lname);
      out.write("</label>\n");
      out.write("<label>");
      out.print(dob);
      out.write("</label>\n");
      out.write("<label>");
      out.print(email);
      out.write("</label>\n");
      out.write("<label>");
      out.print(password);
      out.write("</label>\n");
      out.write("<label>");
      out.print(phone);
      out.write("</label>-->\n");
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
