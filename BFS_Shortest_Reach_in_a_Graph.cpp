
#include<bits/stdc++.h>

using namespace std;

#define MAX 1006
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

        for(int i=1; i<=1002; i++)
        {
            color[i]=WHITE;
            parent[i]=-1;
            dis[i]=-1;
        }

        queue<int>q;
        parent[start]=-1;
        dis[start]=0;
        q.push(start);
        color[start]=GRAY;

        while(!q.empty())
        {
            int x=q.front();


            for(int i=1; i<=node; i++)
            {
                if(con[x][i]==1)
                {
                    if(color[i]==WHITE)
                    {
                        q.push(i);
                        parent[i]=x;
                        dis[i]=dis[x]+6;
                        color[i]=GRAY;
                    }
                }
            }
            q.pop();
        }

}
int main()
{

    int i,j,c;
    int t;
    cin>>t;
    while(t--)
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
            bfs(start);


            for(i=1; i<=node; i++)
            {
                if(i!=start)
                {
                    cout<<dis[i]<<" ";
                }
            }cout<<endl;


    }

}
/*
8 7
0 1
0 2
1 3
2 4
2 5
3 6
3 7
0 1 2 3 4 5 6 7

2
4 2
1 2
1 3
1
3 1
2 3
2


*/


