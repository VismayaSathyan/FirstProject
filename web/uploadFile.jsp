        <%-- 
            Document   : uploadFile
            Created on : 8 Oct, 2021, 12:15:29 PM
            Author     : Vismaya
        --%>

        <%@page import="java.sql.*" %>
        <%@page import="java.io.*,java.util.*, javax.servlet.*" %>
        <%@page import="javax.servlet.http.*" %>
        <%@page import="org.apache.commons.fileupload.*" %>
        <%@page import="org.apache.commons.fileupload.disk.*" %>
        <%@page import="org.apache.commons.fileupload.servlet.*" %>
        <%@page import="org.apache.commons.io.output.*" %>
        <%@page import="java.util.Enumeration" %>
        <%@page import="com.oreilly.servlet.MultipartRequest"%>


        <%
            Connection conn = null;
            String url = "jdbc:mysql://localhost:3306/";
            String dbname = "studentdb";
            String username = "root";
            String pswd = "";
            String drivername = "com.mysql.jdbc.Driver";
            try {
                Class.forName(drivername).newInstance();
                conn = DriverManager.getConnection(url + dbname, username, pswd);
            } catch (Exception ex) {
                System.out.println("Databse not connected");
            }

            String Filename = "";
            String email = (String) session.getAttribute("emailid");
            String root = getServletContext().getRealPath("./Images");
            MultipartRequest m = new MultipartRequest(request, root, 8 * 1024 * 1024);
            Enumeration files = m.getFileNames();
            File f = null;

            String name = m.getParameter("upname");
            String regisno = m.getParameter("regnum");
            String code = m.getParameter("code");
            while (files.hasMoreElements()) {

                String name1 = (String) files.nextElement();

                Filename = m.getFilesystemName(name1);
                String type = m.getContentType(name1);
                f = m.getFile(name1);

                Statement st = conn.createStatement();
                int sq = st.executeUpdate("insert into courses values('" + name + "','" + Filename + "','" + regisno + "', '" + code + "')");
                out.println(" <script> alert('data stored'); </script>");
                if (sq > 0) {
                    String message = "successfully upload ";
                    RequestDispatcher rd = request.getRequestDispatcher("uploadCourses.jsp");
                    request.setAttribute("msg", message);
                    rd.forward(request, response);
        %>
        <script>
            alert('Uploaded successful');
            windows location = "uploadCourses.jsp";
        </script>
        <%
                } else {
                    String message = "Failed to upload ";
                    RequestDispatcher rd = request.getRequestDispatcher("uploadCourses.jsp");
                    request.setAttribute("msg", message);
                    rd.forward(request, response);

                }
            }
        %>
