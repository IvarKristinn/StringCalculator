#!/bin/bash
if [ ! -d classes ]; then 
  mkdir classes 
fi
javac src/main/java/is/ru/StringCalculator/*.java -d classes