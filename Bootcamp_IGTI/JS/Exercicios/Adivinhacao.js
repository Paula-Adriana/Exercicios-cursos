/* 
1) Gerar um numemro aleatoria entre 1 e 100 (utilizar biblioteca Math round = arredonda/ random= aleatorio entre 0 e 1, multiplicar por 100)
2) Inicializar o numero de tentativas como 10
3) Pedir ao jogador para adivinhar o numero sorteado //pacote readline do require
4) Decrementar o numero de tentativas
5) Verifica se a tentativa está correta
6) Se a tentativa for correta: 
- informar que acertou
- Encerrar o jogo
7) Se incorreta e ainda possui tentativas:
- Informar se a tentativa é maior ou menos que o numero sorteado;
- Pedir outra tentativa; 
8) Se incorreta e acabaram as tentativas
- Informar que nao venceu 
- Encerrar o jogo;
*/
var readline = require("readline"); //interacao com o usuario
var rl = readline.createInterface({
  //pede como parametro um obj json
  input: process.stdin, //informa que a interface de entrada do programa seja essa linha de comando
  output: process.stdout,
});

var numAleatorio = Math.round(Math.random() * 100);
if (numAleatorio === 0) {
  numAleatorio = 1;
}
var numTentativas = 10;

//console.log(numAleatorio) //- imprime o numero que foi escolhido aleatoriamente, é um teste para saber se entrará realmente no laço do parabens

pergunta();
function pergunta() {
  //funcao necessaria fazer continuar o programa depois que o usuario digita o numero pois devem ser 10 tentativas consecutivas.
  rl.question("Adivinhe o número: ", function (numero) {
    //funcao que trabalha com numeros, é um callback pois o usuario pode demorar muito tempo para digitar o numero enquanto isso o node vai fazendo outras coisas, qdo num for digitado ele retorna pela funcao
    numero = parseInt(numero);
    numTentativas--; //decrementa o numero de tentativas a cada laço
    if (numero === numAleatorio) {
      //passo 6
      console.log("Parabéns! Você acertou o número");
      rl.close(); //encerra o jogo
    } else if (numTentativas === 0) {
      //passo 8
      console.log("Que pena, você não adivinhou o número em dez tentativas.");
      rl.close();
    } else if (numero > numAleatorio) {
      console.log(
        "Número errado, você ainda possui " +
          numTentativas +
          " tentativas. " +
          "O número informado é maior que o sorteado."
      );
      pergunta(); //para começar de novo a funcao qdo ainda tem tentativa
    } else {
      console.log(
        "Número errado, você ainda possui " +
          numTentativas +
          " tentativas. " +
          "O número informado é menor que o sorteado."
      );
      pergunta();
    }
  });
}
