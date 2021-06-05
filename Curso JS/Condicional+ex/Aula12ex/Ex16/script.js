function verificar () {
    var data = new Date ()
    var ano = data.getFullYear() // 4 digitos
    var fano = window.document.getElementById ('txtano')
    var res = window.document.getElementById ('res')
    if (fano.value.lenght == 0 || Number(fano.value) > ano) {
        window.alert('[ERRO] Verifique novamente seus dados!')
    } else {
        var fsex = document.getElementsByName('radsex')
        var idade = ano - Number(fano.value)
        var genero = ''
        var img = document.createElement('img')
        img.setAttribute('id', 'foto')

        if (fsex[0].checked) { //se a cx fsex zero (que é a masculina) for clicada...
            genero = 'Homem'
            if (idade >= 0 && idade < 12) {
                //criança
                img.setAttribute('src', 'bebeM.png')
            } else if (idade <21) { 
            //jovem
            img.setAttribute('src', 'jovemM.png')
            } else if (idade <60) {
                //adulto
                img.setAttribute('src', 'AdultoM.png')
            } else {
            //idoso
            img.setAttribute('src', 'idosoM.png')
        }


        } else if (fsex[1].checked) {
            genero = 'Mulher'
            if (idade >= 0 && idade < 12) {
                //criança
                img.setAttribute('src', 'bebeF.png')
            } else if (idade <21) { 
            //jovem
            img.setAttribute('src', 'jovemF.png')
            } else if (idade <60) {
                //adulto
                img.setAttribute('src', 'AdultoF.png')
            } else {
            //idoso
            img.setAttribute('src', 'idosoF.png')
        }
        }
        res.style.textAlign = 'center' //alinhamento com html e nao css
        res.innerHTML = `Detectamos ${genero} com idade de ${idade} anos.`
        res.appendChild(img)
        }
        

        }



