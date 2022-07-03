<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page import="java.sql.*"%>
<html>
    <head>
        <title>Pagination Demo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css" /> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>


    </head>
    <body>

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

            String strquery = "SELECT * FROM studata WHERE status='yes' LIMIT 10"; //SELECT column_name(s)
            PreparedStatement sta = con.prepareStatement(strquery);
            ResultSet rs = sta.executeQuery(strquery);
        %>

        <h2>Pagination using jQuery Datatables </h2>

        <!--HTML table with student data-->
        <table id="tableID" class="display" style="width:100%">
            <thead>
                <tr>
                    <th>First_name</th><br/>
            <th>Last_name</th>
            <th>Dob</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Action</th>
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
                <a class="btn btn-warning" href="userdele.jsp?email=<%= rs.getString(4).toString()%>">Delete</a>
            </td>
        </tr>
        <%
            }

            //out.print("Hi "+session_u_name);
        %>
    </tbody>
</table>

<script>

    /* Initialization of datatable */
    $(document).ready(function () {
        $('#tableID').DataTable({});
    });
</script>
</body>
</html>
