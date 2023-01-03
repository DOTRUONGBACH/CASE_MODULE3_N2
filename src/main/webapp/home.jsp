<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Source+Serif+Pro:400,600&display=swap" rel="stylesheet">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Style CSS -->
    <link rel="stylesheet" href="css/style.css">
    <link href='https://fonts.googleapis.com/css?family=Raleway:400,800,300' rel='stylesheet' type='text/css'>
    <link href="css/home.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/imgEffect.css" rel="stylesheet">
    <link href="js/imgEffect.js" rel="script">
</head>

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
                        <c:forEach var="p" items="${hattype}">
                        <li><a class="dropdown-item" href="/hatstyle?id=${p.idHattype}">${p.typeName}</a></li>
                        </c:forEach>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Nữ</a>
                    <ul class="dropdown-menu">
                        <c:forEach var="p" items="${hattype}">
                            <li><a class="dropdown-item" href="#">${p.typeName}</a></li>
                        </c:forEach>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin.jsp">Trẻ em</a>
                </li>
                <li class="nav-item box" style="position: relative; left: 15px; top: -5px">
                    <div class="container-2">
                        <span class="icon"><i class="fa fa-search"></i></span>
                        <input type="search" id="search" placeholder="Search..."/>
                    </div>
                </li>
                <c:if test="${sessionScope.get('username') == null}">
                    <li class="nav-item" style="position: absolute; left: 82%">
                        <div class="nav-link btn btn-secondary" data-bs-toggle="modal" data-bs-target="#myModal2" href="#">Đăng ký</div>
                    </li>
                    <li class="nav-item" style="position: absolute; left: 90%">
                        <div class="nav-link btn btn-secondary" data-bs-toggle="modal" data-bs-target="#myModal" href="#">Đăng nhập</div>
                    </li>
                </c:if>
//test = ... là cú pháp
                <c:if test="${sessionScope.get('username') != null}">
                    <li class="nav-item" style="position: absolute; left: 75%">
                        <div class="dropdown">
                            <div class="dropdown-toggle btn btn-secondary" data-bs-toggle="dropdown">
                                Hello...@gmail.com
                            </div>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Thông tin</a></li>
                                <li><a class="dropdown-item" href="#">Sửa thông tin</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="#">Đăng xuất</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="nav-item" style="position: absolute; left: 90%">
                        <div class="nav-link btn btn-secondary" href="#">Giỏ hàng</div>
                    </li>
                </c:if>
            </ul>

        </div>
    </div>
</nav>
<c:if test="${note != null}">
    <div class="alert alert-warning alert-danger">
        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        <strong>${note}</strong>
    </div>
</c:if>


<div class="modal" id="myModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="container mt-3" style="height: 310px">
                <h2>Đăng nhập</h2>
                <form action="/hat" method="post">
                    <div class="mb-3 mt-3">
                        <label>User:</label>
                        <input type="text" class="form-control" placeholder="Enter username" name="username">
                    </div>
                    <div class="mb-3">
                        <label>Password:</label>
                        <input type="password" class="form-control" placeholder="Enter password" name="password">
                    </div>
                    <div class="form-check mb-3">
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox" name="remember"> Remember me
                        </label>
                    </div>
                    <button type="submit" class="btn btn-primary" style="text-align: right">Đăng nhập</button>
                    <br>
                </form>
            </div>
        </div>
    </div>
</div>

<div class="modal" id="myModal2">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="container mt-3" style="height: 710px">
                <h2>Đăng ký</h2>
                <form action="/action_page.php">
                    <div class="mb-3 mt-3">
                        <label>User:</label>
                        <input type="text" class="form-control" placeholder="Enter username" name="username">
                    </div>
                    <div class="mb-3">
                        <label>Password:</label>
                        <input type="password" class="form-control" placeholder="Enter password" name="password">
                    </div>
                    <div class="mb-3">
                        <label>Full name:</label>
                        <input type="text" class="form-control" placeholder="Enter full name" name="fullName">
                    </div>
                    <div class="mb-3">
                        <label>Age:</label>
                        <input type="number" class="form-control" placeholder="Enter age" name="age">
                    </div>
                    <div class="mb-3">
                        <label>Number Phone:</label>
                        <input type="text" class="form-control" placeholder="Enter number" name="number">
                    </div>
                    <div class="mb-3">
                        <label>Email:</label>
                        <input type="text" class="form-control" placeholder="Enter email" name="email">
                    </div>
                    <div class="form-check mb-3">
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox" name="remember"> Remember me
                        </label>
                    </div>
                    <button type="submit" class="btn btn-primary" style="text-align: right">Đăng ký</button>
                    <br>
                </form>
            </div>
        </div>
    </div>
</div>

<!-- Carousel -->
<div id="demo" class="carousel slide" data-bs-ride="carousel">

    <!-- Indicators/dots -->
    <div class="carousel-indicators">
        <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
        <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
        <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
        <button type="button" data-bs-target="#demo" data-bs-slide-to="3"></button>
    </div>

    <!-- The slideshow/carousel -->
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="img/banner11.jpg" alt="Los Angeles" class="d-block" style="width:100%">
        </div>
        <div class="carousel-item">
            <img src="img/banner22.jpg" alt="Chicago" class="d-block" style="width:100%">
        </div>
        <div class="carousel-item">
            <img src="img/banner33.jpg" alt="New York" class="d-block" style="width:100%">
        </div>
        <div class="carousel-item">
            <img src="img/banner44.jpg" alt="New York" class="d-block" style="width:100%">
        </div>
    </div>

    <!-- Left and right controls/icons -->
    <button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
        <span class="carousel-control-prev-icon"></span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
        <span class="carousel-control-next-icon"></span>
    </button>
