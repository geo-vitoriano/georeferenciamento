create table manifestacoes(

    id bigint not null auto_increment,
    nome_cent varchar(100) not null,
    tipo varchar(100) not null,
    desc_info varchar(100) not null,
    participante varchar(100) not null,
    setor varchar(100) not null,
    entidade varchar(100) not null,
    contexto varchar(100) not null,
    primary key(id)

);