-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema SOFTWARE_LOCKERS_MANAGER
-- -----------------------------------------------------
-- BASE DE DATOS PARA EL SISTEMAS ADAMINISTRADOR DE LOCKERS
-- CREADO POR FL-ANDRUANNOHOMY
DROP SCHEMA IF EXISTS `SOFTWARE_LOCKERS_MANAGER` ;

-- -----------------------------------------------------
-- Schema SOFTWARE_LOCKERS_MANAGER
--
-- BASE DE DATOS PARA EL SISTEMAS ADAMINISTRADOR DE LOCKERS
-- CREADO POR FL-ANDRUANNOHOMY
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SOFTWARE_LOCKERS_MANAGER` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
SHOW WARNINGS;
USE `SOFTWARE_LOCKERS_MANAGER` ;

-- -----------------------------------------------------
-- Table `tblBitacora`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tblBitacora` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tblBitacora` (
  `Tipo` VARCHAR(20) NOT NULL,
  `FechaHora` DATETIME NOT NULL,
  `Usuario` VARCHAR(30) NOT NULL,
  `Operacion` VARCHAR(20) CHARACTER SET 'latin1' COLLATE 'latin1_spanish_ci' NOT NULL,
  `Datos` TEXT NOT NULL)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tblEdificio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tblEdificio` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tblEdificio` (
  `idEdificio` INT NOT NULL AUTO_INCREMENT,
  `Letra` VARCHAR(5) NOT NULL,
  `Facultad` VARCHAR(50) NOT NULL,
  `LockerN` INT NOT NULL,
  PRIMARY KEY (`idEdificio`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `Letra_UNIQUE` ON `tblEdificio` (`Letra` ASC);

SHOW WARNINGS;
CREATE UNIQUE INDEX `Facultad_UNIQUE` ON `tblEdificio` (`Facultad` ASC);

SHOW WARNINGS;
CREATE UNIQUE INDEX `idEdificio_UNIQUE` ON `tblEdificio` (`idEdificio` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tblDescripcion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tblDescripcion` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tblDescripcion` (
  `idDescripcion` INT NOT NULL AUTO_INCREMENT,
  `Numero` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idDescripcion`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `Numero_UNIQUE` ON `tblDescripcion` (`Numero` ASC);

