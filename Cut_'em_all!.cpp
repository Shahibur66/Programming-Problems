
#include<bits/stdc++.h>
using namespace std;
vector<int> al[100005];
bool visit[100005];
int n,m;
int ans;
int dfs(int node)
{
    visit[node]=true;
    int num_vertex=0;

    for(int i=0;i<al[node].size();i++)
    {
        if(!visit[al[node][i]])
        {
            int num_nodes=dfs(al[node][i]);
            if(num_nodes%2==0)
                ans++;
            else
                {
                    num_vertex+=num_nodes;
                }
        }

    }
    return num_vertex+1;
}
int main() {
    int x,y;
    cin>>n;
    for(int i=0;i<n-1;i++)
    {
        cin>>x>>y;
        al[x].push_back(y);
        al[y].push_back(x);
    }
    dfs(1);
    if(n&1)ans=-1;
    cout<<ans;
    return 0;
}
