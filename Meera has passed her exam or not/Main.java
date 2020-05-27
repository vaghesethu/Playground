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
  int r,f=0;
  std::cin>>r;
  for(int i=0;i<n;i++)
  {
    if(a[i]==r){
      f=1;
      break;}
  }
  if(f==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
    
}