#include<iostream>
int digit(int n)
{
  int sum=0;
  if(n>9)
  { 
    while(n!=0)
  {
    sum+=(n%10);
    n/=10;
  }
  }
  else
    return n;
   return digit(sum);
}
int main()
{
  int a;
  std::cin>>a;
  std::cout<<digit(a);
}


    