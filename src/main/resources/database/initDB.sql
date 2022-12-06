CREATE TABLE IF NOT EXISTS user_account
(
  id SERIAL PRIMARY KEY,
  name text NOT NULL,
  surname text NOT NULL,
  patronymic text NOT NULL,
  birthday date NOT NULL,
  registrated_at date NOT NULL,
  phone text NOT NULL,
  account_type text NOT NULL,
  password NOT NULL
  tokens text[]
);
