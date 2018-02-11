#include<bits/stdc++.h>
using namespace std;

int main()
{
    int a[3],b[3];

    int s1=0,s2=0;
        cin>>a[0]>>a[1]>>a[2];
        cin>>b[0]>>b[1]>>b[2];

        for(int j=0;j<3;j++){

        if(a[j]>b[j]){
            s1++;
        }
        else if(a[j]<b[j]){
            s2++;
        }
    }
        cout<<s1<<" "<<s2<<endl;

    return 0;
}
