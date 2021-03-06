<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css"rel="stylesheet"  type="text/css" />
        
  <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
  
  <style media="screen" type="text/css">
    body { background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABoAAAAaCAYAAACpSkzOAAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAALEgAACxIB0t1+/AAAABZ0RVh0Q3JlYXRpb24gVGltZQAxMC8yOS8xMiKqq3kAAAAcdEVYdFNvZnR3YXJlAEFkb2JlIEZpcmV3b3JrcyBDUzVxteM2AAABHklEQVRIib2Vyw6EIAxFW5idr///Qx9sfG3pLEyJ3tAwi5EmBqRo7vHawiEEERHS6x7MTMxMVv6+z3tPMUYSkfTM/R0fEaG2bbMv+Gc4nZzn+dN4HAcREa3r+hi3bcuu68jLskhVIlW073tWaYlQ9+F9IpqmSfq+fwskhdO/AwmUTJXrOuaRQNeRkOd5lq7rXmS5InmERKoER/QMvUAPlZDHcZRhGN4CSeGY+aHMqgcks5RrHv/eeh455x5KrMq2yHQdibDO6ncG/KZWL7M8xDyS1/MIO0NJqdULLS81X6/X6aR0nqBSJcPeZnlZrzN477NKURn2Nus8sjzmEII0TfMiyxUuxphVWjpJkbx0btUnshRihVv70Bv8ItXq6Asoi/ZiCbU6YgAAAABJRU5ErkJggg==);}
    .error-template {padding: 40px 15px;text-align: center;}
    .error-actions {margin-top:15px;margin-bottom:15px;}
    .error-actions .btn { margin-right:10px; }
  </style>

</head>

<body>    
    <div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="error-template">
                <h1>
                    Oops!</h1>
                <h2>
                    Something went wrong...</h2>
                <div class="error-details">
                    Sorry, an error on our side has occured!
                </div>
                <div class="error-actions">
                    <a href="/chessapp" class="btn btn-primary btn-lg">
                      <i class="fa fa-home fa-lg"></i> Take Me Home 
                    </a>
                    <a href="/chessapp/contacts" class="btn btn-default btn-lg">
                      <i class="fa fa-envelope fa-lg"></i> Contact Us 
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>