-- Base de datos: `basereserva`
drop database if exists basereserva;
create database basereserva;
use  basereserva;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idpersona` int(11) NOT NULL,
  `cod_cliente` varchar(10) NOT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idpersona`, `cod_cliente`, `login`, `password`) VALUES
(10, '154', '', ''),
(11, '145', '', ''),
(16, '122', '', ''),
(20, '50', '', ''),
(21, '58', '', ''),
(27, '5', '', ''),
(28, '125', '', ''),
(29, '90', '', ''),
(30, '11', '', ''),
(31, '20', '', ''),
(32, '100', '', ''),
(39, '600', '', ''),
(40, '10', '', ''),
(41, '544', '', ''),
(45, '156', '', ''),
(87, '2', '', ''),
(92, '34', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consumo`
--

CREATE TABLE `consumo` (
  `idconsumo` int(11) NOT NULL,
  `idreserva` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` decimal(7,2) NOT NULL,
  `precio_venta` decimal(7,2) NOT NULL,
  `estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `consumo`
--

INSERT INTO `consumo` (`idconsumo`, `idreserva`, `idproducto`, `cantidad`, `precio_venta`, `estado`) VALUES
(1, 2, 2, '2.00', '500.00', 'Aceptado'),
(2, 2, 8, '1.00', '450.00', 'Aceptado'),
(3, 2, 7, '1.00', '1000.00', 'Aceptado'),
(4, 4, 6, '2.00', '250.00', 'Aceptado'),
(5, 4, 5, '1.00', '200.00', 'Aceptado'),
(6, 5, 7, '2.00', '1000.00', 'Aceptado'),
(7, 5, 2, '2.00', '500.00', 'Aceptado'),
(8, 6, 5, '1.00', '200.00', 'Aceptado'),
(9, 8, 5, '1.00', '200.00', 'Aceptado'),
(10, 9, 6, '1.00', '250.00', 'Aceptado'),
(11, 11, 4, '1.00', '500.00', 'Aceptado'),
(12, 1, 4, '12.00', '500.00', 'Aceptado'),
(13, 15, 8, '5.00', '450.00', 'Aceptado'),
(15, 16, 1, '5.00', '250.00', 'Aceptado'),
(16, 10, 8, '1.00', '450.00', 'Aceptado'),
(17, 15, 1, '2.00', '250.00', 'Aceptado'),
(18, 17, 1, '4.00', '250.00', 'Aceptado'),
(19, 18, 1, '3.00', '250.00', 'Aceptado'),
(20, 20, 5, '5.00', '200.00', 'Aceptado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `idpersona` int(11) NOT NULL,
  `sueldo` decimal(7,2) NOT NULL,
  `acceso` varchar(15) NOT NULL,
  `login` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL,
  `estado` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`idpersona`, `sueldo`, `acceso`, `login`, `password`, `estado`) VALUES
(54, '95000.00', 'Administrador', 'Fernan145', '156', 'A'),
(71, '65000.00', 'E Frigobar', 'efrigo1', '143', 'A'),
(72, '90000.00', 'Recepcionista', 'rep45', '1286', 'D'),
(74, '65000.00', 'E Frigobar', 'ana1', '245', 'D'),
(76, '70000.00', 'Recepcionista', 'rep100', '689', 'A'),
(80, '89000.00', 'Administrador', 'admin', 'admin', 'A'),
(86, '55000.00', 'Digitador', 'digitador', 'digitador1', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idhabitacion` int(11) NOT NULL,
  `numero` varchar(4) NOT NULL,
  `piso` varchar(2) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `caracteristicas` varchar(512) DEFAULT NULL,
  `precio_diario` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL,
  `tipo_habitacion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idhabitacion`, `numero`, `piso`, `descripcion`, `caracteristicas`, `precio_diario`, `estado`, `tipo_habitacion`) VALUES
