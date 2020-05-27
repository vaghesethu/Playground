#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int h=0;
  for(int i=0;i<n;i++)
  {
    if(h<a[i])
     h=a[i];
  }
  std::cout<<h;
}