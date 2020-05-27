#include<iostream>
int fibbo(int n)
{
  int a=0,b=1,c,i;
  if(n==0)
    return a;
  for(int i=2;i<n;i++)
  {
    c=a+b;
    a=b;b=c;
  }
  return b;
}
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int b=fibbo(n);
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<b;
}