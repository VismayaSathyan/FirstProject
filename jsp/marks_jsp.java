package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class marks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Marks Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            h2,nav{\n");
      out.write("                color: peachpuff;\n");
      out.write("                font-family: cursive;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                color: rosybrown;\n");
      out.write("                font-family: cursive;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black;background-image:url('marksimg1.png');  background-repeat:no-repeat; background-size: cover;\">\n");
      out.write("        <div style=\"background-color:#18702f;\">\n");
      out.write("            <header>\n");
      out.write("\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-light\" style=\"text-align:right; height: 100px; padding-top: 0.5px; padding-right: 30px;\">\n");
      out.write("                    <h2 style=\"text-align:center; padding-top: 1px;\"> STUDENT MARKS</h2>\n");
      out.write("\n");
      out.write("                    <a class=\"btn btn-danger\" style=\"padding-left:20px;color: peachpuff;\" href=\"faculty.jsp\">Add Students</a>\n");
      out.write("\n");
      out.write("                    <a class=\"btn btn-danger\" style=\"padding-left:20px;color: peachpuff;\" href=\"managemarks.jsp\">Manage Marks</a>\n");
      out.write("                    <a class=\"btn btn-danger\" style=\"padding-left:20px;color: peachpuff;\" href=\"usermanage.jsp\">Manage Students</a>\n");
      out.write("                    <a class=\"btn btn-danger\" style=\"padding-left:20px;color: peachpuff;\" href=\"stulogin.html\">Logout</a>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <form action=\"marksdata.jsp\" style=\"padding-top:145px;\" method=\"get\" onsubmit=\"return registrationpage()\">\n");
      out.write("\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                <br/><label>Faculty Code</label><br/>\n");
      out.write("                    <input class=\"form-control\" placeholder=\"Enter your code\" type=\"text\" id=\"code\" name=\"code\" required />\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <br/><label>Register no</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"regno\" name=\"regno\"/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <br/> <label style=\"color: black;\">Kannada</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"kan\" name=\"kan\"/>  \n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>English</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"eng\" name=\"eng\" />\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label style=\"color: black;\" >Hindi</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"hin\" name=\"hin\" />\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Maths</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"mat\" name=\"mat\" />\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label style=\"color: black;\" >Science</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"sci\" id=\"eng\" name=\"sci\" />\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Social</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"soc\" name=\"soc\" />\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <br/>     <input class=\"btn btn-warning\" type=\"submit\" value=\"submit\" style=\"text-align: center;\" onclick=\"registrationpage();\" />\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function registrationpage()\n");
      out.write("            {\n");
      out.write("                var flagger = true;\n");
      out.write("                debugger;\n");
      out.write("\n");
      out.write("                var register = document.getElementById('regno').value;\n");
      out.write("                var kannada = document.getElementById('kan').value;\n");
      out.write("                var english = document.getElementById('eng').value;\n");
      out.write("                var hindi = document.getElementById('hin').value;\n");
      out.write("                var maths = document.getElementById('mat').value;\n");
      out.write("                var science = document.getElementById('sci').value;\n");
      out.write("                var social = document.getElementById('soc').value;\n");
      out.write("                var codea= document.getElementById(\"code\").value;\n");
      out.write("               // var sum=parseInt(kannada)+parseInt(english)+parseInt(hindi)+parseInt(maths)+parseInt(science)+parseInt(social);\n");
      out.write("               \n");
      out.write("               // var avg=sum/6;\n");
      out.write("               // var percentage= avg;\n");
      out.write("                if (register == \"\" && kannada == \"\" && english == \"\" && codea==\"\" && hindi == \"\" && maths == \"\" && science == \"\" && social == \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"please fill the details\");\n");
      out.write("                    //flagger=false;\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                var codepattern = /^(FAC){1}[0-9]{5}$/;\n");
      out.write("                if (!codepattern.test(codea))\n");
      out.write("                {\n");
      out.write("                    alert(\"please enter valid faculty code\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                var reg = /^[A-Z]{3}[0-9]{5}$/;\n");
      out.write("                if (!reg.test(register))\n");
      out.write("                {\n");
      out.write("                    alert(\"please enter valid regno\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var kann = /^[0-9]+$/;\n");
      out.write("                if (!kann.test(kannada))\n");
      out.write("                {\n");
      out.write("                    alert(\"please enter valid subject name\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var engg = /^[0-9]+$/;\n");
      out.write("                if (!engg.test(english))\n");
      out.write("                {\n");
      out.write("                    alert(\"please enter valid marks\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                var hinn = /^[0-9]+$/;\n");
      out.write("                if (!hinn.test(hindi))\n");
      out.write("                {\n");
      out.write("                    alert(\"please enter valid marks\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("                }\n");
      out.write("                var matt = /^[0-9]+$/;\n");
      out.write("                if (!matt.test(maths))\n");
      out.write("                {\n");
      out.write("                    alert(\"please enter valid marks\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("                }\n");
      out.write("                var scii = /^[0-9]+$/;\n");
      out.write("                if (!matt.test(science))\n");
      out.write("                {\n");
      out.write("                    alert(\"please enter valid marks\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("                }\n");
      out.write("                var socc = /^[0-9]+$/;\n");
      out.write("                if (!socc.test(social))\n");
      out.write("                {\n");
      out.write("                    alert(\"please enter valid marks\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
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
