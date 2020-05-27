#include <iostream>
#include<bits/stdc++.h>
using namespace std;
bool ispara(char c)
{
  return (c=='(')||(c==')');
}
bool isValid(string str)
{
  int c=0;
  for(int i=0;i<str.length();i++)
  {
    if(str[i]=='(')
      c++;
    else if(str[i]==')')
      c--;
    if(c<0)
      return false;
  }return c==0;
}
void removepara(string str)
{
  if(str.empty())
    return;
  set<string> visit;
  queue<string> q;
  string temp;
  bool lev;
  q.push(str);
  visit.insert(str);
  while(!q.empty())
  {
    str=q.front();
    q.pop();
    if(isValid(str))
    {
      cout<<str<<" ";
      lev=true;
    }
    if(lev) continue;
    for(int i=0;i<str.length();i++)
    {
      if(!ispara(str[i]))
        continue;
      temp=str.substr(0,i)+str.substr(i+1);
      if(visit.find(temp)==visit.end())
      {
        q.push(temp);
        visit.insert(temp);
      }
    }
  }
}
                      
int main() 
{
  string exp;
  cin>>exp;
  removepara(exp);
  return 0;
}