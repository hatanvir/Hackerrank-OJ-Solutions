#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    long long int v,sum=0;
    while(n--){
        cin>>v;
        sum+=v;
    }
    cout<<sum<<endl;
    return 0;
}
