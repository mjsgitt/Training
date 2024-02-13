-- This is for particular Column which is in the data set

SELECT Title , Director , Year
FROM MOVIE;

-- This is for all the columns which are present in the data set

SELECT *
FROM MOVIE;

-- To find the Particular Row

SELECT * 
FROM MOVIE
WHERE Id = 6;

-- If the Movie is been Released in Between 2000 to 2010

SELECT *
FROM MOVIE
WHERE YEAR BETWEEN 2000 AND 2010;

-- If the Movie is been Not Released in Between 2000 to 2010

SELECT *
FROM MOVIE
WHERE YEAR NOT BETWEEN 2000 AND 2010;

-- First Five Movies and It's Year

SELECT Title, YEAR
FROM MOVIE
WHERE YEAR < 2004

-- 

SELECT Title
FROM movies
WHERE Title LIKE("%Toy Story%")

-- 

SELECT Title , Director
FROM movies
WHERE Director LIKE("John Lasseter")

--

SELECT Title , Director
FROM movies
WHERE Director NOT LIKE("John Lasseter")

--

SELECT * FROM movies 
WHERE title LIKE "%WALL%";

--

SELECT DISTINCT Director
FROM Movies
ORDER BY Director ASC

-- 

SELECT Title, Year
FROM Movies
WHERE Year > 2009
ORDER BY Year DESC

--

SELECT title FROM movies
ORDER BY title ASC
LIMIT 5

--

SELECT title FROM movies
ORDER BY title ASC
LIMIT 5 OFFSET 5

--  What we learned UNTIL now

SELECT Column , Other_Column
FROM TABLE
WHERE condition
    AND - OR
    OPERATORS
    LIKE
    NOT LIKE
    IN
    NOT IN
ORDER BY ASC // DESC
LIMIT ROW // COLUMN OFFSETS ROW // COLUMN



