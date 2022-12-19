create table team_players (
    team_id int references team(id),
    player_id int references player(id),
    constraint team_fk foreign key(team_id)
        references team(id),
    constraint player_fk foreign key(player_id)
        references player(id)
);