#!/bin/bash
if [ ! -d classes ]; then
  mkdir classes
fi

javac -classpath "classes;lib/junit-4.12.jar" src/test/java/is/ru/StringCalculator/*.java -d classes