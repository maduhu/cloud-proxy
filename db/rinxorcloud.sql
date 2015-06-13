-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2013 at 06:20 PM
-- Server version: 5.5.32
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rinxorcloud`
--
CREATE DATABASE IF NOT EXISTS `rinxorcloud` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `rinxorcloud`;

-- --------------------------------------------------------

--
-- Table structure for table `asyncjob`
--

CREATE TABLE IF NOT EXISTS `asyncjob` (
  `jobid` varchar(50) NOT NULL,
  `accountid` varchar(50) NOT NULL,
  `cmd` varchar(50) NOT NULL,
  `created` datetime NOT NULL,
  `jobinstanceid` varchar(50) NOT NULL,
  `jobinstancetype` varchar(50) NOT NULL,
  `jobprocstatus` varchar(50) NOT NULL,
  `jobresult` varchar(2000) NOT NULL,
  `jobresultcode` varchar(50) NOT NULL,
  `jobresulttype` varchar(50) NOT NULL,
  `jobstatus` varchar(50) NOT NULL,
  `userid` varchar(50) NOT NULL,
  `jobidcs` varchar(50) NOT NULL,
  PRIMARY KEY (`jobid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `asyncjob`
--

-- --------------------------------------------------------

--
-- Table structure for table `cloudstackplan`
--

CREATE TABLE IF NOT EXISTS `cloudstackplan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `plan` varchar(200) NOT NULL,
  `description` varchar(200) NOT NULL,
  `zoneid` varchar(45) NOT NULL,
  `templateid` varchar(45) NOT NULL,
  `hypervisor` varchar(45) NOT NULL,
  `serviceofferingid` varchar(45) NOT NULL,
  `diskofferingid` varchar(45) NOT NULL,
  `networkofferingid` varchar(45) NOT NULL,
  `networkid` varchar(50) NOT NULL,
  `domainid` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `cloudstackplan`
--

INSERT INTO `cloudstackplan` (`id`, `plan`, `description`, `zoneid`, `templateid`, `hypervisor`, `serviceofferingid`, `diskofferingid`, `networkofferingid`, `networkid`, `domainid`) VALUES
(1, 'Free', 'Free', 'f5e2ae45-d4e7-4125-be13-5a92d647e796', '0bd41bff-67ca-4652-b7e5-c6410a8d0b8f', 'KVM', 'dd584d3d-d23c-494a-8c29-ac69fb8f6b8b', 'd149d89a-3c8e-4d8c-a119-296f67185f91', '71ccadbf-5a60-4b1b-84d5-e15f33281b61', '767eca4a-c8a0-4cac-851b-3001485f641d', '30114a46-5580-11e3-bb83-005056b12677');


INSERT INTO `cloudstackplan` (`id`, `plan`, `description`, `zoneid`, `templateid`, `hypervisor`, `serviceofferingid`, `diskofferingid`, `networkofferingid`, `networkid`, `domainid`) VALUES
(2, 'Free', 'Free', 'f5e2ae45-d4e7-4125-be13-5a92d647e796', '4dbe5613-9670-420c-bc04-bc2be41dee12', 'KVM', 'dd584d3d-d23c-494a-8c29-ac69fb8f6b8b', 'd149d89a-3c8e-4d8c-a119-296f67185f91', '71ccadbf-5a60-4b1b-84d5-e15f33281b61', '767eca4a-c8a0-4cac-851b-3001485f641d', '30114a46-5580-11e3-bb83-005056b12677');

-- --------------------------------------------------------

--
-- Table structure for table `cloudstackuser`
--

CREATE TABLE IF NOT EXISTS `cloudstackuser` (
  `accountid` varchar(45) NOT NULL,
  `accountname` varchar(45) NOT NULL,
  `userid` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `job` varchar(200) NOT NULL,
  `gender` varchar(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cloudstackuser`
--

-- --------------------------------------------------------

--
-- Table structure for table `diskoffering`
--

