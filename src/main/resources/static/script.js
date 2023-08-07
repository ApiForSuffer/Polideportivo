// Function to fetch and display user
function fetchUsers() {
    fetch('/polideportivo/v0.8/user/findall')
        .then(response => response.json())
        .then(data => {
            // Assuming you have a <div> with the id "user-list" in your index.html
            const userList = document.getElementById('user-list');

            // Clear existing content
            userList.innerHTML = '';

            // Loop through the user and create list items
            data.forEach(user => {
                const userItem = document.createElement('li');
                console.log(userItem);
                userItem.textContent = `${user.name}: ${user.lastName}, Registration Date: ${user.registrationDate}, Phone: ${user.phone}`;
                userList.appendChild(userItem);
            });
        })
        .catch(error => console.error('Error:', error));
}

// Call the fetchEvents function when the page loads
document.addEventListener('DOMContentLoaded', fetchUsers);