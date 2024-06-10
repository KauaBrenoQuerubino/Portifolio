const barras = document.querySelector(".btn-abrir-menu");
const menu = document.querySelector(".menu-mobile");
const overlay = document.querySelector(".overlay-menu");
const X = document.querySelector(".btn-fechar");
const inicio = document.querySelector(".topo-do-site")
const Especialidades = document.querySelector(".Especialidades")
const sobre = document.querySelector(".sobre")
const portifolio = document.querySelector(".portifolio");

barras.addEventListener('click', () => {
    menu.style.width = "70%"
    menu.style.boxShadow = "0 0 20px 10px #2dd88059"
    overlay.style.display = "flex"
})

function fechar(){
    menu.style.width = "0%"
    menu.style.boxShadow = "0 0 0 0"
    overlay.style.display = "none"
}

X.addEventListener('click', function fechar(){
    menu.style.width = "0%"
    menu.style.boxShadow = "0 0 0 0"
    overlay.style.display = "none"
})

function descerTela(pagina){
    pagina.scrollIntoView({ behavior: 'smooth' })
    fechar()
}
