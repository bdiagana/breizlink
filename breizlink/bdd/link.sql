-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 26 juil. 2018 à 14:47
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `link`
--

-- --------------------------------------------------------

--
-- Structure de la table `password`
--

DROP TABLE IF EXISTS `password`;
CREATE TABLE IF NOT EXISTS `password` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `url`
--

DROP TABLE IF EXISTS `url`;
CREATE TABLE IF NOT EXISTS `url` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_creation` text NOT NULL,
  `urlsimple` text NOT NULL,
  `urlraccourci` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `url`
--

INSERT INTO `url` (`id`, `date_creation`, `urlsimple`, `urlraccourci`) VALUES
(4, '26-07-2018', 'https://openclassrooms.com/forum/sujet/verifier-si-checkbox-coche-afficher-cacher-element', 'X7f3Q'),
(3, '26-07-2018', 'https://stackoverflow.com/questions/9639003/update-statement-in-java', 'w1Zdw'),
(5, '26-07-2018', 'https://stackoverflow.com/questions/9639003/update-statement-in-java', 'Eekyl'),
(6, '26-07-2018', 'https://perso.univ-rennes1.fr/virginie.sans/j2ee/', 'vjDjw'),
(7, '26-07-2018', 'https://perso.univ-rennes1.fr/virginie.sans/j2ee/', 'HJ6sU');

-- --------------------------------------------------------

--
-- Structure de la table `urlcomplexe`
--

DROP TABLE IF EXISTS `urlcomplexe`;
CREATE TABLE IF NOT EXISTS `urlcomplexe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_creation` text NOT NULL,
  `urlsimple` text NOT NULL,
  `urlraccourci` text NOT NULL,
  `captcha` varchar(20) NOT NULL,
  `date_debut` text NOT NULL,
  `date_fin` text NOT NULL,
  `nbrClick` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `urlpassword`
--

DROP TABLE IF EXISTS `urlpassword`;
CREATE TABLE IF NOT EXISTS `urlpassword` (
  `idUrl` int(11) NOT NULL,
  `idPassword` int(11) NOT NULL,
  PRIMARY KEY (`idUrl`,`idPassword`),
  UNIQUE KEY `idUrl` (`idUrl`,`idPassword`),
  KEY `idPassword` (`idPassword`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(20) NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  `statut` text NOT NULL,
  `confirm` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `login`, `email`, `password`, `statut`, `confirm`) VALUES
(6, 'Bayahya', 'yahyacustomer@gmail.com', '1001services', 'Entreprise', 1),
(4, 'Yahya', 'yahyacustomer@gmail.com', '123Soleil', 'Aassociation', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
