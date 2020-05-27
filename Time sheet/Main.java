#include<iostream>
using namespace std;
int main()
{
 int sun,mon,tue,wed,thur,fri,sat;
  std::cin>>sun>>mon>>tue>>wed>>thur>>fri>>sat;
  int tot=(sun+mon+tue+wed+thur+fri+sat)*100;
  if(sun>0)
    tot+=sun*50;
  if(sat>0)
    tot+=sat*25;
  if(thur>8)
    tot+=(thur-8)*15;
  if(mon>8)
    tot+=(mon-8)*15;
  if(tue>8)
    tot+=(tue-8)*15;
  if(wed>8)
    tot+=(wed-8)*15;
  if(fri>8)
    tot+=(fri-8)*15;
  std::cout<<tot;  
}