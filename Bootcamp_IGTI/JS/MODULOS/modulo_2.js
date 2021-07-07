import {soma} from "./modulo_1.js"

console.log(soma(2, 2))

/*tb pode-se renomear ao importar uma função:
import {soma as adicionar} from "./modulo_1"
console.log(adicionar(2, 2))


Pode-se importar todas as declarações de um módulo de uma vez, usando a sintaxe:
import * as m1 from "./modulo_1"
dando um nome para o objeto que vai encapsular todas essas declarações como propriedade dele. 
console.log(m1.adicionar(2, 2)) //m1 é o objeto

É possivel exportar constantes e variáveis também, exemplo:
export const PI = 3.14

2 comportamentos dos modulos:
Primeiro: Ainda que o módulo seja requisitado por mais de um outro módulo ele será executado apenas uma vez.
Segundo: O carregamento do módulo é feito somente ao final do carregamento da página. 
*/