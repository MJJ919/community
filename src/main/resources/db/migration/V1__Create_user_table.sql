create table user
(
    id int auto_increment primary key,
    name         varchar(50)  not null,
    account_id   varchar(100) not null,
    token        varchar(100) null,
    gmt_create   bigint       null,
    gmt_modified bigint       null
);

