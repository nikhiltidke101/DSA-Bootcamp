// "Write a Program to Check Whether a Character is Vowel or Consonant."

#include <iostream> // Include standard library and namespace
using namespace std; // for C++


int main(){
    char c;
    cout<<"Enter a character: ";
    cin >> c;

    if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ){
        cout<< "Entered character is a vowel";
    }else{
        cout<< "Entered character is a consonant";
    }
}