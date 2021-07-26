#CREATE DATABASE marvel;
CREATE TABLE original_issue (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    resource_uri  VARCHAR(50),
    name_original_issue VARCHAR(50)
) ENGINE = InnoDB;
INSERT INTO original_issue (resource_uri, name_original_issue) VALUES ('http://gateway.marvel.com/v1/public/comics/10223', 'Marvel Premiere (1972) #35');

CREATE TABLE next_table (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	resource_uri VARCHAR(255),
    name_next_table VARCHAR(255)
) ENGINE = InnoDB;
INSERT INTO next_table (resource_uri, name_next_table) VALUES ('http://gateway.marvel.com/v1/public/events/154', 'Avengers Disassembled');
INSERT INTO next_table (resource_uri, name_next_table) VALUES ('http://gateway.marvel.com/v1/public/events/155', 'Monsters Unleashed');

CREATE TABLE previous_table (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	resource_uri VARCHAR(255),
    name_next_table VARCHAR(255)
) ENGINE = InnoDB;

INSERT INTO previous_table (resource_uri, name_next_table) VALUES ('http://gateway.marvel.com/v1/public/events/194',  'X-MEN');
INSERT INTO previous_table (resource_uri, name_next_table) VALUES ('http://gateway.marvel.com/v1/public/events/200',  'X-MEN EVOLUTION');

CREATE TABLE thumbnail (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    path_thumbnail VARCHAR(255) NOT NULL,
    extension VARCHAR(255) NOT NULL
) ENGINE = InnoDB;
INSERT INTO thumbnail (path_thumbnail, extension) VALUES ('http://i.annihil.us/u/prod/marvel/i/mg/6/70/51ca1749980ae', 'jpg');
INSERT INTO thumbnail (path_thumbnail, extension) VALUES ('http://i.annihil.us/u/prod/marvel/i/mg/6/70/68ca3440923p2', 'jpg');

CREATE TABLE creator (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    collection_uri VARCHAR(255)
) ENGINE = InnoDB;
INSERT INTO creator (collection_uri) VALUES ('http://gateway.marvel.com/v1/public/comics/21546/creators1');
INSERT INTO creator (collection_uri) VALUES ('http://gateway.marvel.com/v1/public/comics/21546/creators2');

CREATE TABLE url (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    type_url VARCHAR(255) NOT NULL,
    url VARCHAR(255) NOT NULL
) ENGINE = InnoDB;
INSERT INTO url (type_url, url) VALUES ('comics.xhtml', 'www.marvel-comics.com');

CREATE TABLE item(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,    
    resource_uri VARCHAR(255),
    name_item VARCHAR(255),
    type_item VARCHAR(255),
    role_item VARCHAR(255)
) ENGINE = InnoDB;
INSERT INTO item (resource_uri, name_item, type_item, role_item) VALUES ('www.marvel-comics.com/images/path/marvel-comic/1', 'marvel-comics1', 'hq', '');
INSERT INTO item (resource_uri, name_item, type_item, role_item) VALUES ('www.marvel-comics.com/images/path/marvel-comic/2', 'marvel-comics2', 'ph', '');
INSERT INTO item (resource_uri, name_item, type_item, role_item) VALUES ('www.marvel-comics.com/images/path/marvel-comic/3', 'marvel-comics3', 'quadrinho', '');
INSERT INTO item (resource_uri, name_item, type_item, role_item) VALUES ('www.marvel-comics.com/images/path/marvel-comic/4', 'marvel-comics4', 'x-men', '');
INSERT INTO item (resource_uri, name_item, type_item, role_item) VALUES ('www.marvel-comics.com/images/path/marvel-comic/6', 'marvel-teste-null', NULL, ''); 

CREATE TABLE dates (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    type_dates VARCHAR(255),
    date_dates VARCHAR(255)  
) ENGINE = InnoDB;
INSERT INTO dates (type_dates, date_dates) VALUES ('onsaleDate', '2008-08-27');
INSERT INTO dates (type_dates, date_dates) VALUES ('onpriceDate', '2018-08-28');
INSERT INTO dates (type_dates, date_dates) VALUES ('onDate', '2021-08-28');

CREATE TABLE event_url (
	event_id BIGINT(20) NOT NULL,
    url_id BIGINT(20) NOT NULL
) ENGINE = InnoDB;

