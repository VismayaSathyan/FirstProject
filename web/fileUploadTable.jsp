<%-- 
    Document   : fileUploadTable
    Created on : 8 Oct, 2021, 1:20:19 PM
    Author     : Vismaya
--%>

<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Manage Files</title>
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
                padding-left: 5px;
                padding-right: 5px;
                font-family: cursive;
            }
            #table{
                position: absolute;
                top: 25%;
                left: 38%;
            }
            td{
                background-color: white;
            }
            h2{
                color: white;
            }
            th{
                font-size: 16px;
                background-color:#6ab0a2;
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
                <nav class="navbar navbar-expand-lg navbar-light bg-light" style="text-align:right; height: 100px; padding-top: 0.5px; padding-right: 30px;">
                    <h2 style="text-align:center; color: white; padding-top: 0.5px; font-family:cursive;">MANAGE FILES</h2>
                    <a class="btn btn-danger" style="padding-left:20px; color: peachpuff;" href="faculty.jsp">Add Students</a>
                    <a class="btn btn-danger" style="padding-left:20px; color: peachpuff;" href="marks.jsp">Add Marks</a>
                    <a class="btn btn-danger" style="padding-left:20px; color: peachpuff;" href="usermanage.jsp">Manage Students</a>
                    <a class="btn btn-danger" style="padding-left:20px; color: peachpuff;" href="managemarks.jsp">Manage Marks</a>
                    <a class="btn btn-danger" style="padding-left:20px; color: peachpuff;" href="uploadCourses.jsp">Upload Files</a>
                    <a class="btn btn-danger" style="padding-left:20px; color: peachpuff;" href="stulogin.jsp">Logout</a>
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

                String email = (String) session.getAttribute("emailid");
                if (session.getAttribute("emailid").toString().equals(" ")) {
                    response.sendRedirect("stulogin.jsp");
                }
                String code = "";
                String strquerya = "SELECT faculty_code FROM studata WHERE email='" + email + "' ";
                PreparedStatement st = con.prepareStatement(strquerya);
                ResultSet rsa = st.executeQuery();
                while (rsa.next()) {
                    code = rsa.getString("faculty_code");
                }

                String strquery = "SELECT * FROM courses WHERE faculty_code='" + code + "'";
                PreparedStatement sta = con.prepareStatement(strquery);
                ResultSet rs = sta.executeQuery();
            %>
            <table>
                <tr style="background-color: paleturquoise">
                    <th>Name</th><br/>
                <th>Image</th>
                <th>Resgister no</th>
                <th>Action</th>
                </tr>

                <%
                    while (rs.next()) {
                %>

                <tr>
                    <td><%= rs.getString(1).toString()%></td>

                    <td><img width="100px" height="100px" src="Images/<%=rs.getString(2).toString()%>  "></td>

                    <td><%= rs.getString(3).toString()%></td>
                    <td>
                        <a class="btn btn-warning" href="upfiledele.jsp?registernumb=<%= rs.getString(3).toString()%>">Delete</a>
                    </td>
                </tr>
                <%
                    }

                    //out.print("Hi "+session_u_name);
%>
            </table>
        </div>
    </body>
</html>
