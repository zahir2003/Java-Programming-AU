public class test2 {
    public static void main(String[] args) {
       int i=0;
       int  n=9;
       do{
        i++;
        if(n--<i++)
        {
            break;
        }
       }
       while(i<5);
        System.out.println(i+"\t"+n);
    }
}
