<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-lg-3">
          <a href="?action=createContract">
              <button type="button" class="btn-outline-success">Create Contract</button>
          </a>
        </div>
        <div class="col-lg-3">
            <a href="?action=createContractDetail">
                <button type="button" class="btn-outline-success">Create Contract Detail
                </button>
            </a>
        </div>
    </div>
</div>
<script src="js/jquery-3.6.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
