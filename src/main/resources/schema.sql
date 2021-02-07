DROP database if exists testdb;
create database testdb;
use testdb;
create table if not exists counter(
id int primary key,
counter long
);