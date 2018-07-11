#include<bits/stdc++.h>
#include<queue>

using namespace std;

#define MAX 1005
#define WHITE 1
#define GRAY 2
#define BLACK 3

int node,edge;

int con[MAX][MAX];
int color[MAX];
int parent[MAX];
int dis[MAX];

void bfs(int start)
{

        for(int i=1; i<=1001; i++)
        {
            color[i]=WHITE;
            parent[i]=-1;
            dis[i]=-1;
        }

        queue<int>q;
        parent[start]=-1;
        dis[start]=0;
        q.push(start);

        while(!q.empty())
        {
            int x=q.front();
           // cout<<x<<" ";
            q.pop();
            color[x]=GRAY;

            for(int i=1; i<=node; i++)
            {
                if(con[x][i]==1)
                {
                    if(color[i]==WHITE)
                    {
                        q.push(i);
                        parent[i]=x;
                        dis[i]=dis[x]+6;
                    }
                }
            }

            color[x]=BLACK;
        }

}

int main()
{

    int i,j,c;

    int q;
    cin>>q;
    while(q--)
    {

        memset(con,0,sizeof(con));
            cin>>node>>edge;
            for(i=1; i<=edge; i++)
            {
                int x,y;
                cin>>x>>y;
                con[x][y]=1;
                con[y][x]=1;
            }
            int start;
            cin>>start;
          //  for(i=1; i<=node; i++)
            bfs(start);
             for(i=1; i<=node; i++)
             {
                 if(i!=start)
                    cout<<dis[i]<<" ";
             }cout<<endl;

    }

}