SHOW WARNINGS;
CREATE UNIQUE INDEX `idDescripcion_UNIQUE` ON `tblDescripcion` (`idDescripcion` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tblLocker`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tblLocker` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tblLocker` (
  `idLocker` INT NOT NULL AUTO_INCREMENT,
  `idDescripcion` INT NOT NULL,
  `idEdificio` INT NOT NULL,
  PRIMARY KEY (`idLocker`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tblTipoPrivilegio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tblTipoPrivilegio` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tblTipoPrivilegio` (
  `idTipoPrivilegio` INT NOT NULL AUTO_INCREMENT,
  `Privilegio` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`idTipoPrivilegio`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `idTipoPrivilegio_UNIQUE` ON `tblTipoPrivilegio` (`idTipoPrivilegio` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tblAcceso`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tblAcceso` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tblAcceso` (
  `idAcceso` INT NOT NULL AUTO_INCREMENT,
  `Usuario` VARCHAR(20) NOT NULL,
  `Contraseña` VARCHAR(20) NOT NULL,
  `idTipoPrivilegio` INT NOT NULL,
  PRIMARY KEY (`idAcceso`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `idAcceso_UNIQUE` ON `tblAcceso` (`idAcceso` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tblUsuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tblUsuario` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tblUsuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(30) NOT NULL,
  `ApellidoP` VARCHAR(30) NULL,
  `ApellidoM` VARCHAR(30) NULL,
  `Direccion` TEXT NULL,
  `FechaNacimiento` DATE NOT NULL,
  `Phone` VARCHAR(20) NOT NULL,
  `Email` VARCHAR(70) NOT NULL,
  `Genero` TINYINT(1) NOT NULL,
  `idAcceso` INT NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tblPeticiones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tblPeticiones` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tblPeticiones` (
  `idPeticiones` INT NOT NULL AUTO_INCREMENT,
  `Tipo` VARCHAR(30) NOT NULL,
  `Descripcion` TEXT NOT NULL,
  `idLocker` INT NOT NULL,
  `idUsuario` INT NOT NULL,
  PRIMARY KEY (`idPeticiones`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tblAsignacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tblAsignacion` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tblAsignacion` (
  `idAsignacion` INT NOT NULL AUTO_INCREMENT,
  `Periodo` VARCHAR(70) NOT NULL,
  `idLocker` INT NOT NULL,
  `idUsuario` INT NOT NULL,
  PRIMARY KEY (`idAsignacion`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Data for table `tblEdificio`
-- -----------------------------------------------------
START TRANSACTION;
USE `SOFTWARE_LOCKERS_MANAGER`;
INSERT INTO `tblEdificio` (`idEdificio`, `Letra`, `Facultad`, `LockerN`) VALUES (1, 'A', 'Ingenieria en Sistemas Computacionales', 28);
INSERT INTO `tblEdificio` (`idEdificio`, `Letra`, `Facultad`, `LockerN`) VALUES (2, 'B', 'Ingenieria Mecatronica', 28);
INSERT INTO `tblEdificio` (`idEdificio`, `Letra`, `Facultad`, `LockerN`) VALUES (3, 'C', 'Ingenieria Ambiental', 28);
INSERT INTO `tblEdificio` (`idEdificio`, `Letra`, `Facultad`, `LockerN`) VALUES (4, 'D', 'Licenciatura en Administracion', 28);
INSERT INTO `tblEdificio` (`idEdificio`, `Letra`, `Facultad`, `LockerN`) VALUES (5, 'E', 'Ingenieria Civl', 28);

COMMIT;


-- -----------------------------------------------------
-- Data for table `tblDescripcion`
-- -----------------------------------------------------
START TRANSACTION;
USE `SOFTWARE_LOCKERS_MANAGER`;
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (1, 'LOCKER1');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (2, 'LOCKER2');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (3, 'LOCKER3');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (4, 'LOCKER4');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (5, 'LOCKER5');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (6, 'LOCKER6');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (7, 'LOCKER7');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (8, 'LOCKER8');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (9, 'LOCKER9');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (10, 'LOCKER10');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (11, 'LOCKER11');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (12, 'LOCKER12');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (13, 'LOCKER13');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (14, 'LOCKER14');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (15, 'LOCKER15');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (16, 'LOCKER16');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (17, 'LOCKER17');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (18, 'LOCKER18');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (19, 'LOCKER19');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (20, 'LOCKER20');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (21, 'LOCKER21');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (22, 'LOCKER22');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (23, 'LOCKER23');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (24, 'LOCKER24');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (25, 'LOCKER25');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (26, 'LOCKER26');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (27, 'LOCKER27');
INSERT INTO `tblDescripcion` (`idDescripcion`, `Numero`) VALUES (28, 'LOCKER28');

COMMIT;


-- -----------------------------------------------------
-- Data for table `tblLocker`
-- -----------------------------------------------------
START TRANSACTION;
USE `SOFTWARE_LOCKERS_MANAGER`;
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (1, 1, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (2, 2, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (3, 3, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (4, 4, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (5, 5, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (6, 6, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (7, 7, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (8, 8, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (9, 9, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (10, 10, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (11, 11, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (12, 12, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (13, 13, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (14, 14, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (15, 15, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (16, 16, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (17, 17, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (18, 18, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (19, 19, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (20, 20, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (21, 21, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (22, 22, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (23, 23, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (24, 24, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (25, 25, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (26, 26, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (27, 27, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (28, 28, 1);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (29, 1, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (30, 2, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (31, 3, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (32, 4, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (33, 5, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (34, 6, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (35, 7, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (36, 8, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (37, 9, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (38, 10, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (39, 11, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (40, 12, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (41, 13, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (42, 14, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (43, 15, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (44, 16, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (45, 17, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (46, 18, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (47, 19, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (48, 20, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (49, 21, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (50, 22, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (51, 23, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (52, 24, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (53, 25, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (54, 26, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (55, 27, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (56, 28, 2);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (57, 1, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (58, 2, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (59, 3, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (60, 4, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (61, 5, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (62, 6, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (63, 7, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (64, 8, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (65, 9, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (66, 10, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (67, 11, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (68, 12, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (69, 13, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (70, 14, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (71, 15, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (72, 16, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (73, 17, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (74, 18, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (75, 19, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (76, 20, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (77, 21, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (78, 22, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (79, 23, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (80, 24, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (81, 25, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (82, 26, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (83, 27, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (84, 28, 3);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (85, 1, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (86, 2, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (87, 3, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (88, 4, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (89, 5, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (90, 6, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (91, 7, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (92, 8, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (93, 9, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (94, 10, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (95, 11, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (96, 12, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (97, 13, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (98, 14, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (99, 15, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (100, 16, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (101, 17, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (102, 18, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (103, 19, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (104, 20, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (105, 21, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (106, 22, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (107, 23, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (108, 24, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (109, 25, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (110, 26, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (111, 27, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (112, 28, 4);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (113, 1, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (114, 2, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (115, 3, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (116, 4, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (117, 5, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (118, 6, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (119, 7, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (120, 8, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (121, 9, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (122, 10, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (123, 11, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (124, 12, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (125, 13, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (126, 14, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (127, 15, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (128, 16, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (129, 17, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (130, 18, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (131, 19, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (132, 20, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (133, 21, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (134, 22, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (135, 23, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (136, 24, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (137, 25, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (138, 26, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (139, 27, 5);
INSERT INTO `tblLocker` (`idLocker`, `idDescripcion`, `idEdificio`) VALUES (140, 28, 5);

COMMIT;


-- -----------------------------------------------------
-- Data for table `tblTipoPrivilegio`
-- -----------------------------------------------------
START TRANSACTION;
USE `SOFTWARE_LOCKERS_MANAGER`;
INSERT INTO `tblTipoPrivilegio` (`idTipoPrivilegio`, `Privilegio`) VALUES (1, 'ADMINISTRADOR');
INSERT INTO `tblTipoPrivilegio` (`idTipoPrivilegio`, `Privilegio`) VALUES (2, 'ASISTENTE');
INSERT INTO `tblTipoPrivilegio` (`idTipoPrivilegio`, `Privilegio`) VALUES (3, 'USUARIO');

COMMIT;


-- -----------------------------------------------------
-- Data for table `tblAcceso`
-- -----------------------------------------------------
START TRANSACTION;
USE `SOFTWARE_LOCKERS_MANAGER`;
INSERT INTO `tblAcceso` (`idAcceso`, `Usuario`, `Contraseña`, `idTipoPrivilegio`) VALUES (1, 'ADMIN', '25091992', 1);
INSERT INTO `tblAcceso` (`idAcceso`, `Usuario`, `Contraseña`, `idTipoPrivilegio`) VALUES (2, 'ANGELICA', '25091990', 2);
INSERT INTO `tblAcceso` (`idAcceso`, `Usuario`, `Contraseña`, `idTipoPrivilegio`) VALUES (3, 'DANIEL', '25091991', 3);

COMMIT;


-- -----------------------------------------------------
-- Data for table `tblUsuario`
-- -----------------------------------------------------
START TRANSACTION;
USE `SOFTWARE_LOCKERS_MANAGER`;
INSERT INTO `tblUsuario` (`idUsuario`, `Nombre`, `ApellidoP`, `ApellidoM`, `Direccion`, `FechaNacimiento`, `Phone`, `Email`, `Genero`, `idAcceso`) VALUES (1, 'Jose Daniel', 'Hernandez', 'Osorio ', 'Av. Rio Hondo # 36-A', '1992-09-25', '5560604619', 'isc.danielosorio@hotmail.com', 1, 1);
INSERT INTO `tblUsuario` (`idUsuario`, `Nombre`, `ApellidoP`, `ApellidoM`, `Direccion`, `FechaNacimiento`, `Phone`, `Email`, `Genero`, `idAcceso`) VALUES (2, 'Angelica', 'Lopez', 'Santiago', 'Coacalco', '1999-09-09', '5555555555', 'angelica@hotmail.com', 0, 2);
INSERT INTO `tblUsuario` (`idUsuario`, `Nombre`, `ApellidoP`, `ApellidoM`, `Direccion`, `FechaNacimiento`, `Phone`, `Email`, `Genero`, `idAcceso`) VALUES (3, 'Danielito', 'Hernandez', 'Osorio', 'Rio Hondo', '1991-09-25', '5555555555', 'daniel@hotmail.com', 1, 3);

COMMIT;


-- -----------------------------------------------------
-- Data for table `tblAsignacion`
-- -----------------------------------------------------
START TRANSACTION;
USE `SOFTWARE_LOCKERS_MANAGER`;
INSERT INTO `tblAsignacion` (`idAsignacion`, `Periodo`, `idLocker`, `idUsuario`) VALUES (1, 'Sat May 14  53:04 CDT 2016 a Sat May 14  53:04 CDT 2016', 1, 1);
INSERT INTO `tblAsignacion` (`idAsignacion`, `Periodo`, `idLocker`, `idUsuario`) VALUES (2, 'Sat May 14  53:04 CDT 2016 a Sat May 14  53:04 CDT 2016', 88, 2);

COMMIT;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
