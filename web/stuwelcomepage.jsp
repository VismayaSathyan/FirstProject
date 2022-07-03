<%-- 
    Document   : Welcome
    Created on : 17 Sep, 2021, 10:31:07 AM
    Author     : Vismaya
--%>

<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>Student Page</title>

    </head>
    <body style="background-image: url('stwelcomeimg.png');background-repeat: no-repeat; background-size: cover; padding-bottom: 50px">
        <%
            response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//HTTP 1.1
            response.setHeader("Pragma", "no-cache"); //HTTP 1.0
            response.setDateHeader("Expires", 0);


        %>
        <%            Connection con = null;
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

            //String registerno= request.getParameter("roll");
            /* if(session.getAttribute("users")!= null)
                {
                    response.sendRedirect("newstudentlogin.jsp");
                }*/
            String uname = (String) session.getAttribute("user");
            if (session.getAttribute("user").toString().equals(" ")) //if(uname== " ")
            {
                // session.invalidate();
                response.sendRedirect("newstudentlogin.jsp");
            }
            String strquery = "SELECT * FROM fstudata WHERE userID='" + uname + "'";
            PreparedStatement sta = con.prepareStatement(strquery);
            ResultSet rs = sta.executeQuery(strquery);
        %>
        <header>
            <div>
                <nav  style="text-align:right; padding-top:50px; padding-right: 20px">
                    <!--<h2 style="text-align:center; padding-top: 10px; font-family:alice;"> WELCOME PAGE</h2>-->
                    <a class="btn btn-info" style="padding-left:20px; color: black; font-family:cursive; font-size: 18px;" href="viewattendance.jsp">View Attendance</a>
                    <a class="btn btn-info" style="padding-left:20px; color: black; font-family:cursive; font-size: 18px;" href="viewmarks.jsp">view marks</a>
                    <a class="btn btn-info" style="padding-left:20px; color: black; font-family:cursive; font-size: 18px;" href="newstudentlogin.jsp">Logout</a>
                    <!--<a  style="padding-left:20px; color: black;" href="stulogin.html">Logout</a>-->
                </nav>
            </div>
        </header>
    </body>
</html>
