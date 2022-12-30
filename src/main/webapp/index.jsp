<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <link href="css/theme.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="https://www.facebook.com/ka.haru.520/">
            <img src="https://i.pinimg.com/564x/3a/0a/17/3a0a1753db493f176ec0b32b63302833.jpg" alt="Logo"
                 style="width:80px;" class="rounded-pill">
        </a>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Giới thiệu</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Nam</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Mũ lưỡi trai</a></li>
                        <li><a class="dropdown-item" href="#">Mũ len</a></li>
                        <li><a class="dropdown-item" href="#">Mũ Jacket</a></li>
                        <li><a class="dropdown-item" href="#">Mũ Cối</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Nữ</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Mũ lưỡi trai</a></li>
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
            </ul>
            <div class="box">
                <div class="container-2">
                    <span class="icon"><i class="fa fa-search"></i></span>
                    <input type="search" id="search" placeholder="Search..." />
                </div>
            </div>
        </div>
    </div>
    <div class="collapse navbar-collapse" id="collapse-log">
        <ul class="navbar-nav">
            <li id="dangky" class="nav-item">
                <a class="nav-link" href="#">Đăng ký</a>
            </li>
            <li id="wall" class="nav-item">
                <a class="nav-link" href="#">|</a>
            </li>
            <li id="dangnhap" class="nav-item">
                <a class="nav-link" href="#">Đăng nhập</a>
            </li>
        </ul>
    </div>
</nav>

<div id="videoHome">
    <video controls autoplay loop width="1100px">
        <source src="video/videodemo.mp4">
    </video>
</div>

</body>
</html>
