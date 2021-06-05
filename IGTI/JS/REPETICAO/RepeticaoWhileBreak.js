var carros = ['gol', 'palio', 'sandero', 'fusca']
var i = 0
while (i < carros.length) {
    if(carros[i] === "palio"){
        console.log ("Encontrei o Palio")
        break //aqui ele para o laço quando a comparacao encontra a string  "palio" e nao incrementa mais nada
    }
    i++
}