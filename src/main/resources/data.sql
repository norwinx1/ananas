INSERT INTO FARMER_ENTITY(ID, NAME, COUNTRY, CITY, FIELD_SIZE) ((SELECT * FROM CSVREAD('src/main/resources/csv/farmer.csv')));
INSERT INTO PINEAPPLE_ENTITY(ID, TYPE, FARMER_ID, QUALITY, WEIGHT) ((SELECT * FROM CSVREAD('src/main/resources/csv/pineapple.csv')));