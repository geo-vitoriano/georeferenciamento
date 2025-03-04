create table manifestacao(

    id_info bigint not null auto_increment,
    nome_cent varchar(200) not null,
    tipo varchar(100) not null,
    desc_info varchar(100) not null,
    participante varchar(100) not null,
    setor varchar(100) not null,
    entidade varchar(100) not null,
    contexto varchar(100) not null,
    eixo varchar(100) not null,
    assunto  varchar(100) not null,
    observacao  varchar(100) not null,
    data_info date not null,
    primary key(id_info)

);