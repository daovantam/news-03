<%--
  Created by IntelliJ IDEA.
  User: Adminis
  Date: 3/22/2019
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglip.jsp" %>
<html>
<head>
    <title>Title</title>
    <!-- Custom fonts for this template-->
    <link href="<c:url value="/template/vendor/fontawesome-free/css/all.min.css"/>" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<c:url value="/template/css/sb-admin-2.min.css"/>" rel="stylesheet">
    <dec:head></dec:head>
</head>
<body id="page-top">
<div id="wrapper">
    <%@include file="/common/admin/menu.jsp" %>
    <div id="content-wrapper" class="d-flex flex-column">
        <div id="content">
            <%@include file="/common/admin/header.jsp" %>
            <dec:body></dec:body>
        </div>
        <%@include file="/common/admin/footer.jsp" %>
    </div>
</div>

<script src="<c:url value="/template/vendor/jquery/jquery.min.js"/>"></script>
<script src="<c:url value="/template/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
<script src="<c:url value="/template/vendor/jquery-easing/jquery.easing.min.js"/>"></script>
<script src="<c:url value="/template/js/sb-admin-2.min.js"/>"></script>
</body>
</html>
