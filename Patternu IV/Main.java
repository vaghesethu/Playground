#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0){
        std::cout<<i+1;}
    for(int j=1;j<n;j++)
    {
      
        std::cout<<i;}
      if(i%2!=0)
      {
       std::cout<<i+1;
      }
    
    std::cout<<"\n";
  }
    return 0;
}