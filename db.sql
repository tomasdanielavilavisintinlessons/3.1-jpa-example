create database libreriajpa;

use libreriajpa;

create table authors(
id int primary key auto_increment,
first_name varchar(255),
second_name varchar(255)
);

create table books(
id int primary key auto_increment,
title varchar(255)
);

insert into authors(first_name, second_name) values
('Chuck', 'Palahniuk'),
('James G.', 'Ballard'),
('William', 'Gibson');

insert into books(title) values
('Fight Club'),
('Crash'),
('Neuromant');