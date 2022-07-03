<%-- 
    Document   : faculty
    Created on : 21 Sep, 2021, 9:23:11 PM
    Author     : Vismaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Faculty Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <style>
            h2{
                color:white;

            }
            nav{
                font-family: cursive;
            }
            label{
                color: white;
                font-family: cursive;
            }
            footer {
                position: fixed;
                padding: 10px 10px 0px 10px;
                bottom: 0;
                width: 100%;
                /* Height of the footer*/ 
                height: 50px;
                background: peachpuff;

            }



        </style>
    </head>
    <body style="background-image: url('registrationpage.png'); background-color: black; background-repeat:no-repeat; background-size: cover;">
        <div>
            <header style="background-color:black; padding-left: 20px;">

                <nav  class="navbar navbar-expand-lg navbar-light bg-light" style="text-align:right;padding-right: 10px">
                    <h2 style="text-align:center; padding-top: 5px; font-family:cursive;"> STUDENT INFORMATION</h2>

                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="marks.jsp">Add Marks</a>
                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="managemarks.jsp">Manage Marks</a>
                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="usermanage.jsp">Manage Users</a>
                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="uploadCourses.jsp">Upload Files</a>
                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="fileUploadTable.jsp">Manage files</a>
                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="stulogin.jsp">Logout</a>
                </nav>
            </header>
        </div> 
        <div class="form-group">
            <form  action="fstudentupdate.jsp" method="get" onsubmit="return registrationpage()">

                <% String email = (String) session.getAttribute("emailid");
                    if (session.getAttribute("emailid").toString().equals(" ")) // if(uname==" ")
                    {
                        //session.invalidate();
                        response.sendRedirect("stulogin.jsp");
                    }
                    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//HTTP 1.1
                    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
                    response.setDateHeader("Expires", 0);
                %>

                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <br/><label>Faculty Code</label><br/>
                    <input class="form-control" placeholder="Enter your code" type="text" id="code" name="code" required />
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <br/><label>First Name</label><br/>
                    <input class="form-control" type="text" placeholder="Enter your first nsme" id="fname" name="fname"/>
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Last Name</label><br/>
                    <input class="form-control" type="text" placeholder="Enter your last name" id="lname" name="lname" />
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>DOB</label><br/>
                    <input class="form-control" type="date" id="dob" name="dob" max="2021-09-17" />
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Email</label><br/>
                    <input class="form-control" type="email" placeholder="Enter your email" id="email" name="email"/>
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Phone</label><br/>
                    <input class="form-control" type="text" placeholder="Enter your Phone number" id="phone" name="phone" />
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Class</label><br/>
                    <input placeholder="Enter your class" class="form-control" type="text" id="cls" name="cls"/><br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Kannada Attendance</label><br/>
                    <input class="form-control" type="text" placeholder="Enter the no of classes" id="kattandance" name="kattandance"/><br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>English Attendance</label><br/>
                    <input class="form-control" type="text" placeholder="Enter the no of classes" id="eattandance" name="eattandance"/><br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Hindi Attendance</label><br/>
                    <input class="form-control" type="text" placeholder="Enter the no of classes" id="hattandance" name="hattandance"/><br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Maths Attendance</label><br/>
                    <input class="form-control" type="text" placeholder="Enter the no of classes" id="mattandance" name="mattandance"/><br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Science Attendance</label><br/>
                    <input class="form-control" type="text" placeholder="Enter the no of classes" id="sattandance" name="sattandance"/><br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Social Attendance</label><br/>
                    <input class="form-control" type="text" placeholder="Enter the no of classes" id="soattandance" name="soattandance"/><br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Registration No</label><br/>

                    <input class="form-control" placeholder="Enter thee reg no" type="text" id="roll" name="roll" /><br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <br/><input class="btn btn-primary" type="submit" value="Submit" style="text-align: center;" onclick="registrationpage();" />
                    <input class="btn btn-danger" type="reset" value="Reset" style="text-align: center;" />
                </div>
        </div>




    </div>
