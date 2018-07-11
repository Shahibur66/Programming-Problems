#include<bits/stdc++.h>
using namespace std;
bool palind(string str) {
	int n = str.length();
	for(int i = 0; i < n; i++) {
		if(str.at(i) != str.at(n-i-1)) {
			return false;
		}
	}
	return true;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	string s;
	cin >> s;
	string best = "";
	int n = s.length();
	for(int st = 0; st < n; st++) {
		string cur = "";
		for(int en = st; en < n; en++) {
			cur+= s.at(en);
			if(cur.length() > best.length() && !palind(cur)) {
				best = cur;
			}
		}
	}
	cout << best.length();
	return 0;
}
