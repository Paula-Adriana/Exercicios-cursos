function Contar() {
var inicio  = window.document.getElementById('txti')
var fim = window.document.getElementById('txtf')
var passo = window.document.getElementById('txtp')
var cont = window.document.getElementById('contagem')

var i = Number(inicio.value)
var f = Number(fim.value)
var p = Number(passo.value) 
cont.innerHTML = ('Contando: <br>') 

if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0) {
  cont.innerHTML = ('[ERRO] Faltam dados!')
return false
} else if (p==0) {
  window.alert('Passo inválivo! Considerando passo 1')
  p = 1
}

if (i <= f) {
  for (i; i <= f; p ) {
      cont.innerHTML += `${i} \u{1F47E} `
        console.log(i)
        i=i+p //contagem crescente
    }
    cont.innerHTML += `\u{1F3C1}`
  } else if (i >= f) {
      for (i; f <= i; p ) {
      cont.innerHTML += `${i} \u{1F47E} `
      console.log(i)
      i=i-p //descrescente
  }
  cont.innerHTML += `\u{1F3C1}`
    }
      
    }


 


