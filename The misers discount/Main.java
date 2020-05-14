#include<iostream>
using namespace std;
int main()
{
  float a,b,c,x,y,z;
  cin>>a>>b>>c;
  x=a+b;
  y=x*(100-c)/100;
  z=(x*c)/100;
  cout<<x<<endl;
  cout<<y<<endl;
  cout<<z<<endl;
}