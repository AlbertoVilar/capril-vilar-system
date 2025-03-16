

INSERT INTO addresses (street, city, state, postal_code, country) VALUES ('Rua das Cabras', 'São Paulo', 'SP', '01000-000', 'Brasil');

INSERT INTO addresses (street, city, state, postal_code, country)VALUES ('Avenida Central', 'Rio de Janeiro', 'RJ', '22000-000', 'Brasil');

INSERT INTO addresses (street, city, state, postal_code, country) VALUES ('Rua da Fazenda', 'Belo Horizonte', 'MG', '31000-000', 'Brasil');

INSERT INTO owners (name, email, address_id) VALUES ('Alberto Vilar', 'albertovilar1@email.com', 2);
INSERT INTO owners (name, email, address_id) VALUES ('Maria Oliveira', 'maria@email.com', 1);
INSERT INTO owners (name, email, address_id) VALUES ('Carlos Souza', 'carlos@email.com', 3);


INSERT INTO goat_farms (name, owner_id, address_id, tod) VALUES ('Capril Vilar', 2, 1, '16432');


INSERT INTO phones (number, owner_id, goat_farm_id) VALUES ('11987654321', 1, 1);
INSERT INTO phones (number, owner_id, goat_farm_id) VALUES ('1133224455', 2, 1);

--  BISAVÓS PATERNOS
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('1422913451', 'BALOTELI DA CAPRIVAMAR', 'Macho', 'Alpina', 'Indefinida', 'ATIVO', 'Reprodutor', '2013-01-01', NULL, NULL, true);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('1422913488', 'COROA DA CAPRIVAMAR', 'Fêmea', 'Alpina', 'Indefinida', 'ATIVO', 'Matriz', '2013-01-01', NULL, NULL, true);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('1421308033', 'SHEREK SANRI', 'Macho', 'Alpina', 'Indefinida', 'ATIVO', 'Reprodutor', '2008-01-01', NULL, NULL, true);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('1418510219', 'JUCELISE DO INLI', 'Fêmea', 'Alpina', 'Indefinida', 'ATIVO', 'Matriz', '2010-01-01', NULL, NULL, true);

--  BISAVÓS MATERNOS
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('1403110395', 'NATAL DO JACOMÉ', 'Macho', 'Alpina', 'Indefinida', 'ATIVO', 'Reprodutor', '2010-01-01', NULL, NULL, true);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('1650112018', '12018 CAPRIMEL', 'Fêmea', 'Alpina', 'Indefinida', 'ATIVO', 'Matriz', '2012-01-01', NULL, NULL, true);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('2104406006', 'HERE DO ANGICANO', 'Macho', 'Alpina', 'Indefinida', 'ATIVO', 'Reprodutor', '2006-01-01', NULL, NULL, true);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('2114510040', 'TOPÁZIO DO CRS', 'Fêmea', 'Alpina', 'Indefinida', 'ATIVO', 'Matriz', '2010-01-01', NULL, NULL, true);

--  AVÓS PATERNOS
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('1422915618', 'PETRÓLEO CAPRIVAMAR', 'Macho', 'Alpina', 'Indefinida', 'ATIVO', 'Reprodutor', '2015-01-01', '1422913451', '1422913488', true);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('1422913470', 'BÉLGICA DA CAPRIVAMAR', 'Fêmea', 'Alpina', 'Indefinida', 'ATIVO', 'Matriz', '2013-01-01', '1421308033', '1418510219', true);

--  AVÓS MATERNOS
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('1650113018', 'JOSA CAPRIMEL', 'Macho', 'Alpina', 'Indefinida', 'ATIVO', 'Reprodutor', '2013-01-01', '1403110395', '1650112018', true);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('2114513061', 'PANTALONA DO CRS', 'Fêmea', 'Alpina', 'Indefinida', 'ATIVO', 'Matriz', '2013-01-01', '2104406006', '2114510040', true);

--  PAIS
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('1635717065', 'C.V.C SIGNOS PETROLEO', 'Macho', 'Alpina', 'Indefinida', 'ATIVO', 'Reprodutor', '2017-01-01', '1422915618', '1422913470', true);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active) VALUES ('2114517012', 'NAIDE DO CRS', 'Fêmea', 'Alpina', 'Indefinida', 'ATIVO', 'Matriz', '2017-01-01', '1650113018', '2114513061', true);

--  FILHO
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id, active, goat_farm_id) VALUES ('1643218012', 'XEQUE V DO CAPRIL VILAR', 'Macho', 'Alpina', 'CHAMOISÉE', 'ATIVO', 'POT', '2018-06-27', '1635717065', '2114517012', true, 1); -- Adicionado goat_farm_id = 1