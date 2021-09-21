// Write a Program to Check Whether Number is Even or Odd


#include <iostream> // Include standard library and namespace
using namespace std; // for C++

int main(){
    int n;
    cout<<"Enter a number: ";
    cin >> n;

    if (n%2==0){ // Check if the no. is perfectly divisible by two or not.

        cout<<"Entered number is a even no.";
    
    } else {
    
        cout<<"Entered number is a odd no.";
    
    }

}