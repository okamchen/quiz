insert into user(id, username, password) values (user_seq.nextval, 'oelton', '1234');
insert into user(id, username, password) values (user_seq.nextval, 'rodrigo', '1234');
insert into user(id, username, password) values (user_seq.nextval, 'jabel', '1234');

insert into card(id, name) values (1, 'Esporte');
insert into card(id, name) values (2, 'Seriado');
insert into card(id, name) values (3, 'História');
insert into card(id, name) values (4, 'Geografia');
insert into card(id, name) values (5, 'Conhecimentos Gerais');


insert into question(id, description, awser, punctuation) values (1, 'O Grêmio é o maior clube do Rio Grande do Sul?', true, 1);
insert into question(id, description, awser, punctuation) values (2, 'O Internacional é a maior vergonha do futebol Brasileiro', true, 1);
insert into question(id, description, awser, punctuation) values (3, 'O primeiro campeão gaucho foi o Brasil de Pelotas?', true, 1);
insert into question(id, description, awser, punctuation) values (4, 'O Grêmio é o maior clube do Rio Grande do Sul?', true, 1);
insert into question(id, description, awser, punctuation) values (5, 'O Grêmio é o maior clube do Rio Grande do Sul?', true, 1);

insert into card_question(id_card, id_question) values (1, 1);
insert into card_question(id_card, id_question) values (1, 2);
insert into card_question(id_card, id_question) values (1, 3);
insert into card_question(id_card, id_question) values (1, 4);
insert into card_question(id_card, id_question) values (1, 5);

insert into question(id, description, awser, punctuation) values (6, 'Todo mundo odeia o Chris?', true, 1);
insert into question(id, description, awser, punctuation) values (7, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', true, 1);
insert into question(id, description, awser, punctuation) values (8, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', false, 1);
insert into question(id, description, awser, punctuation) values (9, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', false, 1);
insert into question(id, description, awser, punctuation) values (10, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', true, 1);

insert into card_question(id_card, id_question) values (2, 6);
insert into card_question(id_card, id_question) values (2, 7);
insert into card_question(id_card, id_question) values (2, 8);
insert into card_question(id_card, id_question) values (2, 9);
insert into card_question(id_card, id_question) values (2, 10);

insert into question(id, description, awser, punctuation) values (11, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', false, 1);
insert into question(id, description, awser, punctuation) values (12, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', true, 1);
insert into question(id, description, awser, punctuation) values (13, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', true, 1);
insert into question(id, description, awser, punctuation) values (14, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', false, 1);
insert into question(id, description, awser, punctuation) values (15, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', true, 1);

insert into card_question(id_card, id_question) values (3, 11);
insert into card_question(id_card, id_question) values (3, 12);
insert into card_question(id_card, id_question) values (3, 13);
insert into card_question(id_card, id_question) values (3, 14);
insert into card_question(id_card, id_question) values (3, 15);

insert into question(id, description, awser, punctuation) values (16, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', false, 1);
insert into question(id, description, awser, punctuation) values (17, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', true, 1);
insert into question(id, description, awser, punctuation) values (18, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', false, 1);
insert into question(id, description, awser, punctuation) values (19, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', false, 1);
insert into question(id, description, awser, punctuation) values (20, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', true, 1);

insert into card_question(id_card, id_question) values (4, 16);
insert into card_question(id_card, id_question) values (4, 17);
insert into card_question(id_card, id_question) values (4, 18);
insert into card_question(id_card, id_question) values (4, 19);
insert into card_question(id_card, id_question) values (4, 20);

insert into question(id, description, awser, punctuation) values (21, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', true, 1);
insert into question(id, description, awser, punctuation) values (22, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', false, 1);
insert into question(id, description, awser, punctuation) values (23, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', true, 1);
insert into question(id, description, awser, punctuation) values (24, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', true, 1);
insert into question(id, description, awser, punctuation) values (25, 'Bla Bla Bla Bla Bla Bla Bla Bla Bla ?', false, 1);

insert into card_question(id_card, id_question) values (5, 21);
insert into card_question(id_card, id_question) values (5, 22);
insert into card_question(id_card, id_question) values (5, 23);
insert into card_question(id_card, id_question) values (5, 24);
insert into card_question(id_card, id_question) values (5, 25);
