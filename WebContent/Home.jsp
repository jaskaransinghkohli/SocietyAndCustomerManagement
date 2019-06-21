<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body {
      font: 400 15px/1.8 Lato, sans-serif;
      color: #777;
  }
  h3, h4 {
      margin: 10px 0 30px 0;
      letter-spacing: 10px;      
      font-size: 20px;
      color: #111;
  }
  .container {
      padding: 80px 120px;
  }
  .person {
      border: 10px solid transparent;
      margin-bottom: 25px;
      width: 80%;
      height: 80%;
      opacity: 0.7;
  }
  .person:hover {
      border-color: #f1f1f1;
  }
  .carousel-inner img {
      -webkit-filter: blue(90%);
      filter: blue(90%); /* make all photos black and white */ 
      width: 60%; /* Set width to 100% */
      margin: auto;
  }
  .carousel-caption h3 {
      color: #fff !important;
  }
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */
    }
  }
  .bg-1 {
      background: #2d2d30;
      color: #bdbdbd;
  }
  .bg-1 h3 {color: #fff;}
  .bg-1 p {font-style: italic;}
  .list-group-item:first-child {
      border-top-right-radius: 0;
      border-top-left-radius: 0;
  }
  .list-group-item:last-child {
      border-bottom-right-radius: 0;
      border-bottom-left-radius: 0;
  }
  .thumbnail {
      padding: 0 0 15px 0;
      border: none;
      border-radius: 0;
  }
  .thumbnail p {
      margin-top: 15px;
      color: #555;
  }
  .btn {
      padding: 10px 20px;
      background-color: #333;
      color: #f1f1f1;
      border-radius: 0;
      transition: .2s;
  }
  .btn:hover, .btn:focus {
      border: 1px solid #333;
      background-color: #fff;
      color: #000;
  }
  .modal-header, h4, .close {
      background-color: #333;
      color: #fff !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-header, .modal-body {
      padding: 40px 50px;
  }
  .nav-tabs li a {
      color: #777;
  }
  #googleMap {
      width: 100%;
      height: 400px;
      -webkit-filter: grayscale(100%);
      filter: grayscale(100%);
  }  
  .navbar {
      font-family: Montserrat, sans-serif;
      margin-bottom: 0;
      background-color: #2d2d30;
      border: 0;
      font-size: 11px !important;
      letter-spacing: 4px;
      opacity: 0.9;
  }
  .navbar li a, .navbar .navbar-brand { 
      color: #d5d5d5 !important;
  }
  .navbar-nav li a:hover {
      color: #fff !important;
  }
  .navbar-nav li.active a {
      color: #fff !important;
      background-color: #29292c !important;
  }
  .navbar-default .navbar-toggle {
      border-color: transparent;
  }
  .open .dropdown-toggle {
      color: #fff;
      background-color: #555 !important;
  }
  .dropdown-menu li a {
      color: #000 !important;
  }
  .dropdown-menu li a:hover {
      background-color: red !important;
  }
  footer {
      background-color: #2d2d30;
      color: #f5f5f5;
      padding: 32px;
  }
  footer a {
      color: #f5f5f5;
  }
  footer a:hover {
      color: #777;
      text-decoration: none;
  }  
  .form-control {
      border-radius: 0;
  }
  textarea {
      resize: none;
  }
  </style>
</head>
<body>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#myPage">Your Society</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#myPage">HOME</a></li>
        <li><a href="#band">ABOUT</a></li>
        <li><a href="#tour">OUR BRANCH</a></li>
        <li><a href="#contact">CONTACT</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Login
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#" data-toggle="modal" data-target="#signin" >Sign In</a></li>
            <li><a href="#"  data-toggle="modal" data-target="#signup">Sign Up</a></li> 
          </ul>
        </li>
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
      </ul>
    </div>
  </div>
</nav>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" ></li>
      <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="s1.jpg" alt="New York" width="300px" height="300px">
        <div class="carousel-caption">
          <h3>Drawka Society</h3>
          <p>The atmosphere of Society is Well</p>
        </div>      
      </div>

      <div class="item">
        <img src="s2.jpg" alt="Chicago" width="300px" height="300px">
        <div class="carousel-caption">
          <h3>Security</h3>
          <p>Guards is always Alert.</p>
        </div>      
      </div>
    
      <div class="item">
        <img src="s3.jpg" alt="Los Angeles" width="300px" height="300px">
        <div class="carousel-caption">
          <h3>Fresh wind always there</h3>
          <p>Even though the traffic was a mess, we had the best time playing at Society</p>
        </div>      
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<!-- Container (The Band Section) -->
<div id="band" class="container text-center">
  <h3>THE AANADA SOCIETY</h3>
  <p><em>YOU CAME A TIME</em></p>
  <p>  Delhi or New Delhi as now we call it, is not just the National Capital of India but, also a fast developing Urban and Employment hub of North India. Taking in to consideration that Delhi now offers employment and job opportunities to millions of people. It has now becoming a dream destination for almost every Indian to own a house in Delhi.Keeping in mind that most the people in Delhi are service call and belong to middle income group, there is a rising demand for
