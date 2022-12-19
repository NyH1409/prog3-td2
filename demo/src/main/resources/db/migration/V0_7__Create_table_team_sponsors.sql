create table team_players (
    team_id int references team(id),
    sponsor_id int references sponsor(id),
    constraint team_fk foreign key(team_id)
        references team(id),
    constraint sponsor_fk foreign key(sponsor_id)
        references sponsor(id),
);