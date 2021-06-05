
var N = 987

if ((N ===0) || (N === 1)) {
    console.log (`O número ${N} não é primo!`)
} else if ((N === 2) || (N === 3)) {
    console.log (`O número ${N} é primo!`)
} else if (N >= 4) {
    for (var c =2; c*c <= N; c++) { 
       if (N % c === 0) {
        var NP = " nao é primo"
        break;
       } else {
            var NP = " é primo"
        } 
    }
    console.log("O número " + N + NP) 
}
   
/*regra matematica dos quadrados:
Se o numero tiver algum divisor acima de 1 e menor que a raiz quadrada desse número ele nao é primo.
utiliza-se a raiz quadrada pois: todo numero composto possui divisores em ordem crescente e decrescente
e o "meio" dos divisores é +- a raiz quadrada entao calcula-se até a raiz pq o "outro lado" é igual.
nao há necessidade de calculo duplo. 
ver link: http://mathandmultimedia.com/2012/06/02/determining-primes-through-square-root/
*/
