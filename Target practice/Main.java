#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int t=n,c=0,s=0,a;
  while(s<t)
  {
    std::cin>>a;
    c++;
    s=s+a;
  }
  std::cout<<"The number of turns is "<<c;
}