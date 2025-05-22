import{activarModales} from './modals.js';
import {iniciarBuscador} from './buscar.js';
document.addEventListener('DOMContentLoaded', ()=>{
    const path = window.location.pathname;
    if(path.includes('index.html')){
        activarModales();
        iniciarBuscador();
    }
});