# :mailbox_closed: Orientação a Objetos

## Introdução

A Orientação a Objetos surgiu com a finalidade de facilitar a vida do desenvolvimento de software, pois na POO o difícil não é desenvolvedor mas sim desenvolver um software que satisfaça o cliente.

### Encapsulamento:

*public*: o método é visível por qualquer classe. Todo mundo pode usar.

*private*: o método é visível apenas pela a própria classe.

*protected*: o método é visível pela própria classe e por suas subclasses e pelas classes do mesmo pacote.

### Tipos de Retorno:

refere-se ao tipo de dado retornado pelo método. Métodos que não retornam valores devem possuir nesses paramentos a palavra VOID.

### Um método pode ter como retorno:

Tipos primitivos: byte, int, short, long, float, double e char

Vetores: int[], String[], List[]...

Tipos de referência: String, Scanner, Aluno.

------

# Classe

Classe é um conjunto de objetos com características e comportamentos afins.

Representa um conjunto de objetos com a mesma estrutura.

Modelo do qual objetos individuais são criados.

Classes devem representar uma abstração.

Instância

- A partir de uma mesma classe é possível criar diversos objetos.

Objetos é a instância de uma classe, ou seja, é a concretização de uma classe.

- Um objeto é algo que existem fisicamente e que foi "moldado" na classe.
- A criação de um objeto em Java é feita conforme comando abaixo:
- Classe variável = new Classe();

onde:

Classe é o tipo da variável Objeto.

Variável: é o nome da variável objeto propriamente dia.

New: é o operador de criação da variável objeto.

Classe(0: é o método construtor da classe, responsável por construir um objeto com determinados valores.