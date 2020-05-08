#include<iostream>
#include<string>
using namespace std;
int main()
{
  string a,b;
  getline(cin,a);
  for(int i=0;i<a.size();i++)
  {
    if(a[i-1]==' ' && a[i]=='t' && a[i+1]=='h' && a[i+2]=='e' && a[i+3]==' ')
     i=i+3;
else
    b+=a[i];
  }
  cout<<b;
}