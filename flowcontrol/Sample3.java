public class Sample3
{
public static void main(String args[]){
      if(args.length==0)
        {
           System.out.println("No values");
        }
       else
        {
            for(String city:args)
            System.out.println(city+",");
        }
}
}