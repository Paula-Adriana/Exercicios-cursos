//Gerar junto ao nome o cargo do funcionario. Carregando o endpoint da roles e fazendo o mesmo processo do employees.
function solution1() {
  let employeesPromise = fetch("http://localhost:3000/employees");
  employeesPromise.then((r1) => {
    r1.json().then((employees) => {
      let rolesPromise = fetch("http://localhost:3000/roles");
      rolesPromise.then((r2) => {
        r2.json().then((roles) => {
          let table = renderTable(employees, roles);
          document.getElementById("app").innerHTML = table;
        });
      });
    });
  });
}
//solution1();

function fetchJson(url) {
  return fetch(url).then((r) => {
    return r.json();
  });
}

function solution2() {
  fetchJson("http://localhost:3000/employees").then((employees) => {//somente quando a employees termina é que começa a de roles, requisição sequencial
    fetchJson("http://localhost:3000/roles").then((roles) => {
      let table = renderTable(employees, roles);
      document.getElementById("app").innerHTML = table;
    });
  });
}
solution2();

function solution3() {
  Promise.all([
    fetchJson("http://localhost:3000/employees"), //as duas sao carregadas ao  mesmo tempo, em paralelo com promise.all
    fetchJson("http://localhost:3000/roles"),
  ]).then(([employees, roles]) => { //atribuiçao com desestruturaçao
    let table = renderTable(employees, roles);
    document.getElementById("app").innerHTML = table;
  });
}
//solution3();

function renderTable(employees, roles) {
  let rows = employees.map((i) => {
    let role = roles.find((j) => j.id == i.role_id);
    return `<tr><td>${i.id}</td><td>${i.name}</td><td>${role.name}</td></tr>`;
  });
  return `<table>${rows.join("")}</table>`;
}
