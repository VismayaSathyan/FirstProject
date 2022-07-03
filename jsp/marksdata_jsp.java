package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class marksdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String registerno = request.getParameter("regno");
    String kannada = request.getParameter("kan");
    String english = request.getParameter("eng");
    String hindi = request.getParameter("hin");
    String maths = request.getParameter("mat");
    String science = request.getParameter("sci");
    String social = request.getParameter("soc");
    
    
     int kanm = Integer.parseInt(kannada);
                        int engm = Integer.parseInt(english);
                        int hinm = Integer.parseInt(hindi);
                        int matm = Integer.parseInt(maths);
                        int scim = Integer.parseInt(science);
                        int socm = Integer.parseInt(social);

                        int total = kanm + engm + hinm + matm + scim + socm;
                        int avg = (total) / 6;
                        int percentage = avg;
                        String perc = String.valueOf(percentage);
                   
    
    String query = "INSERT INTO stumarks(regno,kannada,english,hindi,maths,science,social,Percentage) VALUES ('" + registerno + "','" + kannada + "','" + english + "','" + hindi + "','" + maths + "','" + science + "','" + social + "','"+perc+"')";
    PreparedStatement st = con.prepareStatement(query);
    st.executeUpdate(query);

    //String count=rs.getString(1);
    //if(count.equals("0"))
    //
    //{
    //int i= st.executeUpdate("INSERT INTO studata (regno,subject,marks) VALUES('"+registerno+"','"+subject+"','"+marks+"')");
    //out.println("<script>alert('data stored')</script>");

      out.write("\n");
      out.write("<script>\n");
      out.write("    alert('Marks stored');\n");
      out.write("    window.location = 'marks.jsp';\n");
      out.write("</script>\n");
               //}
    //else
    //{
    // out.println("<script>alert('email already exists')</script>");   
    //}
    /*String query="INSERT INTO userdataa VALUES('"+fname+"','"+lname+"','"+dob+"','"+email+"','"+password+"','"+phone+"')";
PreparedStatement st= con.prepareStatement(query);
st.executeUpdate();*/

      out.write("\n");
      out.write("<!--<script>\n");
      out.write("alert('data stored');\n");
      out.write("</script>-->\n");
      out.write("\n");
      out.write("\n");
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
