# Write your MySQL query statement below
with temp as
(select
    email,
    count(*) as ct
from Person group by 1)
select distinct email from temp where ct>1;