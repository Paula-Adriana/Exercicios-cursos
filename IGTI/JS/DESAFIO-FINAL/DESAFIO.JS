fs = require("fs");
fs.readFile("funcionarios.json", "utf-8", function (err, data) {
  if (err) {
    console.log(err);
  } else {
    var lista = JSON.parse(data);////essa var guardará todo o conteudo do json

    maiorSalario();
    function maiorSalario() {
      var c = 0;
      var maior = lista.funcionarios[0].salario;
      var nomeMaior = " ";
      while (c < lista.funcionarios.length) {
        if (lista.funcionarios[c].salario > maior) {
          maior = lista.funcionarios[c].salario;
          nomeMaior = lista.funcionarios[c].nome;
          c++;
        } else {
          c++;
        }
      }
      console.log(`O Funcionário com maior salário na empresa é ${nomeMaior} com ${maior} reais.`);
    }
    menorSalario();
    function menorSalario() {
      var c = 0;
      var menor = lista.funcionarios[0].salario;
      var nomeMenor = " ";
      while (c < lista.funcionarios.length) {
        if (lista.funcionarios[c].salario < menor) {
          menor = lista.funcionarios[c].salario;
          nomeMenor = lista.funcionarios[c].nome;
          c++;
        } else {
          c++;
        }
      }
      console.log(`O Funcionário com menor salário na empresa é ${nomeMenor} com ${menor} reais.`);
    }

    mediaSalario();
    function mediaSalario() {
      var c = 0;
      var soma = 0;
      var total = lista.funcionarios.length;

      while (c < lista.funcionarios.length) {
        soma = soma + lista.funcionarios[c].salario;
        c++;
      }

      var media = soma / total;
      var mediaarredondado = parseFloat(media.toFixed(2));
      console.log(`A média de salário na empresa é de ${mediaarredondado} reais.`);
    }

    maiorS(process.argv[2]);
    function maiorS(setor) {
      var c = 0;
      var maior = 0;
      nomeSetor = " ";

      while (c < lista.funcionarios.length) {
        if (lista.funcionarios[c].setor === setor) {
          if (lista.funcionarios[c].salario > maior) {
            maior = lista.funcionarios[c].salario;
            nomeSetor = lista.funcionarios[c].nome;
            c++;
          } else {
            c++;
          }
        } else {
          c++;
        }
      }
      console.log(
        `O funcionário com maior salário no setor ${setor} é ${nomeSetor} com ${maior} reais.`
      );
    }
    menorS(process.argv[2]);
    function menorS(setor) {
      var c = 0;
      var menor = lista.funcionarios[0].salario;
      nomeSetor = " ";

      while (c < lista.funcionarios.length) {
        if (lista.funcionarios[c].setor === setor) {
          if (lista.funcionarios[c].salario < menor) {
            menor = lista.funcionarios[c].salario;
            nomeSetor = lista.funcionarios[c].nome;
            c++;
          } else {
            c++;
          }
        } else {
          c++;
        }
      }
      console.log(
        `O funcionário com menor salário no setor ${setor} é ${nomeSetor} com ${menor} reais.`
      );
    }

    mediaS(process.argv[2]);
    function mediaS(setor) {
      var c = 0;
      var soma = 0;
      var total = 0;

      while (c < lista.funcionarios.length) {
        if (lista.funcionarios[c].setor === setor) {
          soma = soma + lista.funcionarios[c].salario;
          total++;
          c++;
        } else {
          c++;
        }
      }
      var media = soma / total;

      var mediaarredondado = parseFloat(media.toFixed(2));
      console.log(
        `A média de salário no setor ${setor} é de ${mediaarredondado} reais.`
      );
    }
  }
});
