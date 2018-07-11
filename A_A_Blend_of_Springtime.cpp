#include<bits/stdc++.h>
using namespace std;
int main()
{


    string abc;
    int i,j,c=0,f;

    cin>>abc;

    for(i=0; i<abc.size(); i++)
    {
        if(abc[i]=='A'&&abc[i+1]=='B'&&abc[i+2]=='C' || abc[i]=='A' && abc[i+1]=='C' && abc[i+2]=='B'
           || abc[i]=='B' && abc[i+1]=='A' && abc[i+2]=='C' || abc[i]=='B' && abc[i+1]=='C' && abc[i+2]=='A'
           || abc[i]=='C' && abc[i+1]=='B' && abc[i+2]=='A' || abc[i]=='C' && abc[i+1]=='A' && abc[i+2]=='B'
           )
        {
           cout<<"Yes"<<endl;
           return 0;

        }


    }

    cout<<"No"<<endl;


    return 0;

}
