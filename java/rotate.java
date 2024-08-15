public class rotate {
    public static void main(String[] args) {
        int n=12345,r=7,c=0;
        int b=1,t=n,re=0;
{
while(t>0){
c;
b*=10;
t/=10;
}
b/=10;
r=r%c;
System.out.println(n);
for(int i=0;i<r;i){
re=n%10;
n/=10;
n=re*b+n;
}
System.out.println®;
System.out.println(n);
}
    }
    
}
