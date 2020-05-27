#include<iostream>
using namespace std;
int main()
{
  int tballs,truns,runssc,ballsbowl;
  std::cin>>tballs>>truns>>runssc>>ballsbowl;
  float op1,op2,op3,op4,t,p,q,r;
  t=tballs/6;
  p=ballsbowl/6;
  op1=t+(tballs-(6*t))*0.1;
  op2=p+(ballsbowl-(6*p))*0.1;
  op3=(runssc)/op2;
   q=int(op3*10+0.5);
   op3= (float)q/10;
  op4=(truns)/op1;
   r=int(op4*10+0.5);
   op4=(float)r/10;
  std::cout<<op1<<"\n"<<op2<<"\n"<<op3<<"\n"<<op4<<"\n";
   if(op3>=op4)
     std::cout<<"Eligible to Win";
   else
     std::cout<<"Not Eligible to Win";
}