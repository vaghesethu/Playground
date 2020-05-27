#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int b=1,k;
  //std::cout<<1<<"\n";
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      for(int j=1;j<=i;j++)
      {if(i==j)
      std::cout<<b++;
       else
         std::cout<<b++<<"*";
      }
      //std::cout<<"\n";
    }
    else
    {
      b+=i-1;
      k=b;
      for(int j=1;j<=i;j++)
      {if(i==j)
        std::cout<<k;
       else
         std::cout<<k--<<"*";
      }
      b++;
    }      
    std::cout<<"\n";
  }
}