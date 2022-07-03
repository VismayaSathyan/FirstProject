package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Paginationdemo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Pagination Demo</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css\" /> \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js\"> </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <h2>Pagination using jQuery Datatables </h2>\n");
      out.write("  \n");
      out.write("    <!--HTML table with student data-->\n");
      out.write("    <table id=\"tableID\" class=\"display\" style=\"width:100%\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>StudentID</th>\n");
      out.write("                <th>StudentName</th>\n");
      out.write("                <th>Age</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>Marks Scored</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST1</td>\n");
      out.write("                <td>Prema</td>\n");
      out.write("                <td>35</td>\n");
      out.write("                <td>Female</td>\n");
      out.write("                <td>320</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST2</td>\n");
      out.write("                <td>Wincy</td>\n");
      out.write("                <td>36</td>\n");
      out.write("                 <td>Female</td>\n");
      out.write("                <td>170</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                 <td>ST3</td>\n");
      out.write("                <td>Ashmita</td>\n");
      out.write("                <td>41</td>\n");
      out.write("                <td>Female</td>\n");
      out.write("                <td>860</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST4</td>\n");
      out.write("                <td>Kelina</td>\n");
      out.write("                <td>32</td>\n");
      out.write("                 <td>Female</td>\n");
      out.write("                <td>433</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST5</td>\n");
      out.write("                <td>Satvik</td>\n");
      out.write("                <td>41</td>\n");
      out.write("                 <td>male</td>\n");
      out.write("                <td>162</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST6</td>\n");
      out.write("                <td>William</td>\n");
      out.write("                <td>37</td>\n");
      out.write("                 <td>Female</td>\n");
      out.write("                <td>372</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST7</td>\n");
      out.write("                <td>Chandan</td>\n");
      out.write("                <td>31</td>\n");
      out.write("                <td>male</td>\n");
      out.write("                <td>375</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST8</td>\n");
      out.write("                <td>David</td>\n");
      out.write("                <td>45</td>\n");
      out.write("                 <td>male</td>\n");
      out.write("                <td>327</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST9</td>\n");
      out.write("                <td>Harry</td>\n");
      out.write("                <td>29</td>\n");
      out.write("                 <td>male</td>\n");
      out.write("                <td>205</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST10</td>\n");
      out.write("                <td>Frost</td>\n");
      out.write("                <td>29</td>\n");
      out.write("                 <td>male</td>\n");
      out.write("                <td>300</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST11</td>\n");
      out.write("                <td>Ginny</td>\n");
      out.write("                <td>31</td>\n");
      out.write("                 <td>male</td>\n");
      out.write("                <td>560</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST12</td>\n");
      out.write("                <td>Flod</td>\n");
      out.write("                <td>45</td>\n");
      out.write("                <td>Female</td>\n");
      out.write("                <td>342</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST13</td>\n");
      out.write("                <td>Marshy</td>\n");
      out.write("                <td>23</td>\n");
      out.write("                <td>Female</td>\n");
      out.write("                <td>470</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST13</td>\n");
      out.write("                <td>Kennedy</td>\n");
      out.write("                <td>43</td>\n");
      out.write("                <td>male</td>\n");
      out.write("                <td>313</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST14</td>\n");
      out.write("                <td>Fiza</td>\n");
      out.write("                <td>31</td>\n");
      out.write("                <td>Female</td>\n");
      out.write("                <td>750</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ST15</td>\n");
      out.write("                <td>Silva</td>\n");
      out.write("                <td>34</td>\n");
      out.write("                 <td>male</td>\n");
      out.write("                <td>985</td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("  \n");
      out.write("    <script>\n");
      out.write("  \n");
      out.write("        /* Initialization of datatable */\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $('#tableID').DataTable({ });\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