(1, '1', '3', '2 personas', 'Escritorio, TV, A/C', '10000.00', 'Disponible', 'Standar'),
(2, '2', '5', 'habitación con sauna ', 'wifi', '5000.00', 'ocupado', 'full'),
(4, '15', '5', 'la habitación frente a la plaza', 'cama matrimonial, wifi', '3500.00', 'Mantenimiento', 'Standar'),
(5, '6', '2', 'Cama Queen size + 2 camas singles', 'escritorio, TV, A/C, \n2 baños completos..', '80000.00', 'Disponible', 'Full'),
(6, '8', '1', 'Habitación para 4 personas', '(Netflix), A/C,bañera con hidromasaje', '30000.00', 'Disponible', 'Intermedio'),
(8, '20', '3', '2 personas', 'wifi', '10000.00', 'Disponible', 'Standar'),
(10, '50', '4', '2 personas', 'baño incluido', '5000.00', 'Ocupado', 'Full');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `idpago` int(11) NOT NULL,
  `idreserva` int(11) NOT NULL,
  `tipo_comprobante` varchar(20) NOT NULL,
  `num_comprobante` varchar(20) NOT NULL,
  `iva` decimal(4,2) NOT NULL,
  `precio_total` decimal(7,2) NOT NULL,
  `fecha_emision` date NOT NULL,
  `fecha_pago` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pago`
--

INSERT INTO `pago` (`idpago`, `idreserva`, `tipo_comprobante`, `num_comprobante`, `iva`, `precio_total`, `fecha_emision`, `fecha_pago`) VALUES
(2, 10, 'Factura', '002-002', '0.21', '1000.00', '2022-11-05', '2022-11-05'),
(3, 13, 'Ticket', '001-002', '0.21', '1000.00', '2022-11-05', '2022-11-12'),
(4, 1, 'Factura', '001', '0.21', '1500.00', '2022-11-05', '2022-11-05'),
(5, 11, 'Ticket', '004-004', '0.21', '2000.00', '2022-11-05', '2022-11-05'),
(6, 2, 'Recibo', '005', '0.21', '52450.00', '2022-11-05', '2022-11-05'),
(7, 9, 'Ticket', '001-008', '0.21', '50250.00', '2022-11-05', '2022-11-05'),
(9, 16, 'Recibo', '001-008', '0.21', '1500.00', '2022-11-07', '2022-11-07'),
(10, 17, 'Ticket', '001', '0.21', '81000.00', '2022-11-22', '2022-11-22'),
(11, 20, 'Ticket', '321', '0.21', '11000.00', '2022-11-22', '2022-11-23');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idpersona` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `tipo_documento` varchar(15) NOT NULL,
  `numero_documento` varchar(8) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(45) NOT NULL,
  `email` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idpersona`, `nombre`, `apellido`, `tipo_documento`, `numero_documento`, `direccion`, `telefono`, `email`) VALUES

(87, 'Nilson', 'Castellanos', 'Dni', '28461558', 'Alberdi 100', '1122334455', 'nilson@gmail.com');


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `unidad_medida` varchar(20) NOT NULL,
  `stock` int(45) NOT NULL,
  `precio_venta` decimal(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idproducto`, `nombre`, `descripcion`, `unidad_medida`, `stock`, `precio_venta`) VALUES
