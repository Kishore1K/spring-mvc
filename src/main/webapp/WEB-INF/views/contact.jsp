<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page  isELIgnored="false"  %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.rtl.min.css" integrity="sha384-nU14brUcp6StFntEOOEBvcJm4huWjB0OcIeQ3fltAfSmuZFrkAif0T+UtNGlKKQv" crossorigin="anonymous">

    <title>Contact</title>
  </head>
  <body>
  <div class="container mt-5">
  <h1 class="text-center"> Registration Form</h1>
  <form action="submitForm" method="post">
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

  
    
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
    -->
  </body>
</html>