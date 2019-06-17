											/* DDL */

/* drop tables and sequences to start fresh */											
DROP table car;
DROP table passenger;
DROP SEQUENCE CAR_ID_SEQ;
DROP SEQUENCE PASSENGER_ID_SEQ;

/* create schema structure */
CREATE TABLE passenger (
id NUMBER NOT NULL,
name VARCHAR2(50) NOT NULL,
car_id NUMBER,
PRIMARY KEY (id)
);

CREATE TABLE car (
id NUMBER NOT NULL,
driver NUMBER,
model VARCHAR2(50) NOT NULL,
PRIMARY KEY (id)
);

ALTER TABLE car 
ADD FOREIGN KEY(driver) REFERENCES passenger(id);

ALTER TABLE passenger
ADD FOREIGN KEY (car_id) REFERENCES car(id);

/* create sequences for the ID columns which the app will utlize */
CREATE SEQUENCE CAR_ID_SEQ INCREMENT BY 1 MAXVALUE 999999999999999999999999999 MINVALUE 0 CACHE 20;
CREATE SEQUENCE PASSENGER_ID_SEQ INCREMENT BY 1 MAXVALUE 999999999999999999999999999 MINVALUE 0 CACHE 20;

										/ * DML * /

/* insert values */
INSERT INTO car (id, driver, model) VALUES (1, 1, 'Honda');
INSERT INTO car (id, driver, model) VALUES (2, 2, 'Toyota');
INSERT INTO car (id, driver, model) VALUES (3, 3, 'Hyundai');
INSERT INTO passenger (id, name) VALUES (1, 'Michelle'); 
INSERT INTO passenger (id, name) VALUES (2, 'Tamika'); 
INSERT INTO passenger (id, name) VALUES (3, 'Tanya');
COMMIT;

/* update one column using WHERE clause  */
UPDATE PASSENGER SET car_id = 2 WHERE id = 4;
UPDATE PASSENGER SET car_id = 2 WHERE id = 5;
UPDATE PASSENGER SET car_id = 2 WHERE id = 6;
COMMIT;

/* SELECT statement: INNER JOIN Example */
SELECT passenger.name, car.model FROM PASSENGER INNER JOIN car ON passenger.car_id=car.id;

/* SELECT statement: WHERE clause */
SELECT passenger.name FROM PASSENGER WHERE car_id = 1;




