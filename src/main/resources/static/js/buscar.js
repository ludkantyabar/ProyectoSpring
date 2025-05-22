export function iniciarBuscador(){
    const buscadorTabla = document.getElementById('buscarfilas');
    const filas = document.querySelectorAll('#tabla tbody tr');
    function filtrarTabla(textoBusqueda){
        filas.forEach(fila=>{
            const texto = fila.textContent.toLowerCase();
            fila.style.display = texto.includes(textoBusqueda)?
        '':'none';
        });
    }
    buscadorTabla?.addEventListener('input',()=>{
        const filtro = buscadorTabla.value.toLocaleLowerCase();
        filtrarTabla(filtro);
    });
}