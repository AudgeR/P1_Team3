CREATE TABLE employees (
  user_id NUMBER(7) PRIMARY KEY,
  username VARCHAR2(18) UNIQUE NOT NULL,
  pass_word VARCHAR2(18) NOT NULL,
  first_name VARCHAR2(20) NOT NULL,
  last_name VARCHAR2(20) NOT NULL,
  is_admin VARCHAR2(1) CHECK(is_admin = 'Y' OR is_admin = 'N') NOT NULL
  );
  
CREATE SEQUENCE  userid_seq
    START WITH 1
    INCREMENT BY 1;
/

CREATE TRIGGER userid_seq_trigger
 BEFORE INSERT ON employees
 FOR EACH ROW
 BEGIN
    IF :new.user_id IS NULL THEN
    SELECT userid_seq.nextval INTO :new.user_id FROM dual;
    END IF;
END;
/ 
  
CREATE TABLE tickets (
  ticket_id NUMBER(7) PRIMARY KEY,
  ticket_type NUMBER (1) CHECK(ticket_type > 0 AND ticket_type < 5) NOT NULL,
  amount FLOAT(10) CHECK (amount > 0) NOT NULL,
  submitted DATE,
  resolved DATE,
  status VARCHAR2(8),
  emp_desc VARCHAR2(100),
  user_id NUMBER(7),
  CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES employees (user_id)
  );
 
CREATE SEQUENCE  ticketid_seq
    START WITH 1
    INCREMENT BY 1;
/ 

CREATE TRIGGER ticketid_seq_trigger
 BEFORE INSERT ON tickets
 FOR EACH ROW
 BEGIN
    IF :new.ticket_id IS NULL THEN
    SELECT ticketid_seq.nextval INTO :new.ticket_id FROM dual;
    END IF;
END;
/
  
  INSERT INTO employees VALUES(NULL, 'jt123', 'pass123', 'Johnny', 'Test', 'N');
  INSERT INTO employees VALUES(NULL, 'admin', 'password', 'Adam', 'Admin', 'Y');
  
  SELECT * FROM employees;
  
  SELECT * FROM tickets;
  
  COMMIT;