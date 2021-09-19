/* Write a program where the user is asked to enter two
integers (divisor and dividend) and the quotient and the
remainder of their division is computed.(Both divisor and
dividend should be integers.) */

#include <iostream> // Include standard library and namespace
using namespace std; // for C++

int main(){
    int num1,num2,mod,quo;
    
    cout<<"Enter the divisor number:\n"; 
    cin>>num1; // The user enters the numbers using the cin object.
    cout<<"Enter the dividend number:\n"; 
    cin>>num2; // The user enters the numbers using the cin object.

    quo = num1/num2; // Quotient is calculated using using num1 and num2 and "/" arithmetic operator.
    mod = num1%num2; // Remainder is calculated using using num1 and num2 and "%" arithmetic operator.
    cout<<"The quotient of numbers entered by user is "<<quo; // Then the quo is displayed using the cout object.
    cout<<"\nThe remainder of numbers entered by user is "<<mod; // Then the mod is displayed using the cout object.
}