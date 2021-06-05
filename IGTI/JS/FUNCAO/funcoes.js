function multiplicacao(p1,p2){ //p1 e p2 sao parametros que a funcao vai realizar
    console.log("function multiplicacao executada")
    return p1*p2 //vai retornar o resultado da multiplicao dos parametros mas só sera utilizado se vc colocar em alguma variavel ou chamar 
}

var resultado = multiplicacao (10,2) //cria a variavel com a funcao e os parametros
console.log(resultado) // mostra o resultado guardado dentro da variavel.



//Nem sempre retorna alguma coisa
function saudacao(nome) { 
    console.log("Olá, " + nome + ", seja bem-vinda!")
    }
    saudacao("Paula")
    //console.log(saudacao("Paula")) Se usar essa linha trará "undefined" pois nao há return na funcao



//Nem sempre precisa passar parametros
function funcaoSemParametro() {
    var a = 1 //variaveis criadas dentro da funcao possuem escopo local. 
    var b = 2
    console.log(a + b)
    }
    funcaoSemParametro() //a chamada da funcao deve ser depois da } mas pode ocorrer em qq momento ou docs diferentes até. 