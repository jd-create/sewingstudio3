
INSERT INTO accounts (username, password, enabled) VALUES ('account', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO accounts (username, password, enabled) VALUES ('admin', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO accounts (username, password, enabled) VALUES ('peter', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);

INSERT INTO authorities (username, authority) VALUES ('account', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('peter', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('peter', 'ROLE_ADMIN');

INSERT INTO address (addressid, street, housenumber, city) VALUES ( 1,'Witte de Withstraat', '12', 'Lutjebroek' );
INSERT INTO address (addressid, street, housenumber, city) VALUES ( 2,'Ruijsdaelkade', '46A' , 'Surhuisterveen');
INSERT INTO address (addressid, street, housenumber, city) VALUES ( 3,'Hendersonstraat', '231', 'Rijswijk' );