CREATE TABLE story (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50),
    description_story VARCHAR(50),
    resource_uri VARCHAR(50),
    type_story VARCHAR(50),
    modified VARCHAR(50),
    collection_uri VARCHAR(255),
    codigo_thumbnail BIGINT(20),    
    codigo_creator BIGINT(20),
    codigo_character BIGINT(20),
    codigo_serie BIGINT(20),
    codigo_comic BIGINT(20),
    codigo_event BIGINT(20),
    codigo_original_issue BIGINT(20),
    FOREIGN KEY (codigo_thumbnail) REFERENCES thumbnail (id),
    FOREIGN KEY (codigo_creator) REFERENCES creator (id),
    FOREIGN KEY (codigo_original_issue) REFERENCES original_issue (id)    
) ENGINE = InnoDB;
INSERT INTO story (title, description_story, resource_uri, type_story, modified, collection_uri, codigo_thumbnail, codigo_creator, codigo_character, codigo_serie, codigo_comic, codigo_event, codigo_original_issue) VALUES ('Cover #19947','','http://gateway.marvel.com/v1/public/stories/19947','cover', '1969-12-31T19:00:00-0500','www.marvel-comics.com/images/path/marvel-comic/collectionsSerie1', null, 1,1,1,1,1,1);
INSERT INTO story (title, description_story, resource_uri, type_story, modified, collection_uri, codigo_thumbnail, codigo_creator, codigo_character, codigo_serie, codigo_comic, codigo_event, codigo_original_issue) VALUES ('The Devils Music!','','http://gateway.marvel.com/v1/public/stories/19950','story', '1969-12-31T19:00:00-0500','www.marvel-comics.com/images/path/marvel-comic/collectionsSerie2', null, 1,1,1,1,1,1);


CREATE TABLE image (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    path_image VARCHAR(255) NOT NULL,
    extension VARCHAR(255) NOT NULL
) ENGINE = InnoDB;
INSERT INTO image (path_image, extension) VALUES ('www.marvel-comics.com/images/path/marvel-comic/iron-man', 'jpg');
INSERT INTO image (path_image, extension) VALUES ('www.marvel-comics.com/images/path/marvel-comic/flash', 'jpg');
INSERT INTO image (path_image, extension) VALUES ('www.marvel-comics.com/images/path/marvel-comic/thor', 'jpg');

CREATE TABLE text_table (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    type_text_table  VARCHAR(255),
    language_text_table VARCHAR(255),
    text_text_table TEXT
) ENGINE=InnoDB;
INSERT INTO text_table (type_text_table, language_text_table, text_text_table) VALUES ('issue_solicit_text', 'en-us', "SECRET INVASION TIE-IN!\r<br>THE EXPLOSIVE FINALE STARTS HERE!\r<br>Now that the KILL KREW knows Skrullowjacket's master plan, can they stop the TRUE purpose of the Fifty State Initiative? Plus:  It's THOR GIRL vs. ULTRA GIRL!  One is more than she appears to be... and the other's a Skrull. And, after fourteen issues, are we REALLY going to unmask MUTANT ZERO?!\r<br>Rated T+ ...$2.99");

CREATE TABLE price (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	type_price  VARCHAR(255),
    price DOUBLE
) ENGINE=InnoDB;

INSERT INTO price (type_price, price) VALUES ('printPrice', 2.99);
INSERT INTO price (type_price, price) VALUES ('printPrice', 3.99);
INSERT INTO price (type_price, price) VALUES ('printPrice', 6.99);

