# 🚀 Desafio — Interfaces, Polimorfismo e Classes Abstratas

## 🎯 Objetivo

Neste desafio, você irá praticar conceitos de **Programação Orientada a Objetos (POO)** em Java, trabalhando principalmente com:

- Interfaces
- Implementação de interfaces
- Polimorfismo
- Classes abstratas
- Métodos abstratos
- Herança
- Sobrescrita de métodos

---

# 🟦 Parte 1 — Interface `Autenticavel`

Crie uma interface chamada `Autenticavel`.

### Requisitos

1. Crie a interface `Autenticavel`.
2. Dentro da interface, declare o método:

```java
void autenticar();
```

3. Crie a classe `Usuario` implementando `Autenticavel`.
4. Crie a classe `Administrador` implementando `Autenticavel`.
5. Cada classe deve possuir um comportamento diferente para o método `autenticar()`.

### 💡 Exemplo de comportamento

O `Usuario` pode exibir:

```text
Usuário autenticado com sucesso!
```

Enquanto o `Administrador` pode exibir:

```text
Administrador autenticado com acesso especial!
```

---

## 🔄 Utilizando Polimorfismo

Depois de criar as classes, utilize o conceito de **polimorfismo**:

```java
Autenticavel usuario = new Usuario();
usuario.autenticar();
```

E também:

```java
Autenticavel administrador = new Administrador();
administrador.autenticar();
```

### 🤔 Pense sobre isso

Observe que a variável é do tipo `Autenticavel`, mas o objeto criado pode ser um `Usuario` ou um `Administrador`.

**Pergunta:**

> Por que o Java permite que uma variável do tipo `Autenticavel` receba objetos de classes diferentes?

---

# 🔥 Desafio Extra — Classe Abstrata `Funcionario`

Agora vamos praticar **herança e classes abstratas**.

## Requisitos

### 1. Crie a classe abstrata `Funcionario`

A classe deve possuir os seguintes atributos:

```java
String nome;
double salario;
```

Além disso, crie o método abstrato:

```java
public abstract double calcularBonus();
```

---

### 2. Crie a classe `Gerente`

A classe `Gerente` deve:

- Herdar de `Funcionario`
- Implementar o método `calcularBonus()`
- Possuir uma regra própria para calcular o bônus

### Exemplo:

```text
Bônus do gerente = 20% do salário
```

---

### 3. Crie a classe `Desenvolvedor`

A classe `Desenvolvedor` deve:

- Herdar de `Funcionario`
- Implementar o método `calcularBonus()`
- Possuir uma regra diferente da classe `Gerente`

### Exemplo:

```text
Bônus do desenvolvedor = 10% do salário
```

---

# 🔄 Aplicando Polimorfismo

Depois de criar as classes, experimente:

```java
Funcionario funcionario1 = new Gerente("Ana", 5000);
Funcionario funcionario2 = new Desenvolvedor("Carlos", 5000);
```

Depois, chame:

```java
System.out.println(funcionario1.calcularBonus());
System.out.println(funcionario2.calcularBonus());
```

Mesmo utilizando uma referência do tipo `Funcionario`, cada objeto deverá executar sua própria implementação de `calcularBonus()`.

---

# 🧠 Conceitos praticados

Ao finalizar o desafio, você terá praticado:

| Conceito | Aplicação |
|---|---|
| **Interface** | `Autenticavel` |
| **Implementação** | `Usuario` e `Administrador` |
| **Polimorfismo** | `Autenticavel usuario = new Usuario();` |
| **Classe abstrata** | `Funcionario` |
| **Herança** | `Gerente` e `Desenvolvedor` |
| **Método abstrato** | `calcularBonus()` |
| **Sobrescrita** | Implementação diferente de `calcularBonus()` |
| **Encapsulamento** | Organização e proteção dos atributos |

---

# 🏆 Desafio Final

Depois de implementar tudo, crie uma classe `Main` para testar seu código.

O programa deverá:

1. Criar um `Usuario` e autenticá-lo.
2. Criar um `Administrador` e autenticá-lo.
3. Criar um `Gerente` e calcular seu bônus.
4. Criar um `Desenvolvedor` e calcular seu bônus.
5. Utilizar referências das classes mais genéricas (`Autenticavel` e `Funcionario`) para demonstrar **polimorfismo**.

### 💬 Pergunta para reflexão

> Qual é a diferença entre utilizar uma **interface** e uma **classe abstrata**?

**Não consulte a resposta imediatamente. Tente explicar com suas próprias palavras primeiro!** 🚀