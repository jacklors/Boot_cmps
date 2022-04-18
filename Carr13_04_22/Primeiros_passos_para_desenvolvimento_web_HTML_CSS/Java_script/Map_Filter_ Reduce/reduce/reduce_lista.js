const lista = [
{
    name: 'sabao em po',
    preco: 12,
},

{
    name: 'cereal',
    preco: 30,
},

{
    name: 'toalha',
    preco: 15,
},

];

const saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, lista){
    return lista.reduce(function (prev, current, index){
        console.log ('rodada', index + 1 );
        console.log ({prev});
        console.log ({current});
        return prev - current.preco;
    }, saldoDisponivel);
}

console.log(calculaSaldo(saldoDisponivel, lista));