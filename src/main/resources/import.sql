

INSERT INTO addresses (street, city, state, postal_code, country) VALUES ('Rua das Cabras', 'São Paulo', 'SP', '01000-000', 'Brasil');

INSERT INTO addresses (street, city, state, postal_code, country)VALUES ('Avenida Central', 'Rio de Janeiro', 'RJ', '22000-000', 'Brasil');

INSERT INTO addresses (street, city, state, postal_code, country) VALUES ('Rua da Fazenda', 'Belo Horizonte', 'MG', '31000-000', 'Brasil');

INSERT INTO owners (name, email, address_id) VALUES ('Alberto Vilar', 'albertovilar1@email.com', 2);
INSERT INTO owners (name, email, address_id) VALUES ('Maria Oliveira', 'maria@email.com', 1);
INSERT INTO owners (name, email, address_id) VALUES ('Carlos Souza', 'carlos@email.com', 3);


-- Inserindo registros na tabela goat_farms
INSERT INTO goat_farms (name, registration_number, owner_id, address_id) VALUES ('Capril Vilar', '123456789', 2, 1);


INSERT INTO phones (number, owner_id, goat_farm_id) VALUES ('11987654321', 1, 1);
INSERT INTO phones (number, owner_id, goat_farm_id) VALUES ('1133224455', 2, 1);

-- 🐐 BISAVÓS PATERNOS
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622005', 'Bisavô Paterno Paterno', 'Macho', 'Boer', 'Preto', 'Ativo', 'Reprodutor', '2016-09-10', NULL, NULL);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622006', 'Bisavó Paterna Paterna', 'Fêmea', 'Boer', 'Branca', 'Ativo', 'Matriz', '2016-10-30', NULL, NULL);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622013', 'Bisavô Paterno Materno', 'Macho', 'Boer', 'Marrom', 'Ativo', 'Reprodutor', '2016-03-15', NULL, NULL);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622014', 'Bisavó Paterna Materna', 'Fêmea', 'Boer', 'Bege', 'Ativo', 'Matriz', '2016-05-22', NULL, NULL);

-- 🐐 BISAVÓS MATERNOS
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622015', 'Bisavô Materno Paterno', 'Macho', 'Boer', 'Preto', 'Ativo', 'Reprodutor', '2015-07-19', NULL, NULL);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622016', 'Bisavó Materna Paterna', 'Fêmea', 'Boer', 'Branca', 'Ativo', 'Matriz', '2015-09-05', NULL, NULL);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622017', 'Bisavô Materno Materno', 'Macho', 'Boer', 'Marrom Claro', 'Ativo', 'Reprodutor', '2015-02-11', NULL, NULL);
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622018', 'Bisavó Materna Materna', 'Fêmea', 'Boer', 'Bege', 'Ativo', 'Matriz', '2015-04-28', NULL, NULL);

-- 🐐 AVÓS PATERNOS
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622007', 'Avô Paterno', 'Macho', 'Boer', 'Preto', 'Ativo', 'Reprodutor', '2019-04-10', '164622005', '164622006');
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622008', 'Avó Paterna', 'Fêmea', 'Boer', 'Branca', 'Ativo', 'Matriz', '2019-06-22', '164622013', '164622014');

-- 🐐 AVÓS MATERNOS
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622011', 'Avô Materno', 'Macho', 'Boer', 'Marrom Claro', 'Ativo', 'Reprodutor', '2019-02-18', '164622015', '164622016');
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622012', 'Avó Materna', 'Fêmea', 'Boer', 'Bege', 'Ativo', 'Matriz', '2019-07-25', '164622017', '164622018');

-- 🐐 PAIS
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622001', 'Pai', 'Macho', 'Boer', 'Marrom', 'Ativo', 'Reprodutor', '2021-05-15', '164622007', '164622008');
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622009', 'Mãe', 'Fêmea', 'Boer', 'Bege', 'Ativo', 'Matriz', '2021-08-20', '164622011', '164622012');

-- 🐐 FILHO
INSERT INTO goats (registration_number, name, gender, breed, goat_color, status, category, birth_date, father_id, mother_id) VALUES ('164622010', 'Cabrito Principal', 'Macho', 'Boer', 'Branca', 'Ativo', 'Reprodutor', '2024-03-01', '164622001', '164622009');





