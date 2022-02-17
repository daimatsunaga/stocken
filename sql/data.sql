--originalに全て挿入
SET GLOBAL local_infile=on;
LOAD DATA LOCAL INFILE "/Users/matsunagadai/Downloads/train.tsv"
INTO TABLE original
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES
(@train_id,@name,@item_condition_id,@category_name,@brand_name,@price,@shipping,@item_description)
SET 
id=@train_id, 
name=@name,
condition_id=@item_condition_id,
category_name=@category_name,
brand=@brand_name,
price=@price,
shipping=@shipping,
description=@item_description;

--category_group
INSERT INTO category_group(big_category) VALUES('Beauty');
INSERT INTO category_group(big_category) VALUES('Electronics');
INSERT INTO category_group(big_category) VALUES('Handmade');
INSERT INTO category_group(big_category) VALUES('Home');
INSERT INTO category_group(big_category) VALUES('Kids');
INSERT INTO category_group(big_category) VALUES('Men');
INSERT INTO category_group(big_category) VALUES('Other');
INSERT INTO category_group(big_category) VALUES('Sports & Outdoors');
INSERT INTO category_group(big_category) VALUES('Vintage & Collectibles');
INSERT INTO category_group(big_category) VALUES('Women');