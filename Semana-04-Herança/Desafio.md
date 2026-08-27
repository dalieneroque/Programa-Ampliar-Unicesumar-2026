# Desafio — Herança em Java

Desenvolva um programa simples em **Java** para praticar o conceito de **Herança** em Programação Orientada a Objetos (POO).

## Desafio

Crie uma classe chamada `Animal`.

A classe deverá possuir:

- `nome`
- `idade`

E um método:

```java
emitirSom()
```

Depois, crie duas classes que **herdem** de `Animal`:

- `Cachorro`
- `Gato`

Utilize `extends` para fazer a herança.

### Tarefas

- [ ] Criar a classe `Animal`;
- [ ] Criar os atributos `nome` e `idade`;
- [ ] Criar o método `emitirSom()`;
- [ ] Criar a classe `Cachorro` usando `extends Animal`;
- [ ] Criar a classe `Gato` usando `extends Animal`;
- [ ] Criar um objeto `Cachorro`;
- [ ] Criar um objeto `Gato`;
- [ ] Exibir o nome e a idade dos animais;
- [ ] Fazer cada animal emitir seu próprio som.

### Exemplo de saída

```text
Cachorro
Nome: Rex
Idade: 3
Som: Au Au!

Gato
Nome: Mimi
Idade: 2
Som: Miau!
```

## 🚀 Desafio Extra

Faça com que cada classe tenha um comportamento diferente:

```text
Cachorro → emitirSom() → "Au Au!"
Gato     → emitirSom() → "Miau!"
```

**Dica:** você pode utilizar `@Override` para sobrescrever o método `emitirSom()` da classe `Animal`.

### 🎯 Objetivo

Entender de forma prática que **herança permite que uma classe aproveite características e métodos de outra classe**, podendo também criar ou modificar comportamentos próprios.

**Animal** → classe pai  
**Cachorro** e **Gato** → classes filhas