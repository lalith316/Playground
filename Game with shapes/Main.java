#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int r,l;
  cin>>r>>l;
  int d;
  d=2*r;
  if(d == l)
    cout<<"circle can be inside a square"<<endl;
  else
    cout<<"circle cannot be inside a square"<<endl;
}