#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,hcf,st;
  std::cin>>a>>b>>c;
  if((a>b&&a<c)||(a>c&&a<b))
    std::cout<<"The treasure is in box which has number "<<a;
  else if((b>a&&b<c)||(b>c&&b<a))
    std::cout<<"The treasure is in box which has number "<<b;
  else
    std::cout<<"The treasure is in box which has number "<<c;
  st=a<b?(a<c?a:c):(b<c?b:c);
 
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
  std::cout<<"\nThe code to open the box is "<<hcf;
}