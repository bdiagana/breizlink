<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<img src="\images\pub.jpg" width="144" height="142">
		<img src="\images\url-small.jpg" width="144" height="142">
	</div>	
	<div>
	 	<br>
		<button type="button" name="accueil">Accueil</button>
		<button type="button" name="pres">Présentation</button>
		<button type="button" name="compte">Création d'un compte</button>
		<button type="button" name="raccourcir">Raccourcir</button>
      	<button type="button" name="moncompte">Mon compte</button>
		<button type="button" name="connexion">Connexion</button>
		 <br>
	</div>
	<div>
		<form action="?action=raccourcir" method="post">
		<input type="text" name="urlSimple"  placeholder="Url à raccourcir"/>
		<input value="Raccoucirr" type="submit">
		</form>
      	<input type="checkbox" name="captcha" value="coche" checked />
        <label for="coche">Captcha</label> <br>
        <input type="checkbox" name="securise" value="coche" checked />
        <label for="coche">Sécurisée avec un mot de passe</label>
        <input type="text" name="mdpsecurise" /><br>
        <input type="checkbox" name="date" value="coche" checked /> 
        <label for="coche">Valable du </label> 
      	<input type="text" name="debut" />
      	<label for="coche"> au </label>
      	<input type="text" name="fin" /> <br>
    	<input type="checkbox" name="maxclic" value="coche" checked /> 
        <label for="coche">Max </label> 
      	<input type="text" name="nbrmaxclic" />
      	<label for="coche"> Clics </label> <br>
      	<input type="checkbox" name="datemax" value="coche" checked /> 
        <label for="coche">Valable jusqu'au </label> 
      	<input type="text" name="nbrdatemax" />
        <br>

        <br>
		<a> Devenir partenaires -  CGV - Mentions légales </a>
    </div>
</body>
</html>