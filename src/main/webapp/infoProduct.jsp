<%--
  Created by IntelliJ IDEA.
  User: 84837
  Date: 1/2/2023
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Source+Serif+Pro:400,600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="fonts/icomoon/style.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Style CSS -->
    <link rel="stylesheet" href="css/style.css">
    <link href='https://fonts.googleapis.com/css?family=Raleway:400,800,300' rel='stylesheet' type='text/css'>
    <link href="css/home.css" rel="stylesheet">

    <link href="css/infoProduct.css" rel="stylesheet">
    <link href="js/infoProduct.js" rel="script">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js" rel="script">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" rel="script">
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-dark"
     style="height: 90px; font-size: large; background-color:#212529; opacity: 1;">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Logo</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Giới thiệu</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Nam</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Mũ lưỡi chai</a></li>
                        <li><a class="dropdown-item" href="#">Mũ len</a></li>
                        <li><a class="dropdown-item" href="#">Mũ Jacket</a></li>
                        <li><a class="dropdown-item" href="#">Mũ Cối</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Nữ</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Mũ lưỡi chai</a></li>
                        <li><a class="dropdown-item" href="#">Mũ len</a></li>
                        <li><a class="dropdown-item" href="#">Mũ Jacket</a></li>
                        <li><a class="dropdown-item" href="#">Mũ Cói</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Trẻ em</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Mũ lưỡi trai</a></li>
                        <li><a class="dropdown-item" href="#">Mũ len</a></li>
                        <li><a class="dropdown-item" href="#">Mũ Jacket</a></li>
                        <li><a class="dropdown-item" href="#">Mũ thời trang</a></li>
                    </ul>
                </li>
                <li class="nav-item box" style="position: relative; left: 15px; top: -5px">
                    <div class="container-2">
                        <span class="icon"><i class="fa fa-search"></i></span>
                        <input type="search" id="search" placeholder="Search..."/>
                    </div>
                </li>
                <li class="nav-item" style="position: absolute; left: 82%">
                    <div class="nav-link" href="#">Đăng ký</div>
                </li>
                <li class="nav-item" style="position: absolute; left: 90%">
                    <div class="nav-link" href="#">Đăng nhập</div>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container-fluid" style="margin-top: 2%">
    <div class="row d-flex justify-content-center">
        <div class="col-md-10">
            <div class="card">
                <div class="row">
                    <div class="col-md-6">
                        <div class="images p-3">
                            <div class="text-center p-4">
                                <img id="main-image" src="img/banner11.jpg" width="250"/>
                            </div>
                            <div class="thumbnail text-center">
                                <img onclick="change_image(this)" src="img/banner33.jpg" width="100">
                                <img onclick="change_image(this)" src="img/banner44.jpg" width="100">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="product p-4">
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="d-flex align-items-center"><i class="fa fa-long-arrow-left"></i> <span
                                        class="ml-1">Back</span></div>
                                <i class="fa fa-shopping-cart text-muted"></i>
                            </div>
                            <div class="mt-4 mb-3"><span class="text-uppercase text-muted brand">Loại</span>
                                <h5 class="text-uppercase">Tên sản phẩm</h5>
                                <div class="price d-flex flex-row align-items-center"><span class="act-price">$20</span>
                                    <div class="ml-2"><small class="dis-price">$59</small> <span>40% OFF</span></div>
                                </div>
                                <p class="about">Chi tiết sản phẩm
                                    Shop from a wide range of t-shirt from orianz. Pefect for your everyday
                                    use, you could pair it with a stylish pair of jeans or trousers complete the look.
                                </p>
                                <div class="row">
                                    <div class="col-md-5">
                                        <div class="cart mt-4 align-items-center">
                                            <button class="btn btn-danger text-uppercase mr-2 px-4">Add to cart</button>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="cart mt-4 align-items-center">
                                            <button class="btn btn-danger text-uppercase mr-2 px-4">Mua ngay</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container-fluid" style="margin-top: 2%">
    <div style="text-align: center">
        <h4>Sản phẩm tương tự</h4>
    </div>
</div>

<div class="container-fluid" style="margin-top: 2%">
    <div style="text-align: center">
        <img class="col-md-3" src="img/banner33.jpg" style="width: 250px; margin-top: 2%">
        <img class="col-md-3" src="img/banner11.jpg" style="width: 250px; margin-top: 2%">
        <img class="col-md-3" src="img/banner44.jpg" style="width: 250px; margin-top: 2%">
        <img class="col-md-3" src="img/banner22.jpg" style="width: 250px; margin-top: 2%">
        <img class="col-md-3" src="img/banner33.jpg" style="width: 250px; margin-top: 2%">
    </div>
</div>

<div>a</div>
<div>a</div>
<div>a</div>
<div>a</div>
<div>a</div>
<div>a</div>
<div>a</div>
<div>a</div>
<div>a</div>

<footer class="footer-20192" style="background-color:#212529; float: bottom">
    <div class="site-section">
        <div class="container">

            <div class="cta d-block d-md-flex align-items-center px-5">
                <div>
                    <h2 class="mb-0">Ready for a next project?</h2>
                    <h3 class="text-dark">Let's get started!</h3>
                </div>
                <div class="ml-auto">
                    <a href="#" class="btn btn-dark rounded-0 py-3 px-5">Contact us</a>
                </div>
            </div>
            <div class="row">

                <div class="col-sm">
                    <a href="#" class="footer-logo">Colorlib</a>
                    <p class="copyright">
                        <small>&copy; 2019</small>
                    </p>
                </div>
                <div class="col-sm">
                    <h3>Customers</h3>
                    <ul class="list-unstyled links">
                        <li><a href="#">Buyer</a></li>
                        <li><a href="#">Supplier</a></li>
                    </ul>
                </div>
                <div class="col-sm">
                    <h3>Company</h3>
                    <ul class="list-unstyled links">
                        <li><a href="#">About us</a></li>
                        <li><a href="#">Careers</a></li>
                        <li><a href="#">Contact us</a></li>
                    </ul>
                </div>
                <div class="col-sm">
                    <h3>Further Information</h3>
                    <ul class="list-unstyled links">
                        <li><a href="#">Terms &amp; Conditions</a></li>
                        <li><a href="#">Privacy Policy</a></li>
                    </ul>
                </div>
                <div class="col-md-3">
                    <h3>Follow us</h3>
                    <ul class="list-unstyled social">
                        <li><a href="#"><span class="icon-facebook"></span></a></li>
                        <li><a href="#"><span class="icon-twitter"></span></a></li>
                        <li><a href="#"><span class="icon-linkedin"></span></a></li>
                        <li><a href="#"><span class="icon-medium"></span></a></li>
                        <li><a href="#"><span class="icon-paper-plane"></span></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</footer>

<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</body>
</html>
