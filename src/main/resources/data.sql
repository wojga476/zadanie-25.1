insert into adres (id, street, nr) values (1,'Zielona',3);
insert into adres (id, street, nr) values (2,'Górna',5);
insert into adres (id, street, nr) values (3,'Kwiatowa',16);

insert into mieszkaniec (id, first_name, last_name, sex) values (1,'gdsd','ghgho','female')
insert into mieszkaniec (id, first_name, last_name, sex) values (2,'dghfh','dam','female')
insert into mieszkaniec (id, first_name, last_name, sex) values (3,'saghdfa','dcfgm','male')
insert into mieszkaniec (id, first_name, last_name, sex) values (4,'shla','dfgfm','male')
insert into mieszkaniec (id, first_name, last_name, sex) values (5,'sfda','vsfm','male')
insert into mieszkaniec (id, first_name, last_name, sex) values (6,'jj','dfdvfm','male')

INSERT into mieszkanie (id, number, surface, mieszkaniec_id) VALUES (1,1,56.8,1);
INSERT into mieszkanie (id, number, surface, mieszkaniec_id) VALUES (2,2,67.7,2);
INSERT into mieszkanie (id, number, surface, mieszkaniec_id) VALUES (3,3,88.4,3);
INSERT into mieszkanie (id, number, surface, mieszkaniec_id) VALUES (4,4,123.9,4);
INSERT into mieszkanie (id, number, surface, mieszkaniec_id) VALUES (5,5,70.4,5);
INSERT into mieszkanie (id, number, surface, mieszkaniec_id) VALUES (6,7,34.6,6);

INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (1, 'ddf',1,1);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (2, 'bvb',1,2);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (3, 'fgbds',1,3);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (4, 'bvd',1,4);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (5, 'nhm',1,5);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (6, 'dgg',3,6);
INSERT into wspolnota (id, nazwa_wspolnoty, adres_id, mieszkanie_id) VALUES (7, 'gth',3,7);