(1, 'Gaseosa Cola 500ml', 'Gaseosa Cola de diferentes marcas', 'UND', 16, '250.00'),
(2, 'Barrita de Chocolate', 'Chocolate en barra Toblerone\n con un sabor impresionante', 'UND', 50, '500.00'),
(4, 'jugo de naranja ', 'jugo de naranja en cartón', 'UND', 80, '500.00'),
(5, 'Agua Mineral', 'Agua de mesa', 'UND', 100, '200.00'),
(6, 'Confites', 'm&m', 'UND', 20, '250.00'),
(7, 'Cerveza', 'Heineken', 'UND', 20, '1000.00'),
(8, 'Lata de Naranja', 'Fanta', 'UND', 16, '500.00'),
(10, 'confites', 'otra marca', 'UND', 11, '50.00'),
(13, 'confites', 'mmmm', 'UND', 2, '100.00'),
(14, 'galleta', 'genial', 'UND', 100, '1000.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idreserva` int(11) NOT NULL,
  `idhabitacion` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `idempleado` int(11) NOT NULL,
  `tipo_reserva` varchar(20) NOT NULL,
  `fecha_reserva` date NOT NULL,
  `fecha_ingreso` date NOT NULL,
  `fecha_salida` date NOT NULL,
  `costo_alojamiento` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idreserva`, `idhabitacion`, `idcliente`, `idempleado`, `tipo_reserva`, `fecha_reserva`, `fecha_ingreso`, `fecha_salida`, `costo_alojamiento`, `estado`) VALUES
(1, 1, 31, 80, 'Alquilado', '2022-11-04', '2022-11-12', '2022-11-19', '1000.00', 'Pagada'),
(2, 6, 11, 80, 'Reserva', '2022-11-04', '2022-11-18', '2022-11-27', '50000.00', 'Pagada'),
(7, 6, 29, 80, 'Reserva', '2022-11-04', '2022-11-18', '2022-11-27', '1000.00', 'Reservado'),
(8, 6, 31, 80, 'Reserva', '2022-11-12', '2022-11-17', '2022-11-30', '1000.00', 'Reservado'),
(9, 6, 21, 80, 'Reserva', '2022-11-17', '2022-11-18', '2022-11-30', '50000.00', 'Pagada'),
(10, 1, 87, 80, 'Reserva', '2022-11-11', '2022-11-24', '2022-11-25', '1000.00', 'Pagada'),
(11, 6, 31, 80, 'Reserva', '2022-11-05', '2022-11-20', '2022-11-27', '1500.00', 'Pagada'),
(12, 6, 30, 80, 'Reserva', '2022-11-05', '2022-11-09', '2022-11-11', '1000.00', 'Pagado'),
(13, 6, 28, 80, 'Reserva', '2022-11-05', '2022-11-12', '2022-11-20', '1000.00', 'Pagada'),
(14, 1, 28, 80, 'Reserva', '2022-11-05', '2022-11-05', '2022-11-05', '1000.00', 'Reservado'),
(15, 1, 10, 80, 'Reserva', '2022-11-04', '2022-11-05', '2022-11-18', '1000.00', 'Pagada'),
(16, 6, 30, 80, 'Reserva', '2022-11-07', '2022-11-08', '2022-11-10', '1000.00', 'Pagada'),
(17, 6, 41, 80, 'Reserva', '2022-11-22', '2022-11-23', '2022-11-26', '80000.00', 'Pagada'),
(18, 1, 41, 80, 'Alquilado', '2022-11-23', '2022-11-24', '2022-11-28', '20000.00', 'Pagado'),
(19, 1, 32, 80, 'Reserva', '2022-11-23', '2022-11-25', '2022-11-26', '10000.00', 'Pagado'),
(20, 1, 28, 80, 'Reserva', '2022-11-23', '2022-11-24', '2022-11-26', '10000.00', 'Pagada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(60) DEFAULT NULL,
  `user` varchar(60) DEFAULT NULL,
  `password` varchar(60) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `user`, `password`, `correo`) VALUES
(1, 'maria', 'mar', '123', 'mar@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idpersona`),
  ADD UNIQUE KEY `cod_cliente_UNIQUE` (`cod_cliente`),
  ADD KEY `login` (`login`);

--
-- Indices de la tabla `consumo`
--
ALTER TABLE `consumo`
  ADD PRIMARY KEY (`idconsumo`),
  ADD KEY `fk_consumo_producto_idx` (`idproducto`),
  ADD KEY `fk_consumo_reserva_idx` (`idreserva`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idpersona`),
  ADD UNIQUE KEY `login_UNIQUE` (`login`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idhabitacion`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`idpago`),
  ADD KEY `fk_pago_reserva_idx` (`idreserva`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idpersona`),
  ADD UNIQUE KEY `telefono_UNIQUE` (`telefono`),
  ADD UNIQUE KEY `email_UNIQUE` (`email`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idproducto`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idreserva`),
  ADD KEY `fk_reserva_habitacion_idx` (`idhabitacion`),
  ADD KEY `fk_reserva_cliente_idx` (`idcliente`),
  ADD KEY `fk_reserva_empleado_idx` (`idempleado`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `consumo`
--
ALTER TABLE `consumo`
  MODIFY `idconsumo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idhabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `pago`
--
ALTER TABLE `pago`
  MODIFY `idpago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idpersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=94;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idproducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idreserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;