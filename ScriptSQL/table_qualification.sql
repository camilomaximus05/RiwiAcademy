CREATE TABLE `RiwiAcademyDB`.`qualification` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_inscription` INT NOT NULL,
  `description` VARCHAR(45) NULL,
  `qualification` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_inscription_idx` (`id_inscription` ASC) VISIBLE,
  CONSTRAINT `id_inscription`
    FOREIGN KEY (`id_inscription`)
    REFERENCES `RiwiAcademyDB`.`inscription` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);