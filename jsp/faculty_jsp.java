package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faculty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Faculty Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            h2{\n");
      out.write("                color:white;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            nav{\n");
      out.write("                font-family: cursive;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                color: white;\n");
      out.write("                font-family: cursive;\n");
      out.write("            }\n");
      out.write("            footer {\n");
      out.write("                position: fixed;\n");
      out.write("                padding: 10px 10px 0px 10px;\n");
      out.write("                bottom: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                /* Height of the footer*/ \n");
      out.write("                height: 50px;\n");
      out.write("                background: peachpuff;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('registrationpage.png'); background-color: black; background-repeat:no-repeat; background-size: cover;\">\n");
      out.write("        <div>\n");
      out.write("            <header style=\"background-color:black; padding-left: 20px;\">\n");
      out.write("\n");
      out.write("                <nav  class=\"navbar navbar-expand-lg navbar-light bg-light\" style=\"text-align:right;padding-right: 10px\">\n");
      out.write("                    <h2 style=\"text-align:center; padding-top: 5px; font-family:cursive;\"> STUDENT INFORMATION</h2>\n");
      out.write("\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"marks.jsp\">Add Marks</a>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"managemarks.jsp\">Manage Marks</a>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"usermanage.jsp\">Manage Users</a>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"uploadCourses.jsp\">Upload Files</a>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"fileUploadTable.jsp\">Manage files</a>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"stulogin.html\">Logout</a>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("        </div> \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <form  action=\"fstudentupdate.jsp\" method=\"get\" onsubmit=\"return registrationpage()\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                <br/><label>Faculty Code</label><br/>\n");
      out.write("                    <input class=\"form-control\" placeholder=\"Enter your code\" type=\"text\" id=\"code\" name=\"code\" required />\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <br/><label>First Name</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Enter your first nsme\" id=\"fname\" name=\"fname\"/>\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Last Name</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Enter your last name\" id=\"lname\" name=\"lname\" />\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>DOB</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"date\" id=\"dob\" name=\"dob\" max=\"2021-09-17\" />\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Email</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"email\" placeholder=\"Enter your email\" id=\"email\" name=\"email\"/>\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Phone</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Enter your Phone number\" id=\"phone\" name=\"phone\" />\n");
      out.write("                    <br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Class</label><br/>\n");
      out.write("                    <input placeholder=\"Enter your class\" class=\"form-control\" type=\"text\" id=\"cls\" name=\"cls\"/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Kannada Attendance</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Enter the no of classes\" id=\"kattandance\" name=\"kattandance\"/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>English Attendance</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Enter the no of classes\" id=\"eattandance\" name=\"eattandance\"/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Hindi Attendance</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Enter the no of classes\" id=\"hattandance\" name=\"hattandance\"/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Maths Attendance</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Enter the no of classes\" id=\"mattandance\" name=\"mattandance\"/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Science Attendance</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Enter the no of classes\" id=\"sattandance\" name=\"sattandance\"/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Social Attendance</label><br/>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Enter the no of classes\" id=\"soattandance\" name=\"soattandance\"/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <label>Registration No</label><br/>\n");
      out.write("\n");
      out.write("                    <input class=\"form-control\" placeholder=\"Enter thee reg no\" type=\"text\" id=\"roll\" name=\"roll\" /><br/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-left:10%;padding-right:10%;\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                    <br/><input class=\"btn btn-primary\" type=\"submit\" value=\"Submit\" style=\"text-align: center;\" onclick=\"registrationpage();\" />\n");
      out.write("                    <input class=\"btn btn-danger\" type=\"reset\" value=\"Reset\" style=\"text-align: center;\" />\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("<script>\n");
      out.write("    function registrationpage()\n");
      out.write("    {\n");
      out.write("        var flagger = true;\n");
      out.write("        debugger;\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        var namef = document.getElementById('fname').value;\n");
      out.write("        var namel = document.getElementById('lname').value;\n");
      out.write("        var phonea = document.getElementById('phone').value;\n");
      out.write("        var emaila = document.getElementById('email').value;\n");
      out.write("        var kan = document.getElementById('kattandance').value;\n");
      out.write("        var eng = document.getElementById('eattandance').value;\n");
      out.write("        var hin = document.getElementById('hattandance').value;\n");
      out.write("        var mat = document.getElementById('mattandance').value;\n");
      out.write("        var sci = document.getElementById('sattandance').value;\n");
      out.write("        var soc = document.getElementById('soattandance').value;\n");
      out.write("        var Class = document.getElementById('cls').value;\n");
      out.write("        var codea= document.getElementById(\"code\").value;\n");
      out.write("        //var passwordb= document.getElementById('cpswd').value;\n");
      out.write("        var datea = document.getElementById('dob').value;\n");
      out.write("        var registerno = document.getElementById('roll').value;\n");
      out.write("        //var typeuser= document.getElementById('user').value;   \n");
      out.write("        if (namef == \"\" && namel == \"\" && phonea == \"\" && codea == \"\" && emaila == \"\" && kan == \"\" && eng == \"\" && hin == \"\" && mat == \"\" && sci == \"\" && soc == \"\" && Class == \"\" && registerno == \"\")\n");
      out.write("        {\n");
      out.write("            alert(\"please fill the form\");\n");
      out.write("            //flagger=false;\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var namefpattern = /^[a-zA-Z]+$/;\n");
      out.write("        if (!namefpattern.test(namef))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter valid first name\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("         var codepattern = /^(FAC){1}[0-9]{5}$/;\n");
      out.write("                if (!codepattern.test(codea))\n");
      out.write("                {\n");
      out.write("                    alert(\"please enter valid faculty code\");\n");
      out.write("                    flagger = false;\n");
      out.write("                    return flagger;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("        var namelpattern = /^[a-zA-Z]+$/;\n");
      out.write("        if (!namelpattern.test(namel))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter valid last name\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var phoneapattern = /^[6-9]{1}[0-9]{9}$/;\n");
      out.write("        if (!phoneapattern.test(phonea))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter valid phone no\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var emailapattern = /^[a-zA-Z0-9]+[@]{1}[a-zA-Z]+[.]{1}[a-zA-Z]{2,3}$/;\n");
      out.write("        if (!emailapattern.test(emaila))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter valid email\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var kattan = /^[0-9]{2,3}$/;\n");
      out.write("        if (!kattan.test(kan))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter the valid number\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var eattan = /^[0-9]{2,3}$/;\n");
      out.write("        if (!eattan.test(eng))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter the valid number\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var hattan = /^[0-9]{2,3}$/;\n");
      out.write("        if (!hattan.test(hin))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter the valid number\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var mattan = /^[0-9]{2,3}$/;\n");
      out.write("        if (!mattan.test(mat))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter the valid number\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var sattan = /^[0-9]{2,3}$/;\n");
      out.write("        if (!sattan.test(sci))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter the valid number\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var soattan = /^[0-9]{2,3}$/;\n");
      out.write("        if (!soattan.test(soc))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter the valid number\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var classes = /^[a-zA-Z0-9]+$/;\n");
      out.write("        if (!classes.test(Class))\n");
      out.write("        {\n");
      out.write("            alert(\"please enter valid class\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("        var regno = /^[A-Z]{3}[0-9]{5}$/;\n");
      out.write("        if (!regno.test(registerno))\n");
      out.write("        {\n");
      out.write("            alert(\"Please enter valid Register number\");\n");
      out.write("            flagger = false;\n");
      out.write("            return flagger;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<!--<footer style=\"background-color: black\">\n");
      out.write("    <p style=\"color: wheat; font-size: 10px\">Author: Hege Refsnes<br>\n");
      out.write("        <a href=\"#\" style=\"color: wheat\">hege@example.com</a></p>\n");
      out.write("</footer>-->\n");
      out.write("</body>\n");
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