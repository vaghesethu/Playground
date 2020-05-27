#include<iostream>
int main(){
  // Type your code here
  int n,p=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    p=p*i;
  }
  std::cout<<p;
}