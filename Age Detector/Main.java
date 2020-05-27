#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,c;
  std::cin>>b>>c;
  if(b>c)
    std::cout<<(100-b)+c;
  else
    std::cout<<c-b;
}