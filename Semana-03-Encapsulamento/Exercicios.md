# Exercício — Sistema Bancário com Encapsulamento

Desenvolva, em **Java**, um sistema bancário simples utilizando os conceitos de **Programação Orientada a Objetos (POO)**, com foco em **Encapsulamento**.

Crie uma classe chamada `ContaBancaria` que possua os seguintes atributos:

* Número da conta;
* Titular;
* Saldo.

Todos os atributos deverão ser declarados como `private`.

A classe deverá possuir:

* Um construtor para inicializar os dados da conta;
* Métodos `get` para consultar os dados;
* Um método para realizar depósitos;
* Um método para realizar saques;
* Um método para realizar transferências entre contas.

### Regras

* O saldo inicial deverá ser `R$ 0,00`.
* Não permita depósitos com valores menores ou iguais a zero.
* Não permita saques com valores menores ou iguais a zero.
* Não permita saques superiores ao saldo disponível.
* A transferência deverá verificar se existe saldo suficiente.
* O saldo não poderá ser alterado diretamente fora da classe.
* As operações deverão informar ao usuário se foram realizadas com sucesso ou se foram recusadas.

Crie também uma classe principal para testar todas as funcionalidades desenvolvidas.

### Testes obrigatórios

O programa deverá testar:

* Depósito válido;
* Saque válido;
* Transferência entre contas;
* Saque sem saldo suficiente;
* Depósito com valor inválido;
* Tentativa de acesso direto ao saldo.


