#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  std::cin>>r>>c>>n;
  if(n>r&&n<=(2*r))
    std::cout<<"It is a mango tree";
  else if(n<=(r*c)-3&&n>((r*c)-(2*r)))
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}