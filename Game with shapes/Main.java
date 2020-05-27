#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,r;
  std::cin>>r>>x;
  if(x>=(2*r))
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
}