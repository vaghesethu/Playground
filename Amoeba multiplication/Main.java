#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int first=0,second=1;
  int sum =0;
  for(int i=2;i<n;i++)
  {
    sum=first+second;
    first=second;
    second=sum;
  }
  std::cout<<sum;
}