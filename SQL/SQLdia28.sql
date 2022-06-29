USE Bank

SELECT Funcionarios.Nome,
		Funcionarios.DDD,
		Funcionarios.Telefone,
		Cargos.Descricao AS Cargo
FROM Funcionarios INNER JOIN Cargos
ON Cargos.idCargo = Funcionarios.idCargo

SELECT cl.Nome,
	cl.Email,
	cl.DDD,
	cl.Telefone,
	co.dataAbertura,
	co.Limite,
	IIF (co.internetBanking=1, 'Acessou', 'Não Acessou') AS 'Internet Banking',
	IIF (co.talaoCheque=1, 'Dispõe', 'Não Utiliza') AS 'Talão de Cheque'
		FROM Clientes AS cl INNER JOIN Contas AS co
			ON cl.idCliente = co.idCliente
		WHERE cl.DDD = 19
		ORDER BY co.Limite DESC

SELECT IIF (1=0, 'Verdadeiro.', 'Falso.') AS 'Teste'

SELECT f.Nome AS Gerente,
f.DDD,
f.Telefone,
c.Descricao,
a.Numero,
a.Estado
FROM Funcionarios as f INNER JOIN Cargos AS c
ON f.idcargo = c.idcargo INNER JOIN Agencias AS a
ON a.idGerente = c.idCargo

INSERT INTO Bandeiras (Empresa)
	VALUES ('Elo')

SELECT * FROM Bandeiras
SELECT * FROM tipoCartao

INSERT INTO tipoCartao (Descricao, rendaMinima, Anuidade, Internacional)
VALUES ('Bronze', 100, 0, 0)

INSERT INTO Bandeiras
	VALUES ('Alelo')

DELETE FROM Bandeiras
WHERE idBandeira IN (4,5)

SELECT *
FROM Bandeiras

SELECT *
FROM Contas
WHERE idConta = 10

UPDATE Contas
SET internetBanking = 1
WHERE idConta = 10

SELECT *
FROM tipoCartao
WHERE Anuidade > 0

UPDATE tipoCartao
SET Anuidade = Anuidade * 0.9
WHERE Anuidade > 0

CREATE VIEW vw_media_limite_agencia AS 
	SELECT a.Numero,
			a.Estado,
	AVG (c.limite) AS medialimite
		FROM Contas AS c INNER JOIN Agencias AS a
		ON a.idAgencia = c.idAgencia
	GROUP BY a.Numero,
			a.Estado
GO

SELECT *
FROM vw_media_limite_agencia 

-- exercícios

SELECT a.idAgencia, a.Numero, a.Endereco, a.Cidade, f.Nome
FROM Agencias AS a, Funcionarios AS f
WHERE idCargo = 1

SELECT f.Nome, f.Endereco, f.Cidade, f.Estado, f.DDD, f.Telefone, c.Descricao
FROM Funcionarios AS f, Cargos AS c

SELECT cc.Numero, cc.dataVencimento, tc.Descricao
FROM Cliente_Cartao AS cc, tipoCartao AS tc

SELECT c.idConta, c.dataAbertura, cl.Nome, f.Telefone AS 'telefone funcionário'
FROM Contas AS c, Clientes AS cl, Funcionarios AS f

SELECT a.Numero, c.Cidade, c.Estado, c.idCliente, co.dataAbertura
FROM Agencias AS a, Clientes AS c, Contas AS co

SELECT a.Numero AS 'número agência', c.Cidade, co.dataAbertura, co.Limite, c.Nome, c.Renda
FROM Agencias AS a, Clientes AS c, Contas AS co 

SELECT c.Nome, cc.Numero, cc.dataVencimento, tc.Descricao, tc.Internacional
FROM Clientes AS c, Cliente_Cartao AS cc, tipoCartao AS tc
