
#include<bits/stdc++.h>
using namespace std;
int main()
{


    long num,i,j,s=0,num2;
    long k;
    cin>>num>>k;
    while(k--)
    {
        num2=num%10;
        if(num2==0)
            num/=10;
        else if(num2!=0)
              num=num-1;
    }
    cout<<num<<endl;

}
