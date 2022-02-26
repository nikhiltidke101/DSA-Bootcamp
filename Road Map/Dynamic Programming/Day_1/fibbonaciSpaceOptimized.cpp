#include <bits/stdc++.h>
using namespace std;

int fibbonnaci(int n, vector<int>dp){
    int a =0;
    int b =1;

    if(n == 0){
        return a;
    }

    for(int i = 1 ; i < n ; i++){
        int sum = b;
        b = sum + a;
        a = sum;
    }

    return b;
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