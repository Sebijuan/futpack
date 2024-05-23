-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-05-2024 a las 00:28:21
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `futopener`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coleccion`
--

CREATE TABLE `coleccion` (
  `Nombre` varchar(20) DEFAULT NULL,
  `Apellido` varchar(20) DEFAULT NULL,
  `Valoracion` int(2) DEFAULT NULL,
  `Nombre_Equipo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `ID_Equipo` int(3) NOT NULL,
  `Nombre_Equipo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`ID_Equipo`, `Nombre_Equipo`) VALUES
(1, 'Atletico Madrid'),
(2, 'FC Barcelona'),
(3, 'Real Madrid'),
(4, 'Atletico Bilbao'),
(5, 'Real Betis'),
(6, 'RC Celta'),
(7, 'RCD Mallorca'),
(8, 'Real Sociedad'),
(9, 'Valencia CF'),
(10, 'Deportivo Alaves'),
(11, 'UD Las Palmas'),
(12, 'CA Osasuna'),
(13, 'Rayo Vallecano'),
(14, 'Sevilla FC'),
(15, 'Villarreal FC'),
(16, 'Getafe FC'),
(17, 'UD Almeria'),
(18, 'Cadiz CF'),
(19, 'Girona CF'),
(20, 'Granada CF'),
(21, 'Iconos FC');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `ID_Jugador` int(3) NOT NULL,
  `Nombre` varchar(20) DEFAULT NULL,
  `Apellido` varchar(20) DEFAULT NULL,
  `Valoracion` float DEFAULT NULL,
  `ID_Equipo` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`ID_Jugador`, `Nombre`, `Apellido`, `Valoracion`, `ID_Equipo`) VALUES
(1, 'Antoine', 'Griezmann', 88, 1),
(2, 'Jan', 'Oblack', 88, 1),
(3, 'Marcos', 'Llorente', 84, 1),
(4, 'Koke', 'Resurreccion', 84, 1),
(5, 'Memphis', 'Depay', 84, 1),
(6, 'Rodrigo', 'De Paul', 84, 1),
(7, 'Alvaro', 'Morata', 83, 1),
(8, 'Jose Maria', 'Gimenez', 83, 1),
(9, 'Javi', 'Galan', 82, 1),
(10, 'Angel', 'Correa', 82, 1),
(11, 'Mario', 'Hermoso', 82, 1),
(12, 'Nahuel', 'Molina', 82, 1),
(13, 'Thomas', 'Lemar', 82, 1),
(14, 'Stefan', 'Savic', 82, 1),
(15, 'Reinildo', 'Mandava', 81, 1),
(16, 'Saul', 'Ñiguez', 80, 1),
(17, 'Cesar', 'Azpilicueta', 79, 1),
(18, 'Axel', 'Witsel', 79, 1),
(19, 'Rodrigo', 'Riquelme', 77, 1),
(20, 'Caglar', 'Soyuncu', 77, 1),
(21, 'Samuel', 'Lino', 77, 1),
(22, 'Robert', 'Lewandowski', 90, 2),
(23, 'Marc-Andre', 'Ter Stegen', 89, 2),
(24, 'Frenkie', 'De Jong', 87, 2),
(25, 'Pedri', 'Gonzalez', 86, 2),
(26, 'Ronald', 'Araujo', 86, 2),
(27, 'Ilkay', 'Gundogan', 86, 2),
(28, 'Joao', 'Cancelo', 86, 2),
(29, 'Jules', 'Kounde', 85, 2),
(30, 'Raphael', 'Raphinha', 84, 2),
(31, 'Andreas', 'Christensen', 83, 2),
(32, 'Pablo', 'Gavi', 83, 2),
(33, 'Ferran', 'Torres', 82, 2),
(34, 'Iñigo', 'Martinez', 82, 2),
(35, 'Alejandro', 'Balde', 81, 2),
(36, 'Joao', 'Felix', 81, 2),
(37, 'Oriol', 'Romeu', 80, 2),
(38, 'Sergi', 'Roberto', 80, 2),
(39, 'Marcos', 'Alonso', 79, 2),
(40, 'Thibaut ', 'Courtois', 90, 3),
(41, 'Vini', 'Jr', 89, 3),
(42, 'Federico', 'Valverde', 88, 3),
(43, 'Luka', 'Modric', 87, 3),
(44, 'Toni', 'Kroos', 86, 3),
(45, 'Eder', 'Militao', 86, 3),
(46, 'Jude', 'Bellingham', 86, 3),
(47, 'Antonio', 'Rudiger', 85, 3),
(48, 'David', 'Alaba', 85, 3),
(49, 'Rodrygo', 'Goes', 85, 3),
(50, 'Aurelien', 'Tchouameni', 84, 3),
(51, 'Nacho', 'Fernandez', 83, 3),
(52, 'Joselu', 'Mato', 82, 3),
(53, 'Dani', 'Carvajal', 82, 3),
(54, 'Ferland', 'Mendy', 82, 3),
(55, 'Eduardo', 'Camavinga', 82, 3),
(56, 'Lucas', 'Vazquez', 81, 3),
(57, 'Kepa', 'Arrizalagaba', 81, 3),
(58, 'Brahim', 'Diaz', 80, 3),
(59, 'Dani', 'Ceballos', 79, 3),
(60, 'Fran', 'Garcia', 78, 3),
(61, 'Arda', 'Guler', 77, 3),
(62, 'Andriy', 'Lunin', 74, 3),
(63, 'Unai', 'Simon', 83, 4),
(64, 'Yeray', 'Alvarez', 81, 4),
(65, 'Iñaki', 'Williams', 81, 4),
(66, 'Iker', 'Muniain', 81, 4),
(67, 'Oihan', 'Sancet', 81, 4),
(68, 'Alex', 'Berenguer', 80, 4),
(69, 'Oscar', 'De Marcos', 80, 4),
(70, 'Ander', 'Herrera', 79, 4),
(71, 'Nico', 'Williams', 79, 4),
(72, 'Yuri', 'Berchiche', 79, 4),
(73, 'Dani', 'Vivian', 79, 4),
(74, 'Mikel', 'Vesga', 78, 4),
(75, 'Gorka', 'Guruzeta', 77, 4),
(76, 'Raul', 'Garcia', 77, 4),
(77, 'Ruiz', 'De Galarreta', 76, 4),
(78, 'Dani', 'Garcia', 76, 4),
(79, 'Nabil', 'Fekir', 83, 5),
(80, 'Guido', 'Rodriguez', 83, 5),
(81, 'Borja', ' Iglesias', 83, 5),
(82, 'Rui', 'Silva', 81, 5),
(83, 'William', 'Carvalho', 81, 5),
(84, 'Claudio', 'Bravo', 80, 5),
(85, 'Isco', 'Alarcon', 80, 5),
(86, 'Marc', 'Bartra', 79, 5),
(87, 'Ayoze', 'Perez', 79, 5),
(88, 'Hector', 'Bellerin', 78, 5),
(89, 'Rodri', 'Sanchez', 77, 5),
(90, 'Luiz', 'Henrique', 77, 5),
(91, 'Youssouf', 'Sabaly', 77, 5),
(92, 'Juan', 'Miranda', 77, 5),
(93, 'Aitor', 'Ruibal', 76, 5),
(94, 'German', 'Pezzella', 76, 5),
(95, 'Willian', 'Jose', 76, 5),
(96, 'Andres', 'Guardado', 76, 5),
(97, 'Marc', 'Roca', 75, 5),
(98, 'Iago', 'Aspas', 85, 6),
(99, 'Fran', 'Beltran', 80, 6),
(100, 'Joseph', 'Aidoo', 79, 6),
(101, 'Renato', 'Tapia', 78, 6),
(102, 'Agustin', 'Marchesin', 78, 6),
(103, 'Vicente', 'Guaita', 78, 6),
(104, 'Franco', 'Cervi', 77, 6),
(105, 'Jonathan', 'Bamba', 77, 6),
(106, 'Unai', 'Nuñez', 77, 6),
(107, 'Carles', 'Perez', 76, 6),
(108, 'Kevin', 'Vazquez', 75, 6),
(109, 'Oscar', 'Mingueza', 74, 6),
(110, 'Sergi', 'Darder', 83, 7),
(111, 'Vedat', 'Muriqi', 80, 7),
(112, 'Pablo', 'Maffeo', 78, 7),
(113, 'Predrag', 'Rajkovic', 78, 7),
(114, 'Dani', ' Rodriguez', 78, 7),
(115, 'Jaume', 'Costa', 77, 7),
(116, 'Martin', 'Valjent', 77, 7),
(117, 'Jose', 'Copete', 75, 7),
(118, 'Omar', 'Mascarell', 75, 7),
(119, 'Antonio', 'Raillo', 75, 7),
(120, 'Cycle', 'Larin', 75, 7),
(121, 'Samu', 'Costa', 74, 7),
(122, 'Mikel', 'Merino', 84, 8),
(123, 'Alex', 'Remiro', 84, 8),
(124, 'Mikel', 'Oyarzabal', 83, 8),
(125, 'Robin', 'Le Normand', 82, 8),
(126, 'Brais', 'Mendez', 81, 8),
(127, 'Kieran', 'Tierney', 80, 8),
(128, 'Hamari', 'Traore', 80, 8),
(129, 'Martin', 'Zubimendi', 80, 8),
(130, 'Takefusa', 'Kubo', 80, 8),
(131, 'Igor', 'Zubeldia', 80, 8),
(132, 'Andre', 'Silva', 80, 8),
(133, 'Aritz', 'Elustondo', 80, 8),
(134, 'Umar', 'Sadiq', 77, 8),
(135, 'Alvaro', 'Odriozola', 76, 8),
(136, 'Jose Luis', 'Gaya', 82, 9),
(137, 'Giorgi', 'Mamardashvili', 80, 9),
(138, 'Andre', 'Almeida', 78, 9),
(139, 'Jose Luis', 'Pepelu', 78, 9),
(140, 'Gabriel', 'Paulista', 78, 9),
(141, 'Thierry', 'Correira', 77, 9),
(142, 'Mouctar', 'Diakhaby', 76, 9),
(143, 'Hugo', 'Guillamon', 75, 9),
(144, 'Selim', 'Amallah', 75, 9),
(145, 'Hugo', 'Duro', 74, 9),
(146, 'Dimitri', 'Foulquier', 74, 9),
(147, 'Roman', 'Yaremchuk', 72, 9),
(148, 'Sergi', 'Canos', 72, 9),
(149, 'Andoni', 'Gorosabel', 76, 10),
(150, 'Nahuel', 'Tenaglia', 75, 10),
(151, 'Ruben', 'Duarte', 75, 10),
(152, 'Luis', 'Rioja', 75, 10),
(153, 'Ander', 'Guevara', 74, 10),
(154, 'Kike', 'Garcia', 74, 10),
(155, 'Antonio', 'Blanco', 73, 10),
(156, 'Ianis', 'Hagi', 73, 10),
(157, 'Aleksandar', 'Sedlar', 73, 10),
(158, 'Giuliano', 'Simeone', 72, 10),
(159, 'Carlos', 'Benavidez', 70, 10),
(160, 'Jonathan', 'Viera', 80, 11),
(161, 'Munir', 'El Haddadi', 78, 11),
(162, 'Alvaro', 'Valles', 76, 11),
(163, 'Alberto', 'Moleiro', 75, 11),
(164, 'Saul', 'Coco', 75, 11),
(165, 'Enzo', 'Loiodice', 75, 11),
(166, 'Sandro', 'Ramirez', 75, 11),
(167, 'Sergi', 'Cardona', 74, 11),
(168, 'Daley', 'Sinkgraven', 72, 11),
(169, 'Omenuke', 'Mfulu', 72, 11),
(170, 'Mika', 'Marmol', 72, 11),
(171, 'Alex', 'Suarez', 71, 11),
(172, 'Kirian', 'Rodriguez', 71, 11),
(173, 'David', 'Garcia', 82, 12),
(174, 'Ezequiel', 'Avila', 80, 12),
(175, 'Alejandro', 'Catena', 79, 12),
(176, 'Moi', 'Gomez', 79, 12),
(177, 'Sergio', 'Herrera', 79, 12),
(178, 'Ruben', 'Garcia', 78, 12),
(179, 'Aitor', 'Fernandez', 78, 12),
(180, 'Jon', 'Moncayola', 78, 12),
(181, 'Johan', 'Mojica', 77, 12),
(182, 'Lucas', 'Torro', 77, 12),
(183, 'Ante', 'Budimir', 77, 12),
(184, 'Nacho', 'Vidal', 76, 12),
(185, 'Juan', 'Cruz', 75, 12),
(186, 'Ruben', 'Peña', 75, 12),
(187, 'Isi', 'Palazon', 82, 13),
(188, 'Alvaro', 'Garcia', 79, 13),
(189, 'Stole', 'Dimitrievski', 79, 13),
(190, 'Raul', 'De Tomas', 78, 13),
(191, 'Alfonso', 'Espino', 78, 13),
(192, 'Oscar', 'Trejo', 78, 13),
(193, 'Florian', 'Lejeune', 77, 13),
(194, 'Ivan', 'Balliu', 77, 13),
(195, 'Jorge', 'De Frutos', 77, 13),
(196, 'Oscar', 'Valentin', 76, 13),
(197, 'Sergio', 'Camello', 75, 13),
(198, 'Radamel', 'Falcao', 75, 13),
(199, 'Marcos', 'Acuña', 85, 14),
(200, 'Youssef', 'En-Nesyri', 82, 14),
(201, 'Fernando', 'Reges', 82, 14),
(202, 'Ivan', 'Rakitic', 81, 14),
(203, 'Jesus', 'Navas', 80, 14),
(204, 'Joan', 'Jordan', 80, 14),
(205, 'Marko', 'Dmitrovic', 80, 14),
(206, 'Lukas', 'Ocampos', 80, 14),
(207, 'Jesus', 'Suso', 80, 14),
(208, 'Nemanja', 'Gudelj', 80, 14),
(209, 'Erik', 'Lamela', 80, 14),
(210, 'Oliver', 'Torres', 79, 14),
(211, 'Dodi', 'Lukebakio', 78, 14),
(212, 'Djibril', 'Sow', 78, 14),
(213, 'Rafa', 'Mir', 77, 14),
(214, 'Dani', 'Parejo', 86, 15),
(215, 'Gerard', 'Moreno', 83, 15),
(216, 'Raul', 'Albiol', 81, 15),
(217, 'Etienne', 'Capoue', 81, 15),
(218, 'Francis', 'Coquelin', 80, 15),
(219, 'Juan', 'Foyth', 80, 15),
(220, 'Jeremy', 'Pino', 79, 15),
(221, 'Alexander', 'Sorloth', 79, 15),
(222, 'Jose Luis', 'Morales', 79, 15),
(223, 'Alberto', 'Moreno', 76, 15),
(224, 'Alex', 'Baena', 76, 15),
(225, 'Denis', 'Suarez', 75, 15),
(226, 'Enes', 'Unal', 82, 16),
(227, 'Mauro', 'Arambarri', 80, 16),
(228, 'David', 'Soria', 80, 16),
(229, 'Luis', 'Milla', 78, 16),
(230, 'Nemanja', 'Maksimovic', 78, 16),
(231, 'Damian', 'Suarez', 77, 16),
(232, 'Dakonam', 'Djene', 77, 16),
(233, 'Domingos', 'Duarte', 77, 16),
(234, 'Diego', 'Rico', 77, 16),
(235, 'Omar', 'Alderete', 76, 16),
(236, 'Oscar', 'Rodriguez', 75, 16),
(237, 'Borja', 'Mayoral', 74, 16),
(238, 'Stefan', 'Mitrovic', 74, 16),
(239, 'Anthony', 'Lozano', 73, 16),
(240, 'Gaston', 'Alvarez', 72, 16),
(241, 'Edgar', 'Gonzalez', 79, 17),
(242, 'Lucas', 'Robertone', 79, 17),
(243, 'Fernando', 'Martinez', 78, 17),
(244, 'Luis', 'Maximiano', 77, 17),
(245, 'Cesar', 'Montes', 77, 17),
(246, 'Adrian', 'Embarba', 76, 17),
(247, 'Iddrisu', 'Baba', 76, 17),
(248, 'Lazaro', 'Vinicius', 75, 17),
(249, 'Leo', 'Baptistao', 75, 17),
(250, 'Luis Javier', 'Suarez', 75, 17),
(251, 'Alex', 'Centelles', 73, 17),
(252, 'Largie', 'Ramazani', 73, 17),
(253, 'Dion', 'Lopy', 73, 17),
(254, 'Alex', 'Pozo', 72, 17),
(255, 'Conan', 'Ledesma', 82, 18),
(256, 'Maximiliano', 'Gomez', 77, 18),
(257, 'Gonzalo', 'Escalante', 77, 18),
(258, 'Darwin', 'Machis', 77, 18),
(259, 'Alex ', 'Fernandez', 75, 18),
(260, 'Alvaro', 'Negredo', 75, 18),
(261, 'Luis', 'Hernandez', 75, 18),
(262, 'Victor', 'Chust', 75, 18),
(263, 'Rafael', 'Fali', 75, 18),
(264, 'Ruben', 'Alcaraz', 75, 18),
(265, 'Ivan', 'Alejo', 74, 18),
(266, 'Iza', 'Carcelen', 74, 18),
(267, 'Ruben', 'Sobrino', 74, 18),
(268, 'Chris', 'Ramos', 73, 18),
(269, 'Viktor', 'Tsygankov', 82, 19),
(270, 'Aleix', 'Garcia', 80, 19),
(271, 'Arnau', 'Martinez', 80, 19),
(272, 'David', 'Lopez', 79, 19),
(273, 'Paulo', 'Gazzaniga', 78, 19),
(274, 'Daley', 'Blind', 77, 19),
(275, 'Cristhian', 'Stuani', 77, 19),
(276, 'Yangel', 'Herrera', 76, 19),
(277, 'Cristian', 'Portu', 75, 19),
(278, 'Miguel', 'Gutierrez', 74, 19),
(279, 'Ivan', 'Martin', 74, 19),
(280, 'Yan ', 'Couto', 72, 19),
(281, 'Artem', 'Dovbyk', 70, 19),
(282, 'Savio', 'Moreira', 70, 19),
(283, 'Eric', 'Garcia', 75, 19),
(284, 'Myrto', 'Uzuni', 78, 20),
(285, 'Lucas', 'Boye', 77, 20),
(286, 'Oscar', 'Melendo', 77, 20),
(287, 'Shon', 'Weissman', 75, 20),
(288, 'Jose', 'Callejon', 75, 20),
(289, 'Victor', 'Diaz', 75, 20),
(290, 'Jesus', 'Vallejo', 74, 20),
(291, 'Antonio', 'Puertas', 74, 20),
(292, 'Carlos', 'Neva', 74, 20),
(293, 'Gerard', 'Gumbau', 73, 20),
(294, 'Wilson', 'Manafa', 73, 20),
(295, 'Alberto', 'Perea', 72, 20),
(296, 'Gonzalo', 'Villar', 71, 20),
(297, 'Miguel', 'Rubio', 71, 20),
(298, 'Bobby', 'Charlton', 92, 21),
(299, 'Franck', 'Ribery', 88, 21),
(300, 'Eric', 'Cantona', 89, 21),
(301, 'Van', 'Nistelrooy', 89, 21),
(302, 'Van', 'Persei', 88, 21),
(303, 'Zinedine', 'Zidane', 94, 21),
(304, 'Xavi', 'Hernandez', 90, 21),
(305, 'Xavi', 'Alonso', 87, 21),
(306, 'Roberto', 'Carlos', 90, 21),
(307, 'Van', 'Der Sar', 88, 21),
(308, 'Peter', 'Cech', 88, 21),
(309, 'Ronaldo', 'Nazario', 94, 21),
(310, 'Johan', 'Cruyff', 93, 21),
(311, 'Titi', 'Henry', 91, 21),
(312, 'Ruud', 'Gullit', 90, 21),
(313, 'Emilio', 'Butragueño', 89, 21),
(314, 'Luis', 'Figo', 89, 21),
(315, 'Marcus', 'Owen', 88, 21),
(316, 'Fernando', 'Torres', 87, 21),
(317, 'Davor', 'Suker', 87, 21),
(318, 'Edson', 'Pele', 95, 21),
(319, 'Patrick', 'Vieira', 88, 21),
(320, 'Ricardo', 'Kaka', 89, 21);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID_Usuario` int(3) NOT NULL,
  `Usuario` varchar(20) DEFAULT NULL,
  `Contraseña` varchar(15) DEFAULT NULL,
  `Correo` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID_Usuario`, `Usuario`, `Contraseña`, `Correo`) VALUES
(1, 'edtg', 'aaaa', 'wew'),
(4, 'a', 'a', 'a'),
(5, 'sedg', 'sxgdfr', 'sdeg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`ID_Equipo`);

--
-- Indices de la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`ID_Jugador`),
  ADD KEY `FK_jugador_equipo` (`ID_Equipo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID_Usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `ID_Equipo` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `jugador`
--
ALTER TABLE `jugador`
  MODIFY `ID_Jugador` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=321;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID_Usuario` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD CONSTRAINT `FK_jugador_equipo` FOREIGN KEY (`ID_Equipo`) REFERENCES `equipo` (`ID_Equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
