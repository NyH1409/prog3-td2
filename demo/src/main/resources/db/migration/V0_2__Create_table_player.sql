create table player (
    id int not null
        constraint player_pk primary key,
    name varchar not null,
    number int not null
);