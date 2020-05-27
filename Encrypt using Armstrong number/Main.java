#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int c=0,m=n,sum=0,r,b;
  int t=n;
  while(m!=0)
  {
    c++;
    m/=10;}
  while(n!=0)
  {
    r=n%10;
    b=power(r,c);
    sum=sum+b;
    n/=10;
  }
  if(sum==t)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}