let arrayTarefa = [];

function exbirConteudo(){
    let saida = document.getElementById('resultado');
    if(saida instanceof HTMLParagraphElement){
        saida.textContent = arrayTarefa.join(', ');
    }
}

function cadastrarTarefa(tarefa){
    if(tarefa){
        arrayTarefa.push(tarefa);
        exbirConteudo();
    }else{
        alert("Por favor, insira um valor valido");
    }
}

const configurarTarefas = () => {
    let entradaTarefa = document.getElementById('tarefa')
    let cadastrarTarefaBtn = document.getElementById('cadastrarBtn');

    if((cadastrarTarefaBtn instanceof HTMLButtonElement) && (entradaTarefa instanceof HTMLInputElement)){
        cadastrarTarefaBtn.addEventListener('click', () =>{
            cadastrarTarefa(entradaTarefa.value);
            entradaTarefa.value = ' ';
        })
    }
}

document.addEventListener('DOMContentLoaded', configurarTarefas)