CREATE TABLE serie (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50),
    description_serie TEXT,
    resource_uri VARCHAR(50),
    start_year BIGINT(4),
    end_year BIGINT(4),
    rating VARCHAR(50),
	type_serie VARCHAR(50),
    modified VARCHAR(50),
    collection_uri VARCHAR(255),
    codigo_thumbnail BIGINT(20),
    codigo_creator BIGINT(20),
    codigo_character BIGINT(20),
    codigo_story BIGINT(20),
    codigo_comic BIGINT(20),
    codigo_event BIGINT(20),
    codigo_next BIGINT(20),
    codigo_previous BIGINT(20),
    FOREIGN KEY (codigo_thumbnail) REFERENCES thumbnail(id),
    FOREIGN KEY (codigo_creator) REFERENCES creator(id),
    FOREIGN KEY (codigo_next) REFERENCES next_table(id),
    FOREIGN KEY (codigo_previous) REFERENCES previous_table(id)
) ENGINE = InnoDB;
INSERT INTO serie (title, description_serie, resource_uri, start_year, end_year, rating, type_serie, modified, collection_uri, codigo_thumbnail, codigo_creator, codigo_character, codigo_story, codigo_comic, codigo_event, codigo_next, codigo_previous) VALUES ('Avengers (2000 - 2007)', null, 'http://gateway.marvel.com/v1/public/series/1945', 2000, 2007, 'T', '', '2013-03-20T17:51:27-0400', 'www.marvel-comics.com/images/path/marvel-comic/collectionsSerie2', 1, 1, 1, 1, 1, 1, null, null);
INSERT INTO serie (title, description_serie, resource_uri, start_year, end_year, rating, type_serie, modified, collection_uri, codigo_thumbnail, codigo_creator, codigo_character, codigo_story, codigo_comic, codigo_event, codigo_next, codigo_previous) VALUES ('Avengers: The Initiative (2007 - 2010)', null, 'http://gateway.marvel.com/v1/public/series/1945', 2007, 2010, 'T', '', '2013-03-20T17:51:27-0400', 'www.marvel-comics.com/images/path/marvel-comic/collectionsSerie2', 1, 1, 1, 1, 1, 1, null, null);
#INSERT INTO serie (collection_uri ) VALUES ('www.marvel-comics.com/images/path/marvel-comic/collectionsSerie2');

CREATE TABLE event_table (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    description_comic TEXT(20),
    resource_uri VARCHAR(255),
    modified  VARCHAR(255),
    event_start  VARCHAR(255),
	event_end  VARCHAR(255),
    codigo_thumbnail BIGINT(20),
    codigo_creator  BIGINT(20),
    codigo_story  BIGINT(20),
    codigo_serie  BIGINT(20),
    codigo_next  BIGINT(20),
    codigo_previous  BIGINT(20),
    codigo_character BIGINT(20),
    codigo_comic BIGINT(20),
    FOREIGN KEY (codigo_thumbnail) REFERENCES thumbnail(id),
    FOREIGN KEY (codigo_creator) REFERENCES creator(id),
    FOREIGN KEY (codigo_story) REFERENCES story(id),	
    FOREIGN KEY (codigo_serie) REFERENCES serie(id),
	FOREIGN KEY (codigo_next) REFERENCES next_table(id),
	FOREIGN KEY (codigo_previous) REFERENCES previous_table(id)
) ENGINE = InnoDB;

CREATE TABLE comic (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    digital_id BIGINT(20),
	title_comic VARCHAR(255),
    issue_number BIGINT(20),
    variant_description VARCHAR(255),
    description_comic VARCHAR(255),
    modified VARCHAR(255),
	isbn VARCHAR(255),
	upc VARCHAR(255),
	diamond_code VARCHAR(255),
	ean VARCHAR(255),
	issn VARCHAR(255),
    format_comic VARCHAR(255),
	page_count BIGINT(20),
    resource_uri VARCHAR(255), 
    codigo_thumbnail BIGINT(20),
    codigo_creator BIGINT(20),
    codigo_serie BIGINT(20),
    codigo_story BIGINT(20),
    codigo_event BIGINT(20),
    codigo_character  BIGINT(20),
    FOREIGN KEY (codigo_thumbnail) REFERENCES thumbnail(id),
    FOREIGN KEY (codigo_creator) REFERENCES creator(id),
	FOREIGN KEY (codigo_serie) REFERENCES serie(id),
	FOREIGN KEY (codigo_story) REFERENCES story(id)
) ENGINE = InnoDB;

INSERT INTO comic (digital_id,title_comic,issue_number,variant_description,description_comic,modified,isbn,upc,diamond_code,ean,issn,format_comic,page_count,resource_uri,codigo_thumbnail,codigo_creator,codigo_serie,codigo_story,codigo_event,codigo_character) VALUES (10949,'Avengers: The Initiative (2007) #19',19,'','Join 3-D MAN, CLOUD 9, KOMODO, HARDBALL, and heroes around America in the battle that will decide the fate of the planet and the future of the Initiative program. Will the Kill Krew Army win the day?','2015-10-27T16:38:23-0400','','5960606084-01511','AUG082377','','','Comic',32,'http://gateway.marvel.com/v1/public/comics/22299',1,1,1,1,1,1);
INSERT INTO comic (digital_id,title_comic,issue_number,variant_description,description_comic,modified,isbn,upc,diamond_code,ean,issn,format_comic,page_count,resource_uri,codigo_thumbnail,codigo_creator,codigo_serie,codigo_story,codigo_event,codigo_character) VALUES (10949,'Avengers: The Initiative (2007) #20',20,'','Join 3-D MAN, CLOUD 9, KOMODO, HARDBALL, and heroes around America in the battle that will decide the fate of the planet and the future of the Initiative program. Will the Kill Krew Army win the day?','2015-10-27T16:38:23-0400','','5960606084-01511','AUG082377','','','Comic',32,'http://gateway.marvel.com/v1/public/comics/22299',1,1,1,1,1,1);

