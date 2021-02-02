drop database if exists kaisa_vaccines;
create database kaisa_vaccines;
use kaisa_vaccines;

create table vaccines (
	id int primary key auto_increment,
    name varchar(64),
    vaccines_total long,
    vaccines_used long,
    people_total int
);

insert into vaccines (name, vaccines_total, vaccines_used, people_total) values
("Andalucía",251420,194101,15193),
("Aragón",42465,38170,1731),
("Asturias",45395,40011,5664),
("Baleares",23190,18105,1514),
("Canarias",47485,45482,1744),
("Cantabria",21125,19980,241),
("Castilla y León",95815,82162,5296),
("Castilla-La Mancha",63575,53880,1202),
("Cataluña",217020,168054,2598),
("C. Valenciana",111900,101437,2956),
("Extremadura",40275,32039,638),
("Galicia",68605,62011,3861),
("La Rioja",11965,8684,267),
("C. de Madrid",176615,142765,1738),
("R. de Murcia",46385,40757,1784),
("Navarra",21125,15754,767),
("País Vasco",57380,36864,1333),
("Ceuta",2180,1545,326),
("Melilla",2180,1500,203)
