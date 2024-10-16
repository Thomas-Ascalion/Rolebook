<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<%@ include file="/includes/header.jsp" %>
<body>

<section class="container">
	<div class="form-container">
	<p class="title">Connexion</p>
	<form class="form" action="userlogin" method="post">
		<div class="input-group">
			<label for="email">Adresse mail</label>
			<input type="email" class="form-control" name="login-email" id="username" placeholder="Entrer votre Email" required>
		</div>
		<div class="input-group">
			<label for="password">Mot de passe</label>
			<input type="password" name="password" id="password" placeholder="*********" required>
			<div class="forgot">
				<a href="#">Mot de passe oublié ?</a>
			</div>
		</div>
		<button class="sign">Se connecter</button>
	</form>

	<p class="signup">Pas encore de compte?
		<a href="#" class="">S'inscrire</a>
	</p>
</div>
</section>


<%@ include file="/includes/footer.jsp" %>
</body>
</html>