CREATE TABLE IF NOT EXISTS `diskoffering` (
  `index` int(11) NOT NULL AUTO_INCREMENT,
  `created` datetime NOT NULL,
  `disksize` int(11) NOT NULL,
  `displayoffering` bit(1) NOT NULL,
  `displaytext` varchar(200) NOT NULL,
  `id` varchar(45) NOT NULL,
  `iscustomized` bit(1) NOT NULL,
  `name` varchar(200) NOT NULL,
  `storagetype` varchar(45) NOT NULL,
  PRIMARY KEY (`index`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `diskoffering`
--

INSERT INTO `diskoffering` (`index`, `created`, `disksize`, `displayoffering`, `displaytext`, `id`, `iscustomized`, `name`, `storagetype`) VALUES
(1, '2013-09-02 00:47:54', 5, b'1', 'Small Disk, 5 GB', '927f42b5-9a75-40e7-9598-3fc2bdd1db79', b'0', 'Small', 'shared'),
(2, '2013-12-16 00:00:00', 20, b'1', 'Medium Disk, 20 GB', 'd149d89a-3c8e-4d8c-a119-296f67185f91', b'0', 'Medium', 'shared'),
(3, '2013-12-16 00:00:00', 100, b'1', 'Large Disk, 100 GB', '7ed75360-c0d0-45d1-acb5-8887c7725792', b'0', 'Large', 'shared');

-- --------------------------------------------------------

--
-- Table structure for table `iso`
--

CREATE TABLE IF NOT EXISTS `iso` (
  `index` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(45) NOT NULL,
  `bootable` bit(1) NOT NULL,
  `checksum` varchar(45) NOT NULL,
  `created` datetime NOT NULL,
  `crossZones` bit(1) NOT NULL,
  `displaytext` varchar(200) NOT NULL,
  `domain` varchar(45) NOT NULL,
  `domainid` varchar(45) NOT NULL,
  `id` varchar(45) NOT NULL,
  `isextractable` bit(1) NOT NULL,
  `isfeatured` bit(1) NOT NULL,
  `ispublic` bit(1) NOT NULL,
  `isready` bit(1) NOT NULL,
  `name` varchar(200) NOT NULL,
  `ostypeid` varchar(45) NOT NULL,
  `ostypename` varchar(100) NOT NULL,
  `size` int(11) NOT NULL,
  `status` varchar(45) NOT NULL,
  `tags` longtext,
  `zoneid` varchar(45) NOT NULL,
  `zonename` varchar(45) NOT NULL,
  PRIMARY KEY (`index`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `iso`
--

INSERT INTO `iso` (`index`, `account`, `bootable`, `checksum`, `created`, `crossZones`, `displaytext`, `domain`, `domainid`, `id`, `isextractable`, `isfeatured`, `ispublic`, `isready`, `name`, `ostypeid`, `ostypename`, `size`, `status`, `tags`, `zoneid`, `zonename`) VALUES
(1, '', b'1', '', '2013-09-02 01:37:13', b'1', 'CentOS ,Apache tomcat 6 + JDK 1.6 + MySQL', '', '', '0bd41bff-67ca-4652-b7e5-c6410a8d0b8f', b'0', b'1', b'1', b'1', 'O0001A0001S0002', '', 'CentOS 5.5(64-bit)', 212766720, 'Successfully Installed', '[]', '', ''),
(2, '', b'1', '', '2013-09-02 01:37:13', b'1', 'CentOS, Apache + PHP5 + MySQL', '', '', '4dbe5613-9670-420c-bc04-bc2be41dee12', b'0', b'1', b'1', b'1', 'O0001A0002S0002', '', 'CentOS 5.5(64-bit)', 212766720, 'Successfully Installed', '[]', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `network`
--

CREATE TABLE IF NOT EXISTS `network` (
  `id` varchar(50) NOT NULL,
  `name` varchar(200) NOT NULL,
  `isdefault` tinyint(1) NOT NULL,
  `type` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `network`
--

INSERT INTO `network` (`id`, `name`, `isdefault`, `type`) VALUES
('767eca4a-c8a0-4cac-851b-3001485f641d', 'NewShared1', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `networkoffering`
--

CREATE TABLE IF NOT EXISTS `networkoffering` (
  `index` int(11) NOT NULL AUTO_INCREMENT,
  `availability` varchar(45) NOT NULL,
  `conservemode` bit(1) NOT NULL,
  `displaytext` varchar(200) NOT NULL,
  `egressdefaultpolicy` bit(1) NOT NULL,
  `forvpc` bit(1) NOT NULL,
  `guestiptype` varchar(45) NOT NULL,
  `id` varchar(45) NOT NULL,
  `isdefault` bit(1) NOT NULL,
  `ispersistent` bit(1) NOT NULL,
  `name` varchar(200) NOT NULL,
  `networkrate` int(11) NOT NULL,
  `service` longtext NOT NULL,
  `serviceofferingid` varchar(45) NOT NULL,
  `specifyipranges` bit(1) NOT NULL,
  `specifyvlan` bit(1) NOT NULL,
  `state` varchar(45) NOT NULL,
  `traffictype` varchar(45) NOT NULL,
  PRIMARY KEY (`index`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `networkoffering`
--

INSERT INTO `networkoffering` (`index`, `availability`, `conservemode`, `displaytext`, `egressdefaultpolicy`, `forvpc`, `guestiptype`, `id`, `isdefault`, `ispersistent`, `name`, `networkrate`, `service`, `serviceofferingid`, `specifyipranges`, `specifyvlan`, `state`, `traffictype`) VALUES
(1, 'Required', b'1', 'Offering for Shared networks', b'0', b'0', 'Shared', '71ccadbf-5a60-4b1b-84d5-e15f33281b61', b'1', b'0', 'DefaultSharedNetworkOffering', 200, '[ { "name" : "Dns",\n                  "provider" : [ { "name" : "VirtualRouter" } ]\n                },\n                { "name" : "Firewall",\n                  "provider" : [ { "name" : "VirtualRouter" } ]\n                },\n                { "name" : "UserData",\n                  "provider" : [ { "name" : "VirtualRouter" } ]\n                },\n                { "name" : "Vpn",\n                  "provider" : [ { "name" : "VirtualRouter" } ]\n                },\n                { "capability" : [ { "canchooseservicecapability" : false,\n                        "name" : "SupportedSourceNatTypes",\n                        "value" : "peraccount"\n                      },\n                      { "canchooseservicecapability" : false,\n                        "name" : "RedundantRouter",\n                        "value" : "false"\n                      }\n                    ],\n                  "name" : "SourceNat",\n                  "provider" : [ { "name" : "VirtualRouter" } ]\n                },\n                { "name" : "Dhcp",\n                  "provider" : [ { "name" : "VirtualRouter" } ]\n                },\n                { "capability" : [ { "canchooseservicecapability" : false,\n                        "name" : "ElasticIp",\n                        "value" : "false"\n                      } ],\n                  "name" : "StaticNat",\n                  "provider" : [ { "name" : "VirtualRouter" } ]\n                },\n                { "name" : "PortForwarding",\n                  "provider" : [ { "name" : "VirtualRouter" } ]\n                },\n                { "capability" : [ { "canchooseservicecapability" : false,\n                        "name" : "SupportedLBIsolation",\n                        "value" : "dedicated"\n                      },\n                      { "canchooseservicecapability" : false,\n                        "name" : "ElasticLb",\n                        "value" : "false"\n                      },\n                      { "canchooseservicecapability" : false,\n                        "name" : "InlineMode",\n                        "value" : "false"\n                      }\n                    ],\n                  "name" : "Lb",\n                  "provider" : [ { "name" : "VirtualRouter" } ]\n                }\n              ]', '8ac7d993-01b2-4309-9775-54a9f3f46b2f', b'0', b'0', 'Enabled', 'Guest');

-- --------------------------------------------------------

--
-- Stand-in structure for view `planview`
--
CREATE TABLE IF NOT EXISTS `planview` (
`planid` int(11)
,`name` varchar(200)
,`description` varchar(200)
,`cpunumber` int(11)
,`cpu` int(11)
,`ram` int(11)
,`storage` int(11)
,`ip` varchar(3)
,`bandwidth` int(11)
,`transfer` varchar(3)
,`os` varchar(100)
,`appliance` varchar(200)
,`templatecode` varchar(200)
,`zoneid` varchar(50)
,`zonename` varchar(250)
);
-- --------------------------------------------------------

--
-- Table structure for table `serviceoffering`
--

CREATE TABLE IF NOT EXISTS `serviceoffering` (
  `index` int(11) NOT NULL AUTO_INCREMENT,
  `cpunumber` int(11) NOT NULL,
  `cpuspeed` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `defaultuse` bit(1) NOT NULL,
  `displaytext` varchar(200) NOT NULL,
  `id` varchar(45) NOT NULL,
  `issystem` bit(1) NOT NULL,
  `isvolatile` bit(1) NOT NULL,
  `limitcpuuse` bit(1) NOT NULL,
  `memory` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `networkrate` int(11) NOT NULL,
  `offerha` bit(1) NOT NULL,
  `storagetype` varchar(45) NOT NULL,
  PRIMARY KEY (`index`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `serviceoffering`
--

INSERT INTO `serviceoffering` (`index`, `cpunumber`, `cpuspeed`, `created`, `defaultuse`, `displaytext`, `id`, `issystem`, `isvolatile`, `limitcpuuse`, `memory`, `name`, `networkrate`, `offerha`, `storagetype`) VALUES
(1, 1, 500, '2013-09-02 00:47:54', b'0', 'Small Instance', 'd080e951-a857-47c3-a227-d02c0d6a33cf', b'0', b'0', b'0', 512, 'Small Instance', 200, b'0', 'shared'),
(2, 1, 1000, '2013-09-02 00:47:54', b'0', 'Medium Instance', 'dd584d3d-d23c-494a-8c29-ac69fb8f6b8b', b'0', b'0', b'0', 1024, 'Medium Instance', 200, b'0', 'shared');

-- --------------------------------------------------------

--
-- Table structure for table `vms`
--

CREATE TABLE IF NOT EXISTS `vms` (
  `id` varchar(50) NOT NULL,
  `userid` varchar(50) NOT NULL,
  `guestuser` varchar(50) NOT NULL,
  `guestpassword` varchar(50) NOT NULL,
  `vmusage` longtext NOT NULL,
  `vmusageminute` longtext NOT NULL,
  `vmusagehour` longtext NOT NULL,
  `vmusageday` longtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `vms`
--

-- --------------------------------------------------------

--
-- Table structure for table `vmsusage`
--

CREATE TABLE IF NOT EXISTS `vmsusage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vmid` varchar(50) NOT NULL,
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cpuused` double NOT NULL,
  `diskioread` double NOT NULL,
  `diskiowrite` double NOT NULL,
  `diskkbsread` double NOT NULL,
  `diskkbswrite` double NOT NULL,
  `networkkbsread` double NOT NULL,
  `networkkbswrite` double NOT NULL,
  `memused` double NOT NULL,
  `userid` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=22 ;

--
-- Dumping data for table `vmsusage`
--

-- --------------------------------------------------------

--
-- Table structure for table `vmsusageday`
--

CREATE TABLE IF NOT EXISTS `vmsusageday` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vmid` varchar(50) NOT NULL,
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cpuused` double NOT NULL,
  `diskioread` double NOT NULL,
  `diskiowrite` double NOT NULL,
  `diskkbsread` double NOT NULL,
  `diskkbswrite` double NOT NULL,
  `networkkbsread` double NOT NULL,
  `networkkbswrite` double NOT NULL,
  `memused` double NOT NULL,
  `userid` varchar(50) NOT NULL,
  `numcount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `vmsusagehour`
--

CREATE TABLE IF NOT EXISTS `vmsusagehour` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vmid` varchar(50) NOT NULL,
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cpuused` double NOT NULL,
  `diskioread` double NOT NULL,
  `diskiowrite` double NOT NULL,
  `diskkbsread` double NOT NULL,
  `diskkbswrite` double NOT NULL,
  `networkkbsread` double NOT NULL,
  `networkkbswrite` double NOT NULL,
  `memused` double NOT NULL,
  `userid` varchar(50) NOT NULL,
  `numcount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `vmsusageminute`
--

CREATE TABLE IF NOT EXISTS `vmsusageminute` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vmid` varchar(50) NOT NULL,
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cpuused` double NOT NULL,
  `diskioread` double NOT NULL,
  `diskiowrite` double NOT NULL,
  `diskkbsread` double NOT NULL,
  `diskkbswrite` double NOT NULL,
  `networkkbsread` double NOT NULL,
  `networkkbswrite` double NOT NULL,
  `memused` double NOT NULL,
  `userid` varchar(50) NOT NULL,
  `numcount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `zone`
--

CREATE TABLE IF NOT EXISTS `zone` (
  `id` varchar(50) NOT NULL,
  `name` varchar(250) NOT NULL,
  `isdefault` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `zone`
--

INSERT INTO `zone` (`id`, `name`, `isdefault`) VALUES
('f5e2ae45-d4e7-4125-be13-5a92d647e796', 'SQA', 1),
('b', 'Staging', 0),
('c', 'Production', 0),
('d', 'Develop', 0);

-- --------------------------------------------------------

--
-- Structure for view `planview`
--
DROP TABLE IF EXISTS `planview`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `planview` AS select `cloudstackplan`.`id` AS `planid`,`cloudstackplan`.`plan` AS `name`,`cloudstackplan`.`description` AS `description`,`serviceoffering`.`cpunumber` AS `cpunumber`,`serviceoffering`.`cpuspeed` AS `cpu`,`serviceoffering`.`memory` AS `ram`,`diskoffering`.`disksize` AS `storage`,'N/A' AS `ip`,`serviceoffering`.`networkrate` AS `bandwidth`,'N/A' AS `transfer`,`iso`.`ostypename` AS `os`,`iso`.`displaytext` AS `appliance`,`iso`.`name` AS `templatecode`,`zone`.`id` AS `zoneid`,`zone`.`name` AS `zonename` from ((((`cloudstackplan` join `serviceoffering` on((`serviceoffering`.`id` = `cloudstackplan`.`serviceofferingid`))) join `diskoffering` on((`diskoffering`.`id` = `cloudstackplan`.`diskofferingid`))) join `iso` on((`iso`.`id` = `cloudstackplan`.`templateid`))) join `zone` on((`zone`.`id` = `cloudstackplan`.`zoneid`)));

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
