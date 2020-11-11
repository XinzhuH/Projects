create database Group_24;

USE Group_24;

create table HolderIdentity
(IdentityID int identity (1,1) primary key,
 Name varchar(16),
 AllowedDuration varchar(5),
 AllowedAmount int 
);

create table Room
(RoomID int identity (1,1) primary key,
 Capacity int,
 Location varchar(32),
 AvailableTime varchar(32)
 );

 create table Publisher
(PublisherID int identity (1,1) primary key,
Name varchar(32),
Num varchar(32),
Street varchar(32),
City varchar(32),
State varchar(32),
Country varchar(32),
Zip varchar(32)
);

create table Author
(AuthorID int identity (1,1) primary key,
 FirstName varchar(32),
 LastName varchar(32),
 Country varchar(32)
);

create table OrderHeader
(OrderID int identity (1,1) primary key,
 OrderDate date,
 StorageDate date

);

create table Borrower
(BorrowID int identity (1,1) primary key,
 IdentityID int,foreign key(IdentityID) references HolderIdentity,
 FirstName varchar(32),
 LastName varchar(32),
 Gender varchar(32),
 Department varchar(32)
);

create table RoomRecord
(RoomrecordID int identity (1,1) primary key,
 RoomID int, foreign key(roomID) references Room,
 BorrowerID int,foreign key(BorrowerID) references Borrower,
 StartTime datetime,
 Endtime datetime
);

CREATE TABLE BookInformation
(ISBN varchar(32) primary key,
 PublisherID int, foreign key(PublisherID) references Publisher,
 category varchar(32),
 Genre varchar(32),
 Edition varchar(32),
 Inventory int,
 Location varchar(32),
 price varchar(32)
);

create table OrderDetail
(OrderDetailID int identity (1,1) primary key,
 OrderID int, foreign key(OrderID) references OrderHeader,
 ISBN varchar(32),foreign key(ISBN) references BookInformation,
 Quantity int,
 Unitprice FLOAT(2)

);

create table AuthorWork
(AuthorWorkID int identity (1,1) primary key,
 AuthorID int,foreign key(AuthorID) references Author,
 ISBN varchar(32),foreign key(ISBN) references BookInformation,
);

create table Book
(BookID int identity(1,1) primary key,
 ISBN varchar(32),foreign key(ISBN) references BookInformation,
 Conditions varchar(32)
);

create table Borrow
(BorrowID int identity(1,1) primary key,
 BookID int,foreign key(BookID) references Book,
 BorrowerID int,foreign key(BorrowerID) references Borrower,
 BorrowDate date,
 duedate date
);

create table ReturnRecord
(ReturnRecordID int identity(1,1) primary key,
BorrowID int, foreign key(BorrowID) references Borrow,
ReturnDate Date

);




create table Results
(ResultID int identity(1,1) primary key,
 Dates date,
 Fine varchar(32),
 Status varchar(32)

);

create table Cases
(CaseID int identity(1,1) primary key,
 BorrowID int, foreign key(BorrowID) references Borrow,
 ResultID int, foreign key(ResultID) references Results,
 Description varchar(32)
);


drop table Cases;
drop table Results;
drop table ReturnRecord ;
drop table Borrow ;
drop table Book ;

drop table AuthorWork ;
drop table OrderDetail ;
drop table BookInformation ;
drop table RoomRecord ;
drop table Borrower ;

drop table OrderHeader ;
drop table Author ;
drop table Publisher ;
drop table Room ;
drop table HolderIdentity ;

CREATE TRIGGER UpdateInventory
 ON Cases
 AFTER INSERT
AS
BEGIN
 DECLARE @Desc varchar(32);
 SELECT @Desc = Description FROM inserted;
 IF @Desc = 'Missing Book'
 BEGIN
  Update BookInformation
  SET Inventory = Inventory - 1
  FROM BookInformation bi
  JOIN Book b
  ON bi.ISBN = b.ISBN
  JOIN Borrow bo
  ON b.BookID = bo.BookID
  JOIN inserted i
  ON i.BorrowID = bo.BorrowID
 END
END;

