# Write your MySQL query statement below
# referee_id가 2인걸제외하고 전부 뽑는다.

SELECT
    name
    FROM Customer
    WHERE referee_id != 2 || referee_id IS NULL;
    
