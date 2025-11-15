import java.util.Scanner;
     public class Nokia{
     public static void main(String[]args){

       
         Scanner input = new Scanner(System.in);     
          System.out.print("""
         
         ........Menu......
          1. Phonebook
          2. Messages
          3. Chats
          4. Call Register
          5. Tones
          6. Settings
          7. Call divert
          8. Games
          9. Calculator
         10. Reminders
         11. Clock
         12. Profiles
         13. SIM services3

""");

          System.out.print("Select from the options avaliable: ");
          int menu = input.nextInt();

          switch (menu){ 
          case 1-> {
                  System.out.print("""
          ........Phonebook.........
               1. Search
               2. Service Nos. 
               3. Add name
               4. Erase
               5. Edit
               6. Assign tone
               7. Send b’card
               8. Options
               9. Speed dials
              10. Voice tags
           Select from the options avaliable:
 """);
                             
               int phonebook = input.nextInt();
               switch(phonebook){
               case 8-> System.out.print("""
                     ........options........
                         1. Type of view
                         2. Memory status\n """);                             
                             } 
                         }
          case 2-> {
                    System.out.print("""
           ........Messages..........
                         
           1. Write messages
           2. Inbox
           3. Outbox
           4. Picture messages
           5. Templates
           6. Smileysz
           7. Message settings
           8. Info service
           9. Voice mailbox number
          10.Service command editor
       Select from the options avaliable: """);
          

               int messages =input.nextInt();
               switch(messages){
               case 7->{ 
                          System.out.print("""
                ..........Messages settings........         
                           1. Set 12
                           2. Common 
             Select from the options avaliable:    """);


                            int messageSet = input.nextInt();
                            switch (messageSet){
                              case 1->System.out.println("""
                                       1. Message centre number
                                       2. Messages sent as
                                       3. Message validity  """);
                              case 2-> System.out.print("""
                                           1. Delivery reports
                                           2. Reply via same centre
                                           3. Character support



""");
                              
                                 }
                              }
                         }                   
                     }

                       


                    



               }

     }

}



