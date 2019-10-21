CREATE DATABASE banklist;

USE banklist;

CREATE TABLE `user`
(
    `userid`  int(11)     NOT NULL,
    `name`    varchar(45) NOT NULL,
    `surname` varchar(45) NOT NULL,
    PRIMARY KEY (`userid`)
);

INSERT INTO user (userid, name, surname)
VALUES (1, 'Stefan', 'Williams');
INSERT INTO user (userid, name, surname)
VALUES (2, 'Robin', 'Harris');
INSERT INTO user (userid, name, surname)
VALUES (3, 'Clarence', 'Thomas');
INSERT INTO user (userid, name, surname)
VALUES (4, 'Sandy', 'Robinson');
INSERT INTO user (userid, name, surname)
VALUES (5, 'Ernest', 'Walker');
INSERT INTO user (userid, name, surname)
VALUES (6, 'Samuel', 'Scott');
INSERT INTO user (userid, name, surname)
VALUES (7, 'Benjamin', 'Nelson');
INSERT INTO user (userid, name, surname)
VALUES (8, 'Luka', 'Mitchell');
INSERT INTO user (userid, name, surname)
VALUES (9, 'Fred', 'Morgan');
INSERT INTO user (userid, name, surname)
VALUES (10, 'Albert', 'Cooper');

CREATE TABLE `account`
(
    `accountid` int(11) NOT NULL,
    `account`   int(11) NOT NULL,
    `userid`    int(11) NOT NULL,
    PRIMARY KEY (`accountid`),
    KEY `userid_idx` (`userid`),
    CONSTRAINT `userid` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`)
);

INSERT INTO Account (accountid, account, userid)
VALUES (1, 100, 1);
INSERT INTO Account (accountid, account, userid)
VALUES (2, 200, 2);
INSERT INTO Account (accountid, account, userid)
VALUES (3, 300, 3);
INSERT INTO Account (accountid, account, userid)
VALUES (4, 400, 4);
INSERT INTO Account (accountid, account, userid)
VALUES (5, 500, 5);
INSERT INTO Account (accountid, account, userid)
VALUES (6, 600, 6);
INSERT INTO Account (accountid, account, userid)
VALUES (7, 700, 7);
INSERT INTO Account (accountid, account, userid)
VALUES (8, 800, 8);
INSERT INTO Account (accountid, account, userid)
VALUES (9, 900, 9);
INSERT INTO Account (accountid, account, userid)
VALUES (10, 1000, 10);


