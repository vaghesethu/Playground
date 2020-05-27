#include<iostream>
int gcd(int a,int b)
{
  if(a==0)
    return b;
  if(b==0)
    return a;
  if(a==b)
    return a;
  if(a>b)
    return gcd(a-b,b);
  return gcd(a,b-a);
}
int main()
{
  //Type your code here.
  int a,b;
  std::cin>>a>>b;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}