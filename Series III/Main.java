#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a=6,c=0;
  std::cout<<a<<" ";
  for(int i=1;i<n;i++)
  {
    c=a+(i*5);
    a=c;
    std::cout<<c<<" ";
  }
}
