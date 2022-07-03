<%-- 
    Document   : marks
    Created on : 23 Sep, 2021, 3:54:10 PM
    Author     : Vismaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Marks Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <style>
            h2,nav{
                color: peachpuff;
                font-family: cursive;
            }
            label{
                color: rosybrown;
                font-family: cursive;
            }
        </style>
    </head>
    <body style="background-color: black;background-image:url('marksimg1.png');  background-repeat:no-repeat; background-size: cover;">
        <div style="background-color:#18702f;">
            <header>

                <nav class="navbar navbar-expand-lg navbar-light bg-light" style="text-align:right; height: 100px; padding-top: 0.5px; padding-right: 30px;">
                    <h2 style="text-align:center; padding-top: 1px;"> STUDENT MARKS</h2>

                    <a class="btn btn-danger" style="padding-left:20px;color: peachpuff;" href="faculty.jsp">Add Students</a>

                    <a class="btn btn-danger" style="padding-left:20px;color: peachpuff;" href="managemarks.jsp">Manage Marks</a>
                    <a class="btn btn-danger" style="padding-left:20px;color: peachpuff;" href="usermanage.jsp">Manage Students</a>
                    <a class="btn btn-danger" style="padding-left:20px;color: peachpuff;" href="stulogin.jsp">Logout</a>
                </nav>
            </header>
        </div>
        <div class="form-group">
            <form action="marksdata.jsp" style="padding-top:145px;" method="get" onsubmit="return registrationpage()">
                <%
                    String email = (String) session.getAttribute("emailid");
                    if (session.getAttribute("emailid").toString().equals(" ")) {
                        response.sendRedirect("stulogin.jsp");
                    }

                    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//HTTP 1.1
                    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
                    response.setDateHeader("Expires", 0);


                %>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <br/><label>Faculty Code</label><br/>
                    <input class="form-control" placeholder="Enter your code" type="text" id="code" name="code" required />
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <br/><label>Register no</label><br/>
                    <input class="form-control" type="text" id="regno" name="regno"/><br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label style="color: black;">Kannada</label><br/>
                    <input class="form-control" type="text" id="kan" name="kan"/>  
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>English</label><br/>
                    <input class="form-control" type="text" id="eng" name="eng" />
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label style="color: black;" >Hindi</label><br/>
                    <input class="form-control" type="text" id="hin" name="hin" />
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Maths</label><br/>
                    <input class="form-control" type="text" id="mat" name="mat" />
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label style="color: black;" >Science</label><br/>
                    <input class="form-control" type="sci" id="eng" name="sci" />
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <label>Social</label><br/>
                    <input class="form-control" type="text" id="soc" name="soc" />
                    <br/>
                </div>
                <div style="padding-left:10%;padding-right:10%;" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <br/>     <input class="btn btn-warning" type="submit" value="submit" style="text-align: center;" onclick="registrationpage();" />
                </div>
            </form>
        </div>
        <script>
            function registrationpage()
            {
                var flagger = true;
                debugger;

                var register = document.getElementById('regno').value;
                var kannada = document.getElementById('kan').value;
                var english = document.getElementById('eng').value;
                var hindi = document.getElementById('hin').value;
                var maths = document.getElementById('mat').value;
                var science = document.getElementById('sci').value;
                var social = document.getElementById('soc').value;
                var codea = document.getElementById("code").value;
                // var sum=parseInt(kannada)+parseInt(english)+parseInt(hindi)+parseInt(maths)+parseInt(science)+parseInt(social);

                // var avg=sum/6;
                // var percentage= avg;
                if (register == "" && kannada == "" && english == "" && codea == "" && hindi == "" && maths == "" && science == "" && social == "")
                {
                    alert("please fill the details");
                    //flagger=false;
                    return false;
                }

                var codepattern = /^(FAC){1}[0-9]{5}$/;
                if (!codepattern.test(codea))
                {
                    alert("please enter valid faculty code");
                    flagger = false;
                    return flagger;
                }

                var reg = /^[A-Z]{3}[0-9]{5}$/;
                if (!reg.test(register))
                {
                    alert("please enter valid regno");
                    flagger = false;
                    return flagger;
                }

                var kann = /^[0-9]+$/;
                if (!kann.test(kannada))
                {
                    alert("please enter valid subject name");
                    flagger = false;
                    return flagger;
                }

                var engg = /^[0-9]+$/;
                if (!engg.test(english))
                {
                    alert("please enter valid marks");
                    flagger = false;
                    return flagger;

                }
                var hinn = /^[0-9]+$/;
                if (!hinn.test(hindi))
                {
                    alert("please enter valid marks");
                    flagger = false;
                    return flagger;
                }
                var matt = /^[0-9]+$/;
                if (!matt.test(maths))
                {
                    alert("please enter valid marks");
                    flagger = false;
                    return flagger;
                }
                var scii = /^[0-9]+$/;
                if (!matt.test(science))
                {
                    alert("please enter valid marks");
                    flagger = false;
                    return flagger;
                }
                var socc = /^[0-9]+$/;
                if (!socc.test(social))
                {
                    alert("please enter valid marks");
                    flagger = false;
                    return flagger;
                }
            }

        </script>
    </body>
</html>