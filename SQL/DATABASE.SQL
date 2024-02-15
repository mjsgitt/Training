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


-- 

SELECT Country,City,Population
FROM North_american_cities
WHERE Country LIKE("Canada")

--

SELECT Country,City,Latitude,Longitude
FROM North_american_cities
WHERE Country LIKE("United States")
ORDER BY Latitude DESC

-- 

SELECT Country,City,Longitude
FROM North_american_cities
WHERE Longitude < -87.629798
ORDER BY Longitude DESC


--

SELECT Country,Population,City
FROM North_american_cities
WHERE Country LIKE("Mexico")
ORDER BY Population DESC
LIMIT 2

--

SELECT Country,Population,City
FROM North_american_cities
WHERE Country LIKE("United States")
ORDER BY Population DESC
LIMIT 2 OFFSET 2

--

SELECT *
FROM movies
INNER JOIN Boxoffice


--

SELECT *
FROM movies
INNER JOIN Boxoffice
    ON Id = Movie_Id
WHERE Domestic_sales < International_sales


--

SELECT *
FROM movies
INNER JOIN Boxoffice
    ON Id = Movie_Id
ORDER BY Rating DESC


--

SELECT DISTINCT Building FROM Employees

--

SELECT * FROM Buildings

--

SELECT DISTINCT Building_name,role
FROM Buildings
LEFT JOIN Employees
    ON Building_name = Building

    OR

SELECT DISTINCT Building_name,Role
FROM buildings
LEFT JOIN Employees
    ON buildings.Building_name = Employees.Building
    

--

SELECT  DISTINCT Building ,Name, Role
FROM employees
LEFT JOIN Buildings
    ON Building_name = Building
LIMIT 2 OFFSET 13


OR 

SELECT DISTINCT Building_name ,Role
FROM Buildings
LEFT JOIN Employees
    ON Buildings.Building_name = Employees.Building
WHERE Role IS NULL

-- 

SELECT Title, (Domestic_sales + International_sales) / 1000000 AS gross_sales_millions
FROM movies
INNER JOIN BoxOffice
    ON Id = Movie_Id


--

SELECT Title , ( Rating * 10 ) AS Percentage
FROM Movies
JOIN Boxoffice
ON Id = Movie_id


--

SELECT Title , YEAR
FROM Movies
WHERE ( YEAR % 2 ) = 0

--

SELECT Name , MAX(Years_employed)
FROM employees

--

SELECT DISTINCT Role , AVG ( Years_Employed ) AS AVG 
FROM employees
GROUP BY Role


--

SELECT DISTINCT Building , SUM (years_employed) as EACH
FROM employees
Group BY Building;

--

SELECT role , COUNT (*) as Employees
FROM Employees
WHERE role = "Artist"

-- 

SELECT role , COUNT (*) as Employees
FROM Employees
Group By role

--
SELECT Role , SUM(Years_employed) AS SUM
FROM Employees
WHERE Role = "Engineer"

---

SELECT Director ,Count (Director)
FROM Movies
GROUP BY Director

---

SELECT Director , SUM (Domestic_sales + International_sales ) AS Total
FROM Movies
JOIN Boxoffice
    ON Movies.Id = Boxoffice.Movie_id
GROUP BY Director
ORDER BY Director ASC


