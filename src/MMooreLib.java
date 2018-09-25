public class MMooreLib {



        //Matthew Moore 9/20/18


            public void println(String str)
            {
                System.out.println(str);
            }

        
        public static int leastCommonMultiple(int num1, int num2, int num3)
        {
            //takes in 3 integers,  returns the least common multiple of all three
            /**Finds lcm for two parameters, reuses that same code to find the lcm of the lcm of the firt two ints and the
             third parameter. Was unable to test through IntelliJ as of 8:30 pm 9/24/18 due to the console not printing out
             a result or giving any feedback**/
            /**Unable to test as of 9:00pm 9/24/18, due to inability to run. Unable to debug the error.**/
            //GCF determiner.
            int gcf=0;
            int lcm=0;
            if (num1>num2)
            {
                for (int i = num2; i > 0; i--)
                {
                    if (num1 % i == 0 && num2 % i == 0)
                    {
                        gcf = i;
                    }
                    int quotient = num1 / gcf;
                    lcm = quotient * num2;
                }
            }
            if (num2>num1)
            {
                for (int i=num1;i>0;i--)
                {
                    if (num1%i==0 && num2%i==0)
                    {
                        gcf=i;
                    }
                    int quotient=num1/gcf;
                     lcm=quotient*num2;
                }
            }
            if (num2==num1)
            {
                lcm=num2;
            }
            if (lcm>num3)
            {
                for (int i=num3;i>0;i--)
                {
                    if (lcm%i==0 && num3%i==0)
                    {
                        gcf = i;
                    }
                }
                int quotient2=num3/gcf;
                return(quotient2*lcm);
            }
            if (num3>lcm)
            {
                for (int i=lcm;i>0;i--)
                {
                    if (lcm%i==0 && num3%i==0)
                    {
                        gcf=i;
                    }
                }
                int quotient2=num3/gcf;
                return(quotient2*lcm);
            }
            return (lcm);
        }

        public static String dateStr(String str)
        {
            //First string function
            //Presuppositions: str is in xx/xx/xx format on input.
            //Manipulates str by getting all the characters to the left of the first slash into a new string. Iterated until
            //three slashes.
            /**Changes made as of 8:00 pm 9/24/18 were unable to be tested. Changes include removing lines of code considered
             to be extraneous**/
            String first=str.substring(0,str.indexOf("/"));
            str=str.substring(str.indexOf("/")+1);
            String second=str.substring(0,str.indexOf("/"));
            str=str.substring(str.indexOf("/")+1);
            String third=str.substring(0,str.indexOf("/"));
            return(first+"-"+second+"-"+third);
        }
        public static void fooBarBarz(int num1)
        {
            //Second string function
            //num1 is operated on by modulo. If i%3 returns 0, it's a multiple of 3. If i%5 returns 0, it's a multiple of 5.
            //The third condition, checks if it's a multiple of either. If no condition is satisfied, the input is just
            //printed without manipulation.
            /**Unable to be tested as of 9:11 pm 9/24/18, file wouldn't run.**/
            for (int i=1; i<num1; i++)
            {
                if(i%3==0 && i%5!=0)
                {
                    System.out.println("foo");
                }
                if(i%3!=0 && i%5==0)
                {
                    System.out.println("bar");
                }
                if(i%3==0 && i%5==0)
                {
                    System.out.println("baz");
                }
                else
                {
                    System.out.println(i);
                }
            }
        }
        public static void multiplicationTable(int base, int range)
        {
            //second Math Method
            //Takes in two parameters, then uses a for loop to iterate through the set of integers between 0 and value of
            //range. As it iterates, on each element the product of base times the iteration variable is displayed to the
            //screen.
            /**Last worked 7:25 pm. Unable to be tested due to inability to run.**/
            for (int i=0; i<range+1;i++)
            {
                System.out.println(base*i);
            }
        }
        public static int sumUpTo(int integer)
        {
            //Third Math Method
            //Takes in integer. Uses a for loop to add integers up to integer value.
            /**Last tested 6:55 pm. Unable to be tested again due to inability to run.**/
            int sum=0;
            for (int i=0; i<integer+1;i++)
            {
                sum+=i;
            }
            return(sum);
        }


    }




