 # KonpekiEconomy

[![Build Status](https://github.com/Ninzinhu/KonpekiEconomy/actions/workflows/build.yml/badge.svg)](https://github.com/Ninzinhu/KonpekiEconomy/actions)

A powerful economy plugin for Hytale servers, providing comprehensive player balance management, transactions, and administrative tools.

## Features

- **Player Balance Management**: Check, add, remove, and set player balances.
- **Transaction System**: Secure player-to-player payments.
- **Top Balances**: View the richest players on the server.
- **Admin Commands**: Powerful tools for server administrators to manage economies.
- **Database Support**: Choose between SQLite (default) or MySQL for data storage.
- **Configuration**: Highly customizable settings via YAML configuration.
- **Multi-threaded**: Asynchronous command execution for better performance.

## Installation

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- Hytale server

### Building the Plugin

1. Clone the repository:
   ```bash
   git clone https://github.com/Ninzinhu/KonpekiEconomy.git
   cd KonpekiEconomy
   ```

2. Build with Maven:
   ```bash
   mvn clean package
   ```

3. The plugin JAR will be created in `target/konpeki-economy-1.0-SNAPSHOT.jar`.

### Installing on Hytale Server

1. Stop your Hytale server.
2. Copy the built JAR file to the `plugins` folder of your Hytale server.
3. Start the server. The plugin will generate configuration files automatically.

## Configuration

After first run, a `config.yml` file will be created in the plugin's data folder. Edit it to customize:

- Database settings (SQLite or MySQL)
- Currency symbol and formatting
- Command permissions
- Balance limits

Example configuration:
```yaml
database:
  type: sqlite  # or mysql
  host: localhost
  port: 3306
  database: economy
  username: user
  password: pass

currency:
  symbol: "$"
  decimal_places: 2

commands:
  balance: true
  pay: true
  baltop: true
  eco: true
```

## Usage

### Player Commands

- `/balance` - Check your current balance
- `/pay <player> <amount>` - Send money to another player
- `/baltop` - View top player balances

### Admin Commands

- `/eco add <player> <amount>` - Add money to a player's balance
- `/eco remove <player> <amount>` - Remove money from a player's balance
- `/eco set <player> <amount>` - Set a player's balance
- `/eco reload` - Reload the configuration

## API

KonpekiEconomy provides a simple API for other plugins:

```java
import org.konpekiestudios.konpekistudios.hytale.plugins.KonpekiEcoAPI.Service;

KonpekiEcoAPI api = Service.getInstance();
float balance = api.getBalance(playerId);
api.addBalance(playerId, 100.0f);
```

## Contributing

Contributions are welcome! Please:

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

If you encounter issues or have questions:

- Open an issue on GitHub
- Check the Hytale community forums
- Join our Discord server (link TBD)

---

Made with ❤️ for the Hytale community</content>
<parameter name="filePath">D:\Programação\konpeki-economy\README.md
