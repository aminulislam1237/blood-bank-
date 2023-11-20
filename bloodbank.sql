-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 27, 2022 at 08:40 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bloodbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `addnewdonor`
--

CREATE TABLE `addnewdonor` (
  `id` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `mo` varchar(100) NOT NULL,
  `g` varchar(100) NOT NULL,
  `ea` varchar(100) NOT NULL,
  `bg` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `adress` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addnewdonor`
--

INSERT INTO `addnewdonor` (`id`, `fname`, `dob`, `mo`, `g`, `ea`, `bg`, `city`, `adress`) VALUES
('2', 'asd', '22 dec', '0196', 'male', 'ss@gmail', 'o+', 'dhaka', 'yksg2'),
('', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', ''),
('6565', 'hasd', '33d', 'dv', 'asda', 'asxf', 'as', 'gg', 'gg');

-- --------------------------------------------------------

--
-- Table structure for table `home`
--

CREATE TABLE `home` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `home`
--

INSERT INTO `home` (`username`, `password`) VALUES
('shaqib', '123'),
('rakib', '123456'),
('admin', '222'),
('asda', '332'),
('', ''),
('asdadwd', '333'),
('rakib', '222');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
