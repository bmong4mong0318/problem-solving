SELECT a.CAR_ID, a.CAR_TYPE, ROUND((a.DAILY_FEE * 30)*(1-(b.DISCOUNT_RATE/100))) AS FEE
FROM CAR_RENTAL_COMPANY_CAR a
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN b
ON a.CAR_TYPE = b.CAR_TYPE
WHERE a.CAR_ID IN
(
    # CAR_TYPE = 세단 or SUV
    SELECT CAR_ID
    from CAR_RENTAL_COMPANY_CAR
    where CAR_TYPE in ('세단', 'SUV') 
    and CAR_ID not in
    (
    # 11/1 - 11/30 대여 불가능 CAR_ID
    SELECT CAR_ID
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where DATE_FORMAT(START_DATE,'%y%m%d') between '221101' and '221130'
    or DATE_FORMAT(END_DATE,'%y%m%d') between '221101' and '221130'
    or (DATE_FORMAT(START_DATE,'%y%m%d') < '221101' 
        and DATE_FORMAT(END_DATE,'%y%m%d') > '221130')
    )
)
# 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능
AND DURATION_TYPE = '30일 이상'
# 대여 금액이 50만원 이상 200만원 미만
AND (a.DAILY_FEE * 30)*(1-(b.DISCOUNT_RATE/100)) >= 500000 
AND (a.DAILY_FEE * 30)*(1-(b.DISCOUNT_RATE/100)) < 2000000
ORDER BY 3 DESC, 2, 1 DESC;