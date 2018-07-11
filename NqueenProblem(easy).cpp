#include<bits/stdc++.h>
using namespace std;

bool isSafe(int board[][10],int i,int j, int n)
{
    ///checking column
    for(int row=0; row<i; i++)
    {
        if(board[row][j]==1)
        {
            return false;
        }
    }

    ///checking Left Diagonal

    int x=i;
    int y=j;

    while(x>=0 && y>=0)
    {
        if(board[x][y]==1)
        {
            return false;
        }
        x--;
        y--;
    }

    ///checking Right Diagonal

     x=i;
     y=j;

    while(x>=0 && y<n)
    {
        if(board[x][y]==1)
        {
            return false;
        }
        x--;
        y++;
    }
    /// The position is safe,col and diagonals
    return true;
}

bool solveNQueen(int board[][10],int i,int n)
{
      if(i==n)
      {
          for(int i1=0; i<n; i++)
          {
              for(int j=0; j<n; j++)
              {
                  if(board[i1][j]==1)
                    cout<<"Q ";
                  else
                    cout<<"_ ";
              }cout<<endl;
          }

          return true;
      }
      for(int j=0; j<n; j++)
      {
          if(isSafe(board,i,j,n))
          {
              ///Place the queen
              board[i][j]=1;

              bool nextQueenIsseat=solveNQueen(board,i+1,n);
              if(nextQueenIsseat)
              {
                  return true;
              }
              ///Means i,j is not right position
              board[i][j]=0; ///Backtrack

          }
      }

      ///couldn't place a queen
      return false;

}

int main()
{
    int N;
    cin>>N;
    int board[10][10]={0};
    solveNQueen(board,0,N);
    return 0;

}
