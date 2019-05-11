CREATE TABLE employees (
  user_id NUMBER(7) PRIMARY KEY,
  username VARCHAR2(18) UNIQUE NOT NULL,
  pass_word VARCHAR2(18) NOT NULL,
  first_name VARCHAR2(20) NOT NULL,
  last_name VARCHAR2(20) NOT NULL
  );
  
CREATE TABLE tickets (
  ticket_id NUMBER(7) PRIMARY KEY,
  ticket_type NUMBER (1) CHECK(ticket_type > 0 AND ticket_type < 5) NOT NULL,
  amount FLOAT(10) CHECK (amount > 0) NOT NULL,
  submitted DATE,
  resolved DATE,
  status VARCHAR2(8),
  emp_desc VARCHAR(100)
  );
  
  SELECT * FROM employees;
  
  SELECT * FROM tickets;
  
  COMMIT;