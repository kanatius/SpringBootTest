$(document).ready(function(){
    


});

function removerProduto(id){
    let response = confirm("Deseja mesmo remover o produto?");

    if(response == true){
        window.location.href = "/produto/remover?id=" + id;
    }
}