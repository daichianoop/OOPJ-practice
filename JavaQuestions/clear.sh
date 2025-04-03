#!/bin/bash

# USE WITH CAUTION !!!!

PROJECT_DIR=$(pwd)

find "$PROJECT_DIR" -name "*.class" -type f -exec rm -f {} \;

echo "All .class files have been removed from the project directory."
