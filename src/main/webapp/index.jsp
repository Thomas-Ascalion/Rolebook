<%@page import="com.rolebook.connection.DbCon"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
<!--     <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
<!--     <meta name="description" content="Lorebook - Créez, ajustez et sauvegardez vos fiches de personnages de jeux de rôle comme Donjons et Dragons"> -->
    <title>Lorebook - Gestion de fiches de personnages</title>
    <!-- Lien vers une feuille de style CSS -->
    <link rel="stylesheet" href="./css/styleindex.css">
    <link rel="stylesheet" href="var.css">
    
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Maitree:wght@200;300;400;500;600;700&display=swap" rel="stylesheet">
</head>

<%@ include file="/includes/header.jsp" %>

<body>

<% out.print(DbCon.getConnection()); %>
    <!-- Section principale avec le message d'accueil -->
    <main role="main">
<section class="banner">
<div class="banner-container">
    <div class="banner-content">
        <h1 class="banner-title">
            Élevez vos campagnes de Donjons et Dragons : <br>
            créez, ajustez et sauvegardez vos fiches de personnage en un clin d’œil !
        </h1>
    </div>
</div>
    <div>
    <div>
    <img alt="" src="./assets/plume.png" width="200" height="200">
    </div>
    <div>
    <p>Vous en avez assez de jongler avec vos fiches de personnage version papier, de vous battre avec des gommes qui laissent des traces, de perdre des informations cruciales et de devoir sans cesse recréer vos fiches froissées et tachées ? Fini les ratures et les fiches abîmées qui vous font perdre du temps et de l'énergie. Imaginez un monde où tout est propre, ordonné et facilement accessible.</p>
    <p>Avec notre service, vous pouvez créer, modifier et sauvegarder vos fiches de personnage en quelques clics. Plus besoin de craindre d'oublier vos fiches ou de les voir se dégrader au fil des sessions de jeu. Vous avez la possibilité de gérer jusqu'à 3 fiches gratuitement et, si vous en voulez plus, jusqu'à 10 fiches avec notre option payante.</p>
    <p>Laissez derrière vous les frustrations du papier et rejoignez une communauté de joueurs qui apprécient la simplicité et l'efficacité. Vos aventures méritent ce qu'il y a de mieux, et nous sommes là pour vous offrir cette expérience optimale !</p>
    </div>
    </div>
</section>


        <!-- Section avec les caractéristiques principales -->
        <section id="features" aria-labelledby="titre-features">
            <h2 id="titre-features">Fonctionnalités principales</h2>
            <article aria-labelledby="protection-feature">
            <img alt="" src="./assets/patterncard.png">
            <div>
                <h3 id="protection-feature">Protection</h3>
                <p>Vos fiches sont sauvegardées en toute sécurité.</p>
            </div>
            <img alt="" src="./assets/securite.png" width="200" height="200">
            </article>
            <article aria-labelledby="formulaire-feature">
            <img alt="" src="./assets/patterncard.png">
            <div>
                <h3 id="formulaire-feature">Formulaire</h3>
                <p>Créez et modifiez facilement vos fiches de personnage.</p>
                </div>
            <img alt="" src="./assets/treasure.png" width="200" height="200">
            </article>
            <article aria-labelledby="rapide-feature">
            <img alt="" src="./assets/patterncard.png">
            <div>
                <h3 id="rapide-feature">Rapide</h3>
                <p>Accédez à vos fiches en quelques secondes.</p>
                </div>
            <img alt="" src="./assets/time.png" width="200" height="200">
            </article>
        </section>

        <!-- Section pour les types de comptes -->
        <section id="comptes" aria-labelledby="titre-comptes">
            <h2 id="titre-comptes">Choisissez votre compte</h2>
            <div class="compte compte-gratuit">
                <h3>Compte gratuit</h3>
                <ul>
                    <li>Accès à la création de fiches</li>
                    <li>Stockage limité à 5 fiches</li>
                </ul>
                <a class="" href="login.jsp">Commencer gratuitement</a>
            </div>
            <div class="compte compte-membre">
                <h3>Compte membre</h3>
                <ul>
                    <li>Stockage illimité</li>
                    <li>Fonctionnalités avancées</li>
                </ul>
                <a class="" href="adressePaiement.jsp">S'abonner</a>
            </div>
        </section>

        <!-- Section des témoignages -->
        <section id="temoignages" aria-labelledby="titre-temoignages">
            <h2 id="titre-temoignages">D'autres rôlistes parlent de nous !</h2>
            <article aria-labelledby="temoignage-1">
                <h3 id="temoignage-1">Témoignage de Corentin</h3>
                <blockquote>
                    <p>"Lorebook a changé ma manière de jouer !"</p>
                </blockquote>
            </article>
            <!-- Répéter pour les autres témoignages -->
        </section>
    </main>

    <!-- Pied de page -->
    
    <%@ include file="/includes/footer.jsp" %>
</body>
</html>
