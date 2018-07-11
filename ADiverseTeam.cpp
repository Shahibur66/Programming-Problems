#include<bits/stdc++.h>
using namespace std;

int main()
{
    vector<int>v2;
    set<int>sett;
    set<int>::iterator it;
    int v1[1006];
    int n,k,i,j,s=0;
    cin>>n>>k;

    for(i=1; i<=n; i++)
    {
        cin>>v1[i];
        it=sett.find(v1[i]);
        if(it!=sett.end())
        {
            continue;

        }else
        {
             sett.insert(v1[i]);
             v2.push_back(i);
        }

      if(k==sett.size())
    {
         cout<<"YES"<<endl;

        for(i=0; i<v2.size(); i++)
            cout<<v2[i]<<" ";

            return 0;
    }

    }
        cout<<"NO"<<endl;

   return 0;
}
