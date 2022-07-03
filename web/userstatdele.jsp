
        <%-- 
            Document   : userstatdele
            Created on : 17 Sep, 2021, 4:11:41 PM
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

            String email = request.getParameter("email");

            String query = "DELETE FROM studata WHERE email='" + email + "'";
            PreparedStatement st = con.prepareStatement(query);
        %>
        <script>
            window.location = "approvalpage.jsp";

        </script>
        <%
            int i = st.executeUpdate(query);
        %>