<%-- 
    Document   : manageusers
    Created on : 17 Sep, 2021, 1:47:21 PM
    Author     : Vismaya
--%>

<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Manage List</title>
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
                left: 25%;
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
    <body class="pagination-section">
        <div>
            <header style="background-color: #46915b;">

                <nav  style="text-align:right;background-color:black; height: 100px; padding-top: 0.1px; padding-right: 30px;">
                    <h2 style="text-align:center; font-family:cursive;">MANAGE FACULTY LIST</h2>
                    <a  class="btn btn-danger" style="padding-left:20px; font-size: 16px;  font-family:cursive;" href="admin.jsp">Home</a>
                    <a  class="btn btn-danger" style="padding-left:20px; font-size: 16px;  font-family:cursive;" href="approvalpage.jsp">Approve Faculty</a>
                    <a  class="btn btn-danger" style="padding-left:20px; font-size: 16px;  font-family:cursive;" href="stulogin.html">Logout</a>
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
                String query="SELECT COUNT(*) FROM studata WHERE status='yes'";
                PreparedStatement st = con.prepareStatement(query);
                ResultSet rs1 = st.executeQuery(query);
                 int iquery= Integer.parseInt(query);
                 while(rs1.next()){
                 for(int count=1; count<=iquery; count++)
                 {
                     %>
                     <option><%=count %></option>                     <%
                 }
                 }
                String strquery = "SELECT * FROM studata WHERE status='yes'";
                PreparedStatement sta = con.prepareStatement(strquery);
                ResultSet rs = sta.executeQuery(strquery);
            %>
            <table>
                <tr style="background-color: paleturquoise">
                    <th>First_name</th><br/>
                <th>Last_name</th>
                <th>Dob</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Action</th>


                </tr>
                <%
                    while (rs.next()) {
                %>

                <tr>
                    <td><%= rs.getString(1).toString()%></td>

                    <td><%= rs.getString(2).toString()%></td>

                    <td><%= rs.getString(3).toString()%></td>

                    <td><%= rs.getString(4).toString()%></td>

                    <td><%= rs.getString(5).toString()%></td>


                    <td>
                        <a class="btn btn-warning" href="userdele.jsp?email=<%= rs.getString(4).toString()%>">Delete</a>
                    </td>
                </tr>
                <%
                    }

                    //out.print("Hi "+session_u_name);
                %>
                <!--<tr>
                    <td>Ruby</td>
                    <td>lang</td>
                    <td>ruby@gmail.com</td>
                    <td>19-07-2001</td>
                    <td>7019748323</td>
                    <td>iopiopip</td>
                </tr>
                 <tr>
                    <td>Pepper</td>
                    <td>Potts</td>
                    <td>Pepper@gmail.com</td>
                    <td>18-02-2020</td>
                    <td>7019748322</td>
                    <td>iopiopiy</td>
                </tr>
                 <tr>
                    <td>Emma</td>
                    <td>lango</td>
                    <td>emma@gmail.com</td>
                    <td>12-05-2003</td>
                    <td>7019748321</td>
                    <td>iopiopir</td>
                </tr>-->
            </table>
        </div>
    </body>
</html>