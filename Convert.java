public class Convert{
   

    public static void main(String args[]){

        int tc, i;
        int[] temp = new int[11];
        for(i=0; i<11; i++)
        {
            tc = 10*i;
            temp[i] = ((tc *9)/5)+32;
        }
        System.out.println("Sr. No."+"\t"+"Temperature(Celsius)"+"\t"+"Temperature(Fahrenheit)");
        for(i=0; i<=10; i++)
        {
            int j = i+1;
            System.out.println(" "+j+"\t\t"+i*10+"\t\t\t"+temp[i]);
        }
    }

}