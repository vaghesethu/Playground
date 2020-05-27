#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,n;
  int a,b;
  float c,d;
  std::cin>>p>>r>>n;
  a=p*n*r/100;
  b=a+p;
  c=2*(float)a/100;
  d=b-c;
  std::cout<<a<<"\n"<<b<<"\n"<<c<<"\n"<<d<<"\n";
}