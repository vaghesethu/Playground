#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  std::cin>>a;
  int b=a%10;//last digit
  int e=a/1000;//first
  int h=b+e;
  std::cout<<h;
}