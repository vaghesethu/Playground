#include<iostream>
int main()
{
  int a,b;
  std::cin>>a;
   //char b[50]=(a%2==0)?("Possible"):("Not Possible");
  //std::cout<<b;
  b=a%2;
  if(b==0)
    std::cout<<"Possible";
  else
    std::cout<<"Not possible";
}