insert into HolderIdentity
values('Freshman','2h',1),
('Sophomore','4h',2),
('Junior','6h',2),
('Senior','8h',3),
('Graduate Student','10h',3),
('Doctoral Student','12h',4),
('Lecturer','14h',4),
('Researcher','16h',5),
('Professor','18h',5),
('Director/Dean','20h',6);

insert into Room
values (1,'102','7:00 - 21:00'),
(2,'106','7:00 - 21:00'),
(4,'108','9:00 - 21:00'),
(1,'203','7:00 - 21:00'),
(2,'205','7:00 - 21:00'),
(2,'207','7:00 - 21:00'),
(6,'301','9:00 - 20:00'),
(2,'304','7:00 - 21:00'),
(4,'306','9:00 - 21:00'),
(4,'308','9:00 - 21:00');

insert into Publisher
values ('McGraw-Hill Education','1325','Avenue of the America','New York','NY','United States','10019'),
('Addison-Wesley Professional','1900','E Lake Ave','Clenview','IL','United Kingdom','60025'),
('Signet Classics','256','Summer Street','London','England','United Kingdom','WR10'),
('Scribner','1230','Avenue of the Americas','New York','NY','United States','10019'),
('William Morrow Paperbacks','195','Broadway','New York','NY','United States','10007'),
('CounterPoint','2560','Ninth Street','Berkeley','CA','United States','94710'),
('Routledge','711','3rd Ave','New York','NY','United States','10017'),
('Convergent Books','222','Rosewood Drive','Danvers','MA','United States','01923'),
('Simon & Schuster','1230','6th Ave','New York','NY','United States','10020'),
('Touchstone','1230','Avenue of Americas','New York','NY','United States','10020');

insert into Author
values ('Herbert','Schidt','United States'),
('Noah','Gift','United States'),
('George','Orwell','United Kingdom'),
('Ernest','Hemingway','United States'),
('Steven','Levitt','United States'),
('Stephen','Dubner','United Dtates'),
('Peter','Menzel','United States'),
('Charles','Mann','United States'),
('Robert','Hirsch','United States'),
('Jon','Meacham','United States'),
('Christopher','Knowlton','United States'),
('Siegfried','Engelmann','United Sates'),
('Phyllis','Haddox','United States');

insert into OrderHeader
values ('2018-03-05','2018-03-10'),
('2018-03-07','2018-03-15'),
('2018-05-02','2018-05-08'),
('2018-05-20','2019-05-26'),
('2018-06-13','2018-06-21'),
('2018-07-06','2018-07-12'),
('2018-09-23','2018-09-30'),
('2018-10-02','2018-10-09'),
('2018-11-15','2018-11-21'),
('2018-11-25','2018-12-02');

insert into Borrower
values (1,'Justin','Yang','M','Engineering'),
(2,'Adam','Goldberg','M','Biology'),
(3,'Tiffany','Green','F','Nursing'),
 (4,'North','West','F','Economic'),
 (5,'Nick','White','M','Business'),
 (6,'Emma','Lau','F','Art'),
 (7,'Grace','Tylor','F','Social Science'),
 (8,'Eddie','Lee','M','Engineering'),
 (9,'Dan','Wang','M','Economic'),
 (10,'Cara','Huang','F','Physics');

insert into RoomRecord
values (1, 2,'2019-03-20 10:00','2019-03-20 15:00'),
(2, 4,'2019-04-03 12:00','2019-04-03 14:00'),
(3,3 ,'2019-05-05 15:00','2019-05-05 18:00'),
(4,6 ,'2019-06-15 11:00','2019-06-15 13:00'),
(5, 9,'2019-07-23 15:30','2019-07-23 17:30'),
(6,10 ,'2019-08-02 12:30','2019-08-02 14:30'),
(7, 1,'2019-09-10 11:30','2019-09-10 14:30'),
(8, 5,'2019-10-07 10:30','2019-10-07 12:30'),
(9,7 ,'2019-11-13 18:00','2019-11-13 21:00'),
(10,8 ,'2019-12-06 09:00','2019-12-06 11:30');

