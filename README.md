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

##**Cách 1:**

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

##**Cách 2:**

**Chạy trên CMD**

Ta tải file ZIP về giải nén như bình thường sau đó giải nén

Ví dụ: Em để ở ổ C mục Downloads

![image](https://user-images.githubusercontent.com/114750314/235955337-9b23a0b4-2f47-41cb-bb1e-80fcae558ced.png)

Sau đó ta cần truy cập vào thư mục chứa code bằng cách mở CMD với quyền Admin

Gõ đoạn lệnh để vào được ```src```

![image](https://user-images.githubusercontent.com/114750314/235956098-50b14121-c09d-44ef-9fc9-2db62d7bef8a.png)

Sau đó ta cần mở tất cả các file trong ```src``` (Từng package, folder)

![image](https://user-images.githubusercontent.com/114750314/235956642-6e6e6b72-a651-4333-ba95-67482242b406.png)

Cứ tiếp tục như thế

Sau đó ta gõ lệnh: ```java -cp ".;C:\Users\Nguye\Downloads\BTLJava-main\BTLJava-main\Test\src\DataBase\mysql-connector-j-8.0.30.jar" Main```

##

```Để làm được thì em vẫn chưa tìm ra cách

Cách chạy bằng CMD trên chỉ chạy được những file có trong cùng 1 package

Nhưng khi chạy sẽ báo lỗi

Nếu chạy kết nối SQL trước thì báo lỗi file *Main.java* chưa được khai báo

Còn nếu chạy các file Main trước thì lại báo lỗi SQL JDBC chưa được kết nối

Em chỉ có thể cho chạy trong 1 package thôi

Và cho dù đúng thì vẫn phải mở file để sửa *user, password, port* thì mới kết nối SQL được ạ

Thực sự em không thể làm sao mà cho chạy trên CMD mà không cần dùng Eclipse hay VSCode

Chả ai chạy chương trình mà lại chạy qua CMD cục bộ như này ạ :((```

##Hi vọng thầy có cách nào có thể chỉ em được !!

Em cảm ơn

**Một số hình ảnh của game**

![image](https://user-images.githubusercontent.com/114750314/235725204-223cadc6-add3-4f50-9c7d-4d68dc9c9a12.png)
![image](https://user-images.githubusercontent.com/114750314/235725394-bae3ddfd-49de-4a33-bdfc-e218e970b62f.png)

Em xin chân thành cảm ơn !!
