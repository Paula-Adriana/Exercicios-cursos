function fetchJson(url) {
  return fetch(url).then((r) => {
    if (r.ok) {
      return r.json();
    } else {
      throw new Error(r.statusText);
    }
  });
}

async function list() {
   let [employees, roles] = await Promise.all([
     fetchJson("http://localhost:3000/employees"),
     fetchJson("http://localhost:3000/roles"),
   ]);
   let table = renderTable(employees, roles);
   document.getElementById("app").innerHTML = table;
   
 }
 list();

 function renderTable(employees, roles) {
  let rows = employees.map((i) => {
    let id_role = roles.find((j) => j.id == i.role_id);
    return `<tr><td>${i.id}</td><td>${i.name}</td><td>${id_role.name}</td><td>${i.salary}</td></tr>`;
  });
  return `<table>${rows.join("")}</table>`;
}

