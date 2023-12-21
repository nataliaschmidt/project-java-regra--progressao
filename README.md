# Regra de Progressão

O programa em Java desenvolvido facilita o gerenciamento das atividades avaliativas, permitindo o cadastro, inserção de notas e cálculo automático do desempenho, determinando se o estudante alcançou os 85% necessários para ser aprovado.

## Tecnologias Utilizadas
<hr>

- Java
- Maven

## Instruções
<hr>

- Clone este repositório.

```bash
git clone git@github.com:nataliaschmidt/project-java-regra--progressao.git
```
- Acesse o diretório do projeto e instale suas dependências
```bash
mvn install
```

Execute a classe App, responsável por interagir com a pessoa usuária. Essa classe encontra-se no caminho /src/main/java/com.trybe.java.regraprogressao

## Exemplo de uso

```bash
----------- Cadastrar atividades avaliativas-----------

Digite a quantidade de atividades para cadastrar:
3
Digite o nome da atividade 1:
Projeto Lista de Tarefas
Digite o peso da atividade 1: 
30
Digite a nota obtida para Projeto Lista de Tarefas:
22
Digite o nome da atividade 2:
Projeto Lista de Compras
Digite o peso da atividade 2: 
30
Digite a nota obtida para Projeto Lista de Compras:
30
Digite o nome da atividade 3:
Projeto Jogo de Advinhação
Digite o peso da atividade 3: 
40
Digite a nota obtida para Projeto Jogo de Advinhação:
35

Lamentamos informar que, com base na sua pontuação alcançada neste período, 29.6%, você não atingiu a pontuação mínima necessária para sua aprovação.

```