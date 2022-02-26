#include <bits/stdc++.h>

using namespace std;

int fibbonnaci(int n, vector<int> dp){
    
    int prev2 = 0;
    int prev = 1;
    
    if(n < 1){
        return prev2;
    }

    for(int i=2; i<=n; i++){
      int cur_i = prev2 + prev;
      prev2 = prev;
      prev= cur_i;
    }

    return prev;
}

int main(){
    int n;
    cout<<"Enter Number"<<endl; 
    cin >> n;
    vector<int> dp;
    for(int i = 0; i <= n ; i++ ){
        cout<<fibbonnaci(i,dp);
    }
}
