        <%-- 
            Document   : studb
            Created on : 17 Sep, 2021, 8:48:03 AM
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

            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String dob = request.getParameter("dob");
            String email = request.getParameter("email");
            String password = request.getParameter("pswd");
            String phone = request.getParameter("phone");
            String code = request.getParameter("code");
            String users = "Faculty";

            String querya = "SELECT COUNT(*) FROM studata WHERE email='" + email + "' AND faculty_code='" + code + "'";
            PreparedStatement st = con.prepareStatement(querya);
            ResultSet rs = st.executeQuery(querya);
            rs.next();
            String count = rs.getString(1);

            if (count.equals("0")) {
                int i = st.executeUpdate("INSERT INTO studata (firstname, lastname, dob, email, phone, passwordd, faculty_code, status, users) VALUES('" + fname + "','" + lname + "','" + dob + "','" + email + "','" + phone + "','" + password + "','" + code + "','pending','Faculty')");
                out.println("<script>alert('data stored')</script>");
        %>
        <script>
            window.location = 'stulogin.html';
        </script>
        <%
        } else {
            out.println("<script>alert('Email/ Code already exists')</script>");
        %>
        <script>
            window.location = 'registration.html';
        </script>
        <%
            }
            /*String query="INSERT INTO userdataa VALUES('"+fname+"','"+lname+"','"+dob+"','"+email+"','"+password+"','"+phone+"')";
        PreparedStatement st= con.prepareStatement(query);
        st.executeUpdate();*/
        %>
        <!--<script>
        alert('data stored');
        </script>-->

                    <!--<label><%=fname%></label>
                    <label><%=lname%></label>
                    <label><%=dob%></label>
                    <label><%=email%></label>
                    <label><%=password%></label>
                    <label><%=phone%></label>-->
