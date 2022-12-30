CREATE TABLE habilidade (
    id int(11) NOT NULL, 
    nome varchar(255) DEFAULT NULL, 
    descricao varchar(255) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ALTER TABLE habilidade
-- ADD PRIMARY KEY (ID);

CREATE TABLE status (
    id int(11) NOT NULL,
    attack int(4) DEFAULT NULL,
    defense int(4) DEFAULT NULL,
    spAttack int(4) DEFAULT NULL,
    spDefense int(4) DEFAULT NULL,
    speed int(4) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ALTER TABLE status
-- ADD PRIMARY KEY (ID);

CREATE TABLE ataque (
    id int(11) NOT NULL AUTO_INCREMENT,
    tm int(4) DEFAULT NULL,
    nome varchar(255) DEFAULT NULL,
    tipo varchar(255) DEFAULT NULL,
    efeito varchar(255) DEFAULT NULL,
    dano int(4) DEFAULT NULL,
    pp int(4) DEFAULT NULL,
    precisao int(4) DEFAULT NULL
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE geracao (
    id int(11) NOT NULL AUTO_INCREMENT,
    nome varchar(255) DEFAULT NULL,
    PRIMARY KEY(ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE pokemon (
    id int(11) NOT NULL AUTO_INCREMENT,
    numero varchar(255) DEFAULT NULL,
    nome varchar(255) DEFAULT NULL,
    descricao varchar(255) DEFAULT NULL,
    sexo varchar(255) DEFAULT NULL,
    tipo1 varchar(255) DEFAULT NULL,
    tipo2 varchar(255) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE jogo (
    id int(11) NOT NULL AUTO_INCREMENT,
    nome varchar(255) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE evolucao (
    id int(11) NOT NULL AUTO_INCREMENT,
    forma varchar(255) DEFAULT NULL,
    descricao  varchar(255) DEFAULT NULL,
    level int(11) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE  pokemonsHabilidades (
    id int(11) NOT NULL AUTO_INCREMENT,
    idPokemon int(11) NOT NULL,
    idHabilidade int(11) NOT NULL,
    PRIMARY KEY(id), 
    FOREIGN KEY(idPokemon) REFERENCES pokemon(id),
    FOREIGN KEY(idHabilidade) REFERENCES habilidade(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

ALTER TABLE pokemon 
ADD statusPokemon int(11) DEFAULT NULL;

ALTER TABLE pokemon
ADD FOREIGN KEY (statusPokemon) REFERENCES status(id);
