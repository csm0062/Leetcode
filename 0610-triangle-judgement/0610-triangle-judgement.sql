# Write your MySQL query statement below
# 삼각형이되려면 두 변의 합이 나머지 한 변보다 커야한다.
SELECT
    x, y, z,
    CASE
        WHEN (x + y > z) AND (x + z > y) AND (y + z > x)
        THEN 'Yes'
        ELSE 'No'
        END AS triangle
    FROM Triangle;