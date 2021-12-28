/*
Enter your query here.
*/
SELECT ROUND(SQRT(
        POWER((MAX(LONG_W) - MIN(LONG_W)), 2) + 
        POWER((MAX(LAT_N) - MIN(LAT_N)), 2)
        ), 4) 
FROM STATION;