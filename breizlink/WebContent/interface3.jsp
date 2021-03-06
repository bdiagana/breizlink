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
		<input type="submit" class="btn btn-primary"  name="btn-compte" value="Création d'un compte"/>
		<input type="text"   name="id" placeholder="identifiant" />
		<input type="password"  name="mdp" placeholder="mot de passe" />
		<input type="submit" class="btn btn-success"  name="connexion" value="Connexion"/>
		</form>
		 <br>
	</div>
	<div class="container">
	<div class="form-group">
		<form action="?action=raccourcir" method="post">
		<input type="text" name="urlSimple" class="form-control"  value="${sessionScope.urlS}"/>
		<input value="Raccourcir" class="btn btn-success" type="submit">
		</form>
        <input type="checkbox" id="securise"  name="securise" onclick="validate()" value="coche"/>
        <label for="coche">Sécurisée avec un mot de passe</label><br>
		  <div id="passwd" style="display:none;">
 			<input type="password"  name="urlMdp" placeholder="mot de passe" />
 		 </div>
        <input type="text" class="form-control" name="urlR"  value="http://localhost:8080/breizlink/Controller?link=${sessionScope.url}"/>
        
        <br>
        <a> Créer un compte pour voir nos autres options possibles </a>
        <br>
		<a> Devenir partenaires -  CGV - Mentions légales </a>
    </div>
    </div>
</body>
        <script type="text/javascript">
function validate(){
    if (securise.checked == 1){
    	document.getElementById("passwd").style.display = "block";
    }else{
    	document.getElementById("passwd").style.display = "none";
    }
}
</script>
</html>