INSERT INTO users
(id, email, hash_password, state, role)
  SELECT
    1,
    'admin@admin.com',
    '$2a$10$CVYX7vIc3a7nz7cWiGj0xeBUlAfcg7dVtWc2n5hQv7CNzTD4UGxeK',
    'CONFIRMED',
    'ADMIN'
  WHERE
    NOT EXISTS(
        SELECT id
        FROM users
        WHERE id = 1
    );