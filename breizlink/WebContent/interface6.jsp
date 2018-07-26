<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Breizlink</title>
</head>
<body>
	<div>
		<img src="images/pub.jpg" width="144" height="142">
		<img src="images/url-small.jpg" width="144" height="142">
	</div>	
	<div>
	 	<br>
	 	<form role="form" action="${pageContext.request.contextPath}/Controller" method="post">
		<button type="submit" class="btn btn-primary" name="btn-accueil">Accueil</button>
		<button type="submit" class="btn btn-primary"  name="btn-pres">Présentation</button>
		<button type="submit" class="btn btn-primary"  name="btn-compte">Création d'un compte</button>
		<button type="submit" class="btn btn-primary" name="raccourcir">Raccourcir</button>
      	<button type="submit" class="btn btn-primary" name="moncompte">Mon compte</button>
		<button type="submit" class="btn btn-primary" name="deconnexion">Deconnexion</button>
		</form>
		<br>
		
		
	</div>
		<div class="container">
	<div class="form-group">
      <br>

		<p>
		Bonjour ${sessionScope.id},<br>
		vous pouvez désormais accéder à toutes nos options de création d’URL raccourcies <br>
		Avec mot de passe<br>
		Avec mot de passe différents<br>
		A durée limitée<br>
		A durée périodique<br>
		Création par lots<br>
		Visualisation des statistiques
		
		</p>
		<br>
        <br>
		<a> Devenir partenaires -  CGV - Mentions légales </a>
    </div>
    </div>
</body>
</html>