</div>

<div class="navbar navbar-expand-sm navbar-dark" style="background-color: #212529"></div>

<div class="container-fluid" style="margin-top: 2%">
    <div style="text-align: center">
        <h4>Sản phẩm mới</h4>
    </div>
</div>

<div class="container-fluid center-parent center-me" style="margin-top: 2%; text-align: center; display: inline-flex">
    <figure class="snip1104 blue col-md-4">
        <img src="img/banner33.jpg" alt="sample35" style="width: 400px; margin-top: 2%"/>
        <figcaption>
            <h2>Sale <span> %</span></h2>
        </figcaption>
        <a href="#"></a>
    </figure>
    <figure class="snip1104 blue col-md-4" >
        <img src="img/banner11.jpg" alt="sample35" style="width: 400px; margin-top: 2%"/>
        <figcaption>
            <h2>Sale <span> %</span></h2>
        </figcaption>
        <a href="#"></a>
    </figure>
    <figure class="snip1104 blue col-md-4" >
        <img src="img/banner44.jpg" alt="sample35" style="width: 400px; margin-top: 2%"/>
        <figcaption>
            <h2>Sale <span> %</span></h2>
        </figcaption>
        <a href="#"></a>
    </figure>
    </div>
</div>


<div class="container-fluid" style="margin-top: 2%">
    <div style="text-align: center">
        <h4>Các sản phẩm bán chạy</h4>
    </div>
</div>

<div class="container-fluid" style="margin-top: 2%">
    <div style="text-align: center">
        <h4 class="btn btn-primary">Xem thêm</h4>
    </div>
</div>

<div class="grid container-fluid" style="text-align: center">
    <figure class="effect-zoe figure col-md-3">
        <img src="img/banner33.jpg" alt="img25" style="width: 250px;"/>
        <figcaption>
            <h2>69.000đ<span></span></h2>
            <p class="icon-links">
                <a href="#"><span class="icon-heart"></span></a>
                <a href="#"><span class="icon-eye"></span></a>
                <a href="#"><span class="icon-paper-clip"></span></a>
            </p>
            <p class="description"></p>
        </figcaption>
    </figure>
    <figure class="effect-zoe figure col-md-3">
        <img src="img/banner22.jpg" alt="img25" style="width: 250px;"/>
        <figcaption>
            <h2>69.000đ<span></span></h2>
            <p class="icon-links">
                <a href="#"><span class="icon-heart"></span></a>
                <a href="#"><span class="icon-eye"></span></a>
                <a href="#"><span class="icon-paper-clip"></span></a>
            </p>
            <p class="description"></p>
        </figcaption>
    </figure>
    <figure class="effect-zoe figure col-md-3">
        <img src="img/banner44.jpg" alt="img25" style="width: 250px;"/>
        <figcaption>
            <h2>69.000đ<span></span></h2>
            <p class="icon-links">
                <a href="#"><span class="icon-heart"></span></a>
                <a href="#"><span class="icon-eye"></span></a>
                <a href="#"><span class="icon-paper-clip"></span></a>
            </p>
            <p class="description"></p>
        </figcaption>
    </figure>
    <figure class="effect-zoe figure col-md-3">
        <img src="img/banner11.jpg" style="width: 250px;"/>
        <figcaption>
            <h2>69.000đ<span></span></h2>
            <p class="icon-links">
                <a href="#"><span class="icon-heart"></span></a>
                <a href="#"><span class="icon-eye"></span></a>
                <a href="#"><span class="icon-paper-clip"></span></a>
            </p>
            <p class="description"></p>
        </figcaption>
    </figure>
    <figure class="effect-zoe figure col-md-3">
        <img src="img/banner44.jpg" alt="img25" style="width: 250px;"/>
        <figcaption>
            <h2>69.000đ<span></span></h2>
            <p class="icon-links">
                <a href="#"><span class="icon-heart"></span></a>
                <a href="#"><span class="icon-eye"></span></a>
                <a href="#"><span class="icon-paper-clip"></span></a>
            </p>
            <p class="description"></p>
        </figcaption>
    </figure>
    <figure class="effect-zoe figure col-md-3">
        <img src="img/banner11.jpg" style="width: 250px;"/>
        <figcaption>
            <h2>69.000đ<span></span></h2>
            <p class="icon-links">
                <a href="#"><span class="icon-heart"></span></a>
                <a href="#"><span class="icon-eye"></span></a>
                <a href="#"><span class="icon-paper-clip"></span></a>
            </p>
            <p class="description"></p>
        </figcaption>
    </figure>
    <figure class="effect-zoe figure col-md-3">
        <img src="img/banner33.jpg" alt="img25" style="width: 250px;"/>
        <figcaption>
            <h2>69.000đ<span></span></h2>
            <p class="icon-links">
                <a href="#"><span class="icon-heart"></span></a>
                <a href="#"><span class="icon-eye"></span></a>
                <a href="#"><span class="icon-paper-clip"></span></a>
            </p>
            <p class="description"></p>
        </figcaption>
    </figure>
    <figure class="effect-zoe figure col-md-3">
        <img src="img/banner11.jpg" alt="img25" style="width: 250px;"/>
        <figcaption>
            <h2>69.000đ<span></span></h2>
            <p class="icon-links">
                <a href="#"><span class="icon-heart"></span></a>
                <a href="#"><span class="icon-eye"></span></a>
                <a href="#"><span class="icon-paper-clip"></span></a>
            </p>
            <p class="description"></p>
        </figcaption>
    </figure>
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
<div>a</div>
<div>a</div>
<div>a</div>
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
