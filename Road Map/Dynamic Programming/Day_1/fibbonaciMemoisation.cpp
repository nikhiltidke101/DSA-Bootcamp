#include <bits/stdc++.h>
using namespace std;

int fibbonnaci(int n, vector<int> &dp){
    if( n <= 1){
        return dp[n] = n;
    }

    if(dp[n] != -1){
        return dp[n];
    }else{
        return dp[n] = fibbonnaci(n-1,dp) + fibbonnaci(n-2,dp);
    }
}

int main(){
    int n;
    cout<<"Enter Number"<<endl; 
    cin >> n;
    vector<int> dp (n+1,-1);
    for(int i = 0; i < n+1 ; i++ ){
        cout<<fibbonnaci(i,dp)<<" ";
    }
}