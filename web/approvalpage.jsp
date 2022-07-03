<%-- 
    Document   : admin
    Created on : 17 Sep, 2021, 9:15:30 AM
    Author     : Vismaya
--%>

<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Approval List</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css" /> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>

        <style>
            h2,a{
                color: white;
            }
            table, th, td {
                border: 2px solid black;
                border-collapse: collapse;
                text-align: left;
                padding-top: 10px;
                padding-bottom: 10px;
                padding-left: 15px;
                padding-right: 15px;
                font-family: cursive;
                color: black;
            }
            th{
                color: black;
            }


            #table{
                position: absolute;
                top: 25%;
                left: 21%;
                font-family: cursive;
            }


            th{
                font-size: 16px;
                background-color:#6ab0a2;
            }
        </style>
    </head>
    <body>
        <div>
            <header style="background-color: #46915b;">

                <nav  style="text-align:right;background-color:black; height: 100px; padding-top: 0.1px; padding-right: 30px;">
                    <h2 style="text-align:center; font-family:cursive;">APPROVE FACULTY LIST</h2>
                    <a class="btn btn-danger" style="padding-left:20px; font-size: 16px;  font-family:cursive;" href="admin.jsp">Home</a>
                    <a class="btn btn-danger" style="padding-left:20px; font-size: 16px;  font-family:cursive;" href="manageusers.jsp">Manage Faculty   </a>
                    <a class="btn btn-danger" style="padding-left:20px; font-size: 16px; font-family:cursive;" href="stulogin.html">Logout</a>
                </nav>
            </header>
        </div>
        <div id="table">
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

                String strquery = "SELECT * FROM studata WHERE status='pending'";
                PreparedStatement sta = con.prepareStatement(strquery);
                ResultSet rs = sta.executeQuery(strquery);
            %>
            <table id="tableID" class="display">
                <thead>
                    <tr>
                        <th>First_name</th><br/>
                <th>Last_name</th>
                <th>Dob</th>
                <th>Email</th>
                <th>Phone</th>
                <th style="text-align:center" colspan="2">Action</th>




                </tr>
                </thead>
                <%
                    while (rs.next()) {
                %>
                <tbody>
                    <tr>
                        <td><%= rs.getString(1).toString()%></td>

                        <td><%= rs.getString(2).toString()%></td>

                        <td><%= rs.getString(3).toString()%></td>

                        <td><%= rs.getString(4).toString()%></td>

                        <td><%= rs.getString(5).toString()%></td>


                        <td>
                            <a class="btn btn-warning" href="userstat.jsp?email=<%= rs.getString(4).toString()%>">Accept</a>
                        </td>

                        <td>
                            <a class="btn btn-info" href="userstatdele.jsp?email=<%= rs.getString(4).toString()%>">Reject</a>
                        </td>

                    </tr>
                <tbody>
                    <%
                        }
                        //out.print("Hi "+session_u_name);
%>
            </table>
        </div>
        <script>

            /* Initialization of datatable */
            $(document).ready(function () {
                $('#tableID').DataTable({});
            });
        </script>
    </body>
</html>