insert into BookInformation 
values('0071809252',1,'Book','IT','6',2,'B-12','13.36$'),
('0134863860',2,'Book','IT','1',2,'A-3','31.99$'),
('9780451524935',3,'Book','Dystopian','3',3,'A-5','7.58$'),
('143918271X',4,'Book','Memoir','2',1,'C-6','11.39$'),
('0060731338',5,'Book','leadership','1',2,'A-10','9.29$'),
('0871564300',6,'Album','Photograph','1',1,'C-8','19.79$'),
('1138944254',7,'Album','History','3',1,'A-7','78.66$'),
('0593236661',8,'Book','History','1',2,'B-2','15.28$'),
('1982128372',9,'Book','Economic','1',2,'B-6','19.92$'),
('0671731985',10,'Book','Education','1',2,'B-11','14.99$');

insert into OrderDetail 
values (1, '0071809252', 1,13.36),
(1, '0134863860', 1,31.99),
(2, '0071809252', 1,13.36),
(2, '0134863860', 1,31.99),
(3, '9780451524935', 2,7.58),
(4, '143918271X', 1,11.39),
(4, '0060731338', 1,9.29),
(5, '0060731338', 1,9.29),
(6, '0871564300', 1,19.79),
(6, '1138944254', 1,78.66),
(7, '0593236661', 1,15.28),
(8, '0593236661', 1,15.28),
(8, '1982128372', 2,19.92),
(9, '0671731985', 2,14.99),
(10, '9780451524935', 1,7.58);

insert into AuthorWork 
values
(1,'0071809252'),
(2,'0134863860'),
(3,'9780451524935'),
(4,'143918271X'),
(5,'0060731338'),
(6,'0060731338'),
(7,'0871564300'),
(8,'0871564300'),
(9,'1138944254'),
(10,'0593236661'),
(11,'1982128372'),
(12,'0671731985'),
(12,'0671731985');

insert into Book 
values ('0071809252','Exellent'),
('0071809252','Good'),
('0134863860','Exellent'),
('0134863860','Good'),
('9780451524935','Good'),
('9780451524935','Good'),
('9780451524935','Fair'),
('143918271X','New'),
('0871564300','Fair'),
('1138944254','Good'),
('0593236661','Good'),
('0593236661','Stained'),
('1982128372','Fair'),
('1982128372','Stained'),
('0671731985','Fair'),
('0671731985','Good');

insert into Borrow 
values (1,1 ,'2019-01-03','2019-01-17'),
(2, 1,'2019-01-03','2019-01-17'),
(3, 2,'2019-01-07','2019-02-04'),
(4, 2,'2019-01-07','2019-02-04'),
(5, 3,'2019-02-11','2019-03-25'),
(6, 4,'2019-02-20','2019-04-17'),
(7, 4,'2019-02-20','2019-04-17'),
(8, 4,'2019-02-20','2019-04-17'),
(9, 5,'2019-03-01','2019-05-03'),
(10, 5,'2019-03-01','2019-05-03'),
(11, 6,'2019-04-10','2019-07-03'),
(12, 7,'2019-04-15','2019-07-22'),
(13, 8,'2019-05-08','2019-08-28'),
(14, 8,'2019-05-08','2019-08-28'),
(15, 9,'2019-05-13','2019-09-16'),
(16, 10,'2019-05-16','2019-10-03');

insert into ReturnRecord 
values(1,'2019-1-22'),
(2,'2019-1-15'),
(3,'2019-2-10'),
(4,'2019-2-1'),
(5,'2019-3-20'),
(8,'2019-4-13'),
(9,'2019-3-10'),
(10,'2019-5-1'),
(12,'2019-7-20'),
(13,'2019-9-1'),
(14,'2019-8-25'),
(15,'2019-9-23'),
(16,'2019-9-30');

insert into Results 
values('2019-1-22','2$','Paid'),
('2019-2-10','2$','Paid'),
('2019-3-20','10$','Paid'),
('2019-4-10','20$','Progressing'),
('2019-4-10','20$','Issued'),
('2019-5-1','10$','Issued'),
('2019-6-30','20$','Paid'),
('2019-7-20','5$','Progressing'),
('2019-9-1','2$','Paid'),
('2019-9-23','2$','Paid');

