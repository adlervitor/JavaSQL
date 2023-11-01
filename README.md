# Projeto de Gerenciamento de Estoque

Este projeto consiste em um sistema simples de gerenciamento de estoque, desenvolvido em Java, que permite a inserção e manipulação de dados relacionados a produtos e seus respectivos estoques em um banco de dados PostgreSQL. O sistema foi estruturado de forma modular, utilizando o padrão DAO (Data Access Object) para acessar e manipular os dados no banco de dados.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- Inserção de produtos no banco de dados, incluindo informações como nome, quantidade, valor e data de compra.
- Inserção de itens no estoque correspondente a cada produto, mantendo o controle das quantidades disponíveis em estoque.

## Estrutura do Projeto

O projeto foi estruturado em diferentes pacotes, cada um contendo classes específicas para lidar com determinadas funcionalidades do sistema:

- `org.example.classes`: Contém as classes que representam as entidades do sistema, como `Produtos`, `Estoque`, entre outras.
- `org.example.dao`: Contém os Data Access Objects (DAOs) responsáveis por acessar e manipular os dados no banco de dados. Cada entidade possui seu próprio DAO correspondente.
- `org.example.inserir`: Contém classes que lidam com a inserção de dados no banco de dados, como `InserirEstoque`, `InserirProdutos`, entre outras.
- `org.example`: Contém a classe principal `Main`, que coordena as diferentes funcionalidades do sistema.
