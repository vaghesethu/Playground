#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  float f=0.5;
  int p=1;
  std::cout<<f<<" ";
  while(n-1!=0)
  {
    f=f+p;
    p=p*3;
    std::cout<<f<<" ";
  n--;
  }
  
}