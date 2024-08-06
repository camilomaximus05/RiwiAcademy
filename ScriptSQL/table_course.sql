CREATE TABLE `RiwiAcademyDB`.`course` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name_course` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `nombre_UNIQUE` (`name_course` ASC) VISIBLE);