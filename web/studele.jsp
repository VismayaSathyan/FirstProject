        <%-- 
            Document   : userdele
            Created on : 17 Sep, 2021, 9:24:51 AM
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

            String registerno = request.getParameter("Registerno");

            String query = "DELETE FROM fstudata WHERE Registerno='" + registerno + "'";
            PreparedStatement st = con.prepareStatement(query);
        %>
        <script>
            window.location = "usermanage.jsp";

        </script>
        <%
            int i = st.executeUpdate(query);
        %>