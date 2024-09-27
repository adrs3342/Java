public class Overloading {

    public static int add(int a, float b)
    {
        return (a + (int)b);
    }
    public static int add(float a,int b)
    {
        int c = (int)a + b;
        return c;

    }
    public static int add(int a, int b, int c)
    {
        return (a + b + c);
    }

    public static void addition(int...num)
    {
        int res=0;
//        for(int i =0;i<num.length;i++)
//        {
//            res+=num[i];
//        }
        for(int i: num){
            res += i;
        }

        System.out.println("Addition:"+res);
    }
    public static void main(String[] args)
    {

        Overloading.addition(1,2,3,4,5,6,7,8,9);
        System.out.println(Overloading.add(3.785f ,3));
    }
}
