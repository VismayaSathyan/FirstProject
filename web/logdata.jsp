<%-- 
    Document   : logdata
    Created on : 17 Sep, 2021, 9:03:05 AM
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

    String email = request.getParameter("email");
    String password = request.getParameter("pswd");
    String code = request.getParameter("code");
    session.setAttribute("emailid", email);
    if (email.equals("admin@gmail.com") && password.equals("admin") && code.equals("ADM12345")) {
%>
<script>
    window.location = "admin.jsp";
</script>
<%
    }


    /*String inquery="INSERT INTO ldata VALUES('"+uname+"','"+email+"','"+password+"')";
PreparedStatement st= con.prepareStatement(inquery);
st.executeUpdate();*/
    String querya = "SELECT COUNT(*) FROM studata WHERE faculty_code='" + code + "' AND email='" + email + "' AND passwordd='" + password + "' AND status='yes'";
    PreparedStatement sta = con.prepareStatement(querya);
    ResultSet rs = sta.executeQuery(querya);
    rs.next();
    String count = rs.getString(1);

    if (count.equals("1")) {

        out.println("<script>alert('login successful')</script>");
        //int i= stb.executeUpdate("INSERT INTO ldata VALUES('"+uname+"','"+email+"','"+password+"')");
        //out.println("<script>alert('data stored')</script>");
%><script>
    window.location = 'faculty.jsp';
    //window.location='Welcome.jsp';
</script> 
<%
} else {
    out.println("<script>alert('Please contact the Admin')</script>");
%>
<script>
    window.location = 'stulogin.html';
</script> 
<%
    }

%>