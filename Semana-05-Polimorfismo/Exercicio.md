# Exercício — Animais

Neste desafio, você irá praticar os conceitos de **Herança**, **Sobrescrita de Métodos (`@Override`)** e **Polimorfismo** em Java.

### 📋 Requisitos

- Crie a superclasse **`Animal`** com o método **`emitirSom()`**.
- Crie as subclasses:
  - **`Cachorro`**
  - **`Gato`**
  - **`Passaro`**
- Cada subclasse deve **sobrescrever** o método `emitirSom()` utilizando **`@Override`**.
- Cada animal deve apresentar um comportamento diferente ao emitir seu som.
- Crie um **array de `Animal`** contendo objetos das três subclasses.
- Utilize um **`for`** para percorrer o array.
- Dentro do `for`, chame:

```java
animal.emitirSom();
```

### 💡 Exemplo de saída esperada

```text
Cachorro: Au au!
Gato: Miau!
Passaro: Piu piu!
```

### 🎯 Objetivo

Ao finalizar o desafio, você deverá compreender como uma mesma referência do tipo `Animal` pode representar diferentes objetos e executar comportamentos específicos de cada classe.

**Conceitos praticados:**

- [ ] Classes
- [ ] Objetos
- [ ] Herança
- [ ] `extends`
- [ ] `@Override`
- [ ] Polimorfismo
- [ ] Arrays
- [ ] Estrutura `for`