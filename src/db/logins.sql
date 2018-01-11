-- :name create-logins-table
-- :command :execute
-- :result :raw
CREATE TABLE logins (
  id SERIAL PRIMARY KEY ,
  user_name VARCHAR(50),
  password_hash VARCHAR (50),
  user_id BIGINT REFERENCES users(user_id)
)