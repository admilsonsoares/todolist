
![Logo](https://blog.optimalworkshop.com/wp-content/uploads/2020/06/Understanding-top-tasks.png)


## Autores

- [@admilsonsoares](https://www.github.com/admilsonsoares)


# To Do List

Aplicação Java criada para gerenciamento de tasks:

## Funcionalidades

- Autenticação e Autorização de usuários (Pendente)
- Cadastro de Tasks (base pré cadastrada)
- Busca autenticada das tasks criadas pelo usuario com/sem filtro (PENDING, COMPLETED)
- Busca autenticada das tasks de todos os usuarios por usuario com autorização de gestor
- Busca saúde dos seus componentes (GET /healthcheck)
- Busca indicadores de performance da API
- Documentação Swagger



## Stack utilizada

**Arquitetura:** Hexagonal

**Virtualização:** Docker

**Back-end:** Java, Spring (Boot, Data, Security, Actuator)

**Banco de Dados:** Mysql


## Requisitos

- Docker
- Docker-Compose

## Rodando localmente

Clone o projeto

```bash
  https: git clone https://github.com/admilsonsoares/todolist.git
  ou
  ssh:   git clone git@github.com:admilsonsoares/todolist.git
```

Entre no diretório do projeto

```bash
  cd todo-list
```

Execute o seguinte comando para subir a aplicação

```bash
  ./run.sh     
```

## Uso/Exemplos

- O seguinte link leva a documentação do swagger que contempla os endpoins da aplicação.


    http://localhost:8080/swagger-ui/index.html


- Buscar tasks sem filtro

```javascript

curl -X 'GET' \
  'http://localhost:8080/tasks' \
  -H 'accept: */*'

```

- Buscar tasks com filtro PENDING

```javascript

curl -X 'GET' \
  'http://localhost:8080/tasks?status=PENDING' \
  -H 'accept: */*'

```

- Buscar tasks com filtro COMPLETED

```javascript

curl -X 'GET' \
  'http://localhost:8080/tasks?status=COMPLETED' \
  -H 'accept: */*'

```

- Buscar as tasks de todos os usuarios

```javascript

curl -X 'GET' \
  'http://localhost:8080/tasks/admin' \
  -H 'accept: */*'

```

- Buscar as métricas disponíveis

```javascript

curl -X 'GET' \
  'http://localhost:8080/actuator/metrics' \
  -H 'accept: application/vnd.spring-boot.actuator.v3+json'

```

- Buscar detalhes de uma métricas específica por exemplo (disk.free)

```javascript

curl -X 'GET' \
  'http://localhost:8080/actuator/metrics/disk.free' \
  -H 'accept: application/vnd.spring-boot.actuator.v3+json'

```

- Buscar informações sobre a sáude aplicação.

```javascript

curl -X 'GET' \
  'http://localhost:8080/actuator/health' \
  -H 'accept: application/vnd.spring-boot.actuator.v3+json'

```
