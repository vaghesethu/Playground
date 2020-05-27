#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int b=n;
  for(int i=1;i<=4;i++)
  {
    for(int j=1;j<=i;j++)
    {
      std::cout<<b;
    }std::cout<<"\n";
    b+=1;
  }
   for(int i=4;i>=1;i--)
  { b-=1;
    for(int j=1;j<=i;j++)
    {
      std::cout<<b;
    }std::cout<<"\n";
   
  }
}