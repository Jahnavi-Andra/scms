use scms;

INSERT INTO sports(sport_id,sport_name,trainer_id,fee)
VALUES('1','cricket','1','5000'),
('1','cricket','2','5000'),
('2','football','3','6000'),
('2','football','4','6000'),
('3','volleball','5','3000'),
('3','volleyball','6','3000'),
('4','tennis','7','5000'),
('4','tennis','8','5000'),
('5','basketball','9','4000'),
('5','basketball','10','4000');

INSERT INTO trainer(trainer_id,trainer_name,trainer_phone,age,experience,trainer_uname,trainer_passwd,sport_id)
VALUES('1','Dravid','9854754545','45','15','dravid17','dravid123','1'),
('2','Sehwag','9854754546','42','12','sehwag42','sehwag123','1'),
('3','Beckham','9854754548','40','10','beckham07','beckham123','2'),
('4','Maradona','9854754589','50','22','maradona10','maradona123','2'),
('5','George','9854754654','43','13','george11','george123','3'),
('6','Lorenzo','9854855545','39','10','lorenzo22','lorenzo123','3'),
('7','Nadal','9854788545','46','16','nadal02','nadal123','4'),
('8','Murray','9754754545','41','13','murray01','murray123','4'),
('9','James','9854754885','45','15','james17','james123','5'),
('10','Jordan','9854779545','47','17','jordan17','jordan123','5');

INSERT INTO student(stud_id,stud_name,stud_phone,stud_uname,stud_passwd,wallet,points)
VALUES('101','Praveen kumar','9543025334','praveen31','praveen@31','1000','0'),
('102','Ramya Sree','9600025214','ramya07','ramya@07','2000','500'),
('103','Nirmal','7405025784','nirmal31','nirmal@31','4000','0'),
('104','Murali','8607025876','murali24','murali@24','5000','450'),
('105','Akshara Singh','7690043784','akshara18','akshara@18','3700','0'),
('106','Keerthana','8608735245','keerthi20','keerthi@20','6000','0'),
('107','Kishore','600025214','kishore04','kishore@04','2000','700'),
('108','Karthik Reddy','9542025219','karthik22','karthik@22','4500','1200'),
('109','Madhu mitha','7808025324','madhu15','madhu@15','3000','0'),
('110','Priya Dharshini','8605625278','priya28','priya@28','5000','0');

INSERT INTO trainercamp(tcamp_id,sport_id,trainer_id,stud_id,doj,t_status)
VALUES('001','1','1','101','2020-12-21','pending'),
('002','1','2','103','2020-12-15','pending'),
('003','2','3','104','2020-11-02','accepted'),
('004','2','4','107','2020-10-17','accepted'),
('005','3','5','108','2020-11-01','accepted'),
('006','3','6','102','2020-11-11','accepted'),
('007','4','7','105','2020-08-13','pending'),
('008','4','8','106','2020-11-23','rejected'),
('009','5','9','109','2020-07-22','pending'),
('010','5','10','110','2020-12-20','rejected');

select * from sports;
select * from trainer;
select * from student;
select * from trainercamp;
Update student c set c.points=c.points+200 where c.stud_id=102;
Update student c set c.wallet=c.wallet-1000 where c.stud_id=102;
insert into student (stud_name,stud_phone,stud_uname,stud_passwd,wallet,points)
    		values("jahu","900","jkk","kkkk",2000,100);





