// Write a Program to Swap Two Numbers

#include <iostream> // Include standard library and namespace
using namespace std; // for C++

int main(){
    int a,b,temp;

    cout<<"Enter the input number 1:\n"; 
    cin >> a;
    cout<<"Enter the input number 2:\n"; 
    cin >> b;
    cout<<"The numbers entered by user before swap are "<< a <<" "<< b ;

    // Swap Method
    temp = a;
    a = b;
    b = temp;
    // Swap Khatam
    cout<<"\nThe numbers entered by user after swap are "<< a <<" "<< b ;
}

