SELECT * from DEPARTMENTS;

--1번문제
SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_NAME = 'Marketing';

--2번문제
SELECT *
 FROM DEPARTMENTS
 WHERE DEPARTMENT_NAME LIKE '%IT%';

--3번
SELECT STREET_ADDRESS, POSTAL_CODE, CITY
 FROM LOCATIONS
 WHERE COUNTRY_ID = 'US';

--4번
SELECT *
 FROM LOCATIONS
  WHERE POSTAL_CODE
   LIKE '_____';

--5번
SELECT *
 FROM EMPLOYEES
 WHERE MANAGER_ID = 100 
 AND DEPARTMENT_ID = 50;

 --6번
 SELECT SALARY, COMMISSION_PCT, SALARY * (1 + COMMISSION_PCT) AS TOTAL_SALARY
 FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL AND SALARY >= 10000; 

 SELECT * FROM EMPLOYEES;

 SELECT MANAGER_ID
 , FIRST_NAME || ' ' || LAST_NAME AS EMP_NAME
 , EMAIL, PHONE_NUMBER
 ,HIRE_DATE
 ,JOB_ID
 ,SALARY
 ,COMMISSION_PCT
 ,MANAGER_ID
 ,DEPARTMENT_ID
  FROM EMPLOYEES 
 WHERE MANAGER_ID >= 100 AND MANAGER_ID <= 102 OR
 MANAGER_ID >= 200 AND MANAGER_ID <= 202;

 SELECT FIRST_NAME || '@' || JOB_ID || '.employee.com' --AS EMAIL
 FROM EMPLOYEES