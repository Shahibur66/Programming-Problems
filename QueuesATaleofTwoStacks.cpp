#include<bits/stdc++.h>
#include<queue>
using namespace std;
int main()
{
    long long type,n,i,j,c,x,t;
    cin>>t;
    queue<long>q;
    while(t--)
    {
        cin>>type>>x;

        if(type==1)
        {
            q.push(x);
        }
        if(type==2)
        {
            q.pop();
        }
        if(type==3)
        {
            while(q.emtry())

            cout<<q.front()<<endl;
        }

    }
}
