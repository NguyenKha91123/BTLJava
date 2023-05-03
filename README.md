# BTLJava
# **About**
Đây là một dự án game 2048 đơn giản được viết bằng ngôn ngữ Java

Người chơi có thể chơi và lưu điểm của mình khi đạt điểm cao

Để chơi người dùng chỉ cần ấn nút **Code**
![image](https://user-images.githubusercontent.com/114750314/235927084-8dfa97a3-f401-44a1-b5d4-da73b7bcc5e4.png)

Sau đó ấn **Download ZIP** về và giải nén là oke

Để chạy được game ta cần mở file theo hướng dẫn sau:

```BTLJava-main > BTLJava-main > Test > src > Gam2048 > Main.java``` và **Run**

**Nhưng đến đây vẫn chưa chạy được do SQL chưa được liên kết nên file sẽ lỗi ta sẽ chạy sau khi kết nối CSDL**

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

*Sau khi tạo xong thì vào file JDBCUtil.java để sửa phần user, password, port*

theo đường dẫn: ```BTLJava-main > BTLJava-main > Test > src > DataBase > JDBCUtil.java```

Khi chạy rồi ta chưa có dữ liệu trong cơ sở dữ liệu nên khi ấn vào **"Best"** sẽ hiện **"No Rank"**

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
