#include <bits/stdc++.h>
using namespace std;

void permutations(int index, int n, string str){
    if(index >= n-1){
        cout<<str<<endl;
        return;
    }

    for(int j = index; j < n ; j++){
        if(str[index] != str[j]){
            swap(str[index], str[j]);
            permutations(index+1,n,str);
            swap(str[index], str[j]);
        } 
    }
}

int main(){
    string str = "ABA";
    int n = str.length();
    vector<string> ans;
    string output = "";
    int index =0;

    permutations(index,n,str);
}