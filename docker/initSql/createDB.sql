--CREATE DATABASE menagerie;

create database hiberDB;
use hiberDB;

create table BK_FILE
(ID numeric(18,0)
,ORG_NAME varchar(100)
,NEW_NAME varchar(100)
,PATH_TO varchar(100)
,TYPE varchar(20)
,FLAG varchar(20)
,CREATE_USER varchar(50)
,CREATE_DATE timestamp
,UPDATE_USER varchar(50)
,UPDATE_DATE timestamp
);

select * from BK_FILE;