SELECT DATETIME as '시간'
FROM ANIMAL_INS
WHERE DATETIME in (
    SELECT MAX(DATETIME) 
    FROM ANIMAL_INS
)