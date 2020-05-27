#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  std::cin>>n>>m;
  int a[n],sum=0;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    sum+=a[i];
  }
  if(sum>m)
    std::cout<<"NO";
  else
    std::cout<<"YES";
}