# BTLJava
# **About**
Đây là một dự án game 2048 đơn giản được viết bằng ngôn ngữ Java

Người chơi có thể chơi và lưu điểm của mình khi đạt điểm cao

**Công nghệ được sử dụng**

- Java JDK
- JDBC
- Cơ sở dữ liệu: MySQL Workbean

**Chạy trên Eclipse**

==========**Sử dụng Cơ sở dữ liệu**==========

Tất nhiên ta phải tạo 1 đường liên kết với cơ sở dữ liệu

Em sử dụng Workbean

User: root

Password: 123456789 (Tùy máy có thể có một mật khẩu khác nhau do chính bản thân tự đặt)

Port: 3333 (Cổng port này em tự tạo, có thể tạo cổng Port nhưng phải cùng cổng với nhau trong Java và Workbean)

*Sau khi tạo xong thì vào file JDBCUtil để sửa phần user, password, port*

Khi chạy rồi ta chưa có cơ sở dữ liệu nên khi ấn vào "Best" sẽ hiện "No Rank"

Giờ ta có thể thêm dữ liệu vào qua đoạn code SQL sau:
```

create database GAME

character SET utf8mb4

collate utf8mb4_unicode_ci;

create table game.persons

(

	NAME varchar(30) NOT NULL,
	
    POINT int,
    
    primary KEY (NAME, point)
    
);

insert into game.persons(NAME, POINT)

values

('NGUYEN VAN KHA', 4096),

('NGUYEN THI QUUYNH NHU', 8192),

('NGUYEN VAN KHAN', 2048);

```
Ta có thể thêm bớt dữ liệu trong phần **values**

**FAQ**

Không chạy được ư ?!

==> Làm lại những điều trên đến khi được thì thôi !!

**Một số hình ảnh của game**

![image](https://user-images.githubusercontent.com/114750314/235725204-223cadc6-add3-4f50-9c7d-4d68dc9c9a12.png)
![image](https://user-images.githubusercontent.com/114750314/235725394-bae3ddfd-49de-4a33-bdfc-e218e970b62f.png)

Em xin chân thành cảm ơn !!
