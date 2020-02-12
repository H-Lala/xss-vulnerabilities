<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="img/favicon.ico">

    <title>Sign in</title>

    <!--#include "css/bootstrap.min.css">-->
    <!-- #include "css/style.css">-->
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>

<body class="text-center">

<form class="form" action=${rout} method="post">
    <h1 class="h3 mb-3 font-weight-normal">${message}</h1>
    <#list fields as field>
        <label for=${field} class="sr-only">${field}</label>
        <input class="form-control" type="text" name=${field} placeholder=${field}>
        <br>
    </#list>
    <br>
    <input  class="submit" type="submit">

</form>

</body>
</html>