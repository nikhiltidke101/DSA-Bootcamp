// Write a Program to Add Two Integer Numbers Entered by User

#include <iostream> // Include standard library and namespace
using namespace std; // for C++

int main(){
    int num1,num2,sum;
    
    cout<<"Enter the input number 1&2:\n"; 
    cin>>num1>>num2; // The user enters the numbers using the cin object.

    sum = num1+num2; // Sum is calculated using using num1 and num2 and "+" arithmetic operator.
    cout<<"The sum of numbers entered by user is "<< sum ; // Then the sum is displayed using the cout object.

}