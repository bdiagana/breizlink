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
		<input type="submit" class="btn btn-primary" name="btn-accueil" value="Accueil"/>
		<input type="submit" class="btn btn-primary"  name="btn-pres" value="Présentation" />
		<input type="submit" class="btn btn-primary""  name="btn-compte" value="Création d'un compte"/>
		<input type="text"   name="btn-id" placeholder="identifiant" />
		<input type="password"  name="mdp" placeholder="mot de passe" />
		<input type="submit" class="btn btn-success"  name="connexion" value="Connexion"/>
		</form>
		<br>
		
	</div>
		<div class="container">
	<div class=”form-group”>
      	
		<br>
		<form action="${pageContext.request.contextPath}/Controller?action=createUser" method="post">
		<input type="text" class="form-control" name="login"  placeholder="Login"/> <br>
		<input type="text" class="form-control" name="email"  placeholder="Email"/> <br>
		<input type="password" class="form-control"  name="mdp"  placeholder="Mot de passe"/> <br>
 <label for="exampleFormControlSelect1">Vous êtes ?</label>
    <select name="options" class="form-control" id="exampleFormControlSelect1">
      <option>Particulier</option>
      <option>Entreprise</option>
      <option>Aassociation</option>
    </select><br>
		<input type="submit" class="btn btn-success" value="Creer un compte"/>
		</form>
        <br>
        <br>
		<a> Devenir partenaires -  CGV - Mentions légales </a>
    </div>
    </div>
</body>
</html>