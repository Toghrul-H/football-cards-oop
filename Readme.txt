# FOOTBALL CARDS — SIDE OOP PROJECT (Java)

## Overview

This is a small Object-Oriented Java project that simulates a simple football card system. Each card represents a football player with stats, a position type, and a boost modifier depending on the card’s rarity/type. The project demonstrates inheritance, polymorphism, interfaces, enums, and basic collection handling.

## Key Features

* Add football player cards to a club
* Calculate average team rating
* Count English players and list their names
* Find the best Spanish player by rating
* Detect whether there is an expensive player in the squad
* Identify the most expensive special card (POTY / POTW)

## OOP Concepts Demonstrated

* **Inheritance** → `Card` → (`Attacker`, `Defender`, `Midfielder`)
* **Polymorphism** → `CardType` affects stat boosts differently per subclass
* **Encapsulation** → player data hidden inside classes
* **Interface** → `CardType` with multiple implementations (`POTY`, `POTW`, `None`)
* **Enum** → `Nation` for cleaner nationality handling

## Class List

* `Card` (base class)
* `Attacker`, `Defender`, `Midfielder` (derived classes)
* `CardType` (interface) → `POTY`, `POTW`, `None`
* `Player` (player data)
* `MyClub` (club container and business logic)
* `Nation` (enum)
* `FootballMain` (demo runner)

## Example Output (FootballMain)

```
Average rating: 83
How many English players: 2
Is there expensive player than 1000000: true
Best spanish player: John
All English Players:
- Lopez
- Bailey
Most expensive special card: Jafar
```

## How to Run

1. Place sources under:

```
src/main/java/footballteam/
```

2. Run `FootballMain`

## Future Improvements

* Add file input for player database
* Add remove/edit/update card features
* Add sorting by rating or price
* Add GUI or web front-end for interaction

## Author

Toghrul Hasanli
