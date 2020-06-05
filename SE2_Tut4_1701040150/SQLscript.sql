CREATE schema CLOTHES_SHOP;

USE CLOTHES_SHOP;

CREATE TABLE SHIRT (
shirtID INT NOT NULL AUTO_INCREMENT,
shirtStyle VARCHAR(50) NOT NULL,
shirtName VARCHAR(255) NOT NULL,
Price DOUBLE NOT NULL,
PRIMARY KEY(shirtID));              

INSERT INTO SHIRT (shirtStyle, shirtName, Price) VALUE ("Crop-top", "Áo crop-top vàng quai bèo", 100000), 
													("T-shirt", "Áo phông trơn in Tom&Jerry", 150000),
                                                    ("Over-size", "Sơ mi over-size sọc xanh", 190000);

CREATE TABLE DRESS (
dressID INT NOT NULL AUTO_INCREMENT,
dressStyle VARCHAR(50) NOT NULL,
dressName VARCHAR(255) NOT NULL,
Price DOUBLE NOT NULL,
PRIMARY KEY(dressID));  

INSERT INTO DRESS (dressStyle, dressName, Price) VALUE ("Vay xuông", "Váy chiffon xanh", 250000), 
													("Vay xòe", "Váy bồng cổ bèo hoa nhí", 200000),
                                                    ("Chân váy", "Chân váy tennis", 190000);    
                                                    
CREATE TABLE ACESSORIES (
acessID INT NOT NULL AUTO_INCREMENT,
acessStyle VARCHAR(50) NOT NULL,
acessName VARCHAR(255) NOT NULL,
Price DOUBLE NOT NULL,
PRIMARY KEY(acessID));  

INSERT INTO ACESSORIES (acessStyle, acessName, Price) VALUE ("Vòng cổ", "Vòng cổ tim gắn đá", 270000), 
													("Vòng tay", "Lắc hoa lá bạc", 240000),
                                                    ("Nhẫn", "Nhẫn Hồ ly mắt tím HOT", 140000);                                                        