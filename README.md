# Sistema de Animais e Aves

Este projeto implementa um sistema de classes e interfaces que representam **animais** e **aves**, com a funcionalidade de controlar o estado de vida dos animais e simular comportamentos como voar para as aves.

Uma **interface** em Java é um tipo especial de classe que define um conjunto de métodos que outras classes devem implementar. 
Ela não contém a implementação desses métodos, apenas suas assinaturas (nomes, parâmetros e tipo de retorno). Classes que implementam a interface precisam fornecer a implementação dos métodos definidos nela.

Uma **classe abstrata** em Java é uma classe que não pode ser instanciada diretamente, ou seja, você não pode criar objetos dela. Ela pode conter métodos abstratos (sem implementação) e métodos concretos (com implementação). 
As classes que herdam de uma classe abstrata são obrigadas a implementar os métodos abstratos, a menos que também sejam abstratas.

A classe abstrata serve como um modelo para outras classes, fornecendo uma base comum para herança.




## Estrutura do Projeto

### Classes

1. **Animal (classe abstrata)**:
   - Representa um animal genérico com os seguintes atributos:
     - `nome`: Nome do animal.
     - `idade`: Idade do animal.
     - `isVivo`: Indica se o animal está vivo ou morto.
   - Métodos:
     - `acordar()`: Simula o ato de acordar o animal, caso ele esteja vivo.
     - `dormir()`: Simula o ato de dormir.
     - `morrer()`: Altera o estado do animal para morto, caso ele ainda esteja vivo.
   - **Construtores**:
     - `Animal()`: Construtor padrão que inicializa `isVivo` como `true`.
     - `Animal(String nome, int idade)`: Construtor que inicializa `nome` e `idade`, e `isVivo` como `true`.

2. **Ave (classe concreta)**:
   - Herda de `Animal` e implementa a interface `Voador`.
   - Atributos:
     - `tamanhoAsa`: Representa o tamanho da asa da ave.
   - Métodos:
     - `voar()`: Simula o ato de a ave voar, se estiver viva.
     - `toString()`: Sobrescreve o método `toString` para fornecer uma representação da ave.
   - **Construtores**:
     - `Ave(String nome, int idade, int tamanhoAsa)`: Construtor que inicializa `nome`, `idade` e `tamanhoAsa`.

3. **Voador (interface)**:
   - Define o comportamento `voar()` que deve ser implementado por qualquer classe que represente um ser capaz de voar, como a classe `Ave`.

## Funcionalidades

- **Animal**:
  - Controla o estado de vida de um animal com os métodos `acordar()`, `dormir()` e `morrer()`.
  
- **Ave**:
  - A classe `Ave` herda as funcionalidades de `Animal` e adiciona a habilidade de voar, controlada pelo método `voar()`.
  
- **Voador**:
  - A interface `Voador` define o comportamento de voar, que é implementado pela classe `Ave`.

