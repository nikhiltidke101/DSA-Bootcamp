// "Write a Program to Find Largest Number Among Three Numbers entered by users"

#include <iostream> // Include standard library and namespace
using namespace std; // for C++

int main(){
    int a, b, c;
    cout<< "Enter Three numbers: ";
    cin >> a >> b >> c;

    if ( a > b && a > c){
        cout<< "Largest no. is " <<a;
    }else if ( b > c){
        cout<< "Largest no. is "<<b;
    } else {
        cout<< "Largest no. is "<<c;
    }
}