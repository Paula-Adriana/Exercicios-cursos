//A promise da API fetch só irá falhar se houver um erro de conexão, mas se a resposta(r) da requisição HTTP for um status 
//diferente de 200 (200 é pq deu tudo certo) ela não falha, nós é que temos que forçar a falha para identificar um erro, para isso, 
//lançar um erro no callback do then (usar if/else)
function fetchJson(url) {
  return fetch(url).then((r) => {
    if (r.ok) { //flag ok - mostra se o status  da resposta foi 200 ou nao
      return r.json();
    } else {
      throw new Error(r.statusText);
    }
  });
}

function solution2() {
  fetchJson("http://localhost:3000/employees")
    .then((employees) => {
      fetchJson("http://localhost:3000/roles")
        .then((roles) => {
          let table = renderTable(employees, roles);
          document.getElementById("app").innerHTML = table;
        })
        .catch(showError);//dois erros para mostrar devido ao aninhamento do codigo com o then()
    })
    .catch(showError);
}
//solution2();

function solution3() {
  Promise.all([
    fetchJson("http://localhost:3000/employees"),
    fetchJson("http://localhost:3000/roles"),
  ])
    .then(([employees, roles]) => {
      let table = renderTable(employees, roles);
      document.getElementById("app").innerHTML = table;
    })
    .catch(showError)//aqui o then() aninha os dois arrays por isso só um catch na promise mais externa
    .finally(() => {
      //console.log("Carregou");
    });
}
solution3();

async function solution4() {
  try {//estrutura try/catch usada em codigo sincrono, aqui vai o codigo que pode dar erro
    let employees = await fetchJson("http://localhost:3000/employees");
    let roles = await fetchJson("http://localhost:3000/roles");
    let table = renderTable(employees, roles);
    document.getElementById("app").innerHTML = table;
  } catch (erro) {//será chamada se o codigo acima der qq erro 
    showError(erro);
  }
}
//solution4();

async function solution5() {
  try {
    let [employees, roles] = await Promise.all([
      fetchJson("http://localhost:3000/employees"),
      fetchJson("http://localhost:3000/roles"),
    ]);
    let table = renderTable(employees, roles);
    document.getElementById("app").innerHTML = table;
  } catch (erro) {
    showError(erro);
    //Quando há a cláusula try/catch pode-se colocar o "finally" que é executado independente do status do try ou do catch
    // usado para fazer codigo de finalização / alguma tarefa que será realizada de qq forma
  } finally {
    //console.log("Carregou");
  }
}
//solution5();

function renderTable(employees, roles) {
  let rows = employees.map((employee) => {
    let role = roles.find((role) => role.id == employee.role_id);
    return `<tr><td>${employee.id}</td><td>${employee.name}</td><td>${role.name}</td></tr>`;
  });
  return `<table>${rows.join("")}</table>`;
}

function showError(error) {
  document.getElementById("app").innerHTML = "Erro ao carregar dados.";
  console.error(error);
}
//trabalhando com promise usar catch, then e finally
//trabalhando com await try, catch, finally