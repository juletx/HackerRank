/*
Enter your query here.
*/
SELECT DISTINCT CITY FROM STATION WHERE CITY RLIKE "^[^aeiou]" OR CITY RLIKE "[^aeiou]$"