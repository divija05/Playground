#include <iostream>
using namespace std;
int main()
{
int mat[5][5],N;
  cin>>N;
  for(int i=0;i<N;i++)
    for(int j=0;j<N;j++)
      cin>>mat[i][j];
int sum = 0,sum2=0,flag=1;
for (int i = 0; i < N; i++)
sum = sum + mat[i][i];

for (int i = 0; i < N; i++)
sum2 = sum2 + mat[i][N-1-i];

if(sum!=sum2)
flag=0;

// For sums of Rows
for (int i = 0; i < N; i++) {

int rowSum = 0;
for (int j = 0; j < N; j++)
rowSum += mat[i][j];

// check if every row sum is
// equal to prime diagonal sum
if (rowSum != sum)
flag=0;
}

// For sums of Columns
for (int i = 0; i < N; i++) {

int colSum = 0;
for (int j = 0; j < N; j++)
colSum += mat[j][i];
if (sum != colSum)
flag=0;
}
if (flag==1)
cout << "Yes";
else
cout << "No";

return 0;
} 