CREATE TABLE character_table(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	name_character VARCHAR(255) NOT NULL,
	description_character VARCHAR(255) NOT NULL,
	modified VARCHAR(255),
    codigo_thumbnail BIGINT(20) NOT NULL,
    codigo_comic BIGINT(20) NOT NULL,
    codigo_serie BIGINT(20) NOT NULL,
    codigo_story BIGINT(20) NOT NULL,
    codigo_event BIGINT(20) NOT NULL,
    FOREIGN KEY (codigo_thumbnail) REFERENCES thumbnail(id),
    FOREIGN KEY (codigo_serie) REFERENCES serie(id),
    FOREIGN KEY (codigo_story) REFERENCES story(id),
    FOREIGN KEY (codigo_event) REFERENCES event_table(id),
	FOREIGN KEY (codigo_comic) REFERENCES comic(id)
) ENGINE=InnoDB;

ALTER TABLE event_table add FOREIGN KEY (codigo_character) REFERENCES character_table (id);
ALTER TABLE event_table add FOREIGN KEY (codigo_comic) REFERENCES comic (id);

INSERT INTO event_table (title, description_comic,resource_uri,modified,event_start,event_end,
codigo_thumbnail,codigo_creator,codigo_character,
codigo_story,codigo_comic,codigo_serie,codigo_next,codigo_previous) VALUES ('Acts of Vengeance!','Loki sets about convincing the super-villains of Earth to attack heroes other than those they normally fight in an attempt to destroy the Avengers to absolve his guilt over inadve
rtently creating the team in the first place.', 'http://gateway.marvel.com/v1/public/events/116','2013-06-28T16:31:24-0400','1989-12-10 00:00:00','2008-01-04 00:00:00',
1,1,NULL,1,1,1,1,1);

INSERT INTO event_table (title, description_comic,resource_uri,modified,event_start,event_end,
codigo_thumbnail,codigo_creator,codigo_character,
codigo_story,codigo_comic,codigo_serie,codigo_next,codigo_previous) VALUES ('TRANSFORMES','Loki sets about convincing the super-villains of Earth to attack heroes other than those they normally fight in an attempt to destroy the Avengers to absolve his guilt over inadve
rtently creating the team in the first place.', 'http://gateway.marvel.com/v1/public/events/116','2013-06-28T16:31:24-0400','1989-12-10 00:00:00','2008-01-04 00:00:00',
1,1,NULL,1,1,1,1,1);

INSERT INTO character_table (name_character, description_character, modified, codigo_thumbnail, codigo_comic, codigo_serie, codigo_story, codigo_event) VALUES ('Hulk', 'The Strongest avenger', "2021-07-20", 1, 1, 1, 1, 1);
INSERT INTO character_table (name_character, description_character, modified, codigo_thumbnail, codigo_comic, codigo_serie, codigo_story, codigo_event) VALUES ('All Might', 'The Strongest hero', "2021-07-20", 2, 2, 2, 2, 2);

UPDATE event_table SET codigo_character = 1 WHERE id=1;
UPDATE event_table SET codigo_character = 2 WHERE id=2;

ALTER TABLE serie add FOREIGN KEY (codigo_character) REFERENCES character_table (id);
ALTER TABLE serie add FOREIGN KEY (codigo_event) REFERENCES event_table (id);
ALTER TABLE serie add FOREIGN KEY (codigo_comic) REFERENCES comic (id);
ALTER TABLE serie add FOREIGN KEY (codigo_story) REFERENCES story (id);

INSERT INTO event_table (title, description_comic,resource_uri,modified,event_start,event_end,
codigo_thumbnail,codigo_creator,codigo_character,
codigo_story,codigo_comic,codigo_serie,codigo_next,codigo_previous) VALUES ('GUARDIÕES DA GALAXIA','Loki sets about convincing the super-villains of Earth to attack heroes other than those they normally fight in an attempt to destroy the Avengers to absolve his guilt over inadve
rtently creating the team in the first place.', 'http://gateway.marvel.com/v1/public/events/116','2013-06-28T16:31:24-0400','1989-12-10 00:00:00','2008-01-04 00:00:00',
1,1,1,1,1,1,1,1);

