        x   <%-- 
            Document   : upfiledele
            Created on : 8 Oct, 2021, 1:34:09 PM
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

            String regno = request.getParameter("registernumb");

            String query = "DELETE FROM courses WHERE registernumb ='" + regno + "'";
            PreparedStatement st = con.prepareStatement(query);
        %>
        <script>
            window.location = "fileUploadTable.jsp";

        </script>
        <%
            int i = st.executeUpdate(query);
        %>