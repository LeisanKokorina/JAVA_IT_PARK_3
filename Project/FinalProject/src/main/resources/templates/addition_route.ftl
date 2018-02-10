<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>

<html lang="en">
<head>
    <title>ЖД- Добавление Маршрута</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        /* Remove the navbar's default margin-bottom and rounded borders */
        .navbar {
            margin-bottom: 0;
            border-radius: 0;
        }

        /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
        .row.content {height: 450px}

        /* Set gray background color and 100% height */
        .sidenav {
            padding-top: 20px;
            background-color: lightgray;
            height: 100%;
        }

        /* Set black background color, white text and some padding */
        footer {
            background-color: #555;
            color: white;
            padding: 15px;
        }

        /* On small screens, set height to 'auto' for sidenav and grid */
        @media screen and (max-width: 767px) {
            .sidenav {
                height: auto;
                padding: 15px;
            }
            .row.content {height:auto;}
        }
    </style>
</head>
<body>


<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/static/img/train-5-256.png">Logo</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/">Главная</a></li>


                <li><a href="#">Контакты</a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right">

                <li><a href="/profile"><span class="glyphicon glyphicon-user"></span>Личный кабинет</a></li>
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Выйти</a></li>
            </ul>

        </div>

    </div>
</nav>


<div class="container-fluid text-center">

    <div class="row content">
        <div class="col-sm-2 sidenav">



        </div>

    <div class="col-sm-8 text-center">
        <h3>Добавление маршрута</h3>
        <form title="Станции"
              name="RouteForm"
              method="post"
              action="/insert/route">

            <div class="input-group2">

                <input id="from" type="text" class="form-control" name="pickUpPoint" placeholder="Станция отправления">
            </div>
            <div class="input-group2">

                <input id="to" type="text" class="form-control" name="routePoint" placeholder="Станция прибытия">
            </div>
            <div class="input-group2">

                <input id="trainId" type="number" class="form-control" name="trainId" placeholder="Id Поезда">
            </div>
            <br>

            <div>
                <input type="submit">

            </div>
        </form>


    </div>
</div>
</div>

<footer class="container-fluid text-center">
    <p>@springrain</p>
</footer>

</body>
</html>





