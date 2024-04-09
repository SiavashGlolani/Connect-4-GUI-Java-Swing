# Connect-4-GUI-Java-Swing

## Detailed Description
A Connect-4 game implemented in Java Swing that allows two players to play against each other over a network with a real-time chat function.

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Features](#features)
- [How to Play](#how-to-play)
- [Credits](#credits)
- [License](#license)
- [Contact](#contact)

- ## Introduction

This project is a networked version of the classic Connect-4 game created using Java and Java Swing for the graphical user interface. It allows two players to connect via a server using an IP address and port number and includes a chat feature for players to communicate with each other during the game.

## Installation

To run the Connect-4 game:

1. Ensure you have Java Runtime Environment (JRE) installed on your machine.
2. Download the `Connect-4.jar` file from the releases section of this GitHub repository.
3. Navigate to the folder where you downloaded the JAR file.
4. Run the game using the following command in your command prompt or terminal:

```bash
java -jar Connect-4.jar

## Features

- **Multiplayer Gameplay**: Two players can enjoy Connect-4 in real-time. The game supports a client-server model where one player sets up the game as the host and the other connects as the client.

- **Network Connectivity**: Play with friends over the network. The host can set up a server by providing an IP address and a port number, and the client can join by entering the host's IP and the agreed port number.

- **Real-time Chat Function**: Enhance your gameplay with live communication. The integrated chat feature allows players to send messages back and forth while playing, adding a social element to the classic game.

- **Interactive GUI**: A user-friendly graphical interface makes it easy to play the game with simple mouse controls. The game board and chat are displayed within the same window for ease of use.

- **Server Setup**: The host has control over the server setup, allowing for customization of game settings before starting.

- **Dynamic Gameplay**: Each game session is independent, allowing players to connect and start new games as they wish without affecting previous game results.


## How to Play

### Starting the Game

When you launch the Connect-4 game, you'll be greeted with a splash screen offering two options:

- **Play Offline**: Select this to play the classic Connect-4 game against a computer or a second player on the same computer.
- **Play Online**: Choose this to play against another player over the network.

### Playing Online

1. **Host the Game**: One player needs to act as the host.
    - Select `Play Online` followed by `Host The Game`.
    - Enter your desired player name and choose your token color from the dropdown menu.
    - Provide a port number (e.g., 4999) that will be used to establish the network connection.
    - Click `Host` to start the server and wait for another player to join.

2. **Join the Game**: The second player will join the host's game.
    - Select `Play Online` on the splash screen and then `Join the Game`.
    - Enter your player name and select your token color.
    - Type in the host's IP address and the port number provided by the host.
    - Click `Connect` to join the host's game.

### During the Game

- Once connected, both players will be able to place their tokens in the columns on their turn.
- The game's objective is to connect four tokens vertically, horizontally, or diagonally before your opponent does.
- Utilize the chatbox to communicate with your opponent during the game.

### Ending the Game

- The game concludes once one player successfully connects four tokens or all spaces are filled, resulting in a draw.
- Players can then choose to play another game or exit.

Remember, a stable network connection is required for online play.

- **Cross-Platform Support**: Built in Java, the game can be run on any platform that supports Java, including Windows, macOS, and Linux.

Credits

Developed by Siavash Glolani as a personal project to understand networking and GUI development in Java.


## Contact

If you have any queries regarding this project, please contact me at h.glolani@gmail.com.
