#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    int arr[1000],a[10000];
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j]+arr[j-1]==arr[j]){
                    cout<<arr[j]<<endl;
                }

            }
    }
    return 0;
}
