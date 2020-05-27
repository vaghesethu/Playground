#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float t;
  std::cin>>a>>t;
  int f=(int)t;
  if(a>13)
  {
    if(f==13)
      std::cout<<"$5.00";
    else
      std::cout<<"$8.00";
  }
  else if (a<=13)
  {
    if(f==13)
      std::cout<<"$2.00";
    else
      std::cout<<"$4.00";
  }
}  