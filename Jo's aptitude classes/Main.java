#include<iostream>
int gcd(int a,int b,int c)
{
  int s,i;
  s=a<b?(a<c?a:c):(b<c?b:c);
     for(i=s;i>=1;i--)
     {if(a%1==0&&b%i==0&&c%i==0)
      break;}
     return i;
     }
int main()
{
  int a,b,c,g,d;
  std::cin>>a>>b>>c>>g;
  d=gcd(a,b,c);
  if(d==g)
  std::cout<<"Answer is correct.";
  else
  std::cout<<"Answer is wrong.";
}
  