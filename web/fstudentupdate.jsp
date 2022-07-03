    <%-- 
        Document   : fstudentupdate
        Created on : 23 Sep, 2021, 11:41:57 AM
        Author     : Vismaya
    --%>

    <%@page import="java.text.SimpleDateFormat"%>
    <%@page import="java.sql.*"%>
    <%@page import="java.util.*"%>
    <%@page import="java.util.Date"%>
    <%@page import="java.util.Properties"%>
    <%@page import="javax.mail.internet.MimeMessage"%>
    <%@page import="javax.mail.Transport"%>
    <%@page import="javax.mail.internet.InternetAddress"%>
    <%@page import="javax.mail.Message"%>
    <%@page import="javax.mail.Session"%>

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
            System.out.println("Database connected");
        } catch (Exception ex) {
            System.out.println("Not connected to database");
        }

        //Random rand = new Random();
        //int n = rand.nextInt(123)+ 9999999;
        //String fn=fname+ n.toString();
        //System.out.println(n);
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String dob = request.getParameter("dob");
        String email = request.getParameter("email");
        //String password=request.getParameter("pswd");
        String phone = request.getParameter("phone");
        String Class = request.getParameter("cls");
        String hinatt = request.getParameter("hattandance");
        String kanatt = request.getParameter("kattandance");
        String engatt = request.getParameter("eattandance");
        String matatt = request.getParameter("mattandance");
        String sciatt = request.getParameter("sattandance");
        String socatt = request.getParameter("soattandance");
        String code = request.getParameter("code");
        String register = request.getParameter("roll");
        //String emailid = (String) session.getAttribute("emailid");

        Random rand = new Random();
        int n = rand.nextInt(123) + 9999;
        String s = fname + String.valueOf(n);
        String ukey = "UserID: " + s + "  Password: " + "user123";
        //String date = new SimpleDateFormat("ddHHssSS").format(new Date());
        //String key = UUID.randomUUID().toString();
        //String userid=fname+key;
        String querya = "SELECT COUNT(*) FROM fstudata WHERE Registerno='" + register + "'";
        PreparedStatement st = con.prepareStatement(querya);
        ResultSet rs = st.executeQuery(querya);
        rs.next();
        String count = rs.getString(1);
        if (count.equals("0")) {
            int i = st.executeUpdate("INSERT INTO fstudata (faculty_code,fname,lname,dob,email,phone,class,kanattendance,engattendance,hinattendance,matattendance,sciattendance,socattendance,Registerno,userId,password,usertype) VALUES('" + code + "','" + fname + "','" + lname + "','" + dob + "','" + email + "','" + phone + "','" + Class + "','" + kanatt + "','" + engatt + "','" + hinatt + "','" + matatt + "','" + sciatt + "','" + socatt + "','" + register + "','" + s + "','user123','Student')");
            out.println("<script>alert('data stored')</script>");

            String host = "", user = "", pass = "";

            host = "smtp.gmail.com"; //"smtp.gmail.com";

            user = "vismayam.sathyan@gmail.com"; //"YourEmailId@gmail.com" // email id to send the emails

            pass = "redhairdress*1"; //Your gmail password

            String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

            String to = email;//"madhsunil@gmail.com";
            String from = "vismayam.sathyan@gmail.com"; //Email id of the recipient

            String subject = "welcome";
            boolean sessionDebug = true;

            Properties props = System.getProperties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            props.put("mail.host", host);
            props.put("mail.transport.protocol.", "smtp");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.", "true");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.socketFactory.fallback", "false");
            //props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
            props.put("mail.smtp.starttls.enable", "true");

            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setContent(ukey, "text/html"); // use setText if you want to send text
            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, user, pass);

            try {

                //  transport.sendMessage(msg,address);
                transport.sendMessage(msg, msg.getAllRecipients());
                //out.println("message successfully sended"); // assume it was sent
                //response.sendRedirect("request2.jsp");

            } catch (Exception err) {
                System.out.println("message not successfully sent");
            }
    %>
    <script>
        window.location = 'faculty.jsp';
    </script>
    <%
    } else {
        out.println("<script>alert('Register no already exists')</script>");
    %>
    <script>
        window.location = 'faculty.jsp';
    </script>
    <%
        }
        /*String query="INSERT INTO userdataa VALUES('"+fname+"','"+lname+"','"+dob+"','"+email+"','"+password+"','"+phone+"')";
        PreparedStatement st= con.prepareStatement(query);
        st.executeUpdate();*/
    %>