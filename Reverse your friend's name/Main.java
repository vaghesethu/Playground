#include <iostream>
#include<string.h>
using namespace std;
int main()
{
     char str[200];
  cin.get(str,200);
  for(int i=strlen(str)-1;i>=0;i--)
    cout<<str[i];
}