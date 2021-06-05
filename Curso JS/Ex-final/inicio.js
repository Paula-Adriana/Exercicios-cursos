/* COMEÇANDO A RESOLUCAO PRA TESTAGEM INICIAL!!!
variaveis: 
let num = window.document.getElementById('fnum') //ou queryselector('imput#fnum')
let lista = window.document.getElementById('flista') //ou queryselector('select#flista')
let res = window.document.getElementById('res')//ou queryselector('div#res')
let valores = [] //vetor(array) vazio 

funcoes
function isNumero(n){ //parametro "n"
if (Number(n) >= 1 && Number(n) <=100){
    return true //nao escreve nada na tela apenas verifica se é verdadeira a proposicao acima.
} else{
    return false
}
}

function inlista(n, l){ //dois parametros
 if (l.indexOf(Number(n)) != -1){ // se na lista o valor de n for diferente de -1 (padrao do JS quando nao existe o valor procurado) ou seja: o valor ainda nao está na lista
return true // valor é aceito na lista
} else{
    return false
}
}

function ADD (){
 if (isNumero(num.value) && !inlista(num.value, valores)){ //verifica se é numero (num.value) e verifica se NÃO (!) está na lista recebendo dados do vetor "valores"
     window.alert('tudo ok')
} else {
    window.alert('Valor inválido ou já encontrado na lista')
}
}*/