#include<iostream>
#include<cmath>
void check(int n,int m,int r)
{
  if(pow(n,m)>=r)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
      std::cout<<"Sorry Doctor! You need more bacteria.";
  
}
int main()
{
  int n,m,r;
  std::cin>>n>>m>>r;
  check(n,m,r);
  
}