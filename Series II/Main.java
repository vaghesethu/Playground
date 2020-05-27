#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a=11;int b=0;
  for(int i=1;i<=n;i++)
  {
    b=a*a;
    a=a+4;
    std::cout<<b<<" ";
  }
}