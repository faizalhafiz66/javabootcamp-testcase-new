<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
 <%@include file="/WEB-INF/views/shared/head.jsp" %>
</head>
<!-- ADD THE CLASS layout-top-nav TO REMOVE THE SIDEBAR. -->
<body class="hold-transition skin-blue layout-top-nav">
<div class="wrapper">

<!-- SECTION HEADER -->
<header class="main-header">
<%@include file="/WEB-INF/views/shared/navbar.jsp" %>
</header>
 
  <!-- Full Width Column -->
  <div class="content-wrapper">
    <div class="container">
   
	      <!-- Content Header (Page header) -->
      <section class="content-header">
        <h1>
          Insert Movie
          <small></small>
        </h1>
        <ol class="breadcrumb">
          <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
          <li><a href="#">Layout</a></li>
          <li class="active">Insert</li>
        </ol>
      </section>

      <!-- Main content -->
      <section class="content">
        <div class="row">
        <div class="col-xs-12">
         
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Insert Movie</h3>
              <br>
              <br>
              
            </div>
            <!-- /.box-header -->
            <div class="box-body">
            <c:url var="addAction" value="/form/insert"></c:url>
           		  <form:form action="${addAction }" method="POST" modelAttribute="models">
              		<div class="box-body">
                		<div class="form-group">
                  		<form:label path="title" for="Title">Title</form:label>                 		
                  		<form:input path="title" class="form-control" id="title" placeholder="Enter Title" />
               			</div>
                		<div class="form-group">
                  		<form:label path="description" for="description">Description</form:label>
                  		<form:textarea path="description" rows="5" cols="5" class="form-control" id="description" placeholder="desctiption"></form:textarea>                 		
                		</div>
                		<div class="form-group">
                  		<form:label path="releaseyear">Release Year</form:label>
                  		<form:select class="form-control" path="releaseyear">
                    	<form:option value="2011"></form:option>
	                    <form:option value="2012"></form:option>
	                    <form:option value="2013"></form:option>
	                    <form:option value="2014"></form:option>
	                    <form:option value="2015"></form:option>
                  		</form:select>
                		</div>
                		<div>
                		<form:label path="language" for="language">Language</form:label>                 		
                  		<form:select class="form-control" path="language" id="language">
                    	<form:option value="English"></form:option>
	                    <form:option value="Indonesian"></form:option>
	                    <form:option value="Germany"></form:option>
	                    <form:option value="Japanese"></form:option>
	                    <form:option value="Sundanese"></form:option>
                  		</form:select>
                		</div>
                		
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
              <input type="submit" value="Add Film" />
              
              </div>
            </form:form>
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
    <%@include file="/WEB-INF/views/shared/footer.jsp" %>
    <!-- /.container -->
</footer>
</div>
<%@include file="/WEB-INF/views/shared/footerjs.jsp" %>
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
