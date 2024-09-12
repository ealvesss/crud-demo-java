CREATE TABLE TB_GENDER (
                           ID_GENDER INTEGER NOT NULL PRIMARY KEY,
                           NAME VARCHAR(10) NOT NULL
);

CREATE TABLE TB_PERSON (
                           ID_PERSON INTEGER NOT NULL PRIMARY KEY,
                           ID_GENDER INTEGER NOT NULL,
                           FULL_NAME VARCHAR(50) NOT NULL,
                           BIRTHDATE DATE,
                           CONSTRAINT fk_gender FOREIGN KEY (ID_GENDER) REFERENCES TB_GENDER(ID_GENDER)
);