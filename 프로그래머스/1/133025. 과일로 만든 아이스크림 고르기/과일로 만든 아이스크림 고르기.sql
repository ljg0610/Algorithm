SELECT DISTINCT FH.FLAVOR
FROM FIRST_HALF FH, ICECREAM_INFO II
WHERE FH.TOTAL_ORDER >= 3000 AND FH.FLAVOR = II.FLAVOR AND II.INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER DESC;