insert into Cases 
values(1,1,'Late'),
(3,2,'Late'),
(5,3,'Water Damage'),
(6,4,'Missing Book'),
(7,5,'Missing Book'),
(9,6,'Stained'),
(11,7,'Missing Book'),
(12,8,'Writing'),
(13,9,'Late'),
(15,10,'Late');


create view vwBorrowerRecord 
as
select FirstName, LastName, b.BorrowDate, b.DueDate
from Borrower b1
inner join Borrow b
on b1.BorrowID = b.BorrowID;
select*from vwBorrowerRecord;

CREATE VIEW vwWhoMissingBook
AS
SELECT FirstName, LastName, b.BookID, Description
FROM Borrower b1
JOIN Borrow b
ON b1.BorrowID = b.BorrowerID
JOIN Cases c
ON c.BorrowID = b.BorrowID
WHERE Description IN ('Missing Book');

select * from vwWhoMissingBook


create function fn_OrderAmount(@OrdID INT)
RETURNS INT
AS 
BEGIN
	DECLARE @amount INT = 
	(select sum(Quantity*UnitPrice)
	from OrderDetail od 
	where OrderID = @OrdID);
    set @amount = ISNULL(@amount,0);
   return @amount;
END


Alter table OrderHeader 
add OrderAmount as (dbo.fn_OrderAmount(OrderID));



CREATE FUNCTION countAvailablity(@ISBN varchar(32))
RETURNS int
AS
   BEGIN
      DECLARE @total int = 
      (Select Inventory from dbo.BookInformation where @ISBN = ISBN) -
         (SELECT count(*)
          FROM BookInformation bi
    join Book b
    on bi.ISBN = b.ISBN
    join Borrow bo
    on b.BookID = bo.BookID
    left join ReturnRecord rt
    on bo.BorrowerID = rt.BorrowID
          WHERE @ISBN = bi.ISBN and rt.ReturnRecordID IS NULL) +
    (
    SELECT count(*)
    FROM BookInformation bi
    join Book b
    on bi.ISBN = b.ISBN
    join Borrow bo
    on b.BookID = bo.BookID
    join Cases c
    on c.BorrowID =bo.BorrowID
          WHERE @ISBN = bi.ISBN and c.Description = 'Missing Book'
    );
      SET @total = ISNULL(@total, 0);
      RETURN @total;
END


ALTER TABLE BookInformation ADD Availablity AS (dbo.countAvailablity(ISBN));

---Table-level CHECK Constraints based on a function
--Create CheckCase function to check if there is an unfinished case for a borrower， 0 means false
CREATE FUNCTION CheckCaseStatus (@BorrowerID int)
RETURNS smallint
AS
BEGIN
   DECLARE @Count smallint=0; 
    SELECT @Count = Count(*)
 FROM dbo.Borrow b
 JOIN dbo.Cases c
 ON b.BorrowID = c.BorrowID
 LEFT JOIN dbo.Results r
 On c.ResultID = r.ResultID
    WHERE b.BorrowerID = @BorrowerID
    AND (r.Status != 'Paid'
 OR c.ResultID is NULL);

   RETURN @Count;
END;

DROP FUNCTION CheckCaseStatus;

-- Add table-level CHECK constraint based on the new function for the Reservation table
-- Borrower who has unfinished case can not create now borrow order
UPDATE Results SET Status = 'Paid' WHERE Status != 'Paid';
ALTER TABLE dbo.Borrow ADD CONSTRAINT BanBorrowRequest CHECK (dbo.CheckCaseStatus(BorrowerID) = 0);
UPDATE Results SET Status = 'Progressing' WHERE ResultID = 4;
UPDATE Results SET Status = 'Progressing' WHERE ResultID = 8;
UPDATE Results SET Status = 'Issued' WHERE ResultID = 5;
UPDATE Results SET Status = 'Issued' WHERE ResultID = 6;
--Test
--BorrowerID 4，5，6 has unpaid case
insert into Borrow 
values (1,6 ,'2019-01-03','2019-01-17');--terminate because ID6 has unfinished case
insert into Borrow 
values (1,3,'2019-01-03','2019-01-17');--sucess
select * from Borrow ;

--delete test row
delete from Borrow where BorrowID = (select max(BorrowID) from Borrow);;
