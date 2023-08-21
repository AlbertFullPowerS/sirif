
document.addEventListener("DOMContentLoaded", function() {
    const tabla = document.getElementById("tablaDatos");
    const contenedorTarjetas = document.getElementById("contenedorTarjetas");
    const titulo = "Informacion del partido";

    for (let i = 1; i < tabla.rows.length; i++) {
        const fila = tabla.rows[i];
        const equipo1 = fila.cells[0].textContent;
        const equipo2 = fila.cells[1].textContent;
        const inicio = fila.cells[2].textContent;
        const fin = fila.cells[3].textContent;
        const dia = fila.cells[4].textContent;

        const tarjeta = document.createElement("div");
        tarjeta.classList.add("card");
        tarjeta.classList.add("col-3");
        tarjeta.classList.add("boton-agregar");
        tarjeta.innerHTML = `
                <h4>${titulo}</h4>
                <h5>${equipo1} vs ${equipo2}</h5>
                <br>
                <p>Hora de Inicio: ${inicio}</p>
                <p>Hora del Final: ${fin}</p>
                <p>Dia del Partido: ${dia}</p>
            `;

        contenedorTarjetas.appendChild(tarjeta);
    }
});