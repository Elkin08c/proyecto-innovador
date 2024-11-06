
CREATE TABLE IF NOT EXISTS event(
    id SERIAL,
    event_name VARCHAR(100) NOT NULL,
    description VARCHAR(100) NOT NULL,
    address VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
    );


CREATE TABLE IF NOT EXISTS organizer (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    contact_info VARCHAR(100)
    );


ALTER TABLE event
ADD COLUMN organizer_id INT,
ADD FOREIGN KEY (organizer_id) REFERENCES organizer(id) ON DELETE SET NULL;
