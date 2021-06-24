var numero = 10
var numeroPrimo = true;

for ( c = 2; c < numero; c++) {
    if (numero % c === 0)
    //console.log(c) Se o numero for divisivel por algum antes dele o numeroPrimo fica falso logo nao é primo pq primeiramente ele seria verdadeiro
    numeroPrimo = false;
    break;
   
}
if (numeroPrimo) {//usando booleno escrever a var dentro do () é = a: numeroPrimo === 0 ou seja verdadeiro
    console.log("O número " + numero + " é primo.")
} else {
    console.log("O número " + numero + " não é primo.")
}