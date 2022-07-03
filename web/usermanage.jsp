<%-- 
    Document   : manageusers
    Created on : 17 Sep, 2021, 1:47:21 PM
    Author     : Vismaya
--%>

<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Manage Student  List</title>
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
                padding-left: 10px;
                padding-right: 5px;
                font-family: cursive;

            }
            h2{
                font-family: cursive;
                color: white;
            }
            #table{
                position: absolute;
                top: 25%;
                left:12%;
            }
            td{

                color:black;
            }
            th{
                background-color: #6ab0a2;
            }
            a{
                font-family: cursive;
            }
        </style>
    </head>
    <body>

        <div style="background-color:black;">
            <header>

                <nav  style="text-align:right; height: 100px; padding-top: 1px; padding-right: 30px;">
                    <h2 style="text-align:center; padding-top: 0.5px;">MANAGE STUDENT INFO</h2>
                    <a class="btn btn-danger" style="padding-left:20px; color: white;" href="faculty.jsp">Add Students</a>
                    <a class="btn btn-danger" style="padding-left:20px; color: white;" href="marks.jsp">Add Marks</a>
                    <a class="btn btn-danger" style="padding-left:20px; color: white;" href="managemarks.jsp">Manage Marks</a>

                    <a class="btn btn-danger" style="padding-left:20px; color: white;" href="stulogin.jsp">Logout</a>
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

                String email = (String) session.getAttribute("emailid");
                if (session.getAttribute("emailid").toString().equals(" ")) {
                    response.sendRedirect("stulogin.jsp");
                }

                response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//HTTP 1.1
                response.setHeader("Pragma", "no-cache"); //HTTP 1.0
                response.setDateHeader("Expires", 0);

                String code = "";
                String strquerya = "SELECT faculty_code FROM studata WHERE email='" + email + "' ";
                PreparedStatement st = con.prepareStatement(strquerya);
                ResultSet rsa = st.executeQuery();
                while (rsa.next()) {
                    code = rsa.getString("faculty_code");
                }

                String strquery = "SELECT * FROM fstudata WHERE faculty_code='" + code + "'";
                //int sql= Integer.parseInt(request.getParameter(strquery))/10;
                PreparedStatement sta = con.prepareStatement(strquery);
                ResultSet rs = sta.executeQuery(strquery);
            %>
            <table>
                <tr style=" color:black;">
                    <th>First_name</th><br/>
                <th>Last_name</th>
                <th>Dob</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Class</th>
                <th>Kan_A</th>
                <th>Eng_A</th>
                <th>Hin_A</th>
                <th>Mat_A</th>
                <th>Sci_A</th>
                <th>Soc_A</th>
                <th>Register No</th>
                <th>Delete</th>


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

                    <td><%= rs.getString(6).toString()%></td>

                    <td><%= rs.getString(7).toString()%></td>

                    <td><%= rs.getString(8).toString()%></td>

                    <td><%= rs.getString(9).toString()%></td>

                    <td><%= rs.getString(10).toString()%></td>

                    <td><%= rs.getString(11).toString()%></td>

                    <td><%= rs.getString(12).toString()%></td>

                    <td><%= rs.getString(13).toString()%></td>




                    <td>
                        <a class="btn btn-warning" href="studele.jsp?Registerno=<%= rs.getString(13).toString()%>">Delete</a>
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