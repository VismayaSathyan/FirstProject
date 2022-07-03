<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Login page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <style>
            label{
                font-family: cursive;
                font-size: 16px;
            }
            h1{
                font-family: cursive;
            }
        </style>
    </head>
    <body style="background-image: url('facloginimg.png'); background-repeat: no-repeat; background-size: cover">
        <%
            session.setAttribute("emailid", " ");
        %>
        <form action="logdata.jsp" method="get">

            <div  class="form-group" style="padding-top: 10%">  
                <h1 style="text-align: center; color: black;">Login Form</h1>
                <div style="padding-left: 40%;padding-right: 40%" id="img1" class="col-lg-12 col-md-12 col-sm-2 col-xs-2">
                    <br/><label style="padding-top: 5px;">Enter the email</label>
                    <input class="form-control" type="email" id="email" name="email"/>
                </div>
                <div style="padding-left: 40%;padding-right: 40%" id="img2" class="col-lg-12 col-md-12 col-sm-2 col-xs-2">
                    <br/><label style="padding-top: 2px;">Enter the password</label>
                    <input class="form-control" type="password" id="pswd" name="pswd"/>
                </div>
                <div style="padding-left: 40%;padding-right: 40%" id="img2" class="col-lg-12 col-md-12 col-sm-2 col-xs-2">
                    <br/><label style="padding-top: 2px;">Code</label>
                    <input class="form-control" type="text" id="code" name="code"/>
                </div>
                <div id="img1" style="padding-left: 47.5%;padding-right: 40%" class="col-lg-12 col-md-12 col-sm-2 col-xs-2">
                    <br/><br/><input class="btn btn-warning" type="submit" value="Submit" onclick="loginpage();" /><br/><br/><br/>

                </div>
                <div id="img1" style="padding-left:44%;padding-right: 40%" class="col-lg-12 col-md-12 col-sm-2 col-xs-2">
                    <p style="color: black;font-size: 18px;font-family: cursive;">Redirect to <a class="btn btn-info" style="color:black; font-family: cursive;" href="home.html">Home page</a></p>
                </div>
            </div>



        </form>

        <script>
            function loginpage()
            {
                debugger;
                //var uname= document.getElementById('usname');
                //var unamepattern=/^[a-zA-Z]+$/;
                //var nm= uname.value;
                var flagger = true;
                var emaila = document.getElementById('email');
                var emailapattern = /^[a-zA-Z0-9]+[@]{1}[a-zA-Z]+[.]{1}[a-zA-Z]{2,3}$/;
                var password = document.getElementById('pswd');
                var passwordpattern = /^[a-zA-Z]{5,8}$/;
                var codea = document.getElementById('code')

                //if(!unamepattern.test(nm))
                //{
                // uname.style.backgroundColor="red";
                //}
                //	else{
                //	uname.style.backgroundColor="white";
                //	}
                if (!emailapattern.test(emaila.value))
                {
                    alert('enter the valid email')
                    flagger = false;
                    return flagger;

                }
                if (!passwordpattern.test(password.value))
                {
                    alert('enter the valid pasword')
                    flagger = false;
                    return flagger;
                }
            }
        </script>
    </body>
</html>
