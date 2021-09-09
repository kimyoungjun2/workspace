
-- 테이블 스페이스 사용 권한 부여
ALTER USER user1 quota 50M ON USERS;

SELECT * FROM ALL_USERS;

--계정에 부여한 권한 확인
SELECT * FROM DBA_SYS_PRIVS WHERE GRANTEE = 'USER1';

--ROLE(역할) : 여러 권한들의 집합.
SELECT * FROM DBA_ROLE_PRIVS WHERE GRANTEE = 'USER1';