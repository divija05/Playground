#include<iostream>
using namespace std;
int main()
{
  int r,c,a[10][10];
  cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int k,l;
  for(int k=0;k<c;k++)
  {
    int max=0;
    for(int l=0;l<r;l++)
    {
      if(max<a[l][k])
        max=a[l][k];
    }
    cout<<max<<"\n";
  }
    
    
}