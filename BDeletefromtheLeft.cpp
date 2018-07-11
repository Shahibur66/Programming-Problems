#include<bits/stdc++.h>
using namespace std;

int main()
{

    vector<string>s1,s2;
    string x,y;
    int n,i,j,len1,len2,c=0;

    cin>>x;

    cin>>y;

   // cout<<x.erase(0,1)<<endl;
    //cout<<x<<endl;

   len1=x.size();
   len2=y.size();
   i=0,j=0;
   while(i<=max(len1,len2)||j<=max(len1,len2))
   {

       while(len1>len2)
       {
          x.erase(i,i+1);
          cout<<"x: "<<x<<endl;
          len1=x.size();
          i++;
          c++;
       }
      while(len2>len1)
       {
          y.erase(j,j+1);
           cout<<"y: "<<y<<endl;
          len2=y.size();
          j++;
          c++;
       }
       if(x==y)
       {
           break;
       }
       else if(len1==len2)
       {
           x.erase(i,i+1);
           y.erase(j,j+1);
           cout<<"x: "<<x<<" y: "<<y<<endl;
           c+=2;
           if(x==y)
           {
               break;
           }
           //if(s1==)
       }
       else if(len1==0||len2==0)
       {
           break;
       }

       i++;
       j++;
   }
   cout<<c<<endl;


}
