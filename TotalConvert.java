public class TotalConvert{
   

    public static void main(String args[]){

        int i;
        float[] temp = new float[101];
        for(i=0; i<101; i++)
        {
            temp[i] = (float)((i*9)/5)+32;
        }
        System.out.println("Sr. No."+"\t"+"Temperature(Celsius)"+"\t"+"Temperature(Fahrenheit)");
        for(i=0; i<=100; i++)
        {
            System.out.println(" "+i+"\t\t"+(float)i+"\t\t\t"+temp[i]);
        }
    }

}
