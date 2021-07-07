// let employeesPromise => objeto que encapsulará a resposta futura
let employeesPromise = fetch("http://localhost:3000/employees");

/*funcao resp é que receberá a resposta da requisicao http. é necessário indicar o que fazer com esse objeto resp pois 
esses dados são em http entao é preciso processar esses dados json em  objeto js */
employeesPromise.then((resp) => {
  resp.json().then((employees) => {
    let table = renderTable(employees);
    document.getElementById("app").innerHTML = table;
  });
});

function renderTable(employees) {
  let rows = employees.map(employee => {//array de objeto
    return `<tr><td>${employee.id}</td><td>${employee.name}</td></tr>`;//array de string
  });
  return `<table>${rows.join("")}</table>`;
}
//funcao join() junta todos os elementos de um array de string em uma única string