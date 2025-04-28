function configurar(){
    let verificarBtn = document.getElementById('verificarBtn');
    let valorInput = document.getElementById('valor');
    let idadeInput = document.getElementById('idade');
    let nomeInput = document.getElementById('nome');

    //pretier-ignore
    if((verificarBtn instanceof HTMLButtonElement)
     && (valorInput instanceof HTMLButtonElement) 
     && (idadeInput instanceof HTMLButtonElement) 
     && (nomeInput instanceof HTMLButtonElement))
     verificarBtn.addEventListener('click', () => {
        let valor = valorInput.value;
        let idade = idadeInput.value;
        let nome = nomeInput.value;
        validar(valor); 
        validar(idade);
        validar(nome);
        valorInput.value = '';
        idadeInput.value = '';
        nomeInput.value = '';
     });

    
}
function validar(valorStr){

    try{
        let valor = parseInt(valorStr);

        if(isNaN(valor)){
            throw new Error('O valor deve ser um número.');
        }
        if(valor < 100){
            throw new Error('Não pode ser feito um emprestimo nesse valor.');
        }
        if(valor > 30000){
            throw new Error('O limite de valor do emprestimo e 30.000');
        }
        exibirConteudo('Emprestimo feito ');
    }catch(erro) {
        exibirErro(erro.message);
    }

} 
function validar(idadeStr){
    try{
        let idade = parseInt(idadeStr);

        if(isNaN(idade)){
            throw new Error('O valor deve ser um número.');
        }
        if(idade > 18 ){
            throw new Error('Idade não permitida');
        }
        if(idade < 70){
            throw new Error('Idade não permitida');
        }
        exibirConteudo('Idade permitida ');
    }catch(erro) {
        exibirErro(erro.message);
    }

}
function validar(nomeStr){

    try{
        let nome = String(nomeStr);

        if(isNaN(nome)){
            throw new Error('O valor deve ser um número.');
        }
        if(idade > 18 ){
            throw new Error('Idade não permitida');
        }
        if(idade < 70){
            throw new Error('Idade não permitida');
        }
        exibirConteudo('Idade permitida ');
    }catch(erro) {
        exibirErro(erro.message);
    }
}
function exibirErro(erroMsg){
    let mensagem = document.getElementById('mensagem');

    if(mensagem instanceof HTMLParagraphElement){
        mensagem.textContent = erroMsg;
        mensagem.style.color = 'red';
    }
}
