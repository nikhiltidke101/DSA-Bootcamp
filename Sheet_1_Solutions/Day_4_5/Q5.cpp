// Write a Program to Check whether a year entered by user is Leap Year or not.

// Hint - Before going through the solution you can find the logic on the internet try to understand it.


#include <iostream> // Include standard library and namespace
#include <cmath> // Include basic Math functionality trough this library.
using namespace std; // for C++

int main(){
   int year;
   printf("Enter a year: ");
   scanf("%d", &year);

   // leap year if perfectly divisible by 400
   if (year % 400 == 0) {
      printf("%d is a leap year.", year);
   }
   // not a leap year if divisible by 100
   // but not divisible by 400
   else if (year % 100 == 0) {
      printf("%d is not a leap year.", year);
   }
   // leap year if not divisible by 100
   // but divisible by 4
   else if (year % 4 == 0) {
      printf("%d is a leap year.", year);
   }
   // all other years are not leap years
   else {
      printf("%d is not a leap year.", year);
   }
}