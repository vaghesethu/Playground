#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int a[r][c],sum=0;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int j=0;j<r;j++)
  {sum =0;
    for(int i=0;i<c;i++)
    {
      
        sum+=a[j][i];
       
    }
  cout<<sum<<"\n";
  }
  
}