#include<iostream>
#include<string>
using namespace std;
int main()
{
  string name;
  cin>>name;
  for(int i=0;i<name.size();i++)
    if((name[i]>='a' && name[i]<='z') || (name[i]>='A' && name[i]<='Z'))
      cout<<name[i];//Type your code here.
}