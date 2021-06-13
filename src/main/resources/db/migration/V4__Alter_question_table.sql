alter table question
    add constraint question_pk
        primary key (id);

alter table question modify id int auto_increment;

