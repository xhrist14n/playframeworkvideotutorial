# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table person (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  register_date                 datetime(6),
  constraint pk_person primary key (id)
);


# --- !Downs

drop table if exists person;

