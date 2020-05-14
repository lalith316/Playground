#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b;
  c=(a*a*a)*1000;
  if(c < b)
    cout<<"Cannot store"<<endl;
  else
    cout<<"Can store"<<endl;
}