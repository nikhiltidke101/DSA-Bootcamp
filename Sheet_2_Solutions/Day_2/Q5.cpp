#include <bits/stdc++.h>
using namespace std;

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

string timeConversion(string s) {
    // Solution
    int n = s.length();
    int hh, mm, ss;
    hh = (s[0] - '0') * 10 + (s[1] - '0');
    
    if (hh < 12 && s[8] == 'P'){
        hh += 12;
    }
    if (hh == 12 && s[8] == 'A'){ 
        hh = 0;
    }
    
    string new_hh = "";
    if (hh < 10){
        new_hh = "0"+to_string(hh);
    }
    else{
        new_hh = to_string(hh);
    }
    
    return new_hh+":"+s.substr(3,2)+":"+s.substr(6,2); 
    //
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = timeConversion(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
