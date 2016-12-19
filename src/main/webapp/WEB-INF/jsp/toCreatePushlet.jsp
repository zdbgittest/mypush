<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Pragma" content="no-cache" />
		<script type="text/javascript" src="../js/ajax-pushlet-client.js"></script>
		<script type="text/javascript" src="../js/jquery-3.1.1.js"></script>		
		<script type="text/javascript">
			PL._init(); 
			PL.joinListen('/cuige/eeeeeeeee');
			function onData(event) { 
				
				var html = "<p>"+event.get("mess")+"</p>";
	        	$("#divId").append(html);
			}
		</script>
	</head>
	<body>
		<center>
		<h1>
			my first pushlet!
		</h1>
		</center>
		<div id="divId"></div>
	</body>
</html>


