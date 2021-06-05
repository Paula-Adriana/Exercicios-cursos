var pessoa = {
    "nome": "João", //no JS é opcional colocar em string ou nao exceto no array. NAO esqueça a virgula
    idade: 40,
    telefone: "47 99999-9999",
    temCarro: true,
    animais: [
        "totó",
        "bob",
    ],
    pai: { //dentro pode haver outros objetos
        nome: "José",
        idade: 67,
    }
}


console.log(pessoa.nome) //acessa dados dentro do  objeto "pessoa"
pessoa.animais.push("billy") //dá pra manipular dados, acrescentando o nome atraves do push
pessoa.nome += " Silva"
console.log(pessoa)


// pode utilizar dentro de uma funcao tb
function salvarDados(pessoa) { 
    console.log(pessoa.nome)
}
salvarDados(pessoa)

//para transformar em string, em numero utilizar "parse"
console.log(JSON.stringify(pessoa))
