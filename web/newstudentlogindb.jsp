        <%-- 
            Document   : logdata
            Created on : 17 Sep, 2021, 9:03:05 AM
            Author     : Vismaya
        --%>

        <%@page import="java.sql.*"%>
        <%
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
            String querya = "SELECT * FROM fstudata WHERE userID='" + uname + "' AND password='" + password1 + "'";
            PreparedStatement sta = con.prepareStatement(querya);
            ResultSet rs = sta.executeQuery();
            int x = 0;
            while (rs.next()) {
                if (rs.getString(15).equals(uname) && rs.getString(16).equals(password1)) {

                    x = 1;

                } else {

                    x = 2;

                }

            }
            if (x == 1) {

                out.println("<script>alert('login successful')</script>");

        %>
        <script>
            window.location = 'stuwelcomepage.jsp';
            //window.location='Welcome.jsp';
        </script> 
        <%      } else {
            out.println("<script>alert('Please enter the valid details')</script>");
        %>
        <script>
            window.location = 'newstudentlogin.jsp';
        </script> 
        <%
            }

        %>