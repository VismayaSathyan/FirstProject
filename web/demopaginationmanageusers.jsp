    <%-- 
        Document   : manageusers
        Created on : 17 Sep, 2021, 1:47:21 PM
        Author     : Vismaya
    --%>

    <%@page import="java.sql.*"%>
     <%@page import="java.sql.*" %>
        <%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
    <%@ page import="java.sql.PreparedStatement" %>
    <%@ page import="java.sql.ResultSet" %>
    <%@ page import="java.sql.Connection" %>
    <%@ page import="java.sql.DriverManager" %>

     <%!
    public int nullIntconv(String str)
    {
    int conv=0;
    if(str==null)
    {
    str="0";
    }
    else if((str.trim()).equals("null"))
    {
    str="0";
    }
    else if(str.equals(""))
    {
    str="0";
    }
    try{
    conv=Integer.parseInt(str);
    }
    catch(Exception e)
    {
    }
    return conv;
    }
    %>

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

                    ResultSet rsPagination = null;
                        ResultSet rsRowCnt = null;

                        PreparedStatement psPagination=null;
                        PreparedStatement psRowCnt=null;

                        int iShowRows=5; // Number of records show on per page
                        int iTotalSearchRecords=10; // Number of pages index shown

                        int iTotalRows=nullIntconv(request.getParameter("iTotalRows"));
                        int iTotalPages=nullIntconv(request.getParameter("iTotalPages"));
                        int iPageNo=nullIntconv(request.getParameter("iPageNo"));
                        int cPageNo=nullIntconv(request.getParameter("cPageNo"));

                        int iStartResultNo=0;
                        int iEndResultNo=0;

                        if(iPageNo==0)
                        {
                        iPageNo=0;
                        }
                        else{
                        iPageNo=Math.abs((iPageNo-1)*iShowRows);
                        }
                        String sqlPagination="SELECT SQL_CALC_FOUND_ROWS * FROM studata order by name limit '"+iPageNo+"','"+iShowRows+"'";

                        psPagination=con.prepareStatement(sqlPagination);
                        rsPagination=psPagination.executeQuery();

                        //// this will count total number of rows
                        String sqlRowCnt="SELECT FOUND_ROWS() as cnt FROM studata WHERE status='yes'";
                        psRowCnt=con.prepareStatement(sqlRowCnt);
                        rsRowCnt=psRowCnt.executeQuery();

                        if(rsRowCnt.next())
                        {
                        iTotalRows=rsRowCnt.getInt("cnt");
                        }
                %>
                <input type="hidden" name="iPageNo" value="<%=iPageNo%>">
                <input type="hidden" name="cPageNo" value="<%=cPageNo%>">
                <input type="hidden" name="iShowRows" value="<%=iShowRows%>">
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
                        while (rsPagination.next()) {
                    %>

                    <tr>
                        <td><%= rsPagination.getString(1).toString()%></td>

                        <td><%= rsPagination.getString(2).toString()%></td>

                        <td><%= rsPagination.getString(3).toString()%></td>

                        <td><%= rsPagination.getString(4).toString()%></td>

                        <td><%= rsPagination.getString(5).toString()%></td>


                        <td>
                            <a class="btn btn-warning" href="userdele.jsp?email= <%= rsPagination.getString(4).toString()%>">Delete</a>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                    <%
    //// calculate next record start record and end record
    try{
    if(iTotalRows<(iPageNo+iShowRows))
    {
    iEndResultNo=iTotalRows;
    }
    else
    {
    iEndResultNo=(iPageNo+iShowRows);
    }

    iStartResultNo=(iPageNo+1);
    iTotalPages=((int)(Math.ceil((double)iTotalRows/iShowRows)));

    }
    catch(Exception e)
    {
    e.printStackTrace();
    }

    %>
    <tr>
    <td colspan="3">

    0)
    {
    %>
    &cPageNo=">
    ? style=?cursor:pointer;color: red?>

    ?>
    iTotalSearchRecords && i
    &cPageNo=?> >> Next
    </td>
    </tr>
                </table>
            </div>
        </body>
    </html>
    <%
    try{
    if(psPagination!=null){
    psPagination.close();
    }
    if(rsPagination!=null){
    rsPagination.close();
    }

    if(psRowCnt!=null){
    psRowCnt.close();
    }
    if(rsRowCnt!=null){
    rsRowCnt.close();
    }

    if(con!=null){
    con.close();
    }
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
    %>