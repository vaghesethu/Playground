#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int r,even=0,odd=0,c=0;
  while(n!=0)
  {
    r=n%10;
    c++;
    if(c%2==0)
      even=even+r;
    else
      odd=odd+r;
    n/=10;
  }
  if(even==odd)
    std::cout<<"Yes";
  else
    std::cout<<"No";
  
}