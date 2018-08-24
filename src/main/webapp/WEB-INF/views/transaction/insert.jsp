<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
           		  <form role="form" method="post">
              		<div class="box-body">
                		<div class="form-group">
                  		<label for="Title">Title</label>                 		
                  		<input type="text" class="form-control" id="title" placeholder="Enter Title">
               		</div>
                		<div class="form-group">
                  		<label for="description">Description</label>
                  		<textarea rows="5" cols="5" class="form-control" id="description" placeholder="desctiption"></textarea>                 		
                		</div>
                		<div class="form-group">
                  		<label>Select</label>
                  		<select class="form-control">
                    	<option>2011</option>
	                    <option>2012</option>
	                    <option>2013</option>
	                    <option>2014</option>
	                    <option>2015</option>
                  		</select>
                </div>
                		
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" value="submit" class="btn btn-primary">Submit</button>
              </div>
            </form>
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
