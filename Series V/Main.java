#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int a=11,b=0;
  for(int i=1;i<=n;i++)
  {
    b=a*a;
    std::cout<<b<<" ";
    a=a+4;}
}