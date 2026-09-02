# 💳 Desafio Prático — Polimorfismo em Java

## Sistema de Pagamentos

Você está desenvolvendo um sistema de pagamentos. O sistema precisa permitir que o cliente escolha diferentes formas de pagamento.

Cada forma de pagamento possui uma maneira diferente de realizar a transação.

Seu desafio é utilizar **Polimorfismo** para implementar esse comportamento.

---

## 🎯 Objetivo

Criar um programa que permita realizar pagamentos utilizando diferentes formas de pagamento, sem precisar criar vários `if` ou `switch` para verificar qual tipo de pagamento está sendo utilizado.

Você deverá praticar:

- Classes
- Objetos
- Herança
- `extends`
- Métodos
- `@Override`
- Polimorfismo
- Array
- Estrutura `for`

---

# 📋 Requisitos

## 1. Crie a superclasse `Pagamento`

Crie uma classe chamada:

```java
Pagamento
```

Ela deverá possuir o método:

```java
public void realizarPagamento()
```

Esse método deverá apresentar uma mensagem genérica.

---

## 2. Crie as formas de pagamento

Crie três subclasses:

- `Pix`
- `Cartao`
- `Boleto`

Todas deverão herdar da classe `Pagamento`.

Utilize:

```java
extends Pagamento
```

---

## 3. Sobrescreva o método

Cada forma de pagamento deverá sobrescrever:

```java
realizarPagamento()
```

utilizando:

```java
@Override
```

Cada classe deverá apresentar uma mensagem diferente.

### Exemplos

```text
Pagamento realizado via PIX!
Pagamento realizado via Cartão!
Boleto gerado com sucesso!
```

---

# ⭐ 4. Utilize Polimorfismo

Crie um array do tipo `Pagamento` contendo diferentes formas de pagamento.

Exemplo:

```java
Pagamento[] pagamentos = {
    new Pix(),
    new Cartao(),
    new Boleto()
};
```

Observe que o array é do tipo `Pagamento`, mas possui objetos de classes diferentes.

---

# 🔄 5. Percorra o array

Utilize um `for` para percorrer os pagamentos.

Dentro do `for`, chame:

```java
pagamento.realizarPagamento();
```

O programa deverá identificar automaticamente qual comportamento deve ser executado.

---

# 💻 Exemplo da estrutura principal

```java
public class Main {

    public static void main(String[] args) {

        Pagamento[] pagamentos = {
            new Pix(),
            new Cartao(),
            new Boleto()
        };

        for (Pagamento pagamento : pagamentos) {
            pagamento.realizarPagamento();
        }
    }
}
```

> ⚠️ **Atenção:** o objetivo é que você desenvolva as classes `Pagamento`, `Pix`, `Cartao` e `Boleto`.

---

# 🎯 Resultado esperado

O programa deverá apresentar algo semelhante a:

```text
Pagamento realizado via PIX!
Pagamento realizado via Cartão!
Boleto gerado com sucesso!
```

---

# 🚀 Desafio Extra

Depois de finalizar o desafio, crie **duas novas formas de pagamento**.

Sugestões:

- `PayPal`
- `Criptomoeda`

Cada uma deverá possuir seu próprio comportamento no método:

```java
realizarPagamento()
```

Adicione as novas formas de pagamento ao array.

---

# 🧠 Desafio Final

Agora tente melhorar o sistema.

Crie na classe `Pagamento` um atributo:

```java
double valor;
```

Crie um construtor para receber o valor do pagamento.

Por exemplo:

```java
new Pix(150.00)
```

O resultado poderá ser:

```text
Pagamento via PIX: R$ 150,00
Pagamento via Cartão: R$ 250,00
Boleto gerado: R$ 100,00
```

---

# ❓ Perguntas para reflexão

Ao terminar, responda:

### 1. Onde está o polimorfismo nesse programa?

### 2. Por que o array pode ser do tipo `Pagamento`?

### 3. O que aconteceria se criássemos uma nova classe `PayPal`?

### 4. Por que não precisamos utilizar vários `if` para descobrir qual forma de pagamento está sendo utilizada?

### 5. Qual é a vantagem de cada classe possuir sua própria implementação de `realizarPagamento()`?

---

# 🏆 Checklist

- [ ] Criei a classe `Pagamento`
- [ ] Criei `Pix`
- [ ] Criei `Cartao`
- [ ] Criei `Boleto`
- [ ] Utilizei `extends`
- [ ] Utilizei `@Override`
- [ ] Criei um `Pagamento[]`
- [ ] Utilizei `for`
- [ ] Chamei `pagamento.realizarPagamento()`
- [ ] Adicionei novas formas de pagamento
- [ ] Implementei o valor do pagamento
- [ ] Consegui identificar o polimorfismo no código

---

## 💡 Dica

Não pense:

> "Qual é o tipo desse objeto?"

Pense:

> **"Qual comportamento esse objeto deve executar?"**

Essa é uma das ideias fundamentais por trás do **Polimorfismo**.