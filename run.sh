#!/usr/bin/env bash
rm -rf bin
mkdir -p bin
javac -d bin $(find src -name "*.java") && java -cp bin Main


# vorher einen ordner bin anlegen 
# einmal ausführbar machen mit chmod +x run.sh
# und ab dann immer ./run.sh 
