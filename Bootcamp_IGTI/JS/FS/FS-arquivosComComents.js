var fs = require("fs") 
// O módulo require() permite que vc trabalhe com o sistema de arquivos do seu computador.
// guarda na variavel fs, o nome da variavel aqui é o mesmo do módulo
//voce pode: Read files, Create files, Update files, Delete files, Rename files (SÓ NO NODE NAO FUNCIONA NO BROWSER)

console.log(1)


//Criando arquivos (write/append ou open)
fs.writeFile("meuArquivo.txt", "\ntexto do arquivo", function(err) { //\n quebra linha
    /* o primeiro parametro é o nome do arquivo
    o segundo é o texto do arquivo
    o terceiro (callback) é uma funçao (err) opcional que retornará se houve erro ou não.
    Se a funcao percebe um erro, por padrao ela retornará o objeto erro (error value)
    quando dá erro: 
        [Error: EPERM: operation not permitted, open 'meuArquivo.txt'] {
        errno: -1,
        code: 'EPERM',
        syscall: 'open',
        path: 'meuArquivo.txt'
        }
    caso contrário funcao chamará o parametro null ou seja, está tudo certo 
        Texto escrito com sucesso
        null
        A funcao só a chamada quando o arquivo terminar de ser criado aí vem a funcao e diz se houve erro ou nao
        enquanto isso o programa vai realizando outras funcoes que estejam escritas abaixo ex:
        1
        2
        Texto escrito com sucesso
        o programa escreveu o 1 depois o 2 (que estava abaixo o if) e só entao foi para o if de fato 
        e escreveu o else correspondente a nenhum erro. 
        */
    

    if (err !== null) {
        console.log(err)
    } else {
        console.log("Texto escrito com sucesso")
        console.log(err)
    }
})

console.log(2)
