USE Bank

SELECT AVG(RENDA) AS MediaRenda
FROM Clientes

SELECT Nome AS NomeCliente, Endereco AS 'Endereço do Cliente'
FROM Clientes

SELECT SUM(Valor) AS ValordaTransferencia,
       AVG (Valor) AS media,
	   MAX (Valor) AS Maiorvalor
FROM logTransferencias
WHERE Aprovado = 0

SELECT MAX (Renda) AS Maiorrenda,
	   MIN (Renda) AS Minrenda,
	   Count (*) AS Quantidade
	FROM Clientes

SELECT AVG(COALESCE (Renda,0))
FROM Clientes

CREATE TABLE #Exemplo (
col INT )

INSERT INTO #Exemplo VALUES
(1), (NULL), (80), (30), (NULL)

SELECT COALESCE (col,0)
FROM #Exemplo

SELECT Aprovado, COUNT (*)
FROM logTransferencias
GROUP BY Aprovado

SELECT Cidade, AVG (Renda) AS 'Renda Média', 
	MAX (Renda) AS 'Renda Máxima' , 
	MIN (Renda) AS 'Renda Mínima'
FROM Clientes
GROUP BY Cidade
HAVING MIN(Renda) > 5

SELECT COUNT(idAgencia), Cidade
FROM Agencias
GROUP BY Cidade

SELECT AVG (Renda)
FROM Clientes
WHERE Cidade = 'São Paulo'

SELECT AVG(Renda)
FROM Clientes
GROUP BY Cidade

SELECT AVG (Limite)
FROM Contas
WHERE talaoCheque = 1

SELECT MIN (Anuidade), MAX (Anuidade)
FROM tipoCartao