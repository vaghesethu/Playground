#include<iostream>
int swap(int *a,int *b)
{
  int c;
  c=*a;
  *a=*b;
  *b=c;
}
int main()
{
int a,b;
std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(&a,&b);
 std::cout<<"After swapping a= "<<a<<" and b="<<b;
}