let num = window.document.getElementById('fnum') //ou queryselector('imput#fnum')
let lista = window.document.getElementById('flista') //ou queryselector('select#flista')
let res = window.document.getElementById('res')//ou queryselector('div#res')
let valores = [] //vetor(array) vazio 

function isNumero(n){ //parametro "n"
if (Number(n) >= 1 && Number(n) <=100){
    return true //nao escreve nada na tela apenas verifica se é verdadeira a proposicao acima.
} else{
    return false
}
}

function inlista(n, l){ //dois parametros
 if (l.indexOf(Number(n)) != -1){ // SE na lista o valor de n for diferente de -1 (padrao do JS quando nao existe o valor procurado) ou seja: o valor ainda nao está na lista
return true // valor é aceito na lista
} else{
    return false
}
}
 
function ADD (){
 if (isNumero(num.value) && !inlista(num.value, valores)){ //verifica se é numero (num.value) e verifica se NÃO (!) está na lista recebendo dados do vetor "valores"
     valores.push(Number(num.value)) //se as condiçoes acima estiverem corretas entao: add no vetor "valores"com o push o numero (number)
     let item = document.createElement('option') // pra add no select tem que criar um option
        item.text = `Valor ${num.value} foi adicionado`
     lista.appendChild(item) 
     res.innerHTML = '' // limpa a tela da div finalizar assim que add um novo valor à lista e o resultado é alterado. 

} else {
    window.alert('Valor inválido ou já encontrado na lista')
}
num.value = '' //para limpar o campo depois que add na lista
num.focus()// volta o cursor para o campo de digitacao automaticamente
}

function finalizar(){
    if (valores.length == 0){ //primeiro verificar se existem valores a serem analisados (nao pode estar vazio pq nao tem o que analisar)
       window.alert('Adicione valores antes de finalizar') 
    } else {
        let total = valores.length //quantos valores eu adicionei 
        let maior = valores[0] //o primeiro numero a ser analisado será sempre o maior no inicio pois nao tem nada antes dele
        let menor = valores[0] // mesma logica acima
        let soma = 0
        let media = 0


        for (let pos in valores) { //para a variavel 'pos' na lista de valores
        soma += valores[pos]
            if (valores[pos] > maior) // se o primeiro valor foi maior que o maior inicial (que é zero) ele se torna o maior, veriifcando em cada laço
            maior = valores[pos]
            if (valores[pos] < menor) { //mesma logica acima
                menor = valores[pos]
                
            }
        }

        media = soma/total

        res.innerHTML = '' //zerar a div correspondente ao res para receber o texto final
        res.innerHTML += `<p>Ao todo, temos ${total} números cadastrados.</p>`
        res.innerHTML += `<p>O maior valor informado foi  ${maior}.</p>`
        res.innerHTML += `<p>O menor valor informado foi  ${menor}.</p>`
        res.innerHTML += `<p>Somando todos os valores temos ${soma}</p>`
        res.innerHTML += `<p>A média dos valores é  ${media}</p>`
    }
}