<!DOCTYPE html>
<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
 <%@include file="./shared/head.jsp" %>
</head>
<!-- ADD THE CLASS layout-top-nav TO REMOVE THE SIDEBAR. -->
<body class="hold-transition skin-blue layout-top-nav">
<div class="wrapper">

<!-- SECTION HEADER -->
<header class="main-header">
<%@include file="./shared/navbar.jsp" %>
</header>
 
  <!-- Full Width Column -->
  <div class="content-wrapper">
    <div class="container">
	      <!-- Content Header (Page header) -->
      <section class="content-header">
        <h1>
          Top Navigation
          <small>Example 2.0</small>
        </h1>
        <ol class="breadcrumb">
          <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
          <li><a href="#">Layout</a></li>
          <li class="active">Top Navigation</li>
        </ol>
      </section>

      <!-- Main content -->
      <section class="content">
        <div class="row">
        <div class="col-xs-12">
         
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">List Movie</h3>
              <br>
              <br>
              
              	<div class="input-group input-group-sm pull-left" style="width:20%">
                  
                  <input type="text" class="form-control" id="filterbyYear" placeholder="Search by Year">
                  <span class="input-group-btn">
                      <button type="button" class="btn btn-info btn-flat">Go!</button>
                    </span>
                   
              	</div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example1" class="table table-bordered table-striped">
                <thead>
                <tr>
                  <th>id</th>
                  <th>Title</th>
                  <th>Description</th>
                  <th>Release Year</th>
                  <th>Action</th>
                </tr>
                </thead>
                <tbody>
               	<c:forEach items="${filmModel}"></c:forEach>
                </tbody>
                <tr>
                	<td>
                	${filmModel.filmid }
                	</td>
                	<td>
                	${filmModel.title }
                	</td>
                	<td>
                	${filmModel.description }
                	</td>
                	<td>
                	${filmModel.releaseyear }
                	</td>
                </tr>
              </table>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
      </section>
      <!-- /.content -->
    </div>
    <!-- /.container -->
  </div>
  <!-- /.content-wrapper -->
  
  
  
<footer class="main-footer">
    <%@include file="./shared/footer.jsp" %>
    <!-- /.container -->
</footer>
</div>
<%@include file="./shared/footerjs.jsp" %>
<script>
  $(function () {
    $('#example1').DataTable({
      'paging'      : true,
      'lengthChange': false,
      'searching'   : false,
      'ordering'    : true,
      'info'        : true,
      'autoWidth'   : false
    })
  })
</script>
</body>
</html>
