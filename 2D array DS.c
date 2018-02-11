#include<stdio.h>

int main()
{
    int A[6][6];
    int i,j,sum1=0,sum2=0;
    for(i=0;i<6;i++){
        for(j=0;j<6;j++){
            scanf("%d",&A[i][j]);
        }
    }

        sum1+=A[0][0]+A[0][1]+A[0][2]+A[1][1]+A[2][0]+A[2][1]+A[2][2];


        sum2+=A[3][2]+A[3][3]+A[3][4]+A[4][3]+A[5][2]+A[5][3]+A[5][4];

    if(sum1>sum2){
        printf("%d\n",sum1);
    }
    else{
        printf("%d\n",sum2);
    }
}


