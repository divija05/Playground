#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char a[50],b[50];
  int i,j,c=0;
  cin>>a>>b;
  for(i=0,j=strlen(b)-1;i<strlen(a),j>=0;i++,j--)
  {  if(a[i]==b[j])
      c++;
  }
  if(c==strlen(a))
    cout<<"It is correct";
  else
    cout<<"It is wrong";//Type your code here.
}