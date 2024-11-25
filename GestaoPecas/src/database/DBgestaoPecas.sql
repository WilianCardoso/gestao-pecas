CREATE SCHEMA db_gestao_pecas ;

CREATE TABLE usuario(
    ID INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    tipo_usuario ENUM('adm', 'funcionario')  NOT NULL, 
    PRIMARY KEY (id)
);

CREATE TABLE peca (
    id INTEGER NOT NULL AUTO_INCREMENT,
    codigo INTEGER NOT NULL UNIQUE,
    nome VARCHAR(45) NOT NULL,
    qtd_estoque INTEGER NOT NULL CHECK (qtd_estoque >= 0),
    preco DOUBLE NOT NULL CHECK (preco >= 0),
    PRIMARY KEY (id)
);

CREATE TABLE relatorio (
    id INTEGER NOT NULL AUTO_INCREMENT,
    data_inicio DATE NOT NULL,
    data_fim DATE NOT NULL,
    usuario_id INTEGER NOT NULL, 
    PRIMARY KEY (id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE fornecedor (
    id INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cnpj_cpf VARCHAR(18) NOT NULL UNIQUE, 
    telefone VARCHAR(15) NOT NULL, 
    email VARCHAR(100),
    endereco VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE hist_mov (
    id INTEGER NOT NULL AUTO_INCREMENT,
    tipo_movimentacao ENUM('entrada', 'saida') NOT NULL, 
    qtd INTEGER NOT NULL CHECK (qtd > 0),
    data_hora DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    peca_id INTEGER NOT NULL, 
    fornecedor_id INTEGER, 
    PRIMARY KEY (id),
    FOREIGN KEY (peca_id) REFERENCES peca(id),
    FOREIGN KEY (fornecedor_id) REFERENCES fornecedor(id)
);


