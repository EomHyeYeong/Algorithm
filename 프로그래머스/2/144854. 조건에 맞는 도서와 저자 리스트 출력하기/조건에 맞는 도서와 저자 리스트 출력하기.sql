SELECT  b.book_id, a.author_name, DATE_FORMAT(b.published_date, '%Y-%m-%d') AS PUBLISHED_DATE
FROM    Book b INNER JOIN Author a ON b.author_id=a.author_id
WHERE   b.category LIKE '경제'
ORDER BY b.published_date;