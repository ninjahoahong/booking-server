-- :name create-users-table
-- :command :execute
-- :result :raw
CREATE TABLE users (
  id BIGSERIAL PRIMARY KEY,
  user_name VARCHAR (50),
  first_name VARCHAR (50),
  last_name VARCHAR (50)
)