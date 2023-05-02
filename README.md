# studenPortal

## Student Table

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int NOT NULL,
  `course` varchar(255) DEFAULT NULL,
  `grade` double NOT NULL,
  PRIMARY KEY (`id`)
);



## User Table
CREATE TABLE `user` (
  `User_id` int NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`User_id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci