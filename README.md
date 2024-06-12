# Warped-City
Project Overview
This project is a Unity-based video game that includes a registration web page and an API for storing and validating user data. Players can either log in to play as a registered user or play as a guest.

Features
Unity Game:

Developed using Unity.
Utilizes the "Warped City" sprite pack by ansimuz.
Includes animations and behaviors for dynamic gameplay.
Handles value management, bullet animations, and 3D layer management.
Web Pages:

Registration Page:
Allows users to register an account.
Collects user data and stores it via the API.
Login Page:
Allows users to log in with their registered credentials.
Provides an option to play as a guest.
API:

Stores and validates data input from the registration page.
Ensures secure handling of user information.
Getting Started
Prerequisites
Unity 2020.3 or later
A web browser for accessing the registration and login pages
Internet connection for API interaction
Installation
Clone the Repository:

bash
Copy code
git clone https://github.com/ManuelSM4849/Warped-City.git
cd Warped-City
Open Unity Project:

Open Unity Hub.
Add the cloned project to your Unity Hub.
Open the project in Unity.
Set Up the Web Pages:

Deploy the index.html file to your preferred web server.
Run the API:

Set up a MySQL database on local host port: 8888 and run the "Database.sql" script inside the API folder.
Running the Game
Launch the Unity Game:

Open the Unity project.
Press the Play button in Unity to start the game.
Access Web Pages:

Open the index page in your web browser to create a new account.
Use the login page to log in with your registered credentials or play as a guest.
How It Works
Registration Page
Users input their details into the registration form.
The form data is sent to the API for validation and storage.
Upon successful registration, users can log in via the login page.
Login Page
Users can log in using their registered credentials.
Alternatively, users can choose to play as a guest without logging in.
Unity Game
The game starts with a login screen where players can log in or proceed as guests.
Registered users' progress and data are managed via the API.
The game features various animations, behaviors, and challenges set in the "Warped City" environment.

Acknowledgements
"Warped City" sprite pack by ansimuz.
Unity for providing the development platform.
For any questions or issues, please open an issue on the GitHub repository.
