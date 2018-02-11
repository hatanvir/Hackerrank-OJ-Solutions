#include<bits/stdc++.h>
using namespace std;

int main()
{
    int c=0;
    string s;
    cin>>s;
    for(int i=0;i<s.length();i++){
        if(s[i]>='A' && s[i]<='Z'){
            c++;
        }
    }
    cout<<c+1<<endl;

    return 0;
}
