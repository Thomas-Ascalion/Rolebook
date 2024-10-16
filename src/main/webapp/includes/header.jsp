<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/styleheader.css">
</head>
<body>
    <header role="banner">
        <span id="frishaut"><img src="./assets/frisebas.png" alt=""></span>
        <div class="logo-container">
            <img class="logo" src="./assets/logo.png" alt="Logo d'un dés à 20 faces du site Lorebook">
        </div>
        <nav class="nav-container" role="navigation" aria-label="Navigation principale">
            <ul>
                <li><a href="#accueil">Accueil</a></li>
                <li class="dropdown">
                    <a href="#creer-fiche" class="dropdown-toggle">Créer une fiche</a>
                    <ul class="dropdown-menu">
                        <li><a href="login.jsp">Se connecter</a></li>
                        <li><a href="#se-deconnecter">Se déconnecter</a></li>
                        <li><a href="#s-inscrire">S'inscrire</a></li>
                    </ul>
                </li>
                <li><a href="#mon-compte">Mon compte</a></li>
            </ul>
        </nav>
        <div class="friseheadbas"><img src="./assets/frisefine.png" alt=""></div>
    </header>
</body>
</html>
