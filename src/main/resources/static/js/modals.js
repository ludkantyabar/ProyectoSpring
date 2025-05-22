export function activarModales() {
    const modal = document.getElementById("modal1");
    const modalBody = modal.querySelector(".modal-body");
    modal.addEventListener("show.bs.modal", function (event) {
        const button = event.relatedTarget;
        const producto = button.getAttribute("data-producto");
        switch (producto) {
            case "robot-educativo":
                modalBody.innerHTML = `
                    <h5>Robot Educativo</h5>
                    <p>Ideal para aprender programación y electrónica.</p>
                    <a class="btn btn-success" href="#" role="button">Comprar ahora</a>
                `;
                break;
            case "kit-arduino":
                modalBody.innerHTML = `
                    <h5>Kit de Arduino</h5>
                    <p>Incluye todo lo necesario para tus proyectos de robótica.</p>
                    <a class="btn btn-success" href="#" role="button">Comprar ahora</a>
                `;
                break;
            case "brazo-robotico":
                modalBody.innerHTML = `
                    <h5>Brazo Robótico</h5>
                    <p>Perfecto para tareas de precisión y automatización.</p>
                    <a class="btn btn-success" href="#" role="button">Comprar ahora</a>
                `;
                break;
            default:
                modalBody.innerHTML = `
                    <h5>Producto no encontrado</h5>
                    <p>Por favor, selecciona un producto válido.</p>
                `;
                break;
        }
    });
}