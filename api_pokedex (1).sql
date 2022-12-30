-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 30-Dez-2022 às 23:01
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `api_pokedex`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `ataque`
--

CREATE TABLE `ataque` (
  `id` int(11) NOT NULL,
  `tm` int(4) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `efeito` varchar(255) DEFAULT NULL,
  `dano` int(4) DEFAULT NULL,
  `pp` int(4) DEFAULT NULL,
  `precisao` int(4) DEFAULT NULL,
  `categoria` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `ataque`
--

INSERT INTO `ataque` (`id`, `tm`, `nome`, `tipo`, `efeito`, `dano`, `pp`, `precisao`, `categoria`) VALUES
(1, 1, 'Mega Punch', 'Normal', 'Mega Punch causa dano sem efeito adicional', 80, 20, 85, 'Physical');

-- --------------------------------------------------------

--
-- Estrutura da tabela `evolucao`
--

CREATE TABLE `evolucao` (
  `id` int(11) NOT NULL,
  `forma` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `levelEvolucao` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `geracao`
--

CREATE TABLE `geracao` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `habilidade`
--

CREATE TABLE `habilidade` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `habilidade`
--

INSERT INTO `habilidade` (`id`, `nome`, `descricao`) VALUES
(1, 'Study', 'O Pokémon está protegido contra ataques KO de 1 hit.'),
(2, 'Sand Veil', 'Aumenta a evasão do Pokémon em uma tempestade de areia.');

-- --------------------------------------------------------

--
-- Estrutura da tabela `jogo`
--

CREATE TABLE `jogo` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pokemon`
--

CREATE TABLE `pokemon` (
  `id` int(11) NOT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  `tipo1` varchar(255) DEFAULT NULL,
  `tipo2` varchar(255) DEFAULT NULL,
  `statusPokemon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pokemonshabilidades`
--

CREATE TABLE `pokemonshabilidades` (
  `id` int(11) NOT NULL,
  `idPokemon` int(11) NOT NULL,
  `idHabilidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `status`
--

CREATE TABLE `status` (
  `id` int(11) NOT NULL,
  `attack` int(4) DEFAULT NULL,
  `defense` int(4) DEFAULT NULL,
  `spAttack` int(4) DEFAULT NULL,
  `spDefense` int(4) DEFAULT NULL,
  `speed` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `ataque`
--
ALTER TABLE `ataque`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `evolucao`
--
ALTER TABLE `evolucao`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `geracao`
--
ALTER TABLE `geracao`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `habilidade`
--
ALTER TABLE `habilidade`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `jogo`
--
ALTER TABLE `jogo`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `pokemon`
--
ALTER TABLE `pokemon`
  ADD PRIMARY KEY (`id`),
  ADD KEY `statusPokemon` (`statusPokemon`);

--
-- Índices para tabela `pokemonshabilidades`
--
ALTER TABLE `pokemonshabilidades`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idPokemon` (`idPokemon`),
  ADD KEY `idHabilidade` (`idHabilidade`);

--
-- Índices para tabela `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `ataque`
--
ALTER TABLE `ataque`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `evolucao`
--
ALTER TABLE `evolucao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `geracao`
--
ALTER TABLE `geracao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `habilidade`
--
ALTER TABLE `habilidade`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `jogo`
--
ALTER TABLE `jogo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pokemon`
--
ALTER TABLE `pokemon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pokemonshabilidades`
--
ALTER TABLE `pokemonshabilidades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `status`
--
ALTER TABLE `status`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `pokemon`
--
ALTER TABLE `pokemon`
  ADD CONSTRAINT `pokemon_ibfk_1` FOREIGN KEY (`statusPokemon`) REFERENCES `status` (`id`);

--
-- Limitadores para a tabela `pokemonshabilidades`
--
ALTER TABLE `pokemonshabilidades`
  ADD CONSTRAINT `pokemonshabilidades_ibfk_1` FOREIGN KEY (`idPokemon`) REFERENCES `pokemon` (`id`),
  ADD CONSTRAINT `pokemonshabilidades_ibfk_2` FOREIGN KEY (`idHabilidade`) REFERENCES `habilidade` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
