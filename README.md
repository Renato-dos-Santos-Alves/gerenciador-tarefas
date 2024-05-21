# gerenciador-tarefas
Um aplicativo simples para gerenciar tarefas, onde os usuário podem visualizar, adicionar, apagar e atualizar o conteúdo de sua lista pessoal.

# App StringBoot

## Inicializar a aplicação no host

É necessário ter um postgresql rodando em localhost, porta 5432.
Banco de dados com o nome `gerenciador-tarefa`.
O usuário e senha padrão estão no arquivo de propriedades (`application.properties`)

```sh
$ ./mnvw spring-boot:run
```


## Inicializar pelo docker-compose

O banco de dados para docker-compose deve ser mudado de `localhost` para `db` no arquivo de proproedades.

```
$ docker compose up --build
```