AFFORDABLE HOUSING IN DELHI. Also to consider the important factor of bank loans 
and easy EMI since, that is the only way the middle income group or service 
class gentry can AFFORD A HOUSE IN DELHI or should I say OWN A HOUSE IN DELHI.DELHI
HOUSING SOCIETY is a bespoke solution to the rising demand of good quality housing,
AFFORDABLE HOUSING, in the national capital of Delhi.Any where and every that you 
see in Delhi, let it be Dwarka, Mayur Vihar, Rohini, Patparganj or Vikas Puri etc.
 one can see thousands of housing societies developed under cooperative group 
housing society or CGHS model. DELHI HOUSING SOCIETY takes this legacy forward by 
offering quality housing at AFFORDABLE PRICING.DELHI HOUSING SOCIETY shall also
 ensure that vital steps are taken towards the security of these residents. Now a 
days security being a major concern majorly for women, children and elderly. 
DELHI HOUSING SOCIETY plans to have at least three tier security system with Boundary
Walls with barbed wire fencing, 24x7 deployment of security guards and also CCTV 
camera surveillance system."AB EK GHAR DELHI MAIN" "DELHI HOUSING SOCIETY" 
ke aane se ab ye sapna saakar ho sakega. Delhi Heights Multistate CGHS Ltd.
 with great sense of pride presents the DELHI HOUSING SOCIETY to you. Its an
 affordable housing project which will fulfill your dream of owning a world 
class home in our great nation's capital "Delhi". Inspired by our prime minister's 
vision of "housing for all" Delhi Awas Yojna this project has been proposed in New 
Delhi which apart from being the national capital, it is also a dream destination 
for each and every Indian who desires to have a home in delhi. Keeping the master
 plan of Delhi 2021(MPD 2021) in mind which targets to ensure that each and every
 Indian should have his own house by 2022. Delhi Housing Society Delhi Awas Yojna 
shall actually make it a reality.
  </p>
    <br>
  <div class="row">
    <div class="col-sm-4">
      <p class="text-center"><strong>MR. JOHNSON</strong></p><br>
      <a href="#demo" data-toggle="collapse">
        <img src="M1.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo" class="collapse">
        <p>PRESIDENT</p>
        <p>Loves long walks on the beach</p>
        <p>Member since 1988</p>
      </div>
    </div>
    <div class="col-sm-4">
      <p class="text-center"><strong>MICK</strong></p><br>
      <a href="#demo2" data-toggle="collapse">
        <img src="M2.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo2" class="collapse">
        <p></p>
        <p>VICE PRESIDENT</p>
        <p>Member since 1995</p>
      </div>
    </div>
    <div class="col-sm-4">
      <p class="text-center"><strong>JITU SINGH BHADORIYA</strong></p><br>
      <a href="#demo3" data-toggle="collapse">
        <img src="M3.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo3" class="collapse">
        <p>MANAGER</p>
        <p></p>
        <p>Member since 2005</p>
      </div>
    </div>
  </div>
</div>

<!-- Container (TOUR Section) -->
<div id="tour" class="bg-1">
  <div class="container">
    <h3 class="text-center">OUR BRANCH</h3>
    <p class="text-center">Every customer visit any branch<br> Contect to site person.</p>
    
    <div class="row text-center">
      <div class="col-sm-4">
        <div class="thumbnail">
          <img src="N1.jpg" alt="noida" width="400" height="300">
          <p><strong>Noida</strong></p>
          <p>SEC-63 NEAR GAUR CITY</p>
          <button class="btn" data-toggle="modal" data-target="#myModal">UTTER PRADESH</button>
        </div>
      </div>
      <div class="col-sm-4">
        <div class="thumbnail">
          <img src="G1.jpg" alt="gurugram" width="400" height="400">
          <p><strong>GURUGRAM</strong></p>
          <p>IFFCO CHOCK NEAR METRO</p>
          <button class="btn" data-toggle="modal" data-target="#myModal">HARYANA</button>
        </div>
      </div>
      <div class="col-sm-4">
        <div class="thumbnail">
          <img src="D1.jpg" alt="delhi" width="400" height="300">
          <p><strong>DELHI</strong></p>
          <p>DEVIKA TOWER NEHRU PLACE</p>
          <button class="btn" data-toggle="modal" data-target="#myModal">DELHI</button>
        </div>
      </div>
    </div>
  </div>
  
  <!-- Sign In -->
  <div class="modal fade" id="signin" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">×</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Sign In </h4>
        </div>
        <div class="modal-body">
          <form role="form" action="login" method="post">
            <div class="form-group">
              <label for="psw"><span class=""></span> Enter Phone No or Email Id</label>
              <input type="text" name="loginid" class="form-control" id="psw" >
            </div>
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span>Password</label>
              <input type="password" class="form-control" id="usrname" name="loginpassword" >
            </div>
              <button type="submit" class="btn btn-block" name="admin">Login 
                <span class="glyphicon glyphicon-ok"></span>
              </button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal">
            <span class="glyphicon glyphicon-remove"></span> Cancel
          </button>
          <p>Need <a href="#">help?</a></p>
        </div>
      </div>
    </div>
  </div>
