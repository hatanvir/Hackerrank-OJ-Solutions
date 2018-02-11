#include<bits/stdc++.h>
using namespace std;
int main()
{
    set<char>st;
    string s;
    getline(cin,s);
    transform(s.begin(),s.end(),s.begin(),::tolower);
    for(int i=0;i<s.size();i++){
        if(isalpha(s[i])){
            st.insert(s[i]);
        }
    }
    if(st.size() == 26) cout<<"pangram"<<endl;
    else cout<<"not pangram"<<endl;
    return 0;
}
