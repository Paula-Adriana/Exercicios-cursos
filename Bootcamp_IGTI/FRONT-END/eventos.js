var n1 = document.getElementById('n1');
var n2 = document.getElementById('n2');
var r = document.getElementById('r'); 

function soma() { 
  var resultado = n1.valueAsNumber + n2.valueAsNumber;
  r.textContent = isNaN(resultado) ? "" : resultado; 
} 
  document.addEventListener('input', soma); 
  //Ao add o addEventListener eu substituo o botao soma onclick do html e a soma é feita automaticamente quando os 
  //campos sao preenchidos