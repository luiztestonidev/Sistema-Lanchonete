# Sistema de Lanchonete (Console)

Sistema desenvolvido em Java que simula o fluxo de atendimento de uma lanchonete via terminal, permitindo criar pedidos, consultar o cardápio, aplicar descontos e calcular valores em tempo real.

---

## Sobre o projeto

Este projeto foi desenvolvido com o objetivo de praticar e consolidar fundamentos da programação em Java, evoluindo gradualmente de uma abordagem estruturada para conceitos iniciais de orientação a objetos.

A aplicação simula um cenário real de atendimento, onde o usuário pode interagir com o sistema para montar pedidos e visualizar informações relevantes de forma simples e funcional.

---

## Funcionalidades

* Criação de novos pedidos
* Exibição do cardápio completo
* Consulta de itens por categoria (lanches, acompanhamentos e bebidas)
* Sorteio do dia com aplicação automática de desconto
* Cálculo do valor total do pedido
* Cálculo de troco com validação de valor recebido
* Resumo final com dados do cliente e itens selecionados
* Validação de entradas para evitar falhas no sistema

---

## Regras do sistema

* O usuário pode adicionar múltiplos itens ao pedido
* O sistema valida entradas inválidas (ex: letras no lugar de números)
* Um item pode receber desconto automaticamente caso seja o sorteado do dia
* O valor total do pedido é atualizado dinamicamente
* Os dados do pedido são mantidos em memória durante a execução

---

## Tecnologias e conceitos aplicados

* Java
* Entrada de dados com `Scanner`
* Estruturas condicionais (`if/else`, `switch`)
* Estruturas de repetição (`while`, `do-while`, `for`)
* Estruturas de dados:

  * Arrays
  * `ArrayList` (em evolução)
* Organização de código em métodos
* Validação de entrada de dados (programação defensiva)

---

## Arquitetura (em evolução)

O projeto foi iniciado com uma abordagem estruturada e está sendo gradualmente refatorado para orientação a objetos.

Evoluções em andamento incluem:

* Substituição de arrays por estruturas dinâmicas (`ArrayList`)
* Criação de classes para representar entidades do sistema (ex: Item, Pedido)
* Melhor separação de responsabilidades

---

## Aprendizados

Durante o desenvolvimento deste projeto, foram praticados:

* Manipulação de entrada de dados com `Scanner`
* Controle de fluxo com estruturas condicionais e loops
* Organização e reutilização de código com métodos
* Tratamento de erros de entrada do usuário
* Evolução de estruturas fixas para estruturas dinâmicas
* Introdução à modelagem orientada a objetos

---

## Estrutura do projeto

```
src/
 └── main/
      └── java/
           └── org.example/
                └── Main.java
```

---

## ▶Como executar

### Pré-requisitos

* Java 17 ou superior
* IDE (IntelliJ IDEA, Eclipse, VS Code) ou terminal

### Execução via terminal

```bash
git clone https://github.com/luiztestonidev/Sistema-Lanchonete.git
cd Sistema-Lanchonete/src/main/java
javac org/example/Main.java
java org.example.Main
```

### Execução via IDE

1. Abra o projeto na sua IDE
2. Localize a classe `Main.java`
3. Execute o método `main`

---

## Exemplo de uso

```
_-= LANCHES-TESTONI =-_
[1] - NOVO PEDIDO
[2] - CONSULTAR CARDAPIO POR CATEGORIA
[3] - CALCULAR TROCO
[4] - SORTEIO DO DIA
[5] - ENCERRAR SISTEMA
```

---

## Próximas melhorias

* Integração com banco de dados
* Refatoração completa para orientação a objetos
* Criação de API REST
* Desenvolvimento de interface gráfica (GUI)
* Organização em múltiplas classes (ex: Pedido, Item, Serviço)

---

## Autor

Luiz Testoni

---

## Observação

Este projeto faz parte do processo contínuo de evolução em desenvolvimento de software, com foco em prática consistente, melhoria de código e adoção gradual de boas práticas profissionais.