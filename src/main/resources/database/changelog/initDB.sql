create table if not exists trip
(
    id bigint primary key,
    company bigint,
    plane varchar(250),
    town_from varchar(250),
    town_to varchar(250),
    time_in date,
    tinme_out date
),
create table if not exist company
(
    it bigint primary key,
    name varchar(250),
    trip_id bigint
)