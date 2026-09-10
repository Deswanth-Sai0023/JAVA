public class twice
{
public static int twice(int num[]){
    int n = num.length;
    boolean istwice = false;
    for(int i = 0 ; i<n; i++){
        for(int j = i+1 ; j<n ; j++)
        {
            if(num[i]==num[j])
            {

                return 1;
            }
        }
    }
    
    return -1;
}
    public static void main(String args[])
    {
        int num[] = {1,2,3,4};
        int re = twice(num);
        if(re==-1)
        {
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}