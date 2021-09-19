// Write a Program to Find Size of int, float, double and char in your computer.

#include <iostream> // Include standard library and namespace
using namespace std; // for C++

int main() {
    int intType;
    float floatType;
    double doubleType;
    char charType;

    // sizeof evaluates the size of a variable
    printf("Size of int: %d bytes\n", sizeof(intType));
    printf("Size of float: %d bytes\n", sizeof(floatType));
    printf("Size of double: %d bytes\n", sizeof(doubleType));
    printf("Size of char: %d byte\n", sizeof(charType));
    
    return 0;
}