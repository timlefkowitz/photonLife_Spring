CREATE DATABASE IF NOT EXISTS qwe_db;

CREATE USER admin@localhost IDENTIFIED BY 'codeup';
GRANT ALL ON qwe_db.* TO admin@localhost;