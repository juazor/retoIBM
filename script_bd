-- Database: user_database

-- DROP DATABASE user_database;

CREATE DATABASE user_database
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Mexico.1252'
    LC_CTYPE = 'Spanish_Mexico.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
	
	-- SCHEMA: user_database

-- DROP SCHEMA user_database ;

CREATE SCHEMA user_database
    AUTHORIZATION postgres;
	
	
-- Table: user_database.pruebasumar

-- DROP TABLE user_database.pruebasumar;

CREATE TABLE user_database.pruebasumar
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 0 MINVALUE 0 MAXVALUE 9999999 CACHE 1 ),
    num1 integer,
    num2 integer,
    resultado integer
)

TABLESPACE pg_default;

ALTER TABLE user_database.pruebasumar
    OWNER to postgres;