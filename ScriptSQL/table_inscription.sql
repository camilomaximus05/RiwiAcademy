CREATE TABLE `RiwiAcademyDB`.`inscription` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_course` INT NOT NULL,
  `id_student` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `id_courses_idx` (`id_course` ASC) VISIBLE,
  INDEX `id_students_idx` (`id_student` ASC) VISIBLE,
  CONSTRAINT `id_courses`
    FOREIGN KEY (`id_course`)
    REFERENCES `RiwiAcademyDB`.`course` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_students`
    FOREIGN KEY (`id_student`)
    REFERENCES `RiwiAcademyDB`.`student` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
