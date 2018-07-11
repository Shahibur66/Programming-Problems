#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,k,i,j,c=0,s=0;
    bool f1=false,f2=false;
    cin>>n>>k;
    vector<int>A,B;
    //int A[103],B[103];
    for(i=0; i<n; i++)
    {
        int x;
        cin>>x;
       A.push_back(x);
       B.push_back(x);
    }

     reverse(B.begin(),B.end());

    for(i=0,j=1; i<n&&j<=n; i++,j++)
    {
        if(j%2!=0)
        {
            if(A[i]<=k)
            {
                c++;
                cout<<A[i]<<" "<<i<<" "<<j;

            }
        }
        else if(j%2==0)
        {

            if(B[i]<=k)
            {
                c++;
            }

        }
    }
    //cout<<c<<endl;
}
