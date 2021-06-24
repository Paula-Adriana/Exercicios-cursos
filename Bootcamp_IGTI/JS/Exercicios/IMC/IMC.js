function calcularIMC() {
    var altura = parseFloat(document.getElementById("altura").value)
    var peso = parseFloat(document.getElementById("peso").value)
    console.log(altura)
    console.log(peso)
    var IMC = peso/(altura*altura)
    console.log(IMC)
    document.getElementById("resultado").innerHTML = "Seu IMC é de " + IMC

    if (IMC < 17) {
    res.innerHTML = ("Muito abaixo do peso")
     } else if ((IMC >= 17) && (IMC <= 18.5)) {
       res.innerHTML =  ("Abaixo do peso")
    } else if ((IMC >= 18.5) && (IMC <=25)) {
       res.innerHTML =  ("Peso ideal")
    } else if ((IMC >=25) && (IMC <= 30)) {
       res.innerHTML =  ("Sobrepeso")
    } else if ((IMC >= 30) && (IMC <=35)) {
       res.innerHTML =  ("Obesidade")
    } else if ((IMC >= 35) && (IMC <= 40)) {
       res.innerHTML =  ("Obesidade severa")
    } else {
        res.innerHTML =  ("Obesidade severa")
    }

 }  
