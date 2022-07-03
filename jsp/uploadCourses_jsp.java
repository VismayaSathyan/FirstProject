package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uploadCourses_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Upload File</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
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
      out.write("        </style>\n");
      out.write("    <body style=\"background-image:url('fileup.png')\">\n");
      out.write("        <div>\n");
      out.write("            <header style=\"background-color:black; padding-left: 20px;\">\n");
      out.write("\n");
      out.write("                <nav  class=\"navbar navbar-expand-lg navbar-light bg-light\" style=\"text-align:right;padding-right: 10px\">\n");
      out.write("                    <h2 style=\"text-align:center; padding-top: 5px; font-family:cursive;\"> UPLOAD THE FILES</h2>\n");
      out.write("\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"marks.jsp\">Add Marks</a>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"managemarks.jsp\">Manage Marks</a>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"usermanage.jsp\">Manage Users</a>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"fileUploadTable.jsp\">Manage Files</a>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"faculty.jsp\">Add StudentInfo</a>\n");
      out.write("                    <a class=\"btn btn-warning\" style=\"padding-left:20px; color: black;\" href=\"stulogin.html\">Logout</a>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("        </div> \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <form action='uploadFile.jsp' method='post' enctype='multipart/form-data' onsubmit=\"return uploadfile()\">\n");
      out.write("                 <div class=\"col-lg-12 col-md-12 col-sm-4 col-xs-4\" style=\"padding-left:570px; padding-right: 500px;\">\n");
      out.write("                    <label>File name</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"upname\" name=\"upname\"/>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"col-lg-12 col-md-12 col-sm-4 col-xs-4\" style=\"padding-left:570px; padding-right: 500px;\">\n");
      out.write("                    <label>Register number</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"regnum\" name=\"regnum\"/>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-4 col-xs-4\" style=\"padding-left:570px; padding-right: 500px;\">\n");
      out.write("                    <label>Choose a File</label>\n");
      out.write("                    <input class=\"form-control\" type=\"file\" id=\"ufile\" name=\"ufile\" required />\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-4 col-xs-4\" style=\"padding-left:570px; padding-right: 500px;\">\n");
      out.write("                    <label>Code</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"code\" name=\"code\"/>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-4 col-xs-4\" style=\"padding-left:570px; padding-right: 500px;\">\n");
      out.write("                    <br/><br/> <input class=\"btn btn-danger\" type=\"submit\" value=\"upload\" onClick=\"uploadfile();\"/>\n");
      out.write("                </div> \n");
      out.write("            </form>\n");
      out.write("            <p>\n");
      out.write("             ");
 
        String message=(String) request.getAttribute("msg");
        if(message!=null){
        out.println(""+message);
        }else{
        
        }
        
      out.write("\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("            <script>\n");
      out.write("                function uploadfile()\n");
      out.write("                {\n");
      out.write("                debugger;\n");
      out.write("                var flagger = true;\n");
      out.write("                var filename= document.getElementById(\"upname\").value;\n");
      out.write("                var registerno= document.getElementById(\"regnum\").value;\n");
      out.write("                var file = document.getElementById(\"ufile\").value;\n");
      out.write("                var codea= document.getElementById(\"code\").value;\n");
      out.write("                \n");
      out.write("                if(filename==\"\" && registerno==\"\" && file==\"\" && codea==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter the data\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                var fname=/^[a-zA-z]+$/;\n");
      out.write("                 if (!fname.test(filename))\n");
      out.write("                {\n");
      out.write("                    alert('enter the valid Filename');\n");
      out.write("                    flagger=false;\n");
      out.write("                    return flagger;\n");
      out.write("                \n");
      out.write("                }\n");
      out.write("                var reg=/^[A-z]{3}[0-9]{5}$/;\n");
      out.write("                 if (!reg.test(registerno))\n");
      out.write("                {\n");
      out.write("                    alert('enter the valid register number');\n");
      out.write("                    flagger=false;\n");
      out.write("                    return flagger;\n");
      out.write("                \n");
      out.write("                }\n");
      out.write("                var fcodea=/^(FAC){1}[0-9]{5}$/;\n");
      out.write("                 if (!fcodea.test(codea))\n");
      out.write("                {\n");
      out.write("                    alert('enter the valid Filename');\n");
      out.write("                    flagger=false;\n");
      out.write("                    return flagger;\n");
      out.write("                \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            </script>\n");
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
