-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-11-2015 a las 16:21:27
-- Versión del servidor: 5.6.16
-- Versión de PHP: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `salon de eventos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservacion`
--

CREATE TABLE IF NOT EXISTS `reservacion` (
  `No` bigint(30) NOT NULL AUTO_INCREMENT,
  `Nombre` char(30) NOT NULL,
  `Apellido_Paterno` char(30) NOT NULL,
  `Apellido_Materno` char(30) NOT NULL,
  `Telefono` bigint(30) NOT NULL,
  `Correo_Electronico` char(30) NOT NULL,
  `Tipo_Evento` char(30) NOT NULL,
  `Fecha_Reservacion` char(30) NOT NULL,
  `Anticipo` bigint(30) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `reservacion`
--

INSERT INTO `reservacion` (`No`, `Nombre`, `Apellido_Paterno`, `Apellido_Materno`, `Telefono`, `Correo_Electronico`, `Tipo_Evento`, `Fecha_Reservacion`, `Anticipo`) VALUES
(1, 'YTUFGDTJHY', 'YUTJHGYTUJ', 'UYTUJHYJT', 657676, 'FGHHG', 'XV AGHÑOS', '1 JHGENERO 2015', 76786),
(2, 'JOSE', 'DURON', 'ARAUJO', 4491183512, 'CJ_JOSE07@HOTMAIL.COM', 'BODA', '4  ABRIL 2018', 2000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
