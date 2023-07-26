# screenmatch

Settings to run the project:

1) Install MySql.
2) Open a terminal:
 - mysql -u seu_usuario -p screenmatch
 - your password
 - add table:
   
    create table movies(
    id bigint not null auto_increment,
    name varchar(100) not null,
    duration_in_minutes int not null,
    release_year int not null,
    gender varchar(100),
    primary key(id)
    );
