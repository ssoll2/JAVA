#데이터 베이스 보기
show databases;
#데이터 베이스 만들기
create database jdbc;

#데이터 베이스 보기
show databases;

#데이터 베이스 사용하기
use jdbc;

#테이블 만들기
#student_info 테이블 / 기본키 : stb_id(varchar(100))
create table jdbc.student_info(
	std_id VARCHAR(100) NOT NULL, #아이디
    std_name VARCHAR(100) NOT NULL, # 이름
    std_age INT NOT NULL, # 나이
    std_grade INT NOT NULL, #학년
    std_gender VARCHAR(50) NOT NULL, #성별
    std_phone VARCHAR(100) DEFAULT '', #번호
    PRIMARY KEY(std_id)
);
#테이블 보기
show tables;

#테이블 내용 입력
insert into jdbc.student_info(std_id,std_name,std_age,std_grade,std_gender,std_phone)
values('202301','홍길동','18','2','남자','010-2989-5454');
insert into jdbc.student_info(std_id,std_name,std_age,std_grade,std_gender,std_phone)
values('202302','김길동','20','2','여자','010-2123-5453');
insert into jdbc.student_info(std_id,std_name,std_age,std_grade,std_gender,std_phone)
values('202303','홍일동','17','2','남자','010-1235-5424');
insert into jdbc.student_info(std_id,std_name,std_age,std_grade,std_gender,std_phone)
values('202304','홍이동','23','2','여자','010-2239-5354');
insert into jdbc.student_info(std_id,std_name,std_age,std_grade,std_gender,std_phone)
values('202305','홍삼동','25','2','남자','010-1189-1884');
insert into jdbc.student_info(std_id,std_name,std_age,std_grade,std_gender,std_phone)
values('202306','홍사동','19','2','여자','010-3349-5294');
insert into jdbc.student_info(std_id,std_name,std_age,std_grade,std_gender,std_phone)
values('202307','홍오동','24','2','남자','010-2247-5674');
insert into jdbc.student_info(std_id,std_name,std_age,std_grade,std_gender,std_phone)
values('202308','홍육동','22','2','여자','010-2329-5904');
insert into jdbc.student_info(std_id,std_name,std_age,std_grade,std_gender,std_phone)
values('202309','홍칠동','29','2','남자','010-2009-5874');
insert into jdbc.student_info(std_id,std_name,std_age,std_grade,std_gender,std_phone)
values('202310','홍구동','27','2','여자','010-2189-5959');

#테이블 보기(전체)
select * from jdbc.student_info;

#테이블 보기(부분) = where 조건문을 작성한다.
select * from jdbc.student_info where std_gender='남자';
select * from jdbc.student_info where std_gender='여자';

select * from jdbc.student_info where std_id = '202304';
#테이블 수정 
update jdbc.student_info SET std_gender='남자', std_age = '22' where std_id = '202304';

#테이블 삭제
delete from jdbc.student_info where std_id = '202304';

select * from jdbc.student_info where std_name ='홍이동';

