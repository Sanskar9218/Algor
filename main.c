#include <stdio.h>
#include <stdlib.h>
#define N 5
int a[N];
int top=-1;
void push()
{
    int x;
    printf("numer you want");
    scanf("%d",&x);
    if(top==N-1)
       {
           printf("overflow");
       }
        else
    {

        top++;
        a[top]=x;
    }

}
void pop()
{
    if(top==-1)
    {
        printf("underflow");
    }
    else
    {
        top--;
    }
}
void display()
{
    int i;
    for(i=top;i>=0;i--)
    {
        printf("%d %c",a[i],' ');
    }
}
int main()
{
    int ch;
    do
  {
  printf("enter your choice");
  scanf("%d",&ch);
  switch(ch)
  {
      case 1:push();
      break;
      case 2:pop();
      break;
      case 3:display();
      break;
      default:printf("invalid choice");
  }
  }

      while(ch!=0);
 return 0;
}
