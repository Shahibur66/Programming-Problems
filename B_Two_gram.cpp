
#include<bits/stdc++.h>
using namespace std;
int main()
{

    string name1,name2,name3;

    char two1,two2,t3,t4;
    int c=0,i,j,k=0,p,n,mx=-9999,x,y;
    cin>>n>>name1;

    bool flag=false;
    for(i=0; i<name1.size(); i++)
    {
        two1=name1[i];
        two2=name1[i+1];
        c=0;

        for(j=i+1; j<name1.size(); j++)
        {
          //name2="";
           if(two1==name1[j] && two2==name1[j+1])
           {
              c++;
             // name2+=name1[j];
             //name2+=name1[j+1];
             t3=two1;
             t4=two2;
             x=j;
             y=j+1;

           }

        }
               if(c>mx)
              {
                   mx=c;
                   x=x;
                   y=y;
              }

              cout<<"t3"<<t3<<endl;

    }

        cout<<name1[x]<<name1[y]<<endl;

}
