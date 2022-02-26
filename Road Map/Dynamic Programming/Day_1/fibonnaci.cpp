#include <bits/stdc++.h>
using namespace std;

int fibbonnaci(int n, vector<int> dp){
    if(n <= 1)
        return n;

    return fibbonnaci(n-1, dp) + fibbonnaci(n-2, dp);
}

int main(){
    int n;
    cout<<"Enter Number"<<endl; 
    cin >> n;
    vector<int> dp;
    for(int i = 0; i < n+1 ; i++ ){
        cout<<fibbonnaci(i,dp);
    }
}