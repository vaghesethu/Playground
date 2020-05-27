#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  std::cin>>m;
  int p,d;
  std::cin>>p>>d;
  if(d<=(m*p))
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
  
}