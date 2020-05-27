#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fd,fc,sd,sc;
  std::cin>>fd>>fc>>sd>>sc;
  int d=fd+sd;
  int c=fc+sc;
  while(c>99)
  {
    d+=1;
    c=c-100;
  }
  std::cout<<d<<"\n"<<c;
}