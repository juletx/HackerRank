/*
A median is defined as a number separating the higher half of a data set from the lower half. Query the median of the Northern Latitudes (LAT_N) from STATION and round your answer to  decimal places.
*/
SELECT ROUND(s.lat_n,4) from station s where (SELECT ROUND(COUNT(s.id) / 2) - 1 from station) = (SELECT COUNT(s1.id) from station s1 where s1.lat_n > s.lat_n);