#include<iostream>
#include<string>
using namespace std;
int main()
{
  string a;
  int v=0,c=0,w=0,d=0,s=0;
  getline(cin,a);
  for(int i=0;i<a.size();i++)
  {
    if((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z'))
    {
      if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U')
        v++;
      else
        c++;
    }
    else if (a[i]==' ')
      w++;
    else if(a[i]>='0' && a[i]<='9')
      d++;
    else
      s++;
  }
  cout<<"Vowels:"<<v<<"\n"<<"Consonants:"<<c<<"\n"<<"White Spaces:"<<w<<"\n"<<"Digits:"<<d<<"\n"<<"Symbols:"<<s;

}
