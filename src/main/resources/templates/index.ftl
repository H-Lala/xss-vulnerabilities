<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Index</title>
</head>
<body>
<form method="post">
    <p>Please,write your name</p>
    <br>
    <p>Your name is</p>
    <br>
    <input type="text" name="name">
    <br>
    <p>Message</p>
    <input type="text" name="text">
    <br>
    <input type="submit" value="Submit">
   

</form>
 <h1>
    Hi, ${name}, you successfully logged in
</h1>
<h1>
    Message is  ${text}
</h1>

</body>
</html>