#include<iostream>
int main()
{
  // Type your code here
  int n,r,c=0;
  std::cin>>n;
  do
  {
    n=n/10;
    c++;
  }while(n!=0);
  std::cout<<c;
}