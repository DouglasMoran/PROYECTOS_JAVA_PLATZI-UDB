-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema biblioteca
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema biblioteca
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `biblioteca` DEFAULT CHARACTER SET latin1 ;
USE `biblioteca` ;

-- -----------------------------------------------------
-- Table `biblioteca`.`categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteca`.`categorias` (
  `categoria_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `c_nombre` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`categoria_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 29
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `biblioteca`.`libros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteca`.`libros` (
  `libro_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(120) NOT NULL,
  `numPag` INT(11) NOT NULL,
  `isbn` VARCHAR(77) NOT NULL,
  `fechaPublicacion` DATE NULL DEFAULT NULL,
  `editorial` VARCHAR(50) NULL DEFAULT NULL,
  `n_autor` VARCHAR(50) NULL DEFAULT NULL,
  `categoria_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`libro_id`),
  INDEX `fk_libros_categorias_id` (`categoria_id` ASC),
  CONSTRAINT `fk_libros_categorias`
    FOREIGN KEY (`categoria_id`)
    REFERENCES `biblioteca`.`categorias` (`categoria_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