ALTER TABLE comic add FOREIGN KEY (codigo_event) REFERENCES event_table(id);
ALTER TABLE comic add FOREIGN KEY (codigo_character) REFERENCES character_table(id);  

CREATE TABLE creator_item (
	creator_id BIGINT(20) NOT NULL,
    item_id BIGINT(20) NOT NULL
) ENGINE = InnoDB;
INSERT INTO creator_item (creator_id, item_id) VALUES (1, 1);
INSERT INTO creator_item (creator_id, item_id) VALUES (1, 2);
INSERT INTO creator_item (creator_id, item_id) VALUES (1, 4);
INSERT INTO creator_item (creator_id, item_id) VALUES (1, 5);

CREATE TABLE character_table_url (
	character_table_id BIGINT(20) NOT NULL,
    url_id BIGINT(20) NOT NULL
) ENGINE = InnoDB; 
INSERT INTO character_table_url (character_table_id, url_id) VALUES (1, 1);
INSERT INTO character_table_url (character_table_id, url_id) VALUES (1, 2);
INSERT INTO character_table_url (character_table_id, url_id) VALUES (1, 3);

CREATE TABLE comic_character (
	comic_id BIGINT(20) NOT NULL,
    character_table_id  BIGINT(20) NOT NULL
) ENGINE = innoDB;

CREATE TABLE comic_url (
	comic_id BIGINT(20) NOT NULL,
    url_id BIGINT(20) NOT NULL
) ENGINE = InnoDB; 

CREATE TABLE comic_text_table (
	comic_id BIGINT(20) NOT NULL,
    text_table_id BIGINT(20) NOT NULL
) ENGINE = InnoDB; 

CREATE TABLE comic_price (
	comic_id BIGINT(20) NOT NULL,
    price_id BIGINT(20) NOT NULL
) ENGINE = InnoDB; 

CREATE TABLE comic_image (
	comic_id BIGINT(20) NOT NULL,
    image_id BIGINT(20) NOT NULL
) ENGINE = InnoDB; 

CREATE TABLE comic_dates (
	comic_id BIGINT(20) NOT NULL,
    dates_id BIGINT(20) NOT NULL
) ENGINE = InnoDB; 

CREATE TABLE serie_item (
	serie_id BIGINT(20) NOT NULL,
    item_id BIGINT(20) NOT NULL
) ENGINE = InnoDB;
INSERT INTO serie_item (serie_id, item_id) VALUES (1, 1);
INSERT INTO serie_item (serie_id, item_id) VALUES (1, 2);
INSERT INTO serie_item (serie_id, item_id) VALUES (1, 3);

CREATE TABLE serie_url (
	serie_id BIGINT(20) NOT NULL,
    url_id BIGINT(20) NOT NULL
) ENGINE = InnoDB;
INSERT INTO serie_url (serie_id, url_id) VALUES (1, 1);
INSERT INTO serie_url (serie_id, url_id) VALUES (1, 2);
INSERT INTO serie_url (serie_id, url_id) VALUES (1, 3);

CREATE TABLE event_item (
	event_id BIGINT(20) NOT NULL,
    item_id BIGINT(20) NOT NULL
) ENGINE = InnoDB;
INSERT INTO event_item (event_id, item_id) VALUES (1, 1);
INSERT INTO event_item (event_id, item_id) VALUES (1, 2);
INSERT INTO event_item (event_id, item_id) VALUES (1, 3);
INSERT INTO event_item (event_id, item_id) VALUES (1, 4);



CREATE TABLE story_item (
	story_id BIGINT(20) NOT NULL,
    item_id BIGINT(20) NOT NULL
) ENGINE = InnoDB;
INSERT INTO story_item (story_id, item_id) VALUES (1, 1);
INSERT INTO story_item (story_id, item_id) VALUES (1, 2);
INSERT INTO story_item (story_id, item_id) VALUES (1, 3);
INSERT INTO story_item (story_id, item_id) VALUES (1, 4);
INSERT INTO story_item (story_id, item_id) VALUES (1, 5);

CREATE TABLE comic_item (
	comic_id BIGINT(20) NOT NULL,
    item_id BIGINT(20) NOT NULL
) ENGINE = InnoDB;
INSERT INTO comic_item (comic_id, item_id) VALUES (1, 1);
INSERT INTO comic_item (comic_id, item_id) VALUES (1, 2);
INSERT INTO comic_item (comic_id, item_id) VALUES (1, 3);      


