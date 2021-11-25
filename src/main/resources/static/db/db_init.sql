use coffeeshop;

insert into cities(name) value ('Moscow');
insert into cities(name) value ('Saint Petersburg');
insert into cities(name) value ('Novosibirsk');
insert into cities(name) value ('Perm');
insert into cities(name) value ('Ekaterinburg');
insert into cities(name) value ('Vladivostok');

insert into categories(category_id, description, name) VALUES ('1', 'Ground coffee is made from the highest quality beans, which immediately makes it healthier compared to instant varieties.', 'Ground');
insert into categories(category_id, description, name) VALUES ('2', 'Coffee beans - The beans of the coffee tree from which the coffee drink is made.', 'Bean');
insert into categories(category_id, description, name) VALUES ('3', 'Arabian coffee, or, traditionally, the Arabian coffee tree is a species of the genus Coffee tribe Coffee family Madder. Also known as Arabica.','Arabica');
insert into categories(category_id, description, name) VALUES ('4', 'Robusta coffee is a plant species from the genus Coffee of the Madder family.', 'Robusta');

insert into products(product_id, count, date, description, image, price) values ('1', '20', '2021-10-14 10:10:17.78', 'КОФЕ МОЛОТЫЙ TASTY COFFEE БРАУН КЭНДИ 250Г', 'images/img1.jpg', '300');
insert into products(product_id, count, date, description, image, price) values ('2', '16', '2021-10-14 10:10:17.78', 'КОФЕ МОЛОТЫЙ TASTY COFFEE БАРИСТА 250Г', 'images/img2.jpg', '310');
insert into products(product_id, count, date, description, image, price) values ('3', '56', '2021-10-14 10:10:17.78', 'КОФЕ МОЛОТЫЙ TASTY COFFEE БЛЭК КЭНДИ 250Г', 'images/img3.jpg', '290');
insert into products(product_id, count, date, description, image, price) values ('4', '78', '2021-10-14 10:10:17.78', 'КОФЕ В ЗЕРНАХ TASTY COFFEE БЛЭК КЭНДИ 250Г', 'images/img4.jpg', '320');
insert into products(product_id, count, date, description, image, price) values ('5', '11', '2021-10-14 10:10:17.78', 'КОФЕ В ЗЕРНАХ TASTY COFFEE БАРИСТА 250Г', 'images/img5.jpg', '250');
insert into products(product_id, count, date, description, image, price) values ('6', '89', '2021-10-14 10:10:17.78', 'КОФЕ В ЗЕРНАХ TASTY COFFEE КОЛУМБИЯ УИЛА 250Г', 'images/img6.jpg', '305');

insert into product_category(product_id, category_id) VALUES ('1', '1');
insert into product_category(product_id, category_id) VALUES ('1', '4');
insert into product_category(product_id, category_id) VALUES ('2', '1');
insert into product_category(product_id, category_id) VALUES ('2', '3');
insert into product_category(product_id, category_id) VALUES ('3', '1');
insert into product_category(product_id, category_id) VALUES ('3', '3');
insert into product_category(product_id, category_id) VALUES ('4', '2');
insert into product_category(product_id, category_id) VALUES ('4', '3');
insert into product_category(product_id, category_id) VALUES ('5', '2');
insert into product_category(product_id, category_id) VALUES ('5', '3');
insert into product_category(product_id, category_id) VALUES ('6', '2');
insert into product_category(product_id, category_id) VALUES ('6', '4');