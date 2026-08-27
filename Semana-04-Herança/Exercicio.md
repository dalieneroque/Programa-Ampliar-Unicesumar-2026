# Exercício — Sistema de Veículos com Herança em Java

Desenvolva, em **Java**, um sistema simples de veículos utilizando os conceitos de **Programação Orientada a Objetos (POO)**, com foco em **Herança**.

Crie uma superclasse chamada `Veiculo` que possua os seguintes atributos:

- Marca;
- Modelo;
- Ano.

A classe `Veiculo` deverá possuir:

- Um construtor para inicializar os dados;
- Métodos para exibir as informações do veículo;
- Um método `acelerar()`.

Em seguida, crie duas subclasses:

- `Carro`, que deverá herdar de `Veiculo`;
- `Moto`, que deverá herdar de `Veiculo`.

As subclasses deverão utilizar os atributos e métodos herdados da classe `Veiculo`.

### Regras

- `Carro` e `Moto` devem utilizar **herança** com `extends`;
- Os atributos da classe `Veiculo` deverão ser protegidos ou acessados por meio de métodos apropriados;
- O método `acelerar()` deverá ser utilizado pelos diferentes tipos de veículos;
- Cada veículo deverá apresentar suas próprias informações;
- A classe principal deverá criar objetos de `Carro` e `Moto`;
- O programa deverá testar os métodos desenvolvidos.

### Testes obrigatórios

O programa deverá:

- Criar um objeto `Carro`;
- Criar um objeto `Moto`;
- Exibir os dados do carro;
- Exibir os dados da moto;
- Executar o método `acelerar()` para o carro;
- Executar o método `acelerar()` para a moto;
- Demonstrar que `Carro` e `Moto` herdam características de `Veiculo`.

### 🚀 Desafio Extra

Adicione um método específico chamado:

```java
abrirPorta()
```

Esse método deverá existir **somente na classe `Carro`**, pois uma moto não possui portas.

Ao executar o programa, demonstre que:

- O `Carro` pode utilizar os métodos herdados de `Veiculo`;
- O `Carro` também possui o método específico `abrirPorta()`;
- A `Moto` utiliza os métodos herdados de `Veiculo`, mas não possui `abrirPorta()`.


**Objetivo do exercício:** compreender na prática como uma classe pode herdar características de outra classe e, ao mesmo tempo, possuir seus próprios comportamentos.