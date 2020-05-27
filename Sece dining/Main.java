#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char d[10];
  std::cin>>d;
  int r;
  std::cin>>r;
  if(d[0]=='f')
  { if(r==1)
    std::cout<<"Left Handed";
   else
     std::cout<<"Right Handed";
  }
  else
  {
    if(r==1)
      std::cout<<"Right Handed";
    else
       std::cout<<"Left Handed";
}
}