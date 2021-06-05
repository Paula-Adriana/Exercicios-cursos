var numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
var i = 0
while(i < numeros.length) {
    var num = numeros[i]
    i++
    if (num % 2 === 0) {
        console.log (num + " é Par!") 
       // continue //obriga a voltar a começar o laço (acho que foi exemplo incorreto com a estrutura inteira do If funciona ok - ver exemplo continue2)          
        }
        console.log (num + " é Impar!") 
    }

