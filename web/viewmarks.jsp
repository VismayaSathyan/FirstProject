    <%-- 
        Document   : manageusers
        Created on : 17 Sep, 2021, 1:47:21 PM
        Author     : Vismaya
    --%>

    <%@page import="java.sql.*"%>
    <!DOCTYPE html>
    <html>
        <head>
            <title>Student Marks List</title>
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
                    padding-left: 20px;
                    padding-right: 20px;
                }
                #table{
                    position: absolute;
                    top: 25%;
                    left:23.2%;
                }
                th{
                    background-color: #6ab0a2;
                    font-family: cursive;
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
                        <h2 style="text-align:center; padding-top: 1px; font-family:cursive; color:white;">MARKS</h2>
                        <a class="btn btn-warning" style="padding-left:20px; color: white;font-family: cursive" href="stuwelcomepage.jsp">Home</a>
                        <a class="btn btn-danger" style="padding-left:20px; color: white;font-family: cursive" href="viewattendance.jsp">View Attendance</a>
                        <a class="btn btn-info" style="padding-left:20px; color: white;font-family: cursive" href="newstudentlogin.jsp">Logout</a>
                    </nav>
                    </nav>
                </header>
            </div>
            <div class= pagination id="table">
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

                    //String registerno= request.getParameter("regno");
                    String uname = (String) session.getAttribute("user");
                    if (session.getAttribute("user").toString().equals(" ")) // if(uname==" ")
                    {
                        //session.invalidate();
                        response.sendRedirect("newstudentlogin.jsp");
                    }
                    String regno = "";
                    String strquery = "SELECT Registerno FROM fstudata WHERE userID='" + uname + "' ";
                    PreparedStatement sta = con.prepareStatement(strquery);
                    ResultSet rs = sta.executeQuery();
                    while (rs.next()) {
                        regno = rs.getString("Registerno");
                    }

                    String strquerya = "SELECT * FROM stumarks WHERE regno='" + regno + "' ";
                    PreparedStatement st = con.prepareStatement(strquerya);
                    ResultSet rsa = st.executeQuery();
                %>
                <table>
                    <tr style="background-color: paleturquoise">

                        <th>Register Number</th><br/>
                    <th>Kannada</th>
                    <th>English</th>
                    <th>Hindi</th>
                    <th>Maths</th>
                    <th>Science</th>
                    <th>Social</th>
                    <th>Percentage</th>
                    <th>Grade</th>



                    </tr>
                    <%
                        while (rsa.next()) {
                    %>
                              <!--<td><%//regno=rs.getString("Registerno"); %></td>-->
                    <tr>
                        <td><%= rsa.getString(1).toString()%></td>

                        <td><%= rsa.getString(2).toString()%></td>

                        <td><%= rsa.getString(3).toString()%></td>

                        <td><%= rsa.getString(4).toString()%></td>

                        <td><%= rsa.getString(5).toString()%></td>

                        <td><%= rsa.getString(6).toString()%></td>

                        <td><%= rsa.getString(7).toString()%></td>
                        <%
                            /* String kan = rsa.getString("kannada");
                            String eng = rsa.getString("english");
                            String hin = rsa.getString("hindi");
                            String mat = rsa.getString("maths");
                            String sci = rsa.getString("science");
                            String soc = rsa.getString("social");

                            int kanm = Integer.parseInt(kan);
                            int engm = Integer.parseInt(eng);
                            int hinm = Integer.parseInt(hin);
                            int matm = Integer.parseInt(mat);
                            int scim = Integer.parseInt(sci);
                            int socm = Integer.parseInt(soc);

                            int total = kanm + engm + hinm + matm + scim + socm;
                            int avg = (total) / 6;
                            int percentage = avg;
                            String perc = String.valueOf(percentage);*/

                        %>
                        <td> <%= rsa.getString(8).toString()%></td>

                        <td> <%= rsa.getString(9).toString()%></td>

                    </tr>
                    <%
                        }

                        out.print("Hello   " + uname + "  Your  Marks  Are  As  Follows:");
                    %>
                    <script>
                        out.println();
                    </script>
                    </tr>
                </table>
            </div>
        </body>
    </html>