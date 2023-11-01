CREATE TABLE cotacao_moeda (
       id SERIAL PRIMARY KEY,
       moeda VARCHAR(50),
       valor DECIMAL(10, 2)
);
CREATE TABLE cadastro_usuario (
      id SERIAL PRIMARY KEY,
      nome VARCHAR(100),
      email VARCHAR(100),
      telefone VARCHAR(20)
);

CREATE TABLE numeros_aleatorios (
    id SERIAL PRIMARY KEY,
    numero INT
);

CREATE TABLE feriados_nacionais (
    id SERIAL PRIMARY KEY,
    data DATE,
    descricao VARCHAR(100)
);

CREATE TABLE eclipses_solares (
      id SERIAL PRIMARY KEY,
      data DATE,
      tipo VARCHAR(50)
);

CREATE TABLE produtos (
      id SERIAL PRIMARY KEY,
      nome VARCHAR(100),
      preco DECIMAL(10, 2)
);

INSERT INTO produtos (nome, preco) VALUES
       ('Camiseta de Algodão', 19.99),
       ('Calça Jeans Skinny', 49.99),
       ('Tênis Esportivo Nike', 89.99),
       ('Vestido Floral', 29.99),
       ('Óculos de Sol Ray-Ban', 129.99),
       ('Relógio de Pulso Casio', 79.99),
       ('Mochila para Notebook', 39.99),
       ('Bolsa de Couro Feminina', 59.99),
       ('Boné Estilizado', 14.99),
       ('Jaqueta Corta-Vento', 54.99),
       ('Calça de Moletom', 34.99),
       ('Sapato Social Masculino', 69.99),
       ('Biquíni Estampado', 24.99),
       ('Shorts de Praia', 19.99),
       ('Perfume Importado', 89.99),
       ('Batom Matte', 9.99),
       ('Camisa Polo Lacoste', 69.99),
       ('Saia Midi Plissada', 39.99),
       ('Tênis Converse Chuck Taylor', 49.99),
       ('Camisa de Flanela', 29.99),
       ('Pulseira de Prata', 19.99),
       ('Anel de Diamante', 149.99),
       ('Colar de Pérolas', 99.99),
       ('Blusa de Tricô', 44.99),
       ('Chapéu Fedora', 24.99),
       ('Bolsa Tote de Couro', 74.99),
       ('Blazer Slim Fit', 64.99),
       ('Relógio Smartwatch', 129.99),
       ('Calça Legging Esportiva', 29.99),
       ('Camisa Social Branca', 49.99),
       ('Bota de Couro', 79.99),
       ('Vestido de Festa Longo', 129.99),
       ('Mala de Viagem Grande', 99.99),
       ('Camisola de Seda', 34.99),
       ('Sapato de Salto Alto', 54.99),
       ('Blusa de Cetim', 29.99),
       ('Sneaker Plataforma', 44.99);

CREATE TABLE estoque (
     id SERIAL PRIMARY KEY,
     nome VARCHAR(100),
     quantidade INT,
     valor DECIMAL(10, 2),
     data_compra DATE
);

INSERT INTO estoque (nome, quantidade, valor, data_compra) VALUES
       ('Camiseta de Algodão', 61, 29.99, '2023-10-10'),
       ('Calça Jeans Skinny', 30, 59.99, '2023-10-11'),
       ('Tênis Esportivo Nike', 22, 99.99, '2023-10-12'),
       ('Vestido Floral', 57, 49.99, '2023-10-13'),
       ('Óculos de Sol Ray-Ban', 72, 129.99, '2023-10-14'),
       ('Relógio de Pulso Casio', 55, 79.99, '2023-10-15'),
       ('Mochila para Notebook', 66, 39.99, '2023-10-16'),
       ('Bolsa de Couro Feminina', 38, 89.99, '2023-10-17'),
       ('Boné Estilizado', 56, 19.99, '2023-10-18'),
       ('Jaqueta Corta-Vento', 34, 69.99, '2023-10-19'),
       ('Calça de Moletom', 68, 39.99, '2023-10-20'),
       ('Sapato Social Masculino', 57, 79.99, '2023-10-21'),
       ('Biquíni Estampado', 47, 29.99, '2023-10-22'),
       ('Shorts de Praia', 28, 24.99, '2023-10-23'),
       ('Perfume Importado', 60, 149.99, '2023-10-24'),
       ('Batom Matte', 21, 9.99, '2023-10-25'),
       ('Camisa Polo Lacoste', 22, 79.99, '2023-10-26'),
       ('Saia Midi Plissada', 42, 39.99, '2023-10-27'),
       ('Tênis Converse Chuck Taylor', 21, 59.99, '2023-10-28'),
       ('Camisa de Flanela', 35, 34.99, '2023-10-29'),
       ('Pulseira de Prata', 65, 49.99, '2023-10-30'),
       ('Anel de Diamante', 45, 999.99, '2023-10-31'),
       ('Colar de Pérolas', 47, 149.99, '2023-11-01'),
       ('Blusa de Tricô', 45, 44.99, '2023-11-02'),
       ('Chapéu Fedora', 23, 29.99, '2023-11-03'),
       ('Bolsa Tote de Couro', 54, 119.99, '2023-11-04'),
       ('Blazer Slim Fit', 52, 89.99, '2023-11-05'),
       ('Relógio Smartwatch', 51, 199.99, '2023-11-06'),
       ('Calça Legging Esportiva', 33, 34.99, '2023-11-07'),
       ('Camisa Social Branca', 46, 49.99, '2023-11-08'),
       ('Bota de Couro', 61, 109.99, '2023-11-09'),
       ('Vestido de Festa Longo', 24, 149.99, '2023-11-10'),
       ('Mala de Viagem Grande', 38, 79.99, '2023-11-11'),
       ('Camisola de Seda', 36, 69.99, '2023-11-12'),
       ('Sapato de Salto Alto', 23, 59.99, '2023-11-13'),
       ('Blusa de Cetim', 32, 39.99, '2023-11-14'),
       ('Sneaker Plataforma', 64, 89.99, '2023-11-15');
