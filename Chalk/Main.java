#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int t,s=0;
  s=n;
  t=n*(1/sqrt(n));
  while(t>1){
    s=s+t;
    t=t*(1/sqrt(n));
  }
  std::cout<<s+1;
  
}