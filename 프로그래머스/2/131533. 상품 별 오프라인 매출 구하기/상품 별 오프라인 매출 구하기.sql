SELECT  p.product_code, SUM(s.sales_amount) * p.price AS SALES
FROM    product p INNER JOIN offline_sale s ON p.product_id=s.product_id
GROUP BY p.product_code
ORDER BY SALES DESC, p.product_code