/*DROP*/
DROP TABLE usuario;
DROP TABLE times;
DROP TABLE partida;
DROP TABLE comentario;
DROP TABLE atividade;
DROP TABLE quadra;
DROP TABLE times_partida;
DROP TABLE times_usuarios;

/*CREATE*/
CREATE TABLE usuario(
  id NUMBER,
  nome VARCHAR(50),
  cpf LONG,
  idade NUMBER(3,0),
  pontos NUMBER(3,0),
  senha VARCHAR(32),
  CONSTRAINT pk_usuario PRIMARY KEY(id)
);

CREATE TABLE times(
  id NUMBER,
  nome VARCHAR(50),
  emblema VARCHAR(50),
  id_usuario NUMBER,
  CONSTRAINT pk_times PRIMARY KEY(id)
);

CREATE TABLE partida(
  id NUMBER,
  duracao DATE,
  dataHora DATE,
  id_quadra NUMBER,
  CONSTRAINT pk_partida PRIMARY KEY(id)
);

CREATE TABLE comentario(
  id NUMBER,
  texto VARCHAR(255),
  dataHora DATE,
  visivel NUMBER(1,0),
  id_usuario NUMBER,
  id_partida NUMBER,
  CONSTRAINT pk_comentario PRIMARY KEY(id)
);

CREATE TABLE atividade(
  id NUMBER,
  gols NUMBER,
  faltas NUMBER,
  cartoesAmarelos NUMBER,
  cartoesVermelhos NUMBER,
  id_usuario NUMBER,
  id_partida NUMBER,
  CONSTRAINT pk_atividade PRIMARY KEY(id)
);

CREATE TABLE quadra(
  id NUMBER,
  tipo VARCHAR(20),
  localQuadra VARCHAR(50),
  valor NUMBER(15,2),
  CONSTRAINT pk_quadra PRIMARY KEY(id)
);

CREATE TABLE times_partida(
  id_times NUMBER,
  id_partida NUMBER,
  CONSTRAINT pk_times_partidas PRIMARY KEY(id_times, id_partida)
);

CREATE TABLE times_usuarios(
  id_usuario NUMBER,
  id_times NUMBER,
  CONSTRAINT pk_usuarios_times PRIMARY KEY(id_usuario,id_times)
);

/* FOREIGN KEY */
ALTER TABLE times ADD CONSTRAINT fk_times_usuario FOREIGN KEY(id_usuario) REFERENCES usuario(id);
ALTER TABLE partida ADD CONSTRAINT fk_partida_quadra FOREIGN KEY(id_quadra) REFERENCES quadra(id);
ALTER TABLE comentario ADD CONSTRAINT fk_comentario_usuario FOREIGN KEY(id_usuario) REFERENCES usuario(id);
ALTER TABLE comentario ADD CONSTRAINT fk__comentario_partida FOREIGN KEY(id_partida) REFERENCES partida(id);
ALTER TABLE atividade ADD CONSTRAINT fk_atividade_usuario FOREIGN KEY(id_usuario) REFERENCES usuario(id);
ALTER TABLE atividade ADD CONSTRAINT fk_atividade_partida FOREIGN KEY(id_partida) REFERENCES partida(id);
ALTER TABLE times_partida ADD CONSTRAINT fk_timespartida_times FOREIGN KEY(id_times) REFERENCES times(id);
ALTER TABLE times_partida ADD CONSTRAINT fk_timespartida_partida FOREIGN KEY(id_partida) REFERENCES partida(id);
ALTER TABLE times_usuarios ADD CONSTRAINT fk_timesusuarios_usuario FOREIGN KEY(id_usuario) REFERENCES usuario(id);
ALTER TABLE times_usuarios ADD CONSTRAINT fk_timesusuarios_times FOREIGN KEY(id_times) REFERENCES times(id);

/*DROP SEQUENCE*/
DROP SEQUENCE s_usuario;
DROP SEQUENCE s_time;
DROP SEQUENCE s_comentario;
DROP SEQUENCE s_partida;
DROP SEQUENCE s_quadra;
DROP SEQUENCE s_atividade;

/* SEQUENCE */
CREATE SEQUENCE s_usuario NOCACHE;
CREATE SEQUENCE s_time NOCACHE;
CREATE SEQUENCE s_comentario NOCACHE;
CREATE SEQUENCE s_partida NOCACHE;
CREATE SEQUENCE s_quadra NOCACHE;
CREATE SEQUENCE s_atividade NOCACHE;

/* INSERT */
INSERT INTO Usuario(id,nome,cpf,idade,pontos,senha)VALUES(s_usuario.NEXTVAL,'Admin',12345678901,20,0,'12345');

/* SELECT */
SELECT * FROM usuario;