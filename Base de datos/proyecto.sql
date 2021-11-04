-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-10-2021 a las 17:00:09
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `ID_COMPRA` int(12) NOT NULL,
  `ID_PRODUCTO` int(12) DEFAULT NULL,
  `ID_PROVEEDOR` int(12) DEFAULT NULL,
  `CANTIDAD_COMPRA` int(12) NOT NULL,
  `DIA_REABASTECIOMIENTO` varchar(25) NOT NULL,
  `ESTADO_DE_LA_COMPRA` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`ID_COMPRA`, `ID_PRODUCTO`, `ID_PROVEEDOR`, `CANTIDAD_COMPRA`, `DIA_REABASTECIOMIENTO`, `ESTADO_DE_LA_COMPRA`) VALUES
(3001, 1001, 2001, 3, '26/10/2021', 'en salida');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `ID_PRODUCTO` int(12) NOT NULL,
  `NOMBRE_PRODUCTO` varchar(25) NOT NULL,
  `REFERENCIAS_DEL_PRODUCTO` varchar(25) NOT NULL,
  `STOCK_DEL_PRODUCTO` int(12) NOT NULL,
  `CANTIDAD_PRODUCTO` int(12) NOT NULL,
  `TOTAL_PRECIO_PRODUCTO` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`ID_PRODUCTO`, `NOMBRE_PRODUCTO`, `REFERENCIAS_DEL_PRODUCTO`, `STOCK_DEL_PRODUCTO`, `CANTIDAD_PRODUCTO`, `TOTAL_PRECIO_PRODUCTO`) VALUES
(1001, 'monitor', '1596', 600000, 4, 2400000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `ID_PROVEEDOR` int(12) NOT NULL,
  `NOMBRE_PROVEEDOR` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`ID_PROVEEDOR`, `NOMBRE_PROVEEDOR`) VALUES
(2001, 'ASUS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID_USUARIO` int(12) NOT NULL,
  `NOMBRE_USUARIO` varchar(25) NOT NULL,
  `TELEFONO` int(12) NOT NULL,
  `DIRECCION` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID_USUARIO`, `NOMBRE_USUARIO`, `TELEFONO`, `DIRECCION`) VALUES
(5001, 'bran', 301, 'carr');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `ID_VENTA` int(12) NOT NULL,
  `ID_USUARIO` int(12) DEFAULT NULL,
  `ID_PRODUCTO` int(12) DEFAULT NULL,
  `STOCK_DE_VENTA` int(12) NOT NULL,
  `CANTIDAD` int(12) NOT NULL,
  `ESTADO_DEL_PRODUCTO_DE_VENTA` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`ID_VENTA`, `ID_USUARIO`, `ID_PRODUCTO`, `STOCK_DE_VENTA`, `CANTIDAD`, `ESTADO_DEL_PRODUCTO_DE_VENTA`) VALUES
(4001, 5001, 1001, 700000, 2, 'en proceso');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`ID_COMPRA`),
  ADD KEY `producto_ibfk_1` (`ID_PRODUCTO`),
  ADD KEY `proveedor_ibfk_2` (`ID_PROVEEDOR`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`ID_PRODUCTO`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`ID_PROVEEDOR`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID_USUARIO`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`ID_VENTA`),
  ADD KEY `productos_ibfk_1` (`ID_PRODUCTO`),
  ADD KEY `usuario_ibfk_2` (`ID_USUARIO`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`ID_PRODUCTO`) REFERENCES `producto` (`ID_PRODUCTO`),
  ADD CONSTRAINT `proveedor_ibfk_2` FOREIGN KEY (`ID_PROVEEDOR`) REFERENCES `proveedor` (`ID_PROVEEDOR`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`ID_PRODUCTO`) REFERENCES `producto` (`ID_PRODUCTO`),
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`ID_USUARIO`) REFERENCES `usuario` (`ID_USUARIO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
