<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.rolebook.model.User" %>  <!-- Import nécessaire pour accéder à la classe User -->
<%@ include file="/includes/header.jsp" %>

<%
    // Vérifie si la variable session a déjà été déclarée ailleurs
    // Si elle l'a été, ne la redéclare pas ici.
    
    User currentUser = null;

    if (session != null) {
        // Récupère l'utilisateur depuis la session
        currentUser = (User) session.getAttribute("currentUser");
    }

    if (currentUser == null) {
        // Redirection vers la page de connexion si l'utilisateur n'est pas connecté
        response.sendRedirect("login.jsp");
        return; // Empêche le reste de la page de s'exécuter après la redirection
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Espace personnel</title>
</head>
<body>
    <h1>Bienvenue, <%= currentUser.getName() %> !</h1>  <!-- Affiche le nom de l'utilisateur -->
    <p>Votre email: <%= currentUser.getEmail() %></p> <!-- Par exemple, afficher aussi l'email -->
</body>
</html>

<%@ include file="/includes/footer.jsp" %>
