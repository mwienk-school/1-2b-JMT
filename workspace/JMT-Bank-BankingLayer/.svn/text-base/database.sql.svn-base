-- phpMyAdmin SQL Dump
-- version 3.5.0
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 15, 2012 at 08:07 PM
-- Server version: 5.5.23
-- PHP Version: 5.4.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `jmtbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE IF NOT EXISTS `account` (
  `accountId` varchar(10) NOT NULL,
  `balance` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`accountId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`accountId`, `balance`) VALUES
('0010000001', 800),
('0010000002', 1200);

-- --------------------------------------------------------

--
-- Table structure for table `bankcard`
--

CREATE TABLE IF NOT EXISTS `bankcard` (
  `cardId` varchar(10) NOT NULL,
  `accountId` varchar(10) NOT NULL,
  `pin` varchar(5) NOT NULL,
  PRIMARY KEY (`cardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bankcard`
--

INSERT INTO `bankcard` (`cardId`, `accountId`, `pin`) VALUES
('0987654321', '0010000002', '54321'),
('1234567890', '0010000001', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `accountId` varchar(10) NOT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`username`, `password`, `accountId`, `firstname`, `lastname`) VALUES
('user1', 'pass1', '0010000001', 'Dennis', 'Pallett'),
('user2', 'pass2', '0010000002', 'Mark', 'Wienk');
