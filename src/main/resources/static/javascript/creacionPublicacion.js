function validarPublicacion() {
    const titulo = document.getElementById('titulo').value;
    const contenido = document.getElementById('contenido').value;

    if (titulo.trim() === '' || contenido.trim() === '') {
        mostrarMensaje('Por favor, completa ambos campos antes de publicar.');
        return false;
    }

    return true;
}

function validarBorrador() {
    const titulo = document.getElementById('titulo').value;
    const contenido = document.getElementById('contenido').value;

    if (titulo.trim() === '' && contenido.trim() === '') {
        mostrarMensaje('Por favor, completa uno de los dos campos antes de guardar el borrador de la publicacion.');
        return false;
    }

    return true;
}

function mostrarMensaje(mensaje) {
    // Crear un div para mostrar el mensaje
    const mensajeDiv = document.createElement('div');
    mensajeDiv.className = 'mensaje-emergente';
    mensajeDiv.textContent = mensaje;

    // Agregar el div al cuerpo del documento
    document.body.appendChild(mensajeDiv);

    // Cerrar el div después de 1 segundo
    setTimeout(function () {
        document.body.removeChild(mensajeDiv);
    }, 3000);
}

const textarea = document.getElementById('titulo');
const contador = document.getElementById('contador');

textarea.addEventListener('input', function () {
    // Actualiza el contador de caracteres
    contador.textContent = this.value.length;
});
