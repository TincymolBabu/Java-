import java.util.*;
class symmetric
{
public static void main(String args[])
{
int i,j,f=0;
Scanner sc =new Scanner(System.in);
System.out.println("enter the number of rows");
int rows=sc.nextInt();
System.out.println("enter the number of columns");
int cols=sc.nextInt();
if(rows!=cols)
{
System.out.println("not symmetric");
}
else
{
int matrix[][]=new int[rows][cols];
System.out.println("enter the elements");
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
matrix[i][j]=sc.nextInt();
}
}
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
if(matrix[i][j]!=matrix[j][i])
{
f=1;
break;
}
}
}
if(f==1)
{
System.out.println("not symmetric");
}
else
{
System.out.println("Symmetric");
}
}
}
}
