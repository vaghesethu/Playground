#include<iostream>
int main()
{
  int e,t,n,d,s=0;
  std::cin>>e>>t;
  n=e+t;
  for(int i=1;i<n;i++)
  {
    d=n%i;
    if(d==0)
      s=s+i;
  }
  if(s==n)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}
