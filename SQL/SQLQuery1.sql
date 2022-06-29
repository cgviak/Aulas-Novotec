SELECT *
FROM tipoCartao

SELECT *
FROM Clientes
WHERE Cidade = 'São Paulo'

SELECT *
FROM Clientes
WHERE DDD = 19

SELECT *
FROM Clientes
WHERE Cidade <> 'Valinhos'

SELECT *
FROM Agencias
WHERE DDD = 19 AND Cidade = 'Campinas'

SELECT *
FROM logTransferencias
WHERE Aprovado = 1 AND idTipoTransferencia = 2 AND Valor >= 2900

SELECT *
FROM logTransferencias
WHERE idContaCreditada IN (1701, 1999, 911, 705)

SELECT *
FROM logTransferencias
WHERE Valor BETWEEN 1000 and 1500

SELECT *
FROM Funcionarios
WHERE Nome LIKE 'Al%'

SELECT *
FROM logTransferencias
ORDER BY Valor DESC

SELECT TOP 10 *
FROM logTransferencias
ORDER BY Valor DESC

-- exercícios

SELECT *
FROM tipoCartao

SELECT *
FROM Bandeiras

SELECT Nome, DDD, Telefone, Email
FROM Clientes

SELECT idAgencia, Endereco, Cidade, Estado
FROM Agencias

SELECT *
FROM Clientes
WHERE Cidade = 'Valinhos'

SELECT *
FROM Contas
WHERE dataAbertura = '2011-10-13'

SELECT *
FROM Clientes
WHERE Renda >= 2000

SELECT *
FROM Clientes
WHERE Cidade = 'São Paulo' AND rendaComprovada = 1

SELECT *
FROM Contas
WHERE talaoCheque = 1 OR internetBanking = 0

SELECT *
FROM Cliente_Cartao
WHERE dataPedido BETWEEN '2011-10-01' AND '2011-10-30'

SELECT *
FROM Contas
WHERE idConta BETWEEN 10 AND 20

SELECT *
FROM Contas
WHERE idConta IN (1, 7, 9, 15, 20)

SELECT *
FROM Clientes
WHERE Nome LIKE 'Ana%'

SELECT *
FROM Clientes
WHERE Nome LIKE '%ao'

SELECT *
FROM Funcionarios
WHERE Nome LIKE '%el%'

SELECT *
FROM Contas
ORDER BY Limite ASC

SELECT *
FROM Bandeiras
ORDER BY idBandeira DESC

SELECT TOP 20 percent Renda
FROM Clientes

SELECT *
FROM tipoCartao
WHERE rendaMinima >= 2000 AND Internacional = 1
ORDER BY Anuidade DESC

SELECT TOP 10 *
FROM Cliente_Cartao
WHERE Bloqueado = 1
ORDER BY Numero DESC
