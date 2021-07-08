function fetchJson(url) {
  return fetch(url).then((r) => {
    return r.json();
  });
}
//solucao 2 virou a 4
function solution2() {
  fetchJson("http://localhost:3000/employees").then((employees) => {
    fetchJson("http://localhost:3000/roles").then((roles) => {
      let table = renderTable(employees, roles);
      document.getElementById("app").innerHTML = table;
    });
  });
}
//solution2();

//solucao 3 virou a 5
function solution3() {
  Promise.all([
    fetchJson("http://localhost:3000/employees"),
    fetchJson("http://localhost:3000/roles"),
  ]).then(([employees, roles]) => {
    let table = renderTable(employees, roles);
    document.getElementById("app").innerHTML = table;
  });
}
//solution3();

async function solution4() {
  //Com o await, gera direto o array [employees, roles] não necessitando dos callbacks do then()
  let employees = await fetchJson("http://localhost:3000/employees");
  let roles = await fetchJson("http://localhost:3000/roles");
  let table = renderTable(employees, roles);
  document.getElementById("app").innerHTML = table;
}
//solution4();

async function solution5() {
 //na variavel eu já guardo o array resultante de todo o processo do then() callback por atribuiçao via desestruturação 
  let [employees, roles] = await Promise.all([
    fetchJson("http://localhost:3000/employees"),
    fetchJson("http://localhost:3000/roles"),
  ]);
  let table = renderTable(employees, roles);
  document.getElementById("app").innerHTML = table;
}
solution5();

function renderTable(employees, roles) {
  let rows = employees.map((i) => {
    let role = roles.find((j) => j.id == i.role_id);
    return `<tr><td>${i.id}</td><td>${i.name}</td><td>${role.name}</td></tr>`;
  });
  return `<table>${rows.join("")}</table>`;
}
