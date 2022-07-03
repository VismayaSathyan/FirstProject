package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newstudentlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Student Login page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            h1,label{\n");
      out.write("                font-family: cursive;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('nstuloginimg.png'); background-repeat: no-repeat; background-size: cover\">\n");
      out.write("        ");

           session.setAttribute("user", " " );
           
        
      out.write("\n");
      out.write("        <form action=\"newstudentlogindb.jsp\" method=\"get\" onsubmit=\"return loginpage()\">\n");
      out.write("\n");
      out.write("            <div class=\"form-group\" style=\"padding-top:10%\">\n");
      out.write("                <div style=\"padding-left:40%;padding-right:40%;\" class=\"col-lg-12 col-md-12 col-sm-6 col-xs-6\">\n");
      out.write("                    <h1 style=\"text-align: center; padding-top: 20px; font-family: cursive ;color: black;\">Student Login Form</h1>\n");
      out.write("                    <label style=\"padding-top: 5px;\">Username</label><br/><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"uname\" placeholder=\"Enter the Usernsme\" name=\"uname\"/><br/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:40%;padding-right:40%;\" class=\"col-lg-12 col-md-12 col-sm-6 col-xs-6\">\n");
      out.write("                    <label style=\"padding-top: 2px;\">Password</label>\n");
      out.write("                    <input class=\"form-control\" type=\"password\" placeholder=\"Enter your Password\" id=\"pswd\" name=\"pswd\"/><br/><br/>\n");
      out.write("\n");
      out.write("                    <div style=\"padding-left: 39%;padding-right: 40%\" class=\"col-lg-12 col-md-12 col-sm-6 col-xs-6\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-danger\" value=\"submit\" onclick=\"loginpage();\" /><br/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"img1\" style=\"padding-left:44%;padding-right: 40%\" class=\"col-lg-12 col-md-12 col-sm-2 col-xs-2\">\n");
      out.write("                    <p style=\"color: black;font-size: 18px;font-family: cursive;\">Redirect to <a class=\"btn btn-warning\" style=\"color:black; font-family: cursive;\" href=\"home.html\">Home page</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("            function loginpage()\n");
      out.write("            {\n");
      out.write("                debugger;\n");
      out.write("                var flagger = true;\n");
      out.write("                //var uname= document.getElementById('usname');\n");
      out.write("                //var unamepattern=/^[a-zA-Z]+$/;\n");
      out.write("                //var nm= uname.value;\n");
      out.write("                var username = document.getElementById('uname');\n");
      out.write("                var upattern = /^[a-zA-Z0-9]+$/;\n");
      out.write("                var password = document.getElementById('pswd');\n");
      out.write("                var ppattern = /^[a-zA-Z0-9]+$/;\n");
      out.write("\n");
      out.write("                //if(!unamepattern.test(nm))\n");
      out.write("                //{\n");
      out.write("                // uname.style.backgroundColor=\"red\";\n");
      out.write("                //}\n");
      out.write("                //\telse{\n");
      out.write("                //\tuname.style.backgroundColor=\"white\";\n");
      out.write("                //\t\n");
      out.write("                //\t}\n");
      out.write("                if (username == \"\" && password == \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please fill the details\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (!upattern.test(username.value))\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter the correct username\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (!ppattern.test(password.value))\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter the correct password\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
