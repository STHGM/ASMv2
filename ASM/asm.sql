-- MySQL Script generated by MySQL Workbench
-- 06/09/16 20:12:24
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------


-- -----------------------------------------------------
-- Table mydb.Pessoa
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Pessoa (
  ID_Pes INT NOT NULL AUTO_INCREMENT,
  Tipo VARCHAR(1) NULL,
  Nome VARCHAR(100) NULL,
  Endereco VARCHAR(100) NULL,
  Bairro VARCHAR(45) NULL,
  Telefone_1 VARCHAR(15) NULL,
  Telefone_2 VARCHAR(15) NULL,
  Cidade VARCHAR(45) NULL,
  CEP VARCHAR(10) NULL,
  Estado VARCHAR(2) NULL,
  Email VARCHAR(100) NULL,
  PRIMARY KEY (ID_Pes))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table mydb.Física
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Fisica (
  CPF VARCHAR(14) NULL,
  ID_Pes INT NOT NULL ,
  INDEX fk_Física_Pessoa_idx (ID_Pes ASC),
  CONSTRAINT fk_Física_Pessoa
    FOREIGN KEY (ID_Pes)
    REFERENCES Pessoa (ID_Pes)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table mydb.Juridica
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Juridica (
  CNPJ VARCHAR(18) NOT NULL,
  ID_Pes INT NOT NULL,
  INDEX fk_Juridica_Pessoa1_idx (ID_Pes ASC),
  CONSTRAINT fk_Juridica_Pessoa1
    FOREIGN KEY (ID_Pes)
    REFERENCES Pessoa (ID_Pes)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;




-- -----------------------------------------------------
-- Table mydb.Produto
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Produto (
  ID_Prod INT NOT NULL AUTO_INCREMENT,
  Nome VARCHAR(45) NULL,
  Categoria VARCHAR(45) NULL,
  Descricao VARCHAR(200) NULL,
  sug_pre_venda FLOAT NULL,
  sug_pre_compra FLOAT NULL,
  ID_Trans INT NULL,
  PRIMARY KEY (ID_Prod))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table mydb.Transacao
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Transacao (
  ID_Trans INT NOT NULL AUTO_INCREMENT,
  Tipo VARCHAR(1) NULL,
  Quantidade INT NULL,
  Valor_unitario FLOAT NULL,
  Valor_tot FLOAT NULL,
  Desconto INT NULL,
  ID_Pes INT NOT NULL,
  ID_Prod INT NOT NULL,
  PRIMARY KEY (ID_Trans),
  CONSTRAINT fk_Transacao_Pessoa1
    FOREIGN KEY (ID_Pes)
    REFERENCES Pessoa (ID_Pes),

  CONSTRAINT fk_Transacao_Produto1
    FOREIGN KEY (ID_Prod)
    REFERENCES Produto (ID_Prod)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table mydb.Estoque
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Estoque (
  quantidade INT NOT NULL,
  ID_Prod INT NOT NULL,
  PRIMARY KEY (ID_Prod),
  CONSTRAINT fk_Estoque_Produto1
    FOREIGN KEY (ID_Prod)
    REFERENCES Produto (ID_Prod)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

alter table fisica
drop column dataNasc;