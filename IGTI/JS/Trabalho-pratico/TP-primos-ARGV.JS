
var N = parseInt(process.argv[2])

if ((N ===0) || (N === 1)) {
    console.log (`O número ${N} não é primo!`)
} else if ((N === 2) || (N === 3)) {
    console.log (`O número ${N} é primo!`)
} else if (N >= 4) {
    for (var c =2; c*c <= N; c++) { 
       if (N % c === 0) {
        var NP = " nao é primo"
        break;
       } else {
            var NP = " é primo"
        } 
    }
    console.log("O número " + N + NP) 
}