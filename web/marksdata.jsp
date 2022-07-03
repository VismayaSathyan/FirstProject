<%-- 
    Document   : studb
    Created on : 17 Sep, 2021, 8:48:03 AM
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

    String registerno = request.getParameter("regno");
    String email = (String) session.getAttribute("emailid");
    String kannada = request.getParameter("kan");
    String english = request.getParameter("eng");
    String hindi = request.getParameter("hin");
    String maths = request.getParameter("mat");
    String science = request.getParameter("sci");
    String social = request.getParameter("soc");
    String code = request.getParameter("code");
    int gr = 0;
    String grade = String.valueOf(gr);

    int kanm = Integer.parseInt(kannada);
    int engm = Integer.parseInt(english);
    int hinm = Integer.parseInt(hindi);
    int matm = Integer.parseInt(maths);
    int scim = Integer.parseInt(science);
    int socm = Integer.parseInt(social);

    int total = kanm + engm + hinm + matm + scim + socm;
    int avg = (total) / 6;
    int percentage = avg;
    String perc = String.valueOf(percentage);

    if (avg >= 90) {
        grade = "A+";
    } else if (avg >= 80 && avg < 90) {
        grade = "A";
    } else if (avg >= 70 && avg < 80) {
        grade = "B";
    } else if (avg >= 60 && avg < 70) {
        grade = "C";
    } else if (avg >= 50 && avg < 60) {
        grade = "D";
    } else if (avg >= 40 && avg < 50) {
        grade = "E+";
    } else if (avg >= 35 && avg < 40) {
        grade = "E";
    } else {
        grade = "F";
    }

    String query = "INSERT INTO stumarks(faculty_code, regno, kannada, english, hindi, maths, science, social, Percentage, Grade) VALUES ('" + code + "','" + registerno + "','" + kannada + "','" + english + "','" + hindi + "','" + maths + "','" + science + "','" + social + "','" + perc + "%','" + grade + "')";
    PreparedStatement st = con.prepareStatement(query);
    st.executeUpdate(query);

    //String ount=rs.getString(1);
    //if(count.equals("0"))
    //
    //{
    //int i= st.executeUpdate("INSERT INTO studata (regno,subject,marks) VALUES('"+registerno+"','"+subject+"','"+marks+"')");
    //out.println("<script>alert('data stored')</script>");
%>
<script>
    alert('Marks stored');
    window.location = 'marks.jsp';
</script>
<%               //}
    //else
    //{
    // out.println("<script>alert('email already exists')</script>");   
    //}
    /*String query="INSERT INTO userdataa VALUES('"+fname+"','"+lname+"','"+dob+"','"+email+"','"+password+"','"+phone+"')";
PreparedStatement st= con.prepareStatement(query);
st.executeUpdate();*/
%>
<!--<script>
alert('data stored');
</script>-->


