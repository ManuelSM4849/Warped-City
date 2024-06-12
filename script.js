document.getElementById('registerForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    fetch('http://localhost:8888/puntaje/savePuntaje', { // Actualiza la URL a la de tu API
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            email: email,
            contrasena: password,
            puntos: 0 // Inicializa los puntos a 0 o cualquier valor inicial que desees
        }),
    })
    .then(response => response.json())
    .then(data => {
        alert('Registro exitoso!');
        getLeaderboard(); // Actualiza el leaderboard después de registrar un nuevo usuario
    })
    .catch((error) => {
        console.error('Error:', error);
    });
});

function getLeaderboard() {
    fetch('http://localhost:8888/puntaje/all') // Actualiza la URL a la de tu API
    .then(response => response.json())
    .then(data => {
        // Ordena los datos por puntos en orden descendente
        data.sort((a, b) => b.puntos - a.puntos);

        const leaderboard = document.getElementById('leaderboard').getElementsByTagName('tbody')[0];
        leaderboard.innerHTML = ''; // Limpia la tabla antes de agregar los datos

        data.forEach((puntaje, index) => {
            const row = leaderboard.insertRow();
            const cell1 = row.insertCell(0);
            const cell2 = row.insertCell(1);
            const cell3 = row.insertCell(2);

            cell1.textContent = index + 1;
            cell2.textContent = puntaje.email; // Cambia esto si tienes un campo de nombre de usuario
            cell3.textContent = puntaje.puntos; // Cambia esto al campo correcto de puntaje
        });
    })
    .catch(error => {
        console.error('Error fetching leaderboard:', error);
    });
}

// Llama a getLeaderboard cuando la página se carga
document.addEventListener('DOMContentLoaded', function() {
    getLeaderboard();
});