</form>
<script>
    function registrationpage()
    {
        var flagger = true;
        debugger;


        var namef = document.getElementById('fname').value;
        var namel = document.getElementById('lname').value;
        var phonea = document.getElementById('phone').value;
        var emaila = document.getElementById('email').value;
        var kan = document.getElementById('kattandance').value;
        var eng = document.getElementById('eattandance').value;
        var hin = document.getElementById('hattandance').value;
        var mat = document.getElementById('mattandance').value;
        var sci = document.getElementById('sattandance').value;
        var soc = document.getElementById('soattandance').value;
        var Class = document.getElementById('cls').value;
        var codea = document.getElementById("code").value;
        //var passwordb= document.getElementById('cpswd').value;
        var datea = document.getElementById('dob').value;
        var registerno = document.getElementById('roll').value;
        //var typeuser= document.getElementById('user').value;   
        if (namef == "" && namel == "" && phonea == "" && codea == "" && emaila == "" && kan == "" && eng == "" && hin == "" && mat == "" && sci == "" && soc == "" && Class == "" && registerno == "")
        {
            alert("please fill the form");
            //flagger=false;
            return false;
        }

        var namefpattern = /^[a-zA-Z]+$/;
        if (!namefpattern.test(namef))
        {
            alert("please enter valid first name");
            flagger = false;
            return flagger;
        }

        var codepattern = /^(FAC){1}[0-9]{5}$/;
        if (!codepattern.test(codea))
        {
            alert("please enter valid faculty code");
            flagger = false;
            return flagger;
        }

        var namelpattern = /^[a-zA-Z]+$/;
        if (!namelpattern.test(namel))
        {
            alert("please enter valid last name");
            flagger = false;
            return flagger;
        }

        var phoneapattern = /^[6-9]{1}[0-9]{9}$/;
        if (!phoneapattern.test(phonea))
        {
            alert("please enter valid phone no");
            flagger = false;
            return flagger;
        }

        var emailapattern = /^[a-zA-Z0-9]+[@]{1}[a-zA-Z]+[.]{1}[a-zA-Z]{2,3}$/;
        if (!emailapattern.test(emaila))
        {
            alert("please enter valid email");
            flagger = false;
            return flagger;
        }

        var kattan = /^[0-9]{2,3}$/;
        if (!kattan.test(kan))
        {
            alert("please enter the valid number");
            flagger = false;
            return flagger;
        }

        var eattan = /^[0-9]{2,3}$/;
        if (!eattan.test(eng))
        {
            alert("please enter the valid number");
            flagger = false;
            return flagger;
        }

        var hattan = /^[0-9]{2,3}$/;
        if (!hattan.test(hin))
        {
            alert("please enter the valid number");
            flagger = false;
            return flagger;
        }

        var mattan = /^[0-9]{2,3}$/;
        if (!mattan.test(mat))
        {
            alert("please enter the valid number");
            flagger = false;
            return flagger;
        }

        var sattan = /^[0-9]{2,3}$/;
        if (!sattan.test(sci))
        {
            alert("please enter the valid number");
            flagger = false;
            return flagger;
        }

        var soattan = /^[0-9]{2,3}$/;
        if (!soattan.test(soc))
        {
            alert("please enter the valid number");
            flagger = false;
            return flagger;
        }

        var classes = /^[a-zA-Z0-9]+$/;
        if (!classes.test(Class))
        {
            alert("please enter valid class");
            flagger = false;
            return flagger;
        }
        var regno = /^[A-Z]{3}[0-9]{5}$/;
        if (!regno.test(registerno))
        {
            alert("Please enter valid Register number");
            flagger = false;
            return flagger;
        }
    }

</script>
<!--<footer style="background-color: black">
    <p style="color: wheat; font-size: 10px">Author: Hege Refsnes<br>
        <a href="#" style="color: wheat">hege@example.com</a></p>
</footer>-->
</body>
</html>
