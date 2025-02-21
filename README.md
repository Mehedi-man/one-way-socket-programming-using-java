# Java Socket Programming

This project demonstrates basic socket programming in Java, implementing a simple client-server communication system.

## Features
- The **Server** listens on port `3000` and waits for a client connection.
- The **Client** connects to the server and sends messages.
- The server reads and prints messages from the client.
- The client can terminate communication by sending "Bye".

## Prerequisites
- Java Development Kit (JDK) installed
- A Java IDE or command-line tools

## Installation & Usage

### 1. Compile the files
```sh
javac server.java client.java
```

### 2. Run the Server
```sh
java server
```

### 3. Run the Client
```sh
java client
```

### 4. Communication
- Once the client connects, type messages in the client console.
- The server will display received messages.
- Type "Bye" to close the connection.

## File Structure
```
├── server.java  # Server implementation
├── client.java  # Client implementation
└── README.md    # Documentation
```

## Notes
- Ensure both server and client are running on the same network.
- The server must be started before the client.

## License
This project is open-source. You are free to modify and distribute it as needed.

