-- Show data from the salesman_id and salesman_city columns
SELECT salesman_id, salesman_city from salesman;
--
-- Show data of salesman from Paris
SELECT * FROM salesman where salesman_city='Paris';
-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam'

