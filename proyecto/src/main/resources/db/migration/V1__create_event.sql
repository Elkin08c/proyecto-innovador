CREATE TABLE IF NOT EXISTS event(
    id SERIAL,
    event_name VARCHAR(100)NOT NULL,
    description VARCHAR(100)NOT NULL ,
    address VARCHAR(100)NOT NULL,
    PRIMARY KEY(id)
);