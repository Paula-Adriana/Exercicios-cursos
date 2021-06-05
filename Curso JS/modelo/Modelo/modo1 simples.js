function Tabuada() {
var n = window.document.getElementById('txtn')
var num = Number(n.value)
var res = window.document.getElementById('Contagem')
var c = 1

if (n.value.length == 0 ) {
    res.innerHTML = window.alert('Digite um número')
}
res.innerHTML = ''
do {
    var r = num*c
    console.log (num,c, r)
        res.innerHTML += `${num} x ${c} = ${r} <br>` 

    c++
 } while (c<=10) 
}

