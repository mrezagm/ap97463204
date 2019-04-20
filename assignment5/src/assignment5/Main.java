package assignment5;

public class Main {

    public static void main(String[] args)
    {

        Long startTime=System.currentTimeMillis();
        float function,maximum=0,minimum=0;

        for (float n = 0; n <= 999; n++)
        {

            for (float k = 0; k <= 999; k++)

            {
                function = (float) ((Math.abs(n * n + k * k)) / (n * Math.sin(n + k) + k * Math.cos(n + k)));

                if (function > maximum) {
                    maximum = function;
                }
                if (function < minimum) {
                    minimum = function;
                }
            }
        }
        System.out.format("Maximum Value In %f\n",maximum );
        System.out.format("Minimum Value In %f\n",minimum );
        System.out.println((System.currentTimeMillis()-startTime)+" ms");
    }

}
