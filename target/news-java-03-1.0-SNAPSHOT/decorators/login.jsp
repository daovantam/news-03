<%--
  Created by IntelliJ IDEA.
  User: Adminis
  Date: 3/23/2019
  Time: 12:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglip.jsp" %>
<html>
<head>
    <title>SB Admin 2 - Login</title>

    <!-- Custom fonts for this template-->
    <link href="<c:url value="/template/vendor/fontawesome-free/css/all.min.css"/>" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<c:url value="/template/css/sb-admin-2.min.css"/>" rel="stylesheet">
    <dec:head></dec:head>
</head>
<body class="bg-gradient-primary">
<div class="container">

    <!-- Outer Row -->
    <div class="row justify-content-center">

        <div class="col-xl-10 col-lg-12 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <dec:body></dec:body>
            </div>
        </div>
    </div>
</div>

<script src="<c:url value="/template/vendor/jquery/jquery.min.js"/>"></script>
<script src="<c:url value="/template/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>

<!-- Core plugin JavaScript-->
<script src="<c:url value="/template/vendor/jquery-easing/jquery.easing.min.js"/>"></script>

<!-- Custom scripts for all pages-->
<script src="<c:url value="/template/js/sb-admin-2.min.js"/>"></script>
</body>
</html>
