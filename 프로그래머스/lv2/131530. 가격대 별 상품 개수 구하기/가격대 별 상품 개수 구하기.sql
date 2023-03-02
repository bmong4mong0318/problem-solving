SELECT (
    CASE
        WHEN PRICE < 10000 THEN 0
        ELSE TRUNCATE (PRICE, -4)
    END) as PRICE_GROUP, COUNT(*) as PRODUCTS
from PRODUCT
GROUP BY PRICE_GROUP
order by PRICE_GROUP;