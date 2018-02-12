#include<bits/stdc++.h>
using namespace std;

int convert(string);
int main()
{
    string s,stringFirst="",stringMid="",stringLast="";
    int sum = 0;
    cin>>s;
    string st = s;
    reverse(s.begin(),s.end());
    for(int i=0;i<2;i++){
        stringFirst+=st[i];
    }
    for(int i=0;i<2;i++){
        stringLast+=s[i];
    }
    for(int i=2;i<=7;i++){
        stringMid+=st[i];
    }
    reverse(stringLast.begin(),stringLast.end());
    if(stringLast=="PM" && convert(stringFirst)<12){
        sum=convert(stringFirst)+12;
    }
    else if(stringLast=="AM" && convert(stringFirst)==12){
        sum=0;
    }
    else{
        sum=convert(stringFirst);
    }
    if(sum<10){
        cout<<0<<sum<<stringMid<<endl;
    }
    else{
        cout<<sum<<stringMid<<endl;
    }

    return 0;
}
int convert(string s)
{
    stringstream ss(s);
    int n = 0;
    ss>>n;

    return n;
}
