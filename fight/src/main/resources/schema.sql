CREATE TABLE IF NOT EXISTS technique (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(50) NOT NULL,
    description varchar(50),
    category varchar(50),
    tags varchar(50),
    hit_point double
);