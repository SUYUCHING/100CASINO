
    alter table t_game_log 
        drop constraint FK_axfrcus6iepc9g7ksahvl3hu5;

    alter table t_player_game_log 
        drop constraint FK_l4x6vioybwk74gp7hoy5cb8yx;

    drop table if exists t_card cascade;

    drop table if exists t_game_log cascade;

    drop table if exists t_player_game_log cascade;

    drop table if exists t_player_game_status cascade;

    drop table if exists t_stie_log cascade;

    drop sequence seq_card_id;

    drop sequence seq_game_log_id;

    drop sequence seq_player_game_log_id;

    drop sequence seq_player_game_status_id;

    drop sequence seq_stie_log_id;

    create table t_card (
        f_id int8 not null,
        f_p1 int4,
        f_p2 int4,
        f_p3 int4,
        f_p4 int4,
        f_p5 int4,
        f_p6 int4,
        f_p7 int4,
        f_p8 int4,
        f_p9 int4,
        f_p10 int4,
        f_p11 int4,
        f_p12 int4,
        f_p13 int4,
        f_s1 int4,
        f_s2 int4,
        f_s3 int4,
        f_s4 int4,
        f_s5 int4,
        f_s6 int4,
        f_s7 int4,
        f_s8 int4,
        f_s9 int4,
        f_s10 int4,
        f_s11 int4,
        f_s12 int4,
        f_s13 int4,
        f_h1 int4,
        f_h2 int4,
        f_h3 int4,
        f_h4 int4,
        f_h5 int4,
        f_h6 int4,
        f_h7 int4,
        f_h8 int4,
        f_h9 int4,
        f_h10 int4,
        f_h11 int4,
        f_h12 int4,
        f_h13 int4,
        f_b1 int4,
        f_b2 int4,
        f_b3 int4,
        f_b4 int4,
        f_b5 int4,
        f_b6 int4,
        f_b7 int4,
        f_b8 int4,
        f_b9 int4,
        f_b10 int4,
        f_b11 int4,
        f_b12 int4,
        f_b13 int4,
        primary key (f_id)
    );

    create table t_game_log (
        f_id int8 not null,
        f_winner int4,
        f_card_str text,
        f_card_type int4,
        f_seq int4,
        f_create_date timestamp,
        f_number int4,
        f_game_ref_id int8,
        f_card_id int8,
        primary key (f_id)
    );

    create table t_player_game_log (
        f_id int8 not null,
        f_bet_amt numeric(19, 2),
        f_win_lose numeric(19, 2),
        f_create_date timestamp,
        f_player_id varchar(255),
        f_game_ref_id int8,
        f_game_log_id int8,
        primary key (f_id)
    );

    create table t_player_game_status (
        f_id int8 not null,
        f_tt_win_lose numeric(19, 2),
        f_seq int4,
        f_status int4,
        f_tt_bet numeric(19, 2),
        f_create_date timestamp,
        f_end_date timestamp,
        f_player_id varchar(255),
        f_game_ref_id int8,
        primary key (f_id)
    );

    create table t_stie_log (
        f_id int8 not null,
        f_status int4,
        f_game_ref_id int8,
        primary key (f_id)
    );

    alter table t_game_log 
        add constraint FK_axfrcus6iepc9g7ksahvl3hu5 
        foreign key (f_card_id) 
        references t_card;

    alter table t_player_game_log 
        add constraint FK_l4x6vioybwk74gp7hoy5cb8yx 
        foreign key (f_game_log_id) 
        references t_game_log;

    create sequence seq_card_id;

    create sequence seq_game_log_id;

    create sequence seq_player_game_log_id;

    create sequence seq_player_game_status_id;

    create sequence seq_stie_log_id;
