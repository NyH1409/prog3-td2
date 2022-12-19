create table play_against (
    id int not null
        constraint play_against_pk primary key,
    datetime timestamp not null,
    stadium varchar not null,
    first_team_id int references team(id),
    second_team_id int references team(id)
);