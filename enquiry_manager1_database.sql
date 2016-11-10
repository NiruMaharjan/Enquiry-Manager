-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2016 at 05:52 PM
-- Server version: 5.5.36
-- PHP Version: 5.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `enquiry_manager1`
--

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE IF NOT EXISTS `courses` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(255) NOT NULL,
  `course_description` varchar(255) NOT NULL,
  `fees` int(11) NOT NULL,
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT NULL,
  `status` tinyint(4) NOT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`course_id`, `course_name`, `course_description`, `fees`, `added_date`, `modified_date`, `status`) VALUES
(2, 'advance java', 'advance java', 10000, '2016-10-03 20:47:25', '2016-10-28 18:30:00', 1),
(3, 'Python', 'python', 20000, '2016-10-04 10:05:08', NULL, 1),
(4, 'dot net', 'dot net', 20000, '2016-10-04 10:11:07', NULL, 1),
(6, 'Srisha', 'maharjan', 1200, '2016-10-14 08:59:51', NULL, 1),
(7, 'c#', 'C#', 20000, '2016-10-15 02:20:03', NULL, 1),
(8, 'ddss', 'ss', 1000, '2016-10-17 06:49:35', NULL, 1),
(9, 'Python and Django', 'Python and Django', 20000, '2016-10-20 05:40:40', NULL, 1),
(10, 'node js', 'node js', 20000, '2016-10-20 06:06:26', NULL, 1),
(11, 'Advanced excel', 'Advanced excel', 12000, '2016-10-26 11:11:15', NULL, 1),
(12, 'Android', 'Adroid Development		', 20000, '2016-10-26 12:20:57', NULL, 1),
(13, 'ruby and rails', 'ruby and rails', 20000, '2016-10-26 12:24:15', NULL, 1),
(14, 'Advanced Java', 'Advanced Java', 20000, '2016-10-26 15:00:58', NULL, 1),
(15, 'ddd', 'ssss', 20000, '2016-10-27 14:56:48', NULL, 1),
(16, 'dot net', 'dotnet dotnet', 20000, '2016-10-27 16:08:59', NULL, 1),
(17, 'Python', 'kkk', 90000, '2016-10-27 16:11:53', NULL, 1),
(18, 'core java', 'core java	', 12000, '2016-11-05 11:07:55', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `enquiries`
--

CREATE TABLE IF NOT EXISTS `enquiries` (
  `enquiry_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contact_no` varchar(20) NOT NULL,
  `course_id` int(11) NOT NULL,
  `enquiry_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `message` text NOT NULL,
  `enquiry_type` enum('W','P','I','F') NOT NULL,
  `enquiry_status` enum('Pe','En','Ns','Ni') NOT NULL,
  PRIMARY KEY (`enquiry_id`),
  KEY `course_id` (`course_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `enquiries`
--

INSERT INTO `enquiries` (`enquiry_id`, `first_name`, `last_name`, `email`, `contact_no`, `course_id`, `enquiry_date`, `message`, `enquiry_type`, `enquiry_status`) VALUES
(1, 'Niru', 'Maharjan', 'nmaharjan417@gmail.com', '9849274555', 2, '2016-10-20 21:10:14', 'i am very interested in java', 'W', 'Pe');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `enquiries`
--
ALTER TABLE `enquiries`
  ADD CONSTRAINT `enquiries_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `courses` (`course_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
