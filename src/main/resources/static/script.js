// functions
function fetchUsers() {
    fetch('/polideportivo/v0.8/user/findall')
        .then(response => response.json())
        .then(data => {
            const userList = document.getElementById('user-list');
            userList.innerHTML = '';
            data.forEach(user => {
                const userItem = document.createElement('div');
                userItem.setAttribute("id", "userItem");
                console.log(userItem);
                userItem.textContent = `Id: ${user.id}, ${user.name} ${user.lastName}, Registration Date: ${user.registrationDate}, Phone: ${user.phone}`;
                if (user.reservations && user.reservations.length > 0) {
                    user.reservations.forEach(reservation => {
                        userItem.textContent += `\nRes id: ${reservation.id}, ${reservation.date}`;
                    });
                } else {
                    userItem.textContent += `\nNo reservations.`;
                }
                userList.appendChild(userItem);
            });
        })
        .catch(error => console.error('Error:', error));
}
function addUser() {
    event.preventDefault();
    const name = document.getElementById('name').value;
    const lastName = document.getElementById('lastName').value;
    const phone = document.getElementById('phone').value;

    const user = {
        name: name,
        lastName: lastName,
        registrationDate: new Date().toISOString(),
        phone: phone
    };

    fetch(`/polideportivo/v0.8/user/add`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    })
    .then(response => response.json())
    .then(data => {
        console.log('User added:', data);
    })
    .catch(error => console.error('Error:', error));
}
function addReservation() {
    event.preventDefault();
    const description = document.getElementById('reservationDescription').value;
    const userId = document.getElementById('reservationUserId').value;
    const eventId = document.getElementById('reservationEventId').value;
    const paymentId = document.getElementById('reservationPaymentId').value;
    const reservation = {
        description: description,
        date: new Date().toISOString(),
        status: true,
        user: {id: userId},
        event: {id: eventId},
        payment: {id: paymentId}
    };
    fetch(`/polideportivo/v0.8/reservation/add`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(reservation)
        })
        .then(response => response.json())
        .then(data => {
            console.log('Reservation added:', data);
        })
        .catch(error => console.error('Error adding reservation:', error));
}

// Call the fetchEvents function when the page loads
document.addEventListener('DOMContentLoaded', fetchUsers);

// buttons
// addReservation
document.addEventListener('DOMContentLoaded', function() {
    const addButton = document.getElementById('addReservationButton')
    addButton.addEventListener('click', addReservation);
})
// addUser
document.addEventListener('DOMContentLoaded', function() {
    const addButton = document.getElementById('addUserButton');
    addButton.addEventListener('click', addUser);
});

//
document.addEventListener("DOMContentLoaded", function() {
    const showButton = document.getElementById("inputButton");
    const inputDiv = document.getElementById("input");

    showButton.addEventListener("click", function() {
        inputDiv.style.display = inputDiv.style.display === "none" ? "block" : "none";
    });
});

document.addEventListener("DOMContentLoaded", function() {
    const showButton = document.getElementById("outputButton");
    const outputDiv = document.getElementById("output");

    showButton.addEventListener("click", function() {
        outputDiv.style.display = output.style.display === "none" ? "block" : "none";
    });
});

document.addEventListener("DOMContentLoaded", function() {
    const showButton = document.getElementById("showUsersButton");
    const userListDiv = document.getElementById("user-list");

    showButton.addEventListener("click", function() {
        userListDiv.style.display = userListDiv.style.display === "none" ? "flex" : "none";
    });
});