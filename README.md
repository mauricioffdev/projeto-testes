# 🧪 Projeto de Estudo: Testes Unitários com JUnit 5 (Java)

Este repositório foi criado para demonstrar o conhecimento e a aplicação de testes unitários em Java utilizando o framework padrão da indústria, o **JUnit 5 (Jupiter)**.

O objetivo é garantir a integridade e a manutenibilidade das funcionalidades básicas através de testes automatizados.

---

## 🛠️ Conceitos e Ferramentas Aplicadas

Os seguintes conceitos foram praticados e aplicados no desenvolvimento deste projeto:

### JUnit 5
* `@Test`: Marcação dos métodos que representam cenários de teste.
* `@BeforeEach`: Configuração de objetos (instanciação da classe `Calculadora`) que são executados antes de cada teste, evitando repetição de código.
* **Assertions (Verificações):**
    * `Assertions.assertEquals`: Usado para verificar igualdade de valores (`somar`, `juros`).
    * `Assertions.assertTrue`/`assertFalse`: Usados para testar condições booleanas (`ehPar`).
    * `Assertions.assertThrows`: Usado para verificar se uma exceção esperada é lançada (`dividir por zero`).

### Metodologia
* **Padrão AAA (Arrange, Act, Assert):** Organização dos testes em três etapas claras: Preparação do Cenário, Execução da Ação e Verificação do Resultado.
* **TDD Básico (Test Driven Development):** Demonstração do ciclo de escrita do teste antes da implementação do método, forçando uma melhor arquitetura de código.

### Estrutura
* **Padrão Maven:** Uso da estrutura `src/main/java` para o código da aplicação e `src/test/java` para o código de teste, garantindo o isolamento das dependências de teste.

---

## 📂 Estrutura do Projeto

| Caminho | Descrição |
| :--- | :--- |
| `src/main/java/entidades/Calculadora.java` | A classe principal que contém a lógica de negócio (funções de soma, divisão, etc.). |
| `src/test/java/entidades/CalculadoraTest.java` | A classe de teste que valida todas as funcionalidades da `Calculadora`. |
| `pom.xml` | Contém a dependência configurada para o JUnit Jupiter com escopo de `test`. |

---

## 🚀 Como Rodar

Para executar os testes:

1.  Clone o repositório.
2.  Abra o projeto no IntelliJ IDEA (ou qualquer IDE com suporte a Maven).
3.  Execute a classe `CalculadoraTest.java` (clicando no ícone de Play ao lado da classe).

Todos os testes devem passar (barra verde).