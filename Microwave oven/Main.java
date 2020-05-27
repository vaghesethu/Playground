#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float t,tot;
  std::cin>>n>>t;
  if(n==2){
    tot=(float)(50*t/100)+t;
    std::cout<<tot;
  }else if(n==3){
    tot=(float)2*t;
    std::cout<<tot;
  }else
    std::cout<<"Number of items is more";
}