<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Form</title>
  </head>
  <body class="" style="background: blue">
  	<div class="container t-4">
  	
  		<div class="row">
  			<div class="col-md-6 offset-md-4">
  				<div class="card-body" >
  					<h3 class="text-center"> Complex Form</h3>
  					<form action="handle" >
  						<div class="form-group">
						  <label for="userName" >Name </label>
						  <input type="text" class="form-control" id="userName" name="userName"placeholder="Kishore">
						</div>
						<div class="form-group">
						  <label for="userEmail" >Email address</label>
						  <input type="email" class="form-control" id="userEmail"  name="userEmail" placeholder="name@example.com">
						</div>
						<div class="form-group ">
						  <div class="form-group">
						    <label for="userPassword" >Password</label>
						  </div>
						  <div class="form-group">
						    <input type="password" id="userPassword" class="form-control"  name="userPassword" aria-describedby="passwordHelpInline">
						  </div>
						  <div class="form-group">
						    <span id="passwordHelpInline" class="form-text">
						      Must be 8-20 characters long.
						    </span>
						  </div>
						</div>
						<div class="container text-center">
								<button type="submit" >Sign Up</button>
						</div>
  					</form>
  				</div> 
  				
  			</div>
  		</div>
  	
  	</div>
 		

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>