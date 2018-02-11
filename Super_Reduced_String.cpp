#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    cin>>s;
    int l=s.length();
    for(int i=0;i<l;){
        if(s[i]==s[i+1] && i>-1){
            s.erase(i,2);
            i--;
        }
        else{
            i++;
        }
    }
    if(s.empty()){
        cout<<"Empty String"<<endl;
    }
    else
        cout<<s<<endl;


    return 0;
}
