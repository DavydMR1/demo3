CREATE TABLE IF NOT EXISTS books (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title varchar(50) NOT NULL,
    author varchar(50) NOT NULL,
    publicationYear INT
);