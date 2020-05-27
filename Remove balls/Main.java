#include <iostream>
using namespace std;
int ball(int n)
{
  if((n==1)||(n==2))
    return 1;
  else if(n==3)
    return 2;
  return ball(n-3)+ball(n-1);
}
int main() 
{
   int n;
  cin>>n;
  cout<<ball(n);
  return 0;
}