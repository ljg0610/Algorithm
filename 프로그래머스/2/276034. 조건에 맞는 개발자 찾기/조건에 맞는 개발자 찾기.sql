SELECT DISTINCT DV.ID, DV.EMAIL, DV.FIRST_NAME, DV.LAST_NAME
FROM DEVELOPERS DV
JOIN SKILLCODES SC ON DV.SKILL_CODE & SC.CODE
WHERE SC.NAME = 'C#' OR SC.NAME = 'Python'
ORDER BY ID;