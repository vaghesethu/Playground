#include<iostream>
int main()
{
  int n,f=0;
  std::cin>>n;
  for(int i=2;i<=n/2;i++)
  {
    if(n%i==0){
      f=1;
    break;}
  }if(n==1)
    std::cout<<"Not eligible";
  else{
    if(f==0)
      std::cout<<"Eligible";
    else
      std::cout<<"Not eligible";
  }
}