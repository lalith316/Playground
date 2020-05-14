#include<iostream>
using namespace std;
int main()
{
  int a,b,c,x,y,z;
  cin>>a>>b>>c;
  x=(a*b)/100;
  y=((a-x)*c)/100;
  z=(a-x-y)/3;
  cout<<x<<endl;
  cout<<y<<endl;
  cout<<z<<endl;
}