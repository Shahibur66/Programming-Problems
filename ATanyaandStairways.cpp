#include<bits/stdc++.h>
using namespace std;
int main()
{
    int i,j,a[1001],t=0,c=0,n;
    int first,second;
    vector<int>vec;

    cin>>n;

    for(i=0; i<n; i++)
    {
        cin>>a[i];
       // vec.push_back(a[i]);
       first=a[i];
       if(t==0)
       {
           second=first;
           t=1;
       }
       else if(first<=second)
       {
           c++;
           vec.push_back(second);
           second=first;
       }
       else
       {
           second=first;
       }

    }

    if(second==a[n-1])
    {
        c++;
        vec.push_back(second);
    }

    cout<<c<<endl;
    for(i=0; i<vec.size(); i++)
    {
        cout<<vec[i]<<" ";
    }
}
