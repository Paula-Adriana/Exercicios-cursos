var fs = require("fs")
var carros = ["Gol", "Palio", "Uno", "Celta"]
var nome = "carros.json"
var concessionaria = {
    nome: "Concessionaria XYZ",
    carros //no JSON ele já entende que isso é um array e portanto deve criar uma propriedade com o valor carros, é a mesma coisa que escrever carros: carros,

}

fs.writeFile(nome, JSON.stringify(concessionaria), function(err) { //stringfy para transformar em string o objeto
    if (err) {
        console.log(err)
    } else {
        fs.readFile(nome, "utf-8", function(err, data){
            if (err) {
                console.log(err)
            } else {
                var obj = JSON.parse(data) //parse: recebe um texto e transforma em objeto
                obj.carros.push("HRV") //add hrv no array carros
                console.log(obj)
                fs.writeFile(nome, JSON.stringify(obj), function(err) { //stringfy para transformar em string o objeto
                    if (err) {
                        console.log(err)
            }
        })
    }
})
    }
})
