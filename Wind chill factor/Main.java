#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int t,v;
  float z;
  cin>>t>>v;
  z=35.74+(0.6215*t)+(0.4275*t-35.75)*pow(v,0.16);
  cout<<z<<endl;
}