-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- 생성 시간: 18-08-10 11:20
-- 서버 버전: 10.1.31-MariaDB
-- PHP 버전: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 데이터베이스: `board`
--

-- --------------------------------------------------------

--
-- 테이블 구조 `currency_pair`
--

CREATE TABLE `currency_pair` (
  `id` int(11) NOT NULL,
  `currency_id` varchar(10) NOT NULL,
  `symbol` varchar(10) NOT NULL,
  `min_trade_size` varchar(10) NOT NULL,
  `max_price_digit` varchar(10) NOT NULL,
  `quote_increment` varchar(10) NOT NULL,
  `sort` varchar(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `max_size_digit` varchar(10) NOT NULL,
  `depth` varchar(10) NOT NULL,
  `connect` text NOT NULL,
  `create_date` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `update_date` timestamp(6) NOT NULL DEFAULT '0000-00-00 00:00:00.000000'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `currency_pair`
--

INSERT INTO `currency_pair` (`id`, `currency_id`, `symbol`, `min_trade_size`, `max_price_digit`, `quote_increment`, `sort`, `name`, `max_size_digit`, `depth`, `connect`, `create_date`, `update_date`) VALUES
(1, '0', 'btc_krw', '0.001', '0', '1000', '1', '비트코인', '4', '1000,10000', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002109471-%EB%B9%84%ED%8A%B8%EC%BD%94%EC%9D%B8', '2018-06-12 07:38:30.949214', '0000-00-00 00:00:00.000000'),
(2, '5', 'bch_krw', '0.01', '0', '100', '2', '비트코인캐시', '4', '100,1000', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002260451-%EB%B9%84%ED%8A%B8%EC%BD%94%EC%9D%B8%EC%BA%90%EC%8B%9C', '2018-06-12 07:38:30.965819', '0000-00-00 00:00:00.000000'),
(3, '4', 'etc_krw', '0.1', '0', '10', '3', '이더리움클래식', '4', '10,100', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002245452-%EC%9D%B4%EB%8D%94%EB%A6%AC%EC%9B%80%ED%81%B4%EB%9E%98%EC%8B%9D', '2018-06-12 07:38:30.961810', '0000-00-00 00:00:00.000000'),
(4, '2', 'eth_krw', '0.01', '0', '100', '4', '이더리움', '4', '100,1000', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002197271-%EC%9D%B4%EB%8D%94%EB%A6%AC%EC%9B%80', '2018-06-12 07:38:30.958544', '0000-00-00 00:00:00.000000'),
(5, '1', 'ltc_krw', '0.1', '0', '10', '12', '라이트코인', '4', '10,100', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002245352-%EB%9D%BC%EC%9D%B4%ED%8A%B8%EC%BD%94%EC%9D%B8', '2018-06-12 07:38:30.954997', '0000-00-00 00:00:00.000000'),
(6, '12', 'qtum_krw', '0.1', '0', '10', '19', '퀀텀', '4', '10,100', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002259911-%ED%80%80%ED%85%80-QTUM-', '2018-06-12 07:38:30.974746', '0000-00-00 00:00:00.000000'),
(7, '21', 'xmr_krw', '0.1', '0', '10', '20', '모네로', '4', '10,100', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002244692-%EB%AA%A8%EB%84%A4%EB%A1%9C', '2018-06-12 07:38:30.998638', '0000-00-00 00:00:00.000000'),
(8, '18', 'omg_krw', '0.1', '0', '10', '22', '오미세고', '4', '10,100', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002244752-%EC%98%A4%EB%AF%B8%EC%84%B8%EA%B3%A0', '2018-06-12 07:38:30.988528', '0000-00-00 00:00:00.000000'),
(9, '15', 'xrp_krw', '1', '0', '1', '24', '리플', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002259571-%EB%A6%AC%ED%94%8C', '2018-06-12 07:38:30.976879', '0000-00-00 00:00:00.000000'),
(10, '11', 'zec_krw', '0.1', '0', '10', '25', '지캐시', '4', '10,100', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002244732-%EC%A7%80%EC%BA%90%EC%8B%9C-ZEC-', '2018-06-12 07:38:30.971892', '0000-00-00 00:00:00.000000'),
(11, '24', 'iota_krw', '1', '0', '1', '29', '아이오타', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002259731-%EC%95%84%EC%9D%B4%EC%98%A4%ED%83%80', '2018-06-12 07:38:31.004656', '0000-00-00 00:00:00.000000'),
(12, '17', 'dash_krw', '0.01', '0', '100', '30', '대시', '4', '100,1000', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002244832-%EB%8C%80%EC%8B%9C', '2018-06-12 07:38:30.984297', '0000-00-00 00:00:00.000000'),
(13, '159', 'gto_krw', '1', '0', '1', '30', '기프토', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002260711-%EA%B8%B0%ED%94%84%ED%86%A0-GTO-', '2018-06-12 07:38:31.249592', '0000-00-00 00:00:00.000000'),
(14, '108', 'lend_krw', '10', '1', '0.1', '31', '이더렌드', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002242852-%EC%9D%B4%EB%8D%94%EB%A0%8C%EB%93%9C', '2018-06-12 07:38:31.198004', '0000-00-00 00:00:00.000000'),
(15, '68', 'xlm_krw', '10', '1', '0.1', '32', '스텔라루멘', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002118572-%EC%8A%A4%ED%85%94%EB%9D%BC%EB%A3%A8%EB%A9%98-', '2018-06-12 07:38:31.095184', '0000-00-00 00:00:00.000000'),
(16, '22', 'xem_krw', '1', '0', '1', '33', '뉴이코노미무브먼트', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002244672-%EB%89%B4%EC%9D%B4%EC%BD%94%EB%85%B8%EB%AF%B8%EB%AC%B4%EB%B8%8C%EB%A8%BC%ED%8A%B8-XEM-', '2018-06-12 07:38:31.001202', '0000-00-00 00:00:00.000000'),
(17, '10', 'btg_krw', '0.1', '0', '10', '34', '비트코인골드', '4', '10,100', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002259651-%EB%B9%84%ED%8A%B8%EC%BD%94%EC%9D%B8%EA%B3%A8%EB%93%9C-BTG-', '2018-06-12 07:38:30.968772', '0000-00-00 00:00:00.000000'),
(18, '87', 'ppt_krw', '0.1', '0', '10', '35', '포퓰러스', '4', '10,100', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002258571-%ED%8F%AC%ED%93%B0%EB%9F%AC%EC%8A%A4-PPT-', '2018-06-12 07:38:31.156758', '0000-00-00 00:00:00.000000'),
(19, '47', 'wtc_krw', '0.1', '0', '10', '36', '월튼체인', '4', '10,100', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002242812-%EC%9B%94%ED%8A%BC%EC%B2%B4%EC%9D%B8-WTC-', '2018-06-12 07:38:31.059337', '0000-00-00 00:00:00.000000'),
(20, '155', 'nano_krw', '1', '0', '1', '37', '나노', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002245632-%EB%82%98%EB%85%B8-', '2018-06-12 07:38:31.245926', '0000-00-00 00:00:00.000000'),
(21, '39', 'mco_krw', '1', '0', '1', '38', '모나코', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002258291-%EB%AA%A8%EB%82%98%EC%BD%94', '2018-06-12 07:38:31.038395', '0000-00-00 00:00:00.000000'),
(22, '19', 'xuc_krw', '1', '0', '1', '39', '익스체인지유니온', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002259531-%EC%9D%B5%EC%8A%A4%EC%B2%B4%EC%9D%B8%EC%A7%80%EC%9C%A0%EB%8B%88%EC%98%A8-XUC-', '2018-06-12 07:38:30.992018', '0000-00-00 00:00:00.000000'),
(23, '80', 'mana_krw', '10', '1', '0.1', '40', '디센트라랜드', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002242832-%EB%94%94%EC%84%BC%ED%8A%B8%EB%9D%BC%EB%9E%9C%EB%93%9C', '2018-06-12 07:38:31.148635', '0000-00-00 00:00:00.000000'),
(24, '16', 'hsr_krw', '1', '0', '1', '40', '에이치쉐어', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002259691-%EC%97%90%EC%9D%B4%EC%B9%98%EC%89%90%EC%96%B4-HSR-', '2018-06-12 07:38:30.980533', '0000-00-00 00:00:00.000000'),
(25, '27', 'snt_krw', '10', '1', '0.1', '41', '스테이터스네트워크토큰', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002243172-%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%84%B0%EC%8A%A4%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC%ED%86%A0%ED%81%B0-SNT-', '2018-06-12 07:38:31.015473', '0000-00-00 00:00:00.000000'),
(26, '20', 'eos_krw', '0.1', '0', '1', '41', '이오스', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002245232-%EC%9D%B4%EC%98%A4%EC%8A%A4', '2018-06-12 07:38:30.995296', '0000-00-00 00:00:00.000000'),
(27, '117', 'nas_krw', '1', '0', '1', '42', '네뷸러스', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002183532-%EB%84%A4%EB%B7%B8%EB%9F%AC%EC%8A%A4', '2018-06-12 07:38:31.222118', '0000-00-00 00:00:00.000000'),
(28, '152', 'mkr_krw', '0.01', '0', '100', '42', '메이커', '4', '100,1000', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002260691-%EB%A9%94%EC%9D%B4%EC%BB%A4', '2018-06-12 07:38:31.237260', '0000-00-00 00:00:00.000000'),
(29, '26', 'storj_krw', '1', '0', '1', '42', '스토리지', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002199951-%EC%8A%A4%ED%86%A0%EB%A6%AC%EC%A7%80-STORJ-', '2018-06-12 07:38:31.011144', '0000-00-00 00:00:00.000000'),
(30, '69', 'ark_krw', '1', '0', '1', '43', '아크', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002259311-%EC%95%84%ED%81%AC', '2018-06-12 07:38:31.109641', '0000-00-00 00:00:00.000000'),
(31, '32', 'nuls_krw', '1', '0', '1', '44', '눌스', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002183912-%EB%88%8C%EC%8A%A4', '2018-06-12 07:38:31.023510', '0000-00-00 00:00:00.000000'),
(32, '45', 'salt_krw', '1', '0', '1', '44', '솔트', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002258471-%EC%86%94%ED%8A%B8-SALT-', '2018-06-12 07:38:31.049681', '0000-00-00 00:00:00.000000'),
(33, '28', 'bcd_krw', '1', '0', '1', '46', '비트코인다이아몬드', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002244972-%EB%B9%84%ED%8A%B8%EC%BD%94%EC%9D%B8%EB%8B%A4%EC%9D%B4%EC%95%84%EB%AA%AC%EB%93%9C-BCD-', '2018-06-12 07:38:31.018775', '0000-00-00 00:00:00.000000'),
(34, '94', 'rdn_krw', '1', '0', '1', '47', '레이든네트워크', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002242972-%EB%A0%88%EC%9D%B4%EB%93%A0%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-RDN-', '2018-06-12 07:38:31.165474', '0000-00-00 00:00:00.000000'),
(35, '76', 'eng_krw', '1', '0', '1', '48', '이니그마', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002244272-%EC%9D%B4%EB%8B%88%EA%B7%B8%EB%A7%88-ENG-', '2018-06-12 07:38:31.126344', '0000-00-00 00:00:00.000000'),
(36, '40', 'san_krw', '1', '0', '1', '49', '센티멘트네트워크토큰', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002243132-%EC%84%BC%ED%8B%B0%EB%A9%98%ED%8A%B8%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC%ED%86%A0%ED%81%B0', '2018-06-12 07:38:31.041972', '0000-00-00 00:00:00.000000'),
(37, '96', 'ins_krw', '1', '0', '1', '50', '아이엔에스에코시스템', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002183752-%EC%95%84%EC%9D%B4%EC%97%94%EC%97%90%EC%8A%A4%EC%97%90%EC%BD%94%EC%8B%9C%EC%8A%A4%ED%85%9C-INS-', '2018-06-12 07:38:31.170113', '0000-00-00 00:00:00.000000'),
(38, '46', 'knc_krw', '1', '0', '1', '51', '카이버네트워크', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002199251-%EC%B9%B4%EC%9D%B4%EB%B2%84%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC', '2018-06-12 07:38:31.055319', '0000-00-00 00:00:00.000000'),
(39, '36', 'pay_krw', '1', '0', '1', '52', '텐엑스페이', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002199831-%ED%85%90%EC%97%91%EC%8A%A4%ED%8E%98%EC%9D%B4-PAY-', '2018-06-12 07:38:31.028195', '0000-00-00 00:00:00.000000'),
(40, '77', 'icn_krw', '1', '0', '1', '53', '아이코노미', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002258411-%EC%95%84%EC%9D%B4%EC%BD%94%EB%85%B8%EB%AF%B8-ICN-', '2018-06-12 07:38:31.137125', '0000-00-00 00:00:00.000000'),
(41, '99', 'dpy_krw', '1', '0', '1', '54', '델피', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002197451-%EB%8D%B8%ED%94%BC', '2018-06-12 07:38:31.179705', '0000-00-00 00:00:00.000000'),
(42, '57', 'elf_krw', '1', '0', '1', '55', '엘프', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002199151-%EC%97%98%ED%94%84-ELF-', '2018-06-12 07:38:31.079027', '0000-00-00 00:00:00.000000'),
(43, '50', 'zrx_krw', '1', '0', '1', '56', '제로엑스', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002184332-%EC%A0%9C%EB%A1%9C%EC%97%91%EC%8A%A4-ZRX-', '2018-06-12 07:38:31.062769', '0000-00-00 00:00:00.000000'),
(44, '60', 'sub_krw', '1', '0', '1', '57', '서브스트라텀', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002258371-%EC%84%9C%EB%B8%8C%EC%8A%A4%ED%8A%B8%EB%9D%BC%ED%85%80-SUB-', '2018-06-12 07:38:31.087500', '0000-00-00 00:00:00.000000'),
(45, '44', 'link_krw', '1', '0', '1', '58', '체인링크', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002258331-%EC%B2%B4%EC%9D%B8%EB%A7%81%ED%81%AC-LINK-', '2018-06-12 07:38:31.045887', '0000-00-00 00:00:00.000000'),
(46, '25', 'btm_krw', '1', '0', '1', '60', '바이텀', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002181912-%EB%B0%94%EC%9D%B4%ED%85%80-BTM-', '2018-06-12 07:38:31.008020', '0000-00-00 00:00:00.000000'),
(47, '59', 'ast_krw', '1', '0', '1', '61', '에어스왑', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002186472-%EC%97%90%EC%96%B4%EC%8A%A4%EC%99%91-AST-', '2018-06-12 07:38:31.083510', '0000-00-00 00:00:00.000000'),
(48, '54', 'cvc_krw', '1', '0', '1', '62', '시빅', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002258351-%EC%8B%9C%EB%B9%85-CVC-', '2018-06-12 07:38:31.069814', '0000-00-00 00:00:00.000000'),
(49, '38', 'gnt_krw', '1', '0', '1', '63', '골렘', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002242872-%EA%B3%A8%EB%A0%98', '2018-06-12 07:38:31.034558', '0000-00-00 00:00:00.000000'),
(50, '105', 'tio_krw', '1', '0', '1', '64', '트레이드토큰', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002199271-%ED%8A%B8%EB%A0%88%EC%9D%B4%EB%93%9C%ED%86%A0%ED%81%B0', '2018-06-12 07:38:31.193618', '0000-00-00 00:00:00.000000'),
(51, '114', 'la_krw', '1', '0', '1', '65', '라토큰', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002243012-%EB%9D%BC%ED%86%A0%ED%81%B0', '2018-06-12 07:38:31.216308', '0000-00-00 00:00:00.000000'),
(52, '153', 'snc_krw', '1', '0', '1', '66', '썬컨트렉트', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002259251-%EC%8D%AC%EC%BB%A8%ED%8A%B8%EB%A0%89%ED%8A%B8', '2018-06-12 07:38:31.241907', '0000-00-00 00:00:00.000000'),
(53, '100', 'ukg_krw', '1', '0', '1', '67', '유니코인골드', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002242672-%EC%9C%A0%EB%8B%88%EC%BD%94%EC%9D%B8%EA%B3%A8%EB%93%9C', '2018-06-12 07:38:31.183755', '0000-00-00 00:00:00.000000'),
(54, '138', 'theta_krw', '1', '0', '1', '68', '세타토큰', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002244252-%EC%84%B8%ED%83%80%ED%86%A0%ED%81%B0', '2018-06-12 07:38:31.232112', '0000-00-00 00:00:00.000000'),
(55, '51', 'vib_krw', '1', '0', '1', '69', '바이버레이트', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002197571-%EB%B0%94%EC%9D%B4%EB%B2%84%EB%A0%88%EC%9D%B4%ED%8A%B8-VIB-', '2018-06-12 07:38:31.065295', '0000-00-00 00:00:00.000000'),
(56, '111', 'utk_krw', '1', '0', '1', '70', '유트러스트', '4', '1,10', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002184592-%EC%9C%A0%ED%8A%B8%EB%9F%AC%EC%8A%A4%ED%8A%B8-UTK-', '2018-06-12 07:38:31.208696', '0000-00-00 00:00:00.000000'),
(57, '79', 'rcn_krw', '10', '1', '0.1', '71', '리피오크레딧네트워크', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002243472-%EB%A6%AC%ED%94%BC%EC%98%A4%ED%81%AC%EB%9E%98%EB%94%A7%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-', '2018-06-12 07:38:31.143145', '0000-00-00 00:00:00.000000'),
(58, '56', 'yoyo_krw', '10', '1', '0.1', '72', '요요우', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002258511-%EC%9A%94%EC%9A%94%EC%9A%B0-YOYO-', '2018-06-12 07:38:31.075200', '0000-00-00 00:00:00.000000'),
(59, '97', 'wrc_krw', '10', '1', '0.1', '73', '월드코어', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002245752-%EC%9B%94%EB%93%9C%EC%BD%94%EC%96%B4-WRC-', '2018-06-12 07:38:31.175205', '0000-00-00 00:00:00.000000'),
(60, '86', 'trx_krw', '10', '1', '0.1', '74', '트론', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002260471-%ED%8A%B8%EB%A1%A0-TRX-', '2018-06-12 07:38:31.152642', '0000-00-00 00:00:00.000000'),
(61, '135', 'poe_krw', '10', '1', '0.1', '75', '포엣', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002258551-%ED%8F%AC%EC%97%A3', '2018-06-12 07:38:31.227091', '0000-00-00 00:00:00.000000'),
(62, '90', 'dgb_krw', '10', '1', '0.1', '76', '디지바이트', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002186192-%EB%94%94%EC%A7%80%EB%B0%94%EC%9D%B4%ED%8A%B8', '2018-06-12 07:38:31.161172', '0000-00-00 00:00:00.000000'),
(63, '65', 'dat_krw', '10', '1', '0.1', '77', '데이텀', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002183832-%EB%8D%B0%EC%9D%B4%ED%85%80-DAT', '2018-06-12 07:38:31.091452', '0000-00-00 00:00:00.000000'),
(64, '102', 'dent_krw', '10', '1', '0.1', '78', '덴트', '4', '0.1,1', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002244292-%EB%8D%B4%ED%8A%B8', '2018-06-12 07:38:31.188698', '0000-00-00 00:00:00.000000'),
(65, '37', 'dgd_krw', '0.1', '0', '10', '79', '디직스다오', '4', '10,100', 'https://okcoinkr.zendesk.com/hc/ko/articles/360002245872-%EB%94%94%EC%A7%81%EC%8A%A4%EB%8B%A4%EC%98%A4', '2018-06-12 07:38:31.031224', '0000-00-00 00:00:00.000000');

--
-- 덤프된 테이블의 인덱스
--

--
-- 테이블의 인덱스 `currency_pair`
--
ALTER TABLE `currency_pair`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `currency_id` (`currency_id`),
  ADD KEY `rid` (`id`);

--
-- 덤프된 테이블의 AUTO_INCREMENT
--

--
-- 테이블의 AUTO_INCREMENT `currency_pair`
--
ALTER TABLE `currency_pair`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=391;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;