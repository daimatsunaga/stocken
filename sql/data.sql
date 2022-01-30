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

