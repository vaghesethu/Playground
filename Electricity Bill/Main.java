#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  std::cin>>a;
  if(a<=200)
  {
    int b=(int)a*0.5;
    std::cout<<"Rs."<<b;
  }
  else if(a>200&&a<=400)
    std::cout<<"Rs."<<(a*0.65)+100;
  else if(a>400&&a<=600)
    std::cout<<"Rs."<<(a*0.80)+200;
  else if(a>600)
    std::cout<<"Rs."<<(a*1.25)+425;
}