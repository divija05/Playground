#include<iostream>
using namespace std;
int main()
{
  int r,c,a[10][10];
  cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    int sum=0;
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
      sum+=a[i][j];
    }
    cout<<sum<<"\n";
  }//Type your code here.
}