for (i=0; i<10;i++){ // i vale 0; enquanto o i for menor que 10 faça iso; a cada laço incremente 1 ao i.
    console.log(i)
}

//incrementando
var carros = ['gol', 'palio', 'sandero', 'fusca']
for (var i = 0; i < carros.length; i++) { //lenght para mostar sempre até o ultimo, se colocar um numero ficará engessado
    console.log(carros[i])  
}

//decrementando
for (var i = carros.length-1; i >=0; i--) { //-1 para começar do ultimo até o primeiro.
    console.log(carros[i]) 
} 
//o for mostra o indice do array. isso nao ocorre no for of