-- original
CREATE TABLE original (
  id int NOT NULL, 
  name varchar(255), 
  condition_id int, 
  category_name varchar(255), 
  brand varchar(255), 
  price double, 
  shipping int, 
  description text, 
  PRIMARY KEY (id)
) ;

create index brand_index
  on original(brand);
  
create unique index original_pki
  on original(id);
  
-- category
create table category (
   id serial not null, 
   parent int, 
   name varchar(255),
   name_all varchar(255), 
   primary key (id)
) ;

create unique index category_pki
  on category(id);

create index parent_id_index
  on category(parent);

-- users
create table users (
  id serial not null, 
  name varchar(255), 
  password varchar(255), 
  authority int
) ;

create unique index users_pki
  on users(id);

--items
create table items (
  id serial not null, 
  name varchar(255), 
  condition_id int, 
  category int, 
  brand varchar(255), 
  price double, 
  shipping int, 
  description text
) ;

create index items_brand_index
  on items(brand);

create index items_category_index
  on items(category);

create unique index items_pki
  on items(id);
  
  -- category_group
create table category_group (
   id serial not null, 
   big_category varchar(255)
) ;