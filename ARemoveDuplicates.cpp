#include <bits/stdc++.h>
using namespace std;

bool vu[50000];
int tab[10000];
vector <int> solut;
int main()
{
	int nb;
	cin>>nb;
	for (int i=0;i<nb;i++)
	{
		cin>>tab[i];
	}
	for (int i=nb-1;i>=0;i--)
	{
		if (!vu[tab[i]])
		{
			vu[tab[i]]=true;
			solut.push_back(tab[i]);
		}
	}
	cout<<solut.size()<<endl;
	for (int i=solut.size()-1;i>=0;i--)
	{
		cout<<solut[i]<<" ";
	}
}
