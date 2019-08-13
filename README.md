# springboot-springdata-webservice
Project with REST end points using Jersey, Spring Data

## SET UP

clone the repository to Local

```bash
cd folder/to/clone-into/
git clone https://github.com/kiransaras/springboot-springdata-webservice.git
```
Import as maven project in to the IDE

Run Maven Install
```bash
mvn install
```

Run application as Spring Boot Application,


## Task 1:
## End Points


Method:post

URL: http://localhost:8080/api/wordfrequency

Body:  { "para" : "beta alpha gamma delta alpha" }

## Task 2:
## End Points


Method:get

URL: http://localhost:8080/v/players

Method:get

URL: http://localhost:8080/v/players/{id}

Method:post

URL: http://localhost:8080/v/players

Body:
{
    "name": "mata",
    "team": "ManUTD",
    "position": "midfielder",
    "weight": 180.0,
    "goals": 20
}


Method:put

URL: http://localhost:8080/v/players/{playerId}

Body:
{
        "id": 3,
        "name": "mata",
        "team": "ManUTD",
        "position": "midfielder",
        "weight": 180.0,
        "goals": 20
    }


Method:delete

URL: http://localhost:8080/v/players/{playerId}

## Jococo

After running mvn install, open target/site/jococo/index.html using browser to look at code coverage










