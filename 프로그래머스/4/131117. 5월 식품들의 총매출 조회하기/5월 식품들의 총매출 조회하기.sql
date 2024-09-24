SELECT  p.product_id, p.product_name, (SUM(o.amount) * price) AS TOTAL_SALES
FROM    food_product p INNER JOIN food_order o
        ON p.product_id=o.product_id
WHERE   o.produce_date LIKE '2022-05%'
GROUP BY p.product_id
ORDER BY TOTAL_SALES DESC, p.product_id;
