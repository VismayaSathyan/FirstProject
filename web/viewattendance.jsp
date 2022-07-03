<%-- 
    Document   : manageusers
    Created on : 17 Sep, 2021, 1:47:21 PM
    Author     : Vismaya
--%>

<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Attendance List</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body{
                background-color:white;
            }
            table, th, td {
                border: 2px solid black;
                border-collapse: collapse;
                text-align: left;
                padding-top: 20px;
                padding-bottom: 20px;
                padding-left: 15px;
                padding-right: 15px;
                font-family: cursive;
            }
            #table{
                position: absolute;
                top: 25%;
                left:16%;
            }
            th{
                background-color: #6ab0a2;
            }
            td{
                background-color: white;
            }
        </style>
    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//HTTP 1.1
            response.setHeader("Pragma", "no-cache"); //HTTP 1.0
            response.setDateHeader("Expires", 0);


        %>
        <div style="background-color:black;">
            <header>

                <nav  style="text-align:right; height: 102px; padding-top:1px; padding-right:30px;">
                    <h2 style="text-align:center; padding-top: 1px; font-family:cursive; color:white;">ATTENDANCE</h2>
                    <a class="btn btn-warning" style="padding-left:20px; color: white;font-family: cursive" href="stuwelcomepage.jsp">Home</a>
                    <a class="btn btn-danger" style="padding-left:20px; color: white;font-family: cursive" href="viewmarks.jsp">View Marks</a>
                    <a class="btn btn-info" style="padding-left:20px; color: white;font-family: cursive" href="newstudentlogin.jsp">Logout</a>
                </nav>
            </header>
        </div>
        <div id="table">
            <%                Connection con = null;
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
                if (session.getAttribute("user").toString().equals(" ")) //if(uname=="  ")
                {
                    // session.invalidate();
                    response.sendRedirect("newstudentlogin.jsp");
                }
                String strquery = "SELECT * FROM fstudata WHERE userID='" + uname + "'";
                PreparedStatement sta = con.prepareStatement(strquery);
                ResultSet rs = sta.executeQuery(strquery);
            %>
            <table>
                <tr style="background-color: paleturquoise">
                    <th>Register Number</th><br/>
                <th>KAN_Attendance</th>
                <th>ENG_Attendance</th>
                <th>HIN_Attendance</th>
                <th>MAT_Attendance</th>
                <th>SIC_Attendance</th>
                <th>SOC_Attendance</th>






                </tr>
                <%
                    while (rs.next()) {
                %>

                <tr>
                    <td><%= rs.getString(14).toString()%></td>

                    <td><%= rs.getString(8).toString()%></td>

                    <td><%= rs.getString(9).toString()%></td>

                    <td><%= rs.getString(10).toString()%></td>

                    <td><%= rs.getString(11).toString()%></td>

                    <td><%= rs.getString(12).toString()%></td>

                    <td><%= rs.getString(13).toString()%></td>
                </tr>
                <%
                    }

                    //out.print("Hi "+session_u_name);
                %>
            </table>
        </div>
    </body>
</html>