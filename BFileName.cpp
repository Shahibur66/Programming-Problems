#include<bits/stdc++.h>
using namespace std;

int main()
{

    int i,j,s=0,c=0,k;
    string name;

    cin>>k;
    cin>>name;

    for(i=0; i<name.size(); i++)
    {
        if(name[i]=='x'&&name[i+1]=='x'&&name[i+2]=='x')
            c++;

    }
    cout<<c<<endl;

}
