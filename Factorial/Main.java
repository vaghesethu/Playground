#include<iostream>
int fact(int n)
{
  if(n>=1)
    return n*fact(n-1);
  else
    return 1;
}

int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int f=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<f;
  
}