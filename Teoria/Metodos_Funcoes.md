# Métodos e Funções :keyboard:

#### Definição de métodos:

Métodos ou funções ajudam a modularizar um programa separando-o em blocos pequenos que juntos compõem o sistema.

Uma boa motivação para modularizar o código é a expressão dividir e conquistar.

"Dividir e conquistar."

Os métodos recebem nome que podem ser chamadas varias vezes durante a execução do programa.

Sintexe:

```java
public int nome(args[]){
	codigo
	return(valor);
}
```

#### Funções sem retorno:

- Void

#### Funções com retorno:

Para se retornar é preciso definir na frente do nome do método o tipo do valor a ser retornado.

"Use o return para retornar o valor."

#### Sobrecarga de Métodos:

Na linguagem Java é permitido que vários métodos sejam definidos com o mesmo nome o qual chamamos de sobrecarga, porém tem que ter a lista de argumentos diferentes.

```java
public class Exemplo{

	public static void add(int a, int b){
	}
	public static void add(int a, int b, int c){
	}
	public static void add(double a, double b){
	}
}
```

------

# Entrada de Dados:film_strip:

### Método SCANNER

Sintaxe:

```java
import java.util.Scanner;

Scanner ler = new Scanner(System.in);
```

Para utilizar é necessário importar a biblioteca SCANNER.

Na linha Scanner ler = new Scanner([System.in](http://System.in));, informamos ao Java que utilizamos uma variável chamada ler e todos os métodos da classe Scanner estão contidos nela e estes dados serem informados via teclado.

Mas para isso precisamos informar:

### Para os tipos:

- Int
- Float
- Double
- String

### Método do Scanner:

- nextInt()
- nextFloat()
- nextDouble()
- nextLine()

------

# Outros Métodos:

#### SQRT:

O método SQRT retorna a raiz quadrada de um número, porém o número deve ser do tipo Double.

#### RANDON:

Outro método utilizado na classe Math é o Randon ele retorna um número fracionário aleatório entre 0.0 e 1.0.

Mas como converter em inteiro?

Basta colocar o tipo primitivo na frente.

Ex:

```java
(int)(Math.randon()* 60);
```

# Métodos Matemáticos:

#### ABS:

Retorna o valor absoluto de cada número.

#### POW:

Retorna a potência de número por outro.

#### CEIL:

Retorna o próximo número inteiro.

#### FLOOR:

Retorna o número inteiro anterior.

#### MAX:

Retorna o maior valor entre dois números.

#### MIN:

Retorna o menor valor entre dois números.

#### COS:

Retorna o Co-Seno do número em radianos.

#### SIN:

Retorna o seno dos números em radianos.

#### TAN:

Retorna o tangente dos números em radianos.

------

# Funções com Strings

Uma String é um conjunto de caracteres.

### Método Equals:

Esse método é usado para comparar Strings.

### Método Length:

O método length é usado para retornar o tamanho de uma determinada string, incluindo os espaços em branco.

### Método SubString:

É usado para retornar uma nova string a partir de dois índices específicos.

Sintaxe:

```java
<string> .substring(<primeiro>,<segundo>);
```

### Método CharAt:

É usado para indicar um caracter existente na posição indicada na posição dentro da string.

(Começando na posição 0.)

### Método IndexOf

Retorna um número inteiro indicando a posição de um caractere dentro de uma string.

### Outros Métodos:

### ToLowCase():

retorna uma nova string, formada pelo conteúdo de uma string dada, com os caracteres para formato minúsculo.

### ToUpperCase():

Retorna uma nova string, formada pelo conteúdo de uma string dada, como caracteres convertidos para formato maiúsculo.

### ValeuOf():

Cria string a partir de um dado númerico.

------

# Conversão de dados primitivos

Em algum momento na construção do seu programa, você precisará converter tipos de dados, exemplo, você recebeu o valor de uma string e precisará utilizar está informação como valor numérico inteiro.

```java
parseInt(String);
parseFloat(String);
parseDouble(String);
```