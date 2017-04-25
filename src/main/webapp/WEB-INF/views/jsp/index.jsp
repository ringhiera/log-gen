<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Log Generator with minimal API for configuration</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' /> 
</head>
<body>
	<h2>LogGen Api: generate a few logs at random</h2>
	<p>Clearly there is no instruction as we want you to have some fun. At least for now :)</p>
	<h3>Instructions:</h3>
	<p>The API exposes 2 services avilable at <a href="/loggen/config">/loggen/config</a></p>
	<p>GET: Returns the current configuration</p>
	<p>POST updates the configuration and (re)starts the timer e.g. '{"logGens":[{"logbody":"Hello World!","severity":"INFO","delay":0,"period":3000},{"logbody":"Waning World!","severity":"WARN","delay":0,"period":1000},{"logbody":"Error World!\\n\\tMultiline ..","severity":"ERROR","delay":0,"period":12345}]}'</p>
	<p></p>
	<p>A Swagger UI is avaliable under <a href="/loggen/swagger-ui.html">/loggen/swagger-ui.html</a></p>
	<p></p>
	<p></p>
	
	<h3>Example:</h3>
	<p>curl -i \ <br/>
    -H "Accept: application/json" \ <br/>
	 -H "Content-Type: application/json" \ <br/>
    -H "X-HTTP-Method-Override: PUT" \ <br/>
    -X POST -d '{"logGens":[{"logbody":"Hello World!","severity":"INFO","delay":0,"period":3000},{"logbody":"Waning World!","severity":"WARN","delay":0,"period":1000},{"logbody":"Error World!\n\tMultiline ..","severity":"ERROR","delay":0,"period":12345}]}' \ <br />
    http://localhost:8080/loggen/config<br/>
    </p>
	<p></p>
	<p></p>
	<p></p>
	<h3>In Progress:</h3>
	<p>DELETE: Stops the timer and no logs are generated</p>
	<p></p>
	<p></p>
</body>
</html>