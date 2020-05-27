#include<iostream>
int main()
{
  int initial,f,s=0,p;
  std::cin>>initial>>f;
  for(int i=initial;i<=f;i++)
  {
    s=0;
    for(int j=1;j<i;j++)
    {
      if(i%j==0)
        s=s+j;
    }
      if(s==i)
        std::cout<<i<<" ";
    }
  }