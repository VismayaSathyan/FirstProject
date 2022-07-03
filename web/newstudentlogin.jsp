<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Student Login page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <style>
            h1,label{
                font-family: cursive;
            }
        </style>
    </head>
    <body style="background-image: url('nstuloginimg.png'); background-repeat: no-repeat; background-size: cover">
        <%
            session.setAttribute("user", " ");

        %>
        <form action="newstudentlogindb.jsp" method="get" onsubmit="return loginpage()">

            <div class="form-group" style="padding-top:10%">
                <div style="padding-left:40%;padding-right:40%;" class="col-lg-12 col-md-12 col-sm-6 col-xs-6">
                    <h1 style="text-align: center; padding-top: 20px; font-family: cursive ;color: black;">Student Login Form</h1>
                    <label style="padding-top: 5px;">Username</label><br/><br/>
                    <input class="form-control" type="text" id="uname" placeholder="Enter the Usernsme" name="uname"/><br/><br/>
                </div>
                <div style="padding-left:40%;padding-right:40%;" class="col-lg-12 col-md-12 col-sm-6 col-xs-6">
                    <label style="padding-top: 2px;">Password</label>
                    <input class="form-control" type="password" placeholder="Enter your Password" id="pswd" name="pswd"/><br/><br/>

                    <div style="padding-left: 39%;padding-right: 40%" class="col-lg-12 col-md-12 col-sm-6 col-xs-6">
                        <input type="submit" class="btn btn-danger" value="submit" onclick="loginpage();" /><br/><br/><br/>
                    </div>
                </div>
                <div id="img1" style="padding-left:44%;padding-right: 40%" class="col-lg-12 col-md-12 col-sm-2 col-xs-2">
                    <p style="color: black;font-size: 18px;font-family: cursive;">Redirect to <a class="btn btn-warning" style="color:black; font-family: cursive;" href="home.html">Home page</a></p>
                </div>
            </div>


        </form>
        <script>
            function loginpage()
            {
                debugger;
                var flagger = true;
                //var uname= document.getElementById('usname');
                //var unamepattern=/^[a-zA-Z]+$/;
                //var nm= uname.value;
                var username = document.getElementById('uname');
                var upattern = /^[a-zA-Z0-9]+$/;
                var password = document.getElementById('pswd');
                var ppattern = /^[a-zA-Z0-9]+$/;

                //if(!unamepattern.test(nm))
                //{
                // uname.style.backgroundColor="red";
                //}
                //	else{
                //	uname.style.backgroundColor="white";
                //	
                //	}
                if (username == "" && password == "")
                {
                    alert("Please fill the details");
                    return false;
                }
                if (!upattern.test(username.value))
                {
                    alert("Please enter the correct username");
                    flagger = false;
                    return flagger;
                }

                if (!ppattern.test(password.value))
                {
                    alert("Please enter the correct password");
                    flagger = false;
                    return flagger;
                }

            }
        </script>
    </body>
</html>
