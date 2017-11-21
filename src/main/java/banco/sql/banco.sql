create table tb_usuario(
id_usuario serial not null primary key,
    nome varchar(50) not null,
    sobrenome varchar(50) not null
);

create table tb_perfil(
nome_perfil varchar(50) not null,
    descricao varchar(100)not null,
    codigo_perfil serial not null primary key,
    id_usuario serial not null references tb_usuario(id_usuario)
);

create table tb_endereco(
logradouro varchar(100) not null,
    complemento varchar(100) not null,
    bairro varchar(50) not null,
    numero varchar (8) not null,
    CEP  varchar(8) not null,
    codigo_endereco serial not null primary key,
    id_usuario serial not null references tb_usuario(id_usuario)
);