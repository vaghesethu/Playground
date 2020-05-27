#include<iostream>
int main(){
  // Type your code here
  int n;
  std::cin>>n;
  int m=0,f=0,a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    if(a[i]%2==0)
      f++;
    else
      m++;
  }
  std::cout<<m<<"\n";
  std::cout<<f;
  return 0;
}