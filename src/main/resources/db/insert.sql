
set foreign_key_checks=0;

truncate table product;
truncate table feed_back;

insert into product(`id`,`name`,`price`,`details`,`currency`)
values (110,'luxury chair',4500.0,'Lorem ipsum dolor sit amet','FRC'),
 (111,'luxury sofa',4500.0,'Lorem ipsum dolor sit amet','USD'),
(112,'luxury bench',6500.0,'Lorem ipsum dolor sit amet','NGN'),
(113,'luxury table',8500.0,'Lorem ipsum dolor sit amet','NGN');

set foreign_key_checks=1;