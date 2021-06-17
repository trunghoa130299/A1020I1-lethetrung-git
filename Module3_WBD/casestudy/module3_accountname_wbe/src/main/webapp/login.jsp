<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <style>
        .login-form {
            width: 340px;
            margin: 50px auto;
            font-size: 15px;
        }

        .login-form form {
            margin-bottom: 15px;
            background: #f7f7f7;
            box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            padding: 30px;
        }

        .login-form h2 {
            margin: 0 0 15px;
        }

        .form-control, .btn {
            min-height: 38px;
            border-radius: 2px;
        }

        .btn {
            font-size: 15px;
            font-weight: bold;
        }

        body {
            background:#7abaff;
        }
    </style>
</head>
<body>
<div class="login-form">
    <form action="?action=login" method="post">
        <h2 class="text-center">Log in</h2>
        <p>
            <c:if test='${requestScope["message"] != null}'>
                <span class="message text-danger">${requestScope["message"]}</span>
            </c:if>
        </p>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Username" required="required" name="us">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" placeholder="Password" required="required" name="pw">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Log in</button>
        </div>
        <div class="clearfix">
            <label class="float-left form-check-label">
                <button type="button" class="btn btn-primary " data-toggle="modal" data-target="#createUser">
                    Sign Up
                </button>
            </label>
            <a href="#" class="float-right">Forgot Password?</a>
        </div>
    </form>

</div>
<div class="modal fade" id="createUser" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <form method="post" action="?action=createUser">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">User Information</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <fieldset>
                        <table>
                            <tr>
                                <td>User name :</td>
                                <td><input type="text" name="user" id="user" required></td>
                            </tr>
                            <tr>
                                <td>Password:</td>
                                <td><input type="text" name="password" id="password" required></td>
                            </tr>
                        </table>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <input type="submit" value="Create" class="btn btn-primary">
                        </div>
                    </fieldset>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
