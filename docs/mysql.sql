-- MySQL Script generated by MySQL Workbench
-- Thứ năm, 27 Tháng 8 Năm 2020 10:57:35 +07
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema chatapp
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `chatapp` ;

-- -----------------------------------------------------
-- Schema chatapp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `chatapp` DEFAULT CHARACTER SET latin1 ;
USE `chatapp` ;

-- -----------------------------------------------------
-- Table `chatapp`.`User`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `chatapp`.`User` ;

CREATE TABLE IF NOT EXISTS `chatapp`.`User` (
  `UserID` INT(11) NOT NULL AUTO_INCREMENT,
  `Username` VARCHAR(30) NOT NULL,
  `Fullname` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(30) NOT NULL,
  `Online` BIT(1) NULL DEFAULT NULL,
  `AvatarFilePath` VARCHAR(45) NULL DEFAULT NULL,
  `BirthDay` DATE NULL DEFAULT NULL,
  `Sex` BIT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`UserID`),
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC),
  INDEX `index3` (`Fullname` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `chatapp`.`Conversation`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `chatapp`.`Conversation` ;

CREATE TABLE IF NOT EXISTS `chatapp`.`Conversation` (
  `ConversationID` INT(11) NOT NULL AUTO_INCREMENT,
  `UserStartID` INT(11) NOT NULL,
  `Type` INT(11) NOT NULL,
  `Name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`ConversationID`),
  INDEX `fk_Conversation_1_idx` (`UserStartID` ASC),
  CONSTRAINT `fk_Conversation_1`
    FOREIGN KEY (`UserStartID`)
    REFERENCES `chatapp`.`User` (`UserID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `chatapp`.`Chat`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `chatapp`.`Chat` ;

CREATE TABLE IF NOT EXISTS `chatapp`.`Chat` (
  `ChatID` INT(11) NOT NULL AUTO_INCREMENT,
  `ConversationID` INT(11) NOT NULL,
  `Type` INT(11) NOT NULL,
  `UserSendID` INT(11) NOT NULL,
  `Content` VARCHAR(640) NULL DEFAULT NULL,
  PRIMARY KEY (`ChatID`),
  INDEX `fk_Chat_1_idx` (`ConversationID` ASC),
  INDEX `fk_Chat_2_idx` (`UserSendID` ASC),
  CONSTRAINT `fk_Chat_1`
    FOREIGN KEY (`ConversationID`)
    REFERENCES `chatapp`.`Conversation` (`ConversationID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Chat_2`
    FOREIGN KEY (`UserSendID`)
    REFERENCES `chatapp`.`User` (`UserID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `chatapp`.`ConversationMember`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `chatapp`.`ConversationMember` ;

CREATE TABLE IF NOT EXISTS `chatapp`.`ConversationMember` (
  `ConversationMemberID` INT(11) NOT NULL AUTO_INCREMENT,
  `ConversationID` INT(11) NOT NULL,
  `MemberID` INT(11) NOT NULL,
  `NotSeenChat` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ConversationMemberID`),
  INDEX `fk_ConversationMember_1_idx` (`ConversationID` ASC),
  INDEX `fk_ConversationMember_2_idx` (`MemberID` ASC),
  CONSTRAINT `fk_ConversationMember_1`
    FOREIGN KEY (`ConversationID`)
    REFERENCES `chatapp`.`Conversation` (`ConversationID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ConversationMember_2`
    FOREIGN KEY (`MemberID`)
    REFERENCES `chatapp`.`User` (`UserID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `chatapp`.`Friend`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `chatapp`.`Friend` ;

CREATE TABLE IF NOT EXISTS `chatapp`.`Friend` (
  `FriendID` INT(11) NOT NULL AUTO_INCREMENT,
  `UserYouID` INT(11) NOT NULL,
  `UserMeID` INT(11) NOT NULL,
  PRIMARY KEY (`FriendID`),
  INDEX `fk_Friend_1_idx` (`UserYouID` ASC),
  INDEX `fk_Friend_2_idx` (`UserMeID` ASC),
  CONSTRAINT `fk_Friend_1`
    FOREIGN KEY (`UserYouID`)
    REFERENCES `chatapp`.`User` (`UserID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Friend_2`
    FOREIGN KEY (`UserMeID`)
    REFERENCES `chatapp`.`User` (`UserID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `chatapp`.`FriendRequest`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `chatapp`.`FriendRequest` ;

CREATE TABLE IF NOT EXISTS `chatapp`.`FriendRequest` (
  `FriendRequestID` INT(11) NOT NULL AUTO_INCREMENT,
  `UserSendID` INT(11) NOT NULL,
  `UserReplyID` INT(11) NOT NULL,
  `Time` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`FriendRequestID`),
  INDEX `fk_FriendRequest_1_idx` (`UserSendID` ASC),
  INDEX `fk_FriendRequest_2_idx` (`UserReplyID` ASC),
  CONSTRAINT `fk_FriendRequest_1`
    FOREIGN KEY (`UserSendID`)
    REFERENCES `chatapp`.`User` (`UserID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_FriendRequest_2`
    FOREIGN KEY (`UserReplyID`)
    REFERENCES `chatapp`.`User` (`UserID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
