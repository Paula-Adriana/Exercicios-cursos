var palavra = "arara";
var palavraInvertida = "";

for (i = palavra.length -1; i >= 0; i--) {
  palavraInvertida = palavraInvertida + palavra[i];
}

if (palavraInvertida === palavra) {
    console.log(`A palavra ${palavra} é um palíndromo.`)
} else {
    console.log(`A palavra ${palavra} não é um palíndromo.`)
}