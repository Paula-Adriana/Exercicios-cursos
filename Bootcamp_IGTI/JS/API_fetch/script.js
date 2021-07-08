// let employeesPromise => objeto que encapsulará a resposta futura
let employeesPromise = fetch("http://localhost:3000/employees");

/*Para obter o resultado do objeto promise, usar a função Then(). Essa função recebe outra função (resp) e está é que receberá a
resposta da requisicao http.*/
employeesPromise.then((resp) => {

/*É necessário indicar o que fazer com esse objeto "resp" pois esses dados são em http entao é preciso processar
esses dados json em  objeto js, por isso usar novamente then() colocando como parametro um array*/
  resp.json().then((employees) => {
    let table = renderTable(employees);
    document.getElementById("app").innerHTML = table; //o innerHTML pode incorrer em vulnerabilidade, não é a forma + apropriada.
  });
});

//Gera a tabela com a lista de employees (array) que foi carregada aqui: resp.json().then((employees) => {
function renderTable(employees) {
  /*O método map() /mapea todos os elementos em um array para outro conjunto de valores.*/
  let rows = employees.map(i => { //i: variavel que vai mapear o map.
    return `<tr><td>${i.id}</td><td>${i.name}</td></tr>`; //gera um array com varias strings
    
  });
  return `<table>${rows.join("")}</table>`;//funcao join() junta todos os elementos de um array de string em uma única string

}

