public class linearsearch
{
    public static int search(int num[], int key)
    {
        for(int i = 0 ; i<num.length ; i++)
        {
            if(num[i]==key)
            {
               return i;
            }
         
        }
         return -1;
    }
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,5,6,7,8,9};
        int key = 70;
        int a = search(num,key);
        if(a == -1)
        {
             System.out.println("not found");
        }
        else{
             System.out.println("found at " + a);
        }
        

    }
}