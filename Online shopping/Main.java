#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int flip_cost,flip_dif,flip_ship;
  std::cin>>flip_cost>>flip_dif>>flip_ship;
  int snap_cost,snap_dif,snap_ship;
  std::cin>>snap_cost>>snap_dif>>snap_ship;
  int am_cost,am_dif,am_ship;
  std::cin>>am_cost>>am_dif>>am_ship;
  int a,b,c;
  a=flip_cost+flip_ship-(flip_cost*flip_dif/100);
  b=snap_cost+snap_ship-(snap_cost*snap_dif/100);
  c=am_cost+am_ship-(am_cost*am_dif/100);
  std::cout<<"In Flipkart Rs."<<a<<"\n"<<"In Snapdeal Rs."<<b<<"\n"<<"In Amazon Rs."<<c<<"\n";
  if(a<=b&&a<=c)
    std::cout<<"He will prefer Flipkart";
  else if(b<=a&&b<=c)
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
  
}