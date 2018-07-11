#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,m,i,j,k,p;
    map<int,int>code;
    int a[21],b[21];
    cin>>n>>m;
    for(i=0; i<n; i++)
    {
        int x;
        cin>>a[i];
    }
    for(i=0; i<m; i++)
    {
        int x;
        cin>>b[i];
    }
    for(i=0; i<n; i++)
    {
        for(j=0; j<m; j++)
        {
            if(a[i]==b[j])
                cout<<a[i]<<" ";

        }
    }

}
