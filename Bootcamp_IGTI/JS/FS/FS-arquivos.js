var fs = require("fs")
var nome = "meuArquivo.txt" //criar o nome do arquivo na variavel fica + facil de usar

fs.writeFile(nome, "conteúdo arquivo", function(err) { 

    if (err !== null) {
        console.log(err)
    } else {
        console.log("Texto escrito com sucesso")

fs.appendFile(nome, "\n+ uma linha acrescentada", function(err){ 
    if (err !== null) {
        console.log(err)
    } else {
        fs.readFile(nome, "utf-8", function(err, data) {
            if (err) {
                console.log(err)
            } else {
                console.log(data)
            }
        })
    }
})

}})


        
