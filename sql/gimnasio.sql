-- phpMyAdmin SQL Dump
-- version 4.6.6deb5ubuntu0.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 19-05-2021 a las 00:41:23
-- Versión del servidor: 5.7.34-0ubuntu0.18.04.1
-- Versión de PHP: 7.2.24-0ubuntu0.18.04.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gimnasio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistencia`
--

CREATE TABLE `asistencia` (
  `idasistencia` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `idcliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `asistencia`
--

INSERT INTO `asistencia` (`idasistencia`, `fecha`, `idcliente`) VALUES
(1, '2020-05-13', 210035),
(2, '2020-05-13', 512198),
(3, '2020-05-15', 210035),
(4, '2021-05-07', 47507),
(5, '2021-05-12', 210035);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE latin1_spanish_ci DEFAULT NULL,
  `telefono` varchar(15) COLLATE latin1_spanish_ci DEFAULT NULL,
  `direccion` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idcliente`, `nombre`, `telefono`, `direccion`) VALUES
(18429, 'Jorge gonzales', '5810664120', 'Bosques de africa 87'),
(19534, 'Ivonne Hernandez', '5526508715', 'San francisco 19'),
(39575, 'karla Panini', '5588997744', 'Panteones 16'),
(47507, 'Olga Acuña', '5558100497', 'Ojo de agua Numero 3'),
(78558, 'Andres andrade', '5511983423', 'Av siempre viva 22'),
(140061, 'Adrian rodriguez', '5545984102', 'Av principal 47B'),
(145034, 'Consuelo Rio', '5810887799', 'Buenavista 17'),
(155607, 'Ricardo rosales', '5489647811', 'Siempre viva 17'),
(167744, 'Angelico Cruz', '1246004597', 'Cerrada buenavista 3'),
(182516, 'Adriana ramirez', '5524984475', 'Cerrada azoyapan 15'),
(183957, 'Jazmin Acuña', '5810860497', 'Prol Ojo de agua 23'),
(210035, 'Miguel Angel', '5558108639', 'Segunda cerrada azoyapan 3'),
(251369, 'Javier perez', '5810898910', 'La escondida 15'),
(279504, 'Alma urbina', '5511024924', 'Xochiltecac 47'),
(314454, 'Abraham Ramirez', '5558109874', 'Jose luis cuevas 17'),
(335893, 'Fernanda Olvera', '1549034568', 'Tula de chiapas 11'),
(443281, 'Carmen cruz', '1245789865', 'Axomiatla 20'),
(512198, 'Floriberta Rivera', '5588779944', 'Azoyapan 3'),
(517087, 'Everardo Gonzales', '1122334455', 'Prada 19'),
(561799, 'Enrique graue', '5514897821', 'Av universidad 11'),
(588972, 'Daniel Gomez', '5524861810', 'Acueducto 17'),
(614856, 'Angel Ramirez', '5525759845', 'Azoyapan 3'),
(679121, 'Mariana Verduzco ', '1122334455', 'FES ARAGON UNAM'),
(737383, 'Marco garcia', '5410998484', 'Olivaritos 17'),
(798618, 'Arturo rivera', '5812003310', 'Rio de los remedios 47'),
(879635, 'Vanessa Vilchis', '5526504598', 'Cda San diego 45'),
(910480, 'Ricardo Rivera', '5558108585', 'Jose Luis Cuevas 17'),
(947660, 'Octavio miranda', '5522449101', 'Jalalpa central 9');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `idequipo` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`idequipo`, `nombre`) VALUES
(1, 'Bicicleta'),
(2, 'Banco press'),
(3, 'Prensa de piernas'),
(4, 'Maquina de dorsales'),
(5, 'Bicicletas estaticas'),
(6, 'Ciclo indoor'),
(7, 'Elipticas'),
(8, 'Cintas de correr'),
(9, 'Maquina de remos'),
(10, 'Paralelas'),
(11, 'Peck deck'),
(12, 'Dorsalera'),
(13, 'Femorales'),
(14, 'Poleas cruzadas'),
(15, 'Abductores'),
(16, 'Barra de pesas'),
(17, 'Rollers'),
(18, 'Maquina de brazos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimiento`
--

CREATE TABLE `mantenimiento` (
  `idmant` int(11) NOT NULL,
  `idequipo` int(11) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `membresia`
--

CREATE TABLE `membresia` (
  `idmembresia` int(11) NOT NULL,
  `fecha_inicial` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `idcliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `membresia`
--

INSERT INTO `membresia` (`idmembresia`, `fecha_inicial`, `fecha_fin`, `idcliente`) VALUES
(13, '2021-05-07', '2021-06-07', 210035),
(14, '2020-05-13', '2020-06-13', 512198),
(15, '2020-05-13', '2020-06-13', 155607),
(16, '2020-05-13', '2020-06-13', 167744),
(18, '2020-05-13', '2020-05-20', 182516),
(20, '2020-05-13', '2020-06-13', 18429),
(21, '2020-05-13', '2020-06-13', 443281),
(22, '2020-05-13', '2020-05-20', 798618),
(24, '2020-05-13', '2020-06-13', 947660),
(25, '2020-05-13', '2020-06-13', 140061),
(26, '2020-05-13', '2020-06-13', 279504),
(27, '2021-05-12', '2021-06-12', 561799),
(28, '2020-05-13', '2020-06-13', 737383),
(29, '2020-05-13', '2020-06-13', 78558),
(30, '2020-05-13', '2020-06-13', 251369),
(31, '2020-05-15', '2020-05-22', 679121),
(32, '2021-05-07', '2021-06-07', 47507),
(33, '2021-05-07', '2021-05-14', 19534),
(34, '2021-05-12', '2021-05-19', 39575),
(35, '2021-05-12', '2021-05-13', 517087),
(41, '2021-05-12', '2021-05-19', 614856),
(42, '2021-05-12', '2021-05-19', 183957),
(45, '2021-05-12', '2021-05-19', 145034),
(46, '2021-05-12', '2021-06-12', 910480),
(47, '2021-05-12', '2021-06-12', 879635),
(48, '2021-05-12', '2021-05-19', 314454),
(49, '2021-05-12', '2021-05-19', 588972),
(50, '2021-05-12', '2021-05-13', 335893);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `categoria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idproducto`, `nombre`, `cantidad`, `precio`, `categoria`) VALUES
(1, 'Muscle Tech', 15, 1200, 2),
(2, 'Standar WHEY', 10, 1100, 2),
(3, '100 WHET PROTEINA', 4, 1400, 2),
(4, 'CELL TECH', 7, 900, 2),
(5, 'SERIOUS MASS', 7, 1200, 2),
(6, 'NITRO TECH', 7, 1400, 2),
(7, 'Bicicleta estatica', 3, 4000, 1),
(8, 'Maquina de step', 2, 3400, 1),
(9, 'Comba', 17, 400, 1),
(10, 'Bandas elasticas', 20, 350, 1),
(11, 'Mancuernas 1KG', 28, 300, 1),
(12, 'Pesa rusa', 11, 900, 1),
(13, 'Barra de dominadas', 5, 2880, 1),
(14, 'Rueda', 8, 600, 1),
(15, 'Pelota de pilates', 18, 1200, 1),
(16, 'BEST AMINOS', 14, 650, 3),
(17, 'MP AMINO1', 8, 800, 3),
(18, 'AMINO ENERGY', 9, 1000, 3),
(19, 'ALPHA AMIN', 15, 800, 3),
(20, 'AMINO FSS', 4, 500, 1),
(21, 'RECOVERY AMINO', 9, 900, 3),
(22, 'THERMA KOR', 4, 900, 4),
(23, 'ROXY LEAN', 17, 400, 4),
(24, 'THERMO EXT BLACK', 2, 1200, 4),
(25, 'ALPHACLEN', 17, 550, 4),
(26, 'HYDROXY TERM', 8, 1500, 4),
(27, 'PROTIN WHEY PLUS', 10, 1400, 1),
(28, 'Escaladora', 3, 8000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idventa` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `idproducto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idventa`, `fecha`, `idproducto`) VALUES
(1, '2020-05-13', 1),
(2, '2020-05-15', 27),
(3, '2021-05-08', 3),
(4, '2021-05-10', 28),
(5, '2021-05-12', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asistencia`
--
ALTER TABLE `asistencia`
  ADD PRIMARY KEY (`idasistencia`),
  ADD KEY `fk_asistencia_cliente1_idx` (`idcliente`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`idequipo`);

--
-- Indices de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD PRIMARY KEY (`idmant`),
  ADD KEY `fk_mantenimiento_1_idx` (`idequipo`);

--
-- Indices de la tabla `membresia`
--
ALTER TABLE `membresia`
  ADD PRIMARY KEY (`idmembresia`),
  ADD UNIQUE KEY `idcliente_UNIQUE` (`idcliente`),
  ADD KEY `fk_membresia_cliente_idx` (`idcliente`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idproducto`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idventa`),
  ADD KEY `fk_venta_producto` (`idproducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asistencia`
--
ALTER TABLE `asistencia`
  MODIFY `idasistencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=947661;
--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `idequipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  MODIFY `idmant` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `membresia`
--
ALTER TABLE `membresia`
  MODIFY `idmembresia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idproducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;
--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idventa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asistencia`
--
ALTER TABLE `asistencia`
  ADD CONSTRAINT `fk_asistencia_cliente1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD CONSTRAINT `fk_mantenimiento_1` FOREIGN KEY (`idequipo`) REFERENCES `equipo` (`idequipo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `membresia`
--
ALTER TABLE `membresia`
  ADD CONSTRAINT `fk_membresia_cliente` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_venta_producto` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`idproducto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
