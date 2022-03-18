static class Stack
    {
        int top=-1;
        static final int MAX=1000;
        char[] stack=new char[MAX];
        void push(char element)
        {
            if(top>MAX)
            System.out.println("Stack is Full");
            else
            {
             stack[++top]=element;
            }
        }
        char pop()
        {
            if(!isEmpty())
            {
              return stack[top--];
            }
            else
            {
              return 0;
            }
        }
        boolean isEmpty()
        {
            if(top<0)
            {
                return true;
            }
            else
            return false;
        }
        char stackTop()
        {
         return stack[top];
        }
    }
public static String infixToPostfix(CQStack s, String exp)
{
  int i;
  char temp;
  String output="";
  Stack s1=new Stack();
  for(i=0;i<exp.length();i++)
  {
    temp=exp.charAt(i);
    if(temp>='A'&&temp<='Z'||temp>='a'&&temp<='z'||temp>='1'&&temp<='9')
    output=output+temp;
    else if(temp=='(')
    s1.push(temp);
    else if(temp==')')
    {
      while(!s1.isEmpty()&&s1.stackTop()!='(')
      output=output+s1.pop();
      if(s1.isEmpty())
        return "Expression Not Valid";
       else
        s1.pop();
     }
     else
     {
       while(!s1.isEmpty()&&(precedence(temp)<=precedence(s1.stackTop())))
       {
         output=output+s1.pop();
       }
       s1.push(temp);
     }
   }
   while(!s1.isEmpty())
     output=output+s1.pop();
   return output;
}
static int precedence(char c)
{
  switch(c)
  {
    case '+':
    case '-':
      return 1;
    case '*':
    case '/':
      return 2;
    case '^':
      return 3;
   }
   return -1;
}