<%--
  Created by IntelliJ IDEA.
  User: Adminis
  Date: 3/23/2019
  Time: 1:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglip.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="card-body p-0">
    <!-- Nested Row within Card Body -->
    <div class="row">
        <%--<div class="col-lg-6 d-none d-lg-block bg-login-image"></div>--%>
        <div>
            <img src="https://2sao.vietnamnetjsc.vn/images/2018/06/18/13/10/nguyen-thuy-tien-1.jpg" width="430"
                 height="550">
        </div>
        <div class="col-lg-6">
            <div class="p-5">
                <div class="text-center">
                    <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                </div>
                <c:if test="${not empty message}">
                    <div class="alert alert-danger">
                        <strong>${message}</strong>
                    </div>
                </c:if>
                <form class="user" action="/login" method="post">
                    <div class="form-group">
                        <input type="text" class="form-control form-control-user" id="exampleInputEmail"
                               aria-describedby="emailHelp" placeholder="user name" name="userName">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control form-control-user" id="exampleInputPassword"
                               placeholder="Password" name="password">
                    </div>
                    <div class="form-group">
                        <div class="custom-control custom-checkbox small">
                            <input type="checkbox" class="custom-control-input" id="customCheck">
                            <label class="custom-control-label" for="customCheck">Remember Me</label>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary btn-user btn-block">
                        Login
                    </button>
                    <hr>
                </form>
                <hr>
                <div class="text-center">
                    <a class="small" href="forgot-password.html">Forgot Password?</a>
                </div>
                <div class="text-center">
                    <a class="small" href="register.html">Create an Account!</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
