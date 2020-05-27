#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c;
  int adult=b*75;
  int child=c*30;
  int t=adult+child;
  if(t<=a)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}