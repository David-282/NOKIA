import java.util.Scanner;

public class NokiaComplete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.println("""
         
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
          0. Exit
          """);

            System.out.print("Select from the options available: ");
            int menu = input.nextInt();

            if (menu == 0) {
                System.out.println("Good Bye, Thank you for using Nokia...");
                break;
            }

            switch (menu) {
                case 1 -> { 
                    while (true) {
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
               0. Back
           Select from the options available:  """);
                        int phonebook = input.nextInt();
                        if (phonebook == 0) break;

                        switch (phonebook) {
                            case 8 -> { 
                                while (true) {
                                    System.out.print("""
                     ........options........
                         1. Type of view
                         2. Memory status
                         0. Back
                     Select from the options available: """);
                                    int option = input.nextInt();
                                    if (option == 0) break;
                                }
     }
                                       }
                    }
                
}
                case 2 -> { 
                    while (true) {
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
          10. Service command editor
           0. Back
       Select from the options available: """);

                        int messages = input.nextInt();
                        if (messages == 0) break;

                        switch (messages) {
                            case 7 -> { 
                                while (true) {
                                    System.out.print("""
                ..........Messages settings........         
                           1. Set 12
                           2. Common
                           0. Back
             Select from the options available: """);
                                    int messageSet = input.nextInt();
                                    if (messageSet == 0) break;

                                    switch (messageSet) {
                                        case 1 -> System.out.println("""
                                       1. Message centre number
                                       2. Messages sent as
                                       3. Message validity
                                       0. Back
                                       """);
                                        case 2 -> System.out.println("""
                                           1. Delivery reports
                                           2. Reply via same centre
                                           3. Character support
                                           0. Back
                                           """);
                                    }
}
                            }

                                            }
     }
                }
                case 4 -> { 
                    while (true) {
                        System.out.print("""
               .......Call Register......
                    1. Missed calls
                    2. Received calls
                    3. Dialled numbers
                    4. Erase recent call lists
                    5. Show call duration 
                    6. Show call costs
                    7. Call cost settings
                    8. Prepaid credit
                    0. Back
              Select from the options available:    """);
                        int callRegister = input.nextInt();
                        if (callRegister == 0) break;

                        switch (callRegister) {
                            case 5 -> { 
                                while (true) {
                                    System.out.print("""
                         ........Show call duration.......
                              1. Last call duration
                              2. All calls’ duration
                              3. Received calls’ duration
                              4. Dialled calls’ duration
                              5. Clear timers
                              0. Back
                         Select from the options available: """);
                                    int duration = input.nextInt();
                                    if (duration == 0) break;
                                             }
                            }
                            case 6 -> { 
                                while (true) {
                                    System.out.print("""
                        ........Show call costs........
                              1. Last call cost
                              2. All calls’ cost
                              3. Clear counters
                              0. Back
                        Select from the options available: """);
                                    int cost = input.nextInt();
                                    if (cost == 0) break;
                                              }
                            }
                            case 7 -> { 
                                while (true) {
                                    System.out.print("""
                           ........ Call cost settings......
                              1. Call cost limit
                              2. Show costs in
                              0. Back
                        Select from the options available: """);
                                    int setting = input.nextInt();
                                    if (setting == 0) break;
                                             }
                            }
                                        }
          }
}
                case 5 -> {
                    while (true) {
                        System.out.print("""
                   ......Tones.....
                    1. Ringing tone
                    2. Ringing volume
                    3. Incoming call alert
                    4. Composer
                    5. Message alert tone
                    6. Keypad tones
                    7. Warning and game tones
                    8. Vibrating alert
                    9. Screen saver
                    0. Back
           Select from the options available: """);
                        int tones = input.nextInt();
                        if (tones == 0) break;
                    }
                }
                case 6 -> { 
                    while (true) {
                        System.out.print("""
               ........Settings.......
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings
                    0. Back
                  Select from the options available:   """);

                        int settings = input.nextInt();
                        if (settings == 0) break;

                        switch (settings) {
                            case 1 -> { 
                                while (true) {
                                    System.out.print("""
                          .....Call Settings.....
                         1. Automatic redial
                         2. Speed dialling
                         3. Call waiting options
                         4. Own number sending
                         5. Phone line in use
                         6. Automatic answer
                         0. Back
                         Select from the options available: """);
                                    int callSettings = input.nextInt();
                                    if (callSettings == 0) break;
                                }
                            }
                            case 2 -> { 
                                while (true) {
                                    System.out.print("""
                          .......Phone Settings....
                         1. Language
                         2. Cell info display
                         3. Welcome note
                         4. Network selection
                         5. Lights2
                         6. Confirm SIM service actions
                         0. Back
                         Select from the options available: """);
                                    int phoneSettings = input.nextInt();
                                    if (phoneSettings == 0) break;
                                }
                            }
                            case 3 -> { 
                                while (true) {
                                    System.out.print("""
                            ......Security settings......
                          1. PIN code request
                          2. Call barring service
                          3. Fixed dialling
                          4. Closed user group
                          5. Phone security
                          6. Change access codes
                          0. Back
                          Select from the options available: """);
                                    int securitySettings = input.nextInt();
                                    if (securitySettings == 0) break;
                                }
                                              }
                        }
}         
                          }
                case 11 -> {
                    while (true) {
                        System.out.print("""
               .......Clock.....
               1. Alarm clock
               2. Clock settings
               3. Date setting
               4. Stopwatch
               5. Countdown timer
               6. Auto update of date and time
               0. Back
               Select from the options available: """);
                        int clock = input.nextInt();
                        if (clock == 0) break;
                         }
                }
                default -> System.out.println("Option not implemented. Press 0 to go back.");    }
        }
}
}

