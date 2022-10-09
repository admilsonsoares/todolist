
USE todolist;

DROP TABLE IF EXISTS profile;

CREATE TABLE profile (
  id tinyint NOT NULL,
  name VARCHAR(32) NOT NULL,
  description VARCHAR(32) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO profile
    (id, name, description)
VALUES
    (1, "super user", "usuario admin"),
    (2, "default", "usuario padrao");

DROP TABLE IF EXISTS userapp;

CREATE TABLE userapp (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  name VARCHAR(32) NOT NULL,
  profile_id tinyint DEFAULT 2,
  PRIMARY KEY (id),
  FOREIGN KEY (profile_id) REFERENCES profile(id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO userapp
    (name, profile_id)
VALUES
    ("administrator", 1);

INSERT INTO userapp
    (name)
VALUES
    ("amina"),
    ("telma"),
    ("admilson");

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
  user_id bigint(20) unsigned NOT NULL,
  status_id tinyint DEFAULT 1,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES userapp(id),
  FOREIGN KEY (status_id) REFERENCES status(id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


