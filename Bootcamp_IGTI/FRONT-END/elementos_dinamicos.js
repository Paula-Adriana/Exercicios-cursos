var fslist = document.querySelectorAll(".multiple-field")
for (var i = 0; i < fslist.length; i++) {
  initMultipleFieldSet(fslist[i])
}

function initMultipleFieldSet(fs) {
  var addButton = document.createElement("button")
  addButton.textContent = "Adicionar"
  addButton.type = "button"
  fs.appendChild(addButton)

  var firstInput = fs.querySelectorAll("input")

  addButton.addEventListener("click", function() {
    var div = document.createElement("div")
    var newInput = document.createElement("Input")
    newInput.name = firstInput.name
    newInput.type = firstInput.type

    var deleteButton = document.createElement("button")
    deleteButton.textContent = "Excluir"
    deleteButton.type = "button"

    div.appendChild(newInput)
    div.appendChild(deleteButton)

    deleteButton.addEventListener("click", function() {
      div.remove()
    })

    fs.insertBefore(div, addButton)
  })
}