drop table address if exists

drop table person if exists

drop sequence if exists hibernate_sequence

create sequence hibernate_sequence start with 1 increment by 1

create table address (
       address_id bigint not null,
        city varchar(255) not null,
        line1 varchar(255) not null,
        line2 varchar(255),
        state varchar(255) not null,
        zip varchar(255) not null,
        person_id bigint,
primary key (address_id)
)

create table person (
       person_id bigint not null,
        dob timestamp,
        first_name varchar(255) not null,
gender integer,
last_name varchar(255) not null,
middle_name varchar(255),
primary key (person_id)
)

alter table address
add constraint FK81ihijcn1kdfwffke0c0sjqeb_sumit
       foreign key (person_id)
references person1