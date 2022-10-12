USE todolist;

DROP TABLE IF EXISTS userapp;

CREATE TABLE userapp (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  username VARCHAR(32) NOT NULL,
  password VARCHAR(250) NOT NULL,
  account_non_expired char(1) DEFAULT 1,
  account_non_locked char(1) DEFAULT 1,
  credentials_non_expired char(1) DEFAULT 1,
  enabled char(1) DEFAULT 1,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO userapp (username, password) VALUES
    ("gestor", "$2a$12$6nlXhhP34Ztl7kH2aTV3sOE0JPOUCo7IV4eJT4L9u4.16Xty21/oq" ),
    ("admilson", "$2a$12$pf4Qrsw2TJ2hI9Hq1mbSDOjWoSfiPHKytOQUahPUla8wSBCjaWrTy"),
    ("amina", "$2a$12$sJbuegLK2AcuAnEyZ/Hfq.Ay9PUap7YeCD2qm82NP4Bq11z4gLmCG"),
    ("telma", "$2a$12$g1mtVpVUDN5VT3zFu/xTh.LAaLdui5Dh9JFuGWTIZ55Wceiyd4suK");

DROP TABLE IF EXISTS auth_granted_authority;

CREATE TABLE auth_granted_authority (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  authority VARCHAR(32) NOT NULL,
  userapp_id bigint(20) unsigned NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (userapp_id) REFERENCES userapp(id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO auth_granted_authority (authority, userapp_id) VALUES
    ("admin", 1),
    ("user", 2),
    ("user", 3),
    ("user", 4);

DROP TABLE IF EXISTS status;

CREATE TABLE status (
  id tinyint NOT NULL,
  name VARCHAR(32) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO status
    (id, name)
VALUES
    (1, "pending"),
    (2, "completed");

DROP TABLE IF EXISTS task;

CREATE TABLE task (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  name VARCHAR(32) NOT NULL,
  description VARCHAR(32) NOT NULL,
  created_at datetime NOT NULL,
  updated_at datetime DEFAULT NULL,
  userapp_id bigint(20) unsigned NOT NULL,
  status_id tinyint DEFAULT 1,
  PRIMARY KEY (id),
  FOREIGN KEY (userapp_id) REFERENCES userapp(id),
  FOREIGN KEY (status_id) REFERENCES status(id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO todolist.task
(id, name, description, created_at, updated_at, userapp_id, status_id)
VALUES(1, 'task1', 'task1', '2022-10-11 23:48:00', NULL, 2, 1);
INSERT INTO todolist.task
(id, name, description, created_at, updated_at, userapp_id, status_id)
VALUES(2, 'task2', 'task2', '2022-10-11 23:48:00', NULL, 2, 2);
INSERT INTO todolist.task
(id, name, description, created_at, updated_at, userapp_id, status_id)
VALUES(3, 'task3', 'task3', '2022-10-11 23:48:00', NULL, 3, 1);
INSERT INTO todolist.task
(id, name, description, created_at, updated_at, userapp_id, status_id)
VALUES(4, 'task4', 'task4', '2022-10-11 23:48:00', NULL, 4, 1);


