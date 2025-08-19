-- Insertar usuarios
INSERT INTO users (id, email, password, enabled)
VALUES (1, 'juan@example.com', '1234', true);

INSERT INTO users (id, email, password, enabled)
VALUES (2, 'maria@example.com', 'abcd', false);

-- Insertar notas de Juan (user id = 1)
INSERT INTO note (id, title, body, owner_id, enabled)
VALUES (1, 'Nota 1 de Juan', 'Contenido de la primera nota de Juan', 1, true);

INSERT INTO note (id, title, body, owner_id, enabled)
VALUES (2, 'Nota 2 de Juan', 'Contenido de la segunda nota de Juan', 1, true);

-- Insertar notas de María (user id = 2)
INSERT INTO note (id, title, body, owner_id, enabled)
VALUES (3, 'Nota 1 de María', 'Contenido de la primera nota de María', 2, true);

INSERT INTO note (id, title, body, owner_id, enabled)
VALUES (4, 'Nota 2 de María', 'Contenido de la segunda nota de María', 2, false);
