package teste;

public class aConsulta {
	public static void main(String[] args) {
/*
# Atalho.
- Escreva sysout depois aperte - ctrl + barra
- ctrl + shif + f - para fazer identa��o do codigo.
- ctrl + shift + o - para fazer import Ex: Locale, Scanner,
- /* e invetido disso - para fazer comentarios 
- botao direito . op��o source > generate constructor using fields
- botao direito . op��o source > generate getters and setters
- seleciona o codigo, alt + seta pra cima
- seleciona o codigo, ctrl + alt + seta pra cima/baixo
- ctrl + shift + c - comenta o bloco
		
# Entrada de dados.
- sc.next(); - String
- sc.nextLine(); - String
- sc.nextInt(); - Float
- sc.nextDouble(); - Double 
- sc.next().charAt(0); - char

		
# Fun��es String
- Variavel.toLowerCase(); - deixa em minusculo.
- variavel.toUpperCase(); - deixa em maiusculo.
- variavel.trim(); - elimina os espa�os.
- variavel.substring(); - faz recorte do texto da variavel pegando um determinado indice.
- variavel.substring(indice, indice); - faz recorte do texto da variavel pegando um determinado. 
indice, mas com inicio e fim definido.
- variavel.replace('a', 'x'); - sempre que achar a letra 'A' Troca por 'X', 
ou qualquer outra defini��o escolhida.
- variavel.indexOF(); - serve para achar a posi��o que a letra/texto esta.
- variavel.lastIndexOF(); - serve para achar a ultima posi��o que a letra/texto esta.
- .split(); - serve para dividir um texto em varios indices dentro de um vetor.
Exemplo: String s = "potato apple lemon"; > String[] vect = s.split(" "); > System.out.println(vect[0]);		
System.out.println(vect[1]); > System.out.println(vect[2]);
- this.variavel - Faz referencia a um objeto especifico.

#Fun��es Lambda
import java.util.function.Supplier;


# Formata��o da variavel - Placeholder:
- %S para String. 
- %d para Int. 
- %.2f para Float.
- %n para quebra de linha. 
(Exemplo de todas:) 
- System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

- System.out.printf("%.2f%n", variavel);
- System.out.println("texto = " + String.format("%.2f", variavel));


# Usar bibliotecas
- import java.util.BibliotecaQueDeseja;
- import java.util.Locale; - Locale.setDefault(Locale.US); = Pontua��o de numeros flutuantes.
- import java.util.Scanner; - Scanner sc = new Scanner(System.in); = Entrada de dados.


# Fun��es Matematicas.									
- Math.sqrt() - Raiz Quadrada
- Math.pow() - Elevado ao quadrado
- Math.abs() - Valor absoluto.


# conversao de numero real para inteiro e vice versa. Ex: (double) 5 / 2 e vice versa


# Operadores aritm�ticos  # Operadores comparativos  # Operadores l�gicos  # Operadores de atribui��o cumulativa
|Operador| Significado    ||Operador| Significado  ||Operador|Significado||a += b;  |a = a + b;  |
|   +    |   adi��o       ||   >    |    maior     ||   &&   |     E     ||a -= b;  |a = a - b;  |
|   -    |  subtra��o     ||   <    |    menor     ||   ||   |    OU     ||a *= b;  |a = a * b;  |
|   *    |multiplica��o   ||   >=   |maior ou igual||   !    |    N�O    ||a /= b;  |a = a / b;  |
|   /    |   divis�o      ||   <=   |menor ou igual|                      |a %= b;  |a = a % b;  |
|   %    |resto da divis�o||   ==   |   igual      |
|Preced�n: 1� lugar: * / %||   !=   |  diferente   |
|cia       2� lugar: + -  |


# Tipos primitivos em Java
|        Descri��o          |  Tipo  | Tamanho |        Valores          | Valor padr�o |
|                           | byte   | 8 bits  |      -128 a 127         |      0       |
|                           | short  | 16 bits |    -32768 a 32767       |      0       |
|  tipos num�ricos inteiros | int    | 32 bits |-2147483648 a 2147483647 |      0       |
|                           | long   | 64 bits | -9223372036854770000 a  |      0L      |
|                           |        |         | 9223372036854770000     |              |
|   tipos num�ricos com     | Float  | 32 bits |-1,4024E-37 a 3,4028E+38 |     0.0f     |
|     ponto flutuante       | Double | 64 bits |-4,94E-307 a 1,79E+308   |     0.0      |
|   um caractere Unicode    | Char   | 16 bits |  '\u0000' a '\uFFFF'    |   '\u0000'   |
|      valor verdade        | Boolean| 1 bits  |     {false, true}       |    false     |


|         # Estrutura condicional           |      # Encadeamento de estruturas condicionais    |
|                                           |                                                   |
| Simples:            |  Composta:          | if ( condi��o 1 ) {     | if ( condi��o 1 ) {     |
| if ( <condi��o> ) { | if ( <condi��o> ) { |    comando 1            |    comando 1            |
|     <comando 1>     |      <comando 1>    |    comando 2            |    comando 2            |
|     <comando 2>     |      <comando 2>    | }                       | }                       |
| }                   | }                   | else {                  | else if ( comando 2 ) { |
|                     | else {              |     if ( condi��o 2 ) { |    comando 3            |
|                     |     <comando 3>     |        comando 3        |    comando 4            |
|                     |     <comando 4>     |        comando 4        | }                       |
|                     | }                   |     }                   | else if ( comando 3 ) { |
|                     |                     |     else {              |    comando 5            |
|                     |                     |        comando 5        |    comando 6            |
|                     |                     |        comando 6        | }                       |
|                     |                     |     }                   | else {                  |
|                     |                     |                         |    comando 7            |
|                     |                     |                         |    comando 8            |
|                     |                     |                         | }                       |


# Sintaxe do switch-case
|                        |
| switch ( express�o ) { |
| case valor1:           |
|     comando1           |
|     comando2           |
|     break;             |
| case valor2:           |
|     comando3           |
|     comando4           |
|     break;             |
|                        |
| default:               |
|     comando5           |
|     comando6           |
|     break;             |
| }                      |


# Estrutura repetitiva "enquanto" (while)

| while ( condi��o ) { |
|    comando 1         |
|    comando 2         |
| }                    |
|                      |


# Estrutura repetitiva "para" (for)

| for ( in�cio ; condi��o ; incremento) {     |
|    comando 1                                |
|    comando 2                                |
| }                                           |
|                                             |
| Exemplo:                                    |
| for (int i=0; i<5; i++) {                   |
|     System.out.println("Valor de i: " + i); |
| }                                           |
|                                             |

# enhanced for                              
|                                             |
| for (String i : Variavel) {                 |
|    System.out.println(Variavel);            |
|}                                            |
|                                             |

# Estrutura repetitiva "fa�aenquanto" (do while)

| do {                  |
|    comando 1          |
|    comando 2          |
| } while ( condi��o ); |
|                       |
*/
	}
}
