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
		<img src="file:///C:/Users/DSBQ5660/eclipse-workspace/url/WebContent/images/pub.jpg" width="144" height="142">
		<img src="file:///C:/Users/DSBQ5660/eclipse-workspace/url/WebContent/images/url-small.jpg" width="144" height="142">
	</div>	
	<div>
	 	<br>
		 <form action="${pageContext.request.contextPath}/Controller" method="post">
		<input type="submit" name="btn-accueil" value="Accueil"/>
		<input type="submit" name="btn-pres" value="Présentation" />
		<input type="submit" name="btn-compte" value="Création d'un compte"/>
		<input type="text" name="btn-id" placeholder="identifiant" />
		<input type="password" name="mdp" placeholder="mot de passe" />
		<input type="submit" name="connexion" value="Connexion"/>
		</form>
		 <br>
	</div>
	<div>
        <input type="checkbox" name="securise"
               value="coche" checked />
        <label for="coche">Sécurisée avec un mot de passe</label>
        <input type="text" name="mdpsecurise" />
        <br>
        <a> Créer un compte pour voir nos autres options possibles </a>
        <br>
		<a> Devenir partenaires -  CGV - Mentions légales </a>
    </div>
</body>
</html>