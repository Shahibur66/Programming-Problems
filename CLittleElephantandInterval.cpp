#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll work(ll n)
{
    if(n<10)
        return n;
    ll k = n / 10;
    ll r = k + 9 -1;
    while(k>=10)    k/=10;
    if(k<=n%10) r++;
    return r;
}
int main()
{
    ll n ,m;
    scanf("%lld%lld",&n,&m);
    printf("%lld\n",work(m)-work(n-1));
    return 0;
}