</div>



            		  

<!-- Sign Up -->
  <div class="modal fade" id="signup" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">×</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Sign Up </h4>
        </div>
        <div class="modal-body">
          <form role="form" action="signup" method="post">
            <div class="form-group">
              <label for="psw"><span class=""></span>Full Name</label>
              <input type="text" name="fullname" class="form-control" id="psw" >
            </div>
            <div class="form-group">
              <label for="psw"><span class=""></span> Email Id</label>
              <input type="text" name="email" class="form-control" id="psw" >
            </div>
            <div class="form-group">
              <label for="psw"><span class=""></span> Phone No</label>
              <input type="text" name="phoneno" class="form-control" id="psw" >
            </div>
            <div class="form-group">
              <select class="form-control" id="psw" name="type">
              <option value="">Select Type</option>
              <option value="1">ShopKeeper</option>
              <option value="2">Customer</option>
              </select>
              
            </div>
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span>Shop Name</label>
              <input type="text" class="form-control" id="usrname"  name="shopname">
            </div>
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span>Shop Address</label>
              <input type="text" class="form-control" id="usrname"  name="shopaddress">
            </div>
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span>Password</label>
              <input type="password" class="form-control" id="usrname"  name="password">
            </div>
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span>Conform Password</label>
              <input type="text" class="form-control" id="usrname"  name="conformpassword">
            </div>
              <button type="submit" class="btn btn-block" name="signup">SignUP
                <span class="glyphicon glyphicon-ok"></span>
              </button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal">
            <span class="glyphicon glyphicon-remove"></span> Cancel
          </button>
          <p>Need <a href="#">help?</a></p>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- Container (Contact Section) -->
<div id="contact" class="container">
  <h3 class="text-center">Contact</h3>
  <p class="text-center"><em>Dwarka Apartment</em></p>

  <div class="row">
    <div class="col-md-4">
      <p>Mr.Singh</p>
      <p><span class="glyphicon glyphicon-map-marker"></span>Delhi</p>
      <p><span class="glyphicon glyphicon-phone"></span>Phone: +91 8585992258, +91 9876333141</p>
      <p><span class="glyphicon glyphicon-envelope"></span>Email: xyz@gmail.com</p>
    </div>
    <div class="col-md-8">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
      <br>
      <div class="row">
        <div class="col-md-12 form-group">
          <button class="btn pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
  <br>
  
<!-- Add Google Maps -->
<div id="googleMap"></div>
<script>
function myMap() {
var myCenter = new google.maps.LatLng(41.878114, -87.629798);
var mapProp = {center:myCenter, zoom:12, scrollwheel:false, draggable:false, mapTypeId:google.maps.MapTypeId.ROADMAP};
var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);
var marker = new google.maps.Marker({position:myCenter});
marker.setMap(map);
}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBu-916DdpKAjTmJNIgngS6HL_kDIKU0aU&callback=myMap"></script>
<!--
To use this code on your website, get a free API key from Google.
Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp
-->

<!-- Footer -->
<footer class="text-center">
  <a class="up-arrow" href="#myPage" data-toggle="tooltip" title="TO TOP">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a><br><br>
  <p>This site design by<a href="https://www.w3schools.com" data-toggle="tooltip" title="Visit w3schools">Jaskaran Singh</a></p> 
</footer>

<script>
$(document).ready(function(){
  // Initialize Tooltip
  $('[data-toggle="tooltip"]').tooltip(); 
  
  // Add smooth scrolling to all links in navbar + footer link
  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {

    // Make sure this.hash has a value before overriding default behavior
    if (this.hash !== "") {

      // Prevent default anchor click behavior
      event.preventDefault();

      // Store hash
      var hash = this.hash;

      // Using jQuery's animate() method to add smooth page scroll
      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
      $('html, body').animate({
        scrollTop: $(hash).offset().top
      }, 900, function(){
   
        // Add hash (#) to URL when done scrolling (default click behavior)
        window.location.hash = hash;
      });
    } // End if
  });
})
</script>

</body>
</html>