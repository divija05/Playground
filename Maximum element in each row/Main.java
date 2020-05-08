#include<iostream>
using namespace std;
int main()
{
  int r,c,a[10][10];
  cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    int max=0;
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
      if(max<a[i][j])
        max=a[i][j];
    }
    cout<<max<<"\n";
  }
  //Type your code here.
}