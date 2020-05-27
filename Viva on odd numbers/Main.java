#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0;
  float m=0;
  while(c!=3)
  {
    std::cin>>n;
    if(n<0)
    {
      m-=1;
      break;
    }
    else if(n%2==0)
    {
      m-=0.5;
    }
    else
    {
      m+=1;c++;
    }
  }
  std::cout<<m;
    
    
}