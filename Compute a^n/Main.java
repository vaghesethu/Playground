#include<iostream>
#include<math.h>
using namespace std;
int power(int a,int b)
{
  int c;
  c=pow(a,b);
  return c;
}

int main()
{
  //Type your code here.
  int a,b;
  std::cout<<"Enter the value of a\n";
  std::cin>>a;
  std::cout<<"Enter the value of n\n";
  std::cin>>b;
  std::cout<<"The value of "<<a<<" power "<<b<<" is "<<power(a,b);
  
}