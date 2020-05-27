#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,x2,x3;
  int y1,y2,y3;
  int z1,z2,z3;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float a,b;
  a=float(x1+x2+x3)/3;
  b=float(y1+y2+y3)/3;
  std::cout<<a<<"\n"<<b;
}