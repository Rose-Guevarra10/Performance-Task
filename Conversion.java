import java.util.Scanner;

public class CurrencyExchange {
        public static void main(String[] args) {

                Scanner sc = new Scanner (System.in);
                     for(int i = 0; i<=10; i++);
                   System.out.println("*");  
    
 System.out.println("USD TO EURO CONVERTER");
System.out.println("EURO TO USD CONVERTER"); 
System.out.println("POUNDS TO USD CONVERTER "); 
System.out.println("USD TO PESO CONVERTER");

System.out.println();  

System.out.println(" 1 USD = 0.90 Euro");
System.out.println(" 1 Euro = 1.10 USD");
System.out.println(" 1 Pound = 1.31 USD");
System.out.println(" 1 USD = 55.99710 PHP");

System.out.println();  

    System.out.println("Choose one from the following options");
                
                System.out.println("1) USD to €");
                System.out.println("2) € to USD");
                System.out.println("3) £ to USD");
                System.out.println("4) USD to peso");
                int exchange = sc.nextInt();
                switch (exchange) {
                	


        case 1 : {        
        System.out.println("Enter the number of USD");

                         double usd = sc.nextDouble();                 

        if (usd>=0) {
           System.out.println(usd + "USD is " + 0.90 + "€.");

        }
else {
        System.out.println("Please put in positive numbers of USD");
}
break;
        }
   case 2 : {
           System.out.println("Enter the number of €");
           double euro = sc.nextDouble();

           if (euro>=0) {
                   System.out.println( euro + "€ is" + euro*1.11 + "USD.");
 }
 else {          
 System.out.println(" Please put in positive numbers of €");        
      }
   }
 break;

 case 3 : {
 System.out.println("Enter the number of £");        
 double pounds = sc.nextDouble();

  if(pounds>=0) {
          System.out.println(pounds + "pounds is" + pounds*1.31 + "USD");
  }
  else {
          System.out.println("Please put positive numbers of £");        
    }
 }
 break;

 case 4 : {
 System.out.println("Enter the number of USD");        
 double USD = sc.nextDouble();

  if(USD>=0) {
          System.out.println(USD + "USD" + USD* 55.99710 + "Php");
  }
  else {
          System.out.println("Please put positive numbers of USD");        
    }
 }
 break;
 }
 sc.close();
        }
}