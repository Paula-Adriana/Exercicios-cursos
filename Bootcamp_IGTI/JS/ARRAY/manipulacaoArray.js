var carros = ['gol', 'palio', 'sandero', 'fusca']

//retira do array o ultimo elemento e coloca em uma variavel 
var carro = carros.pop()
/*console.log(carro) 
console.log(carros) // array sem o ultimo elemento com o comando carros.length - 1 tb mostra o utlimo elemento mas nao retira o elemento do array*/

//inserindo elemento no array já existente
var x = carros.push("Kombi") 
/*console.log(carros)
console.log(x) // tamanho do array*/

//remove o primeiro elemento do array
carros.shift() 
/*var c = carros.shift() //aqui ele remove o primeiro elemento e guarda na variavel 
console.log(carros)*/

//insere no inicio do array o elemento e retorna o novo tamanho do array
var b = carros.unshift("brasilia") 
/*console.log(carros)
console.log(b)*/

//atualiza o elemento atraves do seu indice
carros[1] = "Novo palio" 
//console.log(carros)

//remove elementos do indice informado [ 'brasilia', 'Novo palio', <1 empty item>, 'Kombi' ]
//delete carros[2]
//console.log(carros)

//add elementos por parametro 
//carros.splice(2, 0, "celta" , "corola")
//console.log(carros) //[ 'brasilia', 'Novo palio', 'celta', 'corola', 'sandero', 'Kombi' ]

//concatena arrays
var carrosAntigos = ["monza", "chevete"]
var todosCar = carros.concat(carrosAntigos)
console.log(todosCar)

//retira sem deletar um elemento do array a partir do indice indicado
var novoArray = todosCar.slice(1)
//console.log(novoArray)
//[ 'brasilia', 'Novo palio', 'sandero', 'Kombi', 'monza', 'chevete' ] array inteiro
//[ 'Novo palio', 'sandero', 'Kombi', 'monza', 'chevete' ] novo array com slice, tirou o primeiro elemento

//passando parametro
var novoarray2 = todosCar.slice(2, 5)
//console.log(novoarray2)
//[ 'brasilia', 'Novo palio', 'sandero', 'Kombi', 'monza', 'chevete' ] array inteiro
//[ 'sandero', 'Kombi', 'monza' ] array slice 2,5 pega a segunda posicao até a quarta pq 5 é o limite


 


