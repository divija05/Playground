#include<iostream>
using namespace std;
int main()
{
  int n,m,i,j,c=0;
  cin>>n>>m;
  for(i=n,j=m;(i*j)>=1;i--,j--)
  {
    c++;
  }
  if(c%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";//Type your code here.
}