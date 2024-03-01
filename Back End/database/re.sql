/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : re

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 12/10/2022 00:13:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `admin_first_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `admin_last_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `admin_email` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `admin_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 200003 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (200001, '123', 'hanyu', 'wang', '87654@qq.com', 'edward');
INSERT INTO `admin` VALUES (200002, '123', 'hanxiang', 'wang', '124443@qq.com', 'James');

-- ----------------------------
-- Table structure for cohort
-- ----------------------------
DROP TABLE IF EXISTS `cohort`;
CREATE TABLE `cohort`  (
  `cohort_id` int(11) NOT NULL AUTO_INCREMENT,
  `cohort_title` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_tags` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_web_link` varchar(2550) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_introducton` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_funding` varchar(25500) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_key_publication` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_participants` int(255) NULL DEFAULT NULL,
  `cohort_mparticipants` int(255) NULL DEFAULT NULL,
  `cohort_fparticipants` int(255) NULL DEFAULT NULL,
  `cohort_mean` int(255) NULL DEFAULT NULL,
  `cohort_20` int(255) NULL DEFAULT NULL,
  `cohort_2039` int(255) NULL DEFAULT NULL,
  `cohort_4059` int(255) NULL DEFAULT NULL,
  `cohort_60` int(255) NULL DEFAULT NULL,
  `cohort_source` varchar(25500) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_startyear` int(255) NULL DEFAULT NULL,
  `cohort_recentyear` int(255) NULL DEFAULT NULL,
  `cohort_avayears` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_numfollow` int(255) NULL DEFAULT NULL,
  `cohort_withdraw` int(255) NULL DEFAULT NULL,
  `cohort_lost` int(255) NULL DEFAULT NULL,
  `cohort_decrease` int(255) NULL DEFAULT NULL,
  `cohort_complete` int(255) NULL DEFAULT NULL,
  `cohort_timephase` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_anthropometrics` varchar(2550) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_lifestyle` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_health` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cohort_owner` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`cohort_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cohort
-- ----------------------------
INSERT INTO `cohort` VALUES (1, 'Health Outcomes and Lifestyle in a Sample of people with Multiple sclerosis (HOLISM)', 'Symptoms of multiple sclerosis (relapse number, disability, fatigue, depression); Quality of life', 'https://pubmed.ncbi.nlm.nih.gov/23691313/', NULL, 'Philanthropic', 'Dr Sandra Neate', 3039, 523, 2404, 46, 11, 852, 1696, 288, 'Online recruitment for the study took place over a 15-week period, using websites, a mailing list, and web 2.0 platforms such as blogs, forums, Facebook, and Twitter.', 2012, 2015, '3.9years', 4, NULL, 1733, NULL, 2466, 'Adulthood', NULL, 'Environment', 'Medical History', 200001);
INSERT INTO `cohort` VALUES (2, 'The Australian Breast Cancer Family Study (ABCFS)', 'Breast cancer', 'https://pubmed.ncbi.nlm.nih.gov/26174520/', NULL, NULL, 'John L Hopper', 31640, 0, 31460, 50, NULL, NULL, NULL, NULL, 'The New York, Philadelphia, Utah, Canadian and Australian sites recruited multiple-case families through family cancer clinics and community outreach.', 1992, 2010, '9 years', 28, 1582, 4430, 3480, 31640, 'Adulthood', 'Height, weight used to calculate BMI', 'Smoking', 'Medical History', 200002);
INSERT INTO `cohort` VALUES (3, 'Colon Cancer Family Registry Cohort (CCFR)', 'Colorectal cancer', 'https://pubmed.ncbi.nlm.nih.gov/29490034/', NULL, ' This work was supported by grant UM1 CA167551 from the\r\nNational Cancer Institute and through cooperative agreements with\r\nthe following CCFRC sites: Australasian Colorectal Cancer Family\r\nRegistry (U01 CA074778 and U01/U24 CA097735); Mayo Clinic\r\nCooperative Family Registry for Colon Cancer Studies (U01/U24\r\nCA074800); Ontario Familial Colorectal Cancer Registry (U01/U24\r\nCA074783); Seattle Colorectal Cancer Family Registry (U01/U24\r\nCA074794); University of Hawaii Colorectal Cancer Family\r\nRegistry (U01/U24 CA074806); and USC Consortium Colorectal\r\nCancer Family Registry U01/U24 CA074799). The targeted minority\r\nrecruitment was supported by grant R01 CA104132. The genome-\r\nwide association studies (GWAS) were supported by grants\r\nU01 CA 122839, R01 CA143237 and U19 CA148107. The CIMP\r\nand KRAS mutation testing was supported by R01 CA118699.\r\nAdditional support for case ascertainment was provided from the\r\nSurveillance, Epidemiology and End Results (SEER) Program of the\r\nNational Cancer Institute to the Fred Hutchinson Cancer Research\r\nCenter (Control Nos. N01-CN-67009 and N01-PC-35142, and\r\nContract No. HHSN2612013000121), the Hawai‘i Department of\r\nHealth (Control Nos. N01-PC-67001 and N01-PC-35137, and\r\nContract No. HHSN26120100037C), and the California\r\nDepartment of Public Health (contracts HHSN261201000035C\r\nawarded to the University of Southern California and\r\nHHSN261201000140C awarded to the Cancer Prevention Institute\r\nof California), the following US state cancer registries: AZ, CO,\r\nMN, NC and NH, and by the Victorian Cancer Registry, Australia\r\nand the Ontario Cancer Registry, Canada. A.K.W. is an NHMRC\r\nEarly Career Fellow. M.A.J. is an NHMRC Senior Research Fellow.\r\nJ.L.H. is a NHMRC Senior Principal Research Fellow. D.D.B. is a\r\nUniversity of Melbourne Research at Melbourne Accelerator\r\nProgram (R@MAP) Senior Research Fellow and NHMRC R.D.\r\nWright Career Development Fellow. The content of this manuscript\r\ndoes not necessarily reflect the views or policies of the National\r\nCancer Institute or any of the collaborating sites in the CCFRC, nor\r\ndoes mention of trade names, commercial products or organizations\r\nimply endorsement by the US Government or the CCFRC. Authors\r\nhad full responsibility for the design of the study, the collection of\r\nthe data, the analysis and interpretation of the data, the decision to\r\nsubmit the manuscript for publication and the writing of the\r\nmanuscript.', 'Mark Jenkins', 42489, 19163, 23326, NULL, NULL, NULL, NULL, NULL, 'Briefly, recruitment protocols fall\r\nbroadly into two main categories: population-based and\r\nclinic-based. Population-based probands were either people\r\nwith a diagnosis of recently diagnosed colorectal cancer\r\n(case-probands) identified from cancer registries, or people\r\nwithout a prior diagnosis of colorectal cancer (control-probands)\r\nrandomly sampled from the general population living\r\nin the relevant recruitment area using Medicare and\r\nDriver’s License files, telephone subscribers lists or electoral\r\nrolls, who were frequency-matched for age to the\r\ncase-probands. Clinic-based probands were people with or\r\nwithout colorectal cancer who were attendees at a family\r\ncancer clinic or genetics clinic.', 1997, 2018, '9.1years', NULL, NULL, 9161, 7019, 42489, 'Adulthood', NULL, NULL, NULL, 200002);
INSERT INTO `cohort` VALUES (4, 'HealthNuts Study', 'Allergy and Lung Health', 'https://pubmed.ncbi.nlm.nih.gov/25613427/', NULL, ' HealthNuts is funded by the National Health and Medical Research\r\nCouncil of Australia [APP491233 and APP1006215], the Ilhan\r\nFood Allergy Foundation, AnaphylaxiStop, the Victorian\r\nGovernment’s Operational Infrastructure Support Program and the\r\nCharles and Sylvia Viertel Medical Research Foundation.\r\nAdditional funding for follow-up of egg-allergic children at age 2\r\nyears was obtained from the Australian Egg Corporation, and funding\r\nfor a genome-wide association study was obtained from the US\r\nDepartment of Defence [W81XWH-10-1-0487].', 'Shyamali C Dharmage', 5276, 2665, 2611, 1, 5276, 0, 0, 0, ' Infants were recruited between\r\nSeptember 2007 and August 2011 when presenting for\r\ntheir routine scheduled vaccination at immunization\r\nclinics in greater metropolitan Melbourne and immediate\r\nsurrounds', 2007, 2011, '6years', 3, 148, 0, 0, 5276, 'Childhood', 'Height, weight, body fat, head circumference, waist circumference, BP, ', ' maternal and infant\r\ndiet, maternal vitamin and medication use in pregnancy,\r\nfamily history of allergic disease, pet exposure, exposure to\r\ntobacco smoke, history of migration and parental country\r\nof birth', 'Allergy', NULL);
INSERT INTO `cohort` VALUES (5, ' Melbourne Atopy Cohort study (MACS)', 'Allergy and Lung Health', 'https://pubmed.ncbi.nlm.nih.gov/27097746/', NULL, ' The first 6 years of the MACS was funded (study formula and staff)\r\nby Nestec Ltd, a subsidiary of Nestle´ Australia. The 12-year followup\r\nwas funded by a project grant from the Asthma Foundation of\r\nVictoria. The National Health and Medical Research Council of\r\nAustralia funded the 18-year (APP454856), and currently planned\r\n25-year (APP1079668) follow-up study, as well as a sub-project to\r\nexamine the role of early life vitamin D (APP1047485). In 2013, the\r\nNHMRC-funded Centre for Air Quality and Health Research and\r\nEvaluation (CAR) provided a seeding grant for geocoding participants’\r\naddresses and measuring genetic polymorphisms known to be\r\nassociated with the management of oxidative stress. In 2015,\r\nAsthma Australia funded a sub-study to examine human breast milk\r\noligosaccharides and microbiome in this cohort. All bodies that have\r\nfunded aspects of the MACS have had no role in interpretation or\r\npublication of study findings.,  The first 6 years of the MACS was funded (study formula and staff)\r\nby Nestec Ltd, a subsidiary of Nestle´ Australia. The 12-year followup\r\nwas funded by a project grant from the Asthma Foundation of\r\nVictoria. The National Health and Medical Research Council of\r\nAustralia funded the 18-year (APP454856), and the 25-year (APP1079668) follow-up study, as well as a sub-project to examine the role of early life vitamin D (APP1047485). In 2013, the NHMRC-funded Centre for Air Quality and Health Research and Evaluation (CAR) provided a seeding grant for geocoding participants’ addresses and measuring genetic polymorphisms known to be\r\nassociated with the management of oxidative stress. In 2015, Asthma Australia funded a sub-study to examine human breast milk oligosaccharides and microbiome in this cohort. All bodies that have funded aspects of the MACS have had no role in interpretation or publication of study findings.', 'Shyamali C Dharmage', 620, 318, 320, NULL, 620, 0, 0, 0, 'Expectant mothers attending the Mercy Maternity Hospital, Melbourne, Australia, were invited to participate in a study of the effect of modification of the infant diet on the risk o finfant allergy.', 1990, 1994, '25years', 27, 58, 52, 5, 620, 'Preganacy', 'Height, weight, body fat, head circumference, waist circumference, BP, ', 'Environment, physical activity, childhood nutrition, parental smoking. At 25 years queried proband and sibling nutrition and smoking habits.', 'Allergy, respiratory, parental medical history, medical characteristics', NULL);
INSERT INTO `cohort` VALUES (6, 'The Tasmanian Longitudinal\r\nHealth Study (TAHS)', 'Asthma, Chronic Bronchitis, Allergy and Lung Health, COPD, Eczema, Food allergy, Sleep disorders breathing', 'https://pubmed.ncbi.nlm.nih.gov/27272183/', NULL, 'This study was supported by the National Health and Medical Research Council (NHMRC) of Australia under NHMRC project grant scheme (299901, 1021275) and NHMRC European collaborative grant scheme (1101313) as part of ALEC (Ageing Lungs in European Cohorts funded by the European Union’s Horizon 2020 research and innovation programme under grant agreement No 633212); The University of Melbourne; Clifford Craig Medical Research Trust of Tasmania; the Victorian, Queensland & Tasmanian Asthma Foundations; The Royal Hobart Hospital; Helen MacPherson Smith Trust; and GlaxoSmithKline.', 'Shyamali C Dharmage', 8583, 4393, 4190, 7, 8583, 0, 0, 0, 'All children born in 1961 and attending school in the island state of Tasmania,\r\nAustralia.', 1968, 2012, '46years', 7, NULL, 2048, 407, 8583, 'Childhood, Adolescence, Adulthood', 'Height, Weight, Waist circumference, Neck circumference', 'Environment, Nutrition, Alcohol, Smoking, Sun exposure', 'Allergy, Cardiobascular, Blood pressure, Respiratory', NULL);
INSERT INTO `cohort` VALUES (7, ' Ten to Men (the Australian\r\nLongitudinal Study on Male Health)', 'Men\'s health', 'https://pubmed.ncbi.nlm.nih.gov/27686951/', NULL, ' We are grateful to the Australian Government Department of\r\nHealth for funding and to the boys and men who provided the survey\r\ndata.', 'Jane Pirkis', 15988, 15988, 0, NULL, 2734, 6507, 6763, 0, ' We used a stratified, multi-stage, cluster random sampling\r\ndesign to recruit our participants. We invited every eligible male in an individual\r\nhousehold to take part in the study. To be eligible, a potential\r\nparticipant had to be male, aged 10–55 at the time of recruitment,\r\nan Australian citizen or permanent resident and\r\nresident in the selected household', 2013, 2014, NULL, NULL, NULL, NULL, NULL, 15988, 'Adolescence', NULL, 'Nutrition, physical activity, smoking, alcohol, illicit drugs, sun exposure', NULL, NULL);
INSERT INTO `cohort` VALUES (8, 'European Community Respiratory Health Survey (ECRHS)', 'Allergy and Lung Health', 'https://www.ecrhs.org/', NULL, 'NHMRC', 'Caroline Lodge is the PI for ECRHS IIII, ', 876, 330, 390, 32, 0, 876, 0, 0, 'Electoral roll', 1990, 2012, NULL, 3, 76, NULL, 14, 876, 'Adulthood', 'Height, Weight', 'Smoking, Physical Activity', 'Allergy, Respiratory', NULL);
INSERT INTO `cohort` VALUES (9, 'The PEBBLES study', 'Allergy and Lung Health, Asthma, Children health, Eczema, Food allergy, Rhinitis', 'Lowe AJ, et al. PEBBLES study protocol: a randomised controlled trial to prevent atopic dermatitis, food allergy and sensitisation in infants with a family history of allergic disease using a skin barrier improvement strategy, Lowe AJ, et al. A phase 1 study of daily treatment with a ceramide-dominant triple lipid mixture commencing in neonates. BMC Dermatology. 2012, 12, Lowe AJ, et al. A randomized trial of a barrier lipid replacement strategy for the prevention of atopic dermatitis and allergic sensitization: the PEBBLES pilot study. BJD. 2017, Vol 178/1. ', NULL, 'NHMRC', 'Adrian J Lowe', 394, 220, 174, 6, 394, 0, 0, 0, 'media campaign, advertisements, WOM via hospital paed\'s', 2018, 2020, '1year', 4, 18, 3, 0, 393, 'Childhood', 'Height, Weight', 'Environment, Nutrition, Physical Activity, Smoking, Sun exposure', 'Allergy, Medical History', NULL);
INSERT INTO `cohort` VALUES (10, 'Respiratory Health in Northern Europe, Spain and Australia ', 'Allergy and Lung Health, Asthma', 'https://helse-bergen.no/fag-og-forsking/forsking/rhinessa/rhinessa-english ', NULL, 'NHMRC, NHMRC, Norwagean Research Council  and European Union', 'Shyamali C Dharmage', 8597, 4200, 4397, 24, 3000, 5500, 97, 0, 'RHINESSA participants were recruited from the offspring of the ECRHS 3/4 study. They were recruited from Aarhus, Denmark; Albacete and Huelva, Spain; Bergen, Norway; Gothenburg, Umeå and Uppsala, Sweden; Melbourne, Australia; Reykjavik, Iceland; and Tartu, Estonia', 2015, 2019, NULL, 4, 11, NULL, 0, 331, 'Adolescence, Offspring, Adulthood', 'Height, Weight, Waist Circumference, Other Body Measures', 'Smoking, Environment, Physical Activity', 'Allergy, Medical History, Reproductive', NULL);
INSERT INTO `cohort` VALUES (11, 'The Australian Paediatric Exposure to Radiation Cohort (Aust-PERC)', 'Cancer', NULL, NULL, 'This work was supported by the National Health and Medical Research Council [grant numbers 509190, 1027368, and 1084197].', 'John D Matthews', 11802846, 5973555, 5829921, NULL, 11802846, 0, 0, 0, 'De-identified Medicare service data and outcomes were obtained for all Australians born between 1966 and 2005 who were enrolled into the Medicare system by 31/12/2005. ', 2005, 2005, '22.3years', NULL, NULL, NULL, NULL, NULL, 'Childhood', NULL, NULL, 'There were 275 489 patients exposed to diagnostic nuclear medicine scans and 688 363 patients exposed to CT scans before age 20 and before cancer diagnosis', NULL);

-- ----------------------------
-- Table structure for superadmin
-- ----------------------------
DROP TABLE IF EXISTS `superadmin`;
CREATE TABLE `superadmin`  (
  `super_admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `super_admin_first_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `super_admin_last_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `super_admin_password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `super_admin_email` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `super_admin_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`super_admin_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 300002 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of superadmin
-- ----------------------------
INSERT INTO `superadmin` VALUES (300001, 'zhiyao', 'wang', '123', '0989@qq.com', 'peter');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `user_first_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `user_last_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `user_email` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 100003 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (100001, '123', 'kehan', 'zhang', '123@qq.com', 'kevin');
INSERT INTO `user` VALUES (100002, '123', 'tailong', 'lei', 'kkk@kkk.com', 'mark');

SET FOREIGN_KEY_CHECKS = 1;
