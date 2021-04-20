SELECT * FROM registroescolar.alunes;

SELECT * FROM registroescolar.alunes WHERE nota > 7;
SELECT * FROM registroescolar.alunes WHERE nota < 7;

UPDATE `registroescolar`.`alunes` SET `nota` = '6.5' WHERE (`idAlunes` = '2');
