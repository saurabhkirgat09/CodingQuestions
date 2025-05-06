-- Find Nth Max Salary
SELECT salary
FROM employees
ORDER BY salary DESC
LIMIT 1 OFFSET 1;

-- Find Nth Min Salary
SELECT distinct salary
FROM employees
ORDER BY ASC
LIMIT 1 OFFSET 1;