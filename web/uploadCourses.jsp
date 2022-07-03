<%-- 
    Document   : uploadCourses
    Created on : 8 Oct, 2021, 12:52:32 PM
    Author     : Vismaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Upload File</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
    <body style="background-image:url('fileup.png')">
        <%
            String email = (String) session.getAttribute("emailid");
            if (session.getAttribute("emailid").toString().equals(" ")) {
                response.sendRedirect("stulogin.jsp");
            }

            response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//HTTP 1.1
            response.setHeader("Pragma", "no-cache"); //HTTP 1.0
            response.setDateHeader("Expires", 0);
        %>
        <div>
            <header style="background-color:black; padding-left: 20px;">

                <nav  class="navbar navbar-expand-lg navbar-light bg-light" style="text-align:right;padding-right: 10px">
                    <h2 style="text-align:center; padding-top: 5px; font-family:cursive;"> UPLOAD THE FILES</h2>

                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="marks.jsp">Add Marks</a>
                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="managemarks.jsp">Manage Marks</a>
                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="usermanage.jsp">Manage Users</a>
                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="fileUploadTable.jsp">Manage Files</a>
                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="faculty.jsp">Add StudentInfo</a>
                    <a class="btn btn-warning" style="padding-left:20px; color: black;" href="stulogin.jsp">Logout</a>
                </nav>
            </header>
        </div> 
        <div class="form-group">
            <form action='uploadFile.jsp' method='post' enctype='multipart/form-data' onsubmit="return uploadfile()">
                <div class="col-lg-12 col-md-12 col-sm-4 col-xs-4" style="padding-left:570px; padding-right: 500px;">
                    <label>File name</label>
                    <input class="form-control" type="text" id="upname" name="upname"/>
                </div>

                <div class="col-lg-12 col-md-12 col-sm-4 col-xs-4" style="padding-left:570px; padding-right: 500px;">
                    <label>Register number</label>
                    <input class="form-control" type="text" id="regnum" name="regnum"/>
                </div>

                <div class="col-lg-12 col-md-12 col-sm-4 col-xs-4" style="padding-left:570px; padding-right: 500px;">
                    <label>Choose a File</label>
                    <input class="form-control" type="file" id="ufile" name="ufile" required />
                </div>

                <div class="col-lg-12 col-md-12 col-sm-4 col-xs-4" style="padding-left:570px; padding-right: 500px;">
                    <label>Code</label>
                    <input class="form-control" type="text" id="code" name="code"/>
                </div>

                <div class="col-lg-12 col-md-12 col-sm-4 col-xs-4" style="padding-left:570px; padding-right: 500px;">
                    <br/><br/> <input class="btn btn-danger" type="submit" value="upload" onClick="uploadfile();"/>
                </div> 
            </form>
            <p>
                <%
                    String message = (String) request.getAttribute("msg");
                    if (message != null) {
                        out.println("" + message);
                    } else {

                    }
                %>
            </p>
        </div>
        <script>
            function uploadfile()
            {
                debugger;
                var flagger = true;
                var filename = document.getElementById("upname").value;
                var registerno = document.getElementById("regnum").value;
                var file = document.getElementById("ufile").value;
                var codea = document.getElementById("code").value;

                if (filename == "" && registerno == "" && file == "" && codea == "")
                {
                    alert("Please enter the data");
                    return false;
                }
                var fname = /^[a-zA-z]+$/;
                if (!fname.test(filename))
                {
                    alert('enter the valid Filename');
                    flagger = false;
                    return flagger;

                }
                var reg = /^[A-z]{3}[0-9]{5}$/;
                if (!reg.test(registerno))
                {
                    alert('enter the valid register number');
                    flagger = false;
                    return flagger;

                }
                var fcodea = /^(FAC){1}[0-9]{5}$/;
                if (!fcodea.test(codea))
                {
                    alert('enter the valid code');
                    flagger = false;
                    return flagger;

                }
            }
        </script>
    </body>
</html>
