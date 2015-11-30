import java.io.*;
class restaurant
{
    public static void main()throws IOException
    {
        
        int back,c,c1,c2,c3,t1,t2,t3,em=0,flag=0,bn,price,pc,pc1,ph1=0,ph2=0; // c:choice c1:choice1 c2:choice2 t1:tablechoice1 em:empty table bn:booking number pc party hall choice ph1 party hall 
        int pc2,pc3,pc4,php;//party hall vairiables
        int credc;
        int table2[]= new int[10];
        int table4[]= new int[15];
        int table8[]= new int[5];
        int sc[]= {99,79,69,350,150,249,69,89,199};//sc:south indian cuisine
        int nc[]= {59,59,59,199,259,239,259};//nc:north indian cuisine
        int me[]= {350,299,350,350,320,199,299};//me:middle eastern cuisine
        int fr[]= {350,299,259,350,499,299,379,299};//fr:french cuisine
        int ci[]= {299,259,199,399,299,199,399,499};//ci:chinese cuisine
        int it[]= {299,259,199,399,299,199,399,499};//it:italian cuisine 
        price=0;
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        
        
        menu_loop:
        while(true)
        {
            System.out.println();
            System.out.println();
            System.out.println("\t \t \t Welcome To The Restaurant! :) ");
            System.out.println();
            System.out.println();
            System.out.println("1.Check out the Awesome new menu");
            System.out.println("2.Book a Table");
            System.out.println("3.Book Party Hall");
            System.out.println("4.Cancel Booking");
            System.out.println("5.Credits");
            System.out.println("6.Exit");
            System.out.println("enter the option no of your choice");
            c= Integer.parseInt(ob.readLine());
            switch(c)
            {
                case 1:
                    cuisine_loop:
                    while(true)
                    {
                        System.out.println();
                        System.out.println();
                        System.out.println("\t \t \t Choose A Cuisine Or to return to Restaurant Menu enter 0");
                        System.out.println("");
                        System.out.println("total bill=Rs."+price);
                        System.out.println("");
                        System.out.println("1.Indian(South)");
                        System.out.println("2.Indian(North)");
                        System.out.println("3.Middle Eastern");
                        System.out.println("4.French");
                        System.out.println("5.Chinese");
                        System.out.println("6.Italian");
                        System.out.println("Or press 0 for Restaurant menu");
                        c1= Integer.parseInt(ob.readLine());
                        switch(c1)
                        {
                            case 0:
                            continue menu_loop;
                            case 1:
                                System.out.println("\t The South Indian menu is:");
                                System.out.println("");
                                System.out.println("0. Masala Dosa \t  ▬Rs.99");
                                System.out.println("1. Plain Dosa \t ▬Rs.79");
                                System.out.println("2. Idli Vada \t ▬Rs.69");
                                System.out.println("3. South Adventure Meals \t ▬Rs.350");
                                System.out.println("4. Mango Rice \t ▬Rs.150");
                                System.out.println("5. Mini Meals \t ▬Rs.249");
                                System.out.println("6. Ragi Mudhe \t ▬Rs.69");
                                System.out.println("7. Puri With Curry \t ▬Rs.89");
                                System.out.println("8. Assorted South Deserts \t ▬Rs.199");
                                System.out.println("To order press 1");
                                System.out.println("To go back to cuisine menu press 0 ");
                                c2=Integer.parseInt(ob.readLine());
                                if(c2==0)
                                continue cuisine_loop;
                                else if(c2==1)
                                {
                                    System.out.println("Enter dish no(one by one)");
                                    System.out.println("To check price press 9(TWICE)");
                                    for(int k=0;k<1;)
                                    {
                                        c3=Integer.parseInt(ob.readLine());
                                        
                                        if(c3==9)
                                        {
                                            break;
                                        }
                                        else if(c3<9)
                                        {
                                            price=price+sc[c3];
                                            
                                            c3=Integer.parseInt(ob.readLine());
                                        }
                                        else
                                        {
                                            System.out.println("invalid entry");
                                        }
                                        
                                    }
                                    System.out.println("current total price Rs."+price);
                                    continue cuisine_loop;
                                }
                                else
                                System.out.println("Invalid entry");continue cuisine_loop;
                                
                            case 2:
                                System.out.println("\t The North Indian menu is:");
                                System.out.println("");
                                System.out.println("0. Roti \t ▬Rs.59");
                                System.out.println("1. Naan \t ▬Rs.59");
                                System.out.println("2. Kulcha \t ▬Rs.59");
                                System.out.println("3. Dal \t ▬Rs.199");
                                System.out.println("5. Panner butter masala \t ▬Rs.259");
                                System.out.println("6. Palak Paneer \t ▬Rs.239");
                                System.out.println("7. Channa Masala \t ▬Rs.259");
                                System.out.println("To order press 1");
                                System.out.println("To go back to cuisine menu press 0 ");
                                c2=Integer.parseInt(ob.readLine());
                                if(c2==0)
                                continue cuisine_loop;
                                else if(c2==1)
                                {
                                    System.out.println("Enter dish no(one by one)");
                                    System.out.println("To check price and return to cuisine menu press 8");
                                    for(int k=0;k<1;)
                                    {
                                        c3=Integer.parseInt(ob.readLine());
                                        
                                        if(c3==8)
                                        {
                                            break;
                                        }
                                        else if(c3<8)
                                        {
                                            price=price+nc[c3];
                                            c3=Integer.parseInt(ob.readLine());
                                        }
                                        else
                                        {
                                            System.out.println("invalid entry");
                                        }
                                        
                                    }
                                    System.out.println("\t Current total price Rs."+price);
                                    continue cuisine_loop;
                                }
                                else
                                System.out.println("Invalid entry");continue cuisine_loop;
                               
                            case 3:
                                System.out.println("\t The Middle Eastern menu is:");
                                System.out.println("");
                                System.out.println("0. Hummus \t ▬Rs.350");
                                System.out.println("1. Falafel \t ▬Rs.299");
                                System.out.println("2. Baklava \t ▬Rs.350");
                                System.out.println("3. Turkish Delight \t ▬Rs.350");
                                System.out.println("4. Foul Mudammes \t ▬Rs.320");
                                System.out.println("5. Pita Bread \t ▬Rs.199");
                                System.out.println("6. Foul Mudammes(boiled fava beans with spices) \t ▬Rs.299");
                                System.out.println("To order press 1");
                                System.out.println("To go back to cuisine menu press 0 ");
                                c2=Integer.parseInt(ob.readLine());
                                if(c2==0)
                                continue cuisine_loop;
                                else if(c2==1)
                                {
                                    System.out.println("Enter dish no(one by one)");
                                    System.out.println("To check price press 7(TWICE)");
                                    for(int k=0;k<1;)
                                    {
                                        c3=Integer.parseInt(ob.readLine());
                                        
                                        if(c3==7)
                                        {
                                            break;
                                        }
                                        else if(c3<7)
                                        {
                                            price=price+me[c3];
                                            c3=Integer.parseInt(ob.readLine());
                                        }
                                        else
                                        {
                                            System.out.println("invalid entry");
                                        }
                                        
                                    }
                                    System.out.println("\t Current total price Rs."+price);
                                    continue cuisine_loop;
                                }
                                else
                                System.out.println("Invalid entry");continue cuisine_loop;
                                
                            case 4:
                                System.out.println("\t The French menu is:");
                                System.out.println("");
                                System.out.println("0. Soupe à l'oignon \t ▬Rs.350");
                                System.out.println("1. Boeuf bourguignon \t ▬Rs.299");
                                System.out.println("2. Chocolate souffle \t ▬Rs.259");
                                System.out.println("3. Flamiche \t ▬Rs.350");
                                System.out.println("4. Confit de canard \t ▬Rs.499");
                                System.out.println("5. Tarte tatin \t ▬Rs.299");
                                System.out.println("6. Ratatouille \t ▬Rs.379");
                                System.out.println("7. Fougasse \t ▬Rs.299");
                                System.out.println("To order press 1");
                                System.out.println("To go back to cuisine menu press 0 ");
                                c2=Integer.parseInt(ob.readLine());
                                if(c2==0)
                                continue cuisine_loop;
                                else if(c2==1)
                                {
                                    System.out.println("Enter dish no(one by one)");
                                    System.out.println("To check price and return to cuisine menu press 8");
                                    for(int k=0;k<1;)
                                    {
                                        c3=Integer.parseInt(ob.readLine());
                                        
                                        if(c3==8)
                                        {
                                            break;
                                        }
                                        else if(c3<8)
                                        {
                                            price=price+fr[c3];
                                            c3=Integer.parseInt(ob.readLine());
                                        }
                                        else
                                        {
                                            System.out.println("invalid entry");
                                        }
                                        
                                    }
                                    System.out.println("\t Current total price Rs."+price);
                                    continue cuisine_loop;
                                }
                                else
                                System.out.println("Invalid entry");continue cuisine_loop;
                                
                            case 5:
                                System.out.println("\t The Chinese menu is:");
                                System.out.println("");
                                System.out.println("0. Chow Mein \t ▬Rs.299");
                                System.out.println("1. Chicken Fried Rice \t ▬Rs.259");
                                System.out.println("2. Fried Rice \t ▬Rs.199");
                                System.out.println("3. Sweet and Sour Pork  \t ▬Rs.399");
                                System.out.println("4. Peking Duck \t ▬Rs.299");
                                System.out.println("5. Wonton Soup \t ▬Rs.199");
                                System.out.println("6. Fun Fusion Fondue \t ▬Rs.399");
                                System.out.println("7. Kung Pao Chicken (Stir-fry) \t ▬Rs.499");
                                 System.out.println("To go back to cuisine menu press 0 ");
                                c2=Integer.parseInt(ob.readLine());
                                if(c2==0)
                                continue cuisine_loop;
                                 else if(c2==1)
                                {
                                    System.out.println("Enter dish no(one by one)");
                                    System.out.println("To check price and return to cuisine menu press 8");
                                    for(int k=0;k<1;)
                                    {
                                        c3=Integer.parseInt(ob.readLine());
                                        
                                        if(c3==8)
                                        {
                                            break;
                                        }
                                        else if(c3<8)
                                        {
                                            price=price+ci[c3];
                                            c3=Integer.parseInt(ob.readLine());
                                        }
                                        else
                                        {
                                            System.out.println("invalid entry");
                                        }
                                        
                                    }
                                    System.out.println("\t Current total price Rs."+price);
                                    continue cuisine_loop;
                                }
                                else
                                System.out.println("Invalid entry");continue cuisine_loop;
                                
                            case 6:
                                System.out.println("\t The Italian menu is:");
                                System.out.println("");
                                System.out.println("0. Chicken parmigiana  \t ▬Rs.259");
                                System.out.println("1. Lasagna \t ▬Rs.399");
                                System.out.println("2. Linguine with clam sauce \t ▬Rs.399");
                                System.out.println("3. Spaghetti with tomato sauce \t ▬Rs.299");
                                System.out.println("4. Penne alla vodka \t ▬Rs.599");
                                System.out.println("5. Shrimp fra diavolo \t ▬Rs.499");
                                System.out.println("6. Pasta primavera \t ▬Rs.399");
                                System.out.println("7. Veal marsala \t ▬Rs.399");
                                System.out.println("To go back to cuisine menu press 0 ");
                                c2=Integer.parseInt(ob.readLine());
                                if(c2==0)
                                continue cuisine_loop;
                                 else if(c2==1)
                                {
                                    System.out.println("Enter dish no(one by one)");
                                    System.out.println("To check price and return to cuisine menu press 8");
                                    for(int k=0;k<1;)
                                    {
                                        c3=Integer.parseInt(ob.readLine());
                                        
                                        if(c3==8)
                                        {
                                            break;
                                        }
                                        else if(c3<8)
                                        {
                                            price=price+it[c3];
                                            c3=Integer.parseInt(ob.readLine());
                                        }
                                        else
                                        {
                                            System.out.println("invalid entry");
                                        }
                                        
                                    }
                                    System.out.println("\t Current total price Rs."+price);
                                    continue cuisine_loop;
                                }
                                else
                                System.out.println("Invalid entry");continue cuisine_loop;
                            
                            default:
                                System.out.println("Invalid Entry!! PLEASE Re-enter correctly");
                                continue cuisine_loop;
                        }
                        
                        
                    }
                   
                case 2:
                    table_loop:
                    while(true)
                    {
                        System.out.println();
                        System.out.println();
                        System.out.println("\t \t \t Tables for 2,4,8 exist which would u like:");
                        
                        System.out.println("To exit to Restaurant Menu press 1");
                        System.out.println("");
                        System.out.println("");
                        t1= Integer.parseInt(ob.readLine());
                        if(t1==1)
                        {
                            continue menu_loop;
                        }
                        else if(t1==2)
                        {
                            for(int j=0;j<10;j++)
                            {
                                if(table2[j]==0)
                                {
                                    flag=1;
                                    em=j;
                                    break;
                                }
                            }
                            if(flag==1)
                            {
                                System.out.println("Available!!! :) :D :)");
                                System.out.println("");
                                System.out.println("If you want to book that table press 1 ");
                                System.out.println("to go to table menu press 2");
                                System.out.println(" to go back to restaurant menu press 0 ");
                                t2=Integer.parseInt(ob.readLine());
                                flag=0;
                                if(t2==1)
                                {
                                    table2[em]=1; //1 means booked 0 means empty
                                    System.out.println("Your Table for 2 is booked!! :) Enjoy Your meal Your booking num is: "+em);
                                    continue menu_loop;
                                }
                                if(t2==2)
                                {
                                    continue table_loop;
                                }
                                if(t2==0)
                                {
                                    continue menu_loop;
                                }
                                flag=0;
                            }
                         
                            else
                            {
                                System.out.println("Table for 2 not Available");
                                continue menu_loop;
                            }
                        }
                        else if(t1==4)
                        {
                            for(int j=0;j<15;j++)
                            {
                                if(table4[j]==0)
                                {
                                    flag=1;
                                    em=j;
                                    break;
                                }
                            }
                            if(flag==1)
                            {
                                System.out.println("Available!!! :) :D :)");
                                System.out.println("");
                                System.out.println("If you want to book that table press 1 ");
                                System.out.println("to go to table menu press 2");
                                System.out.println(" to go back to restaurant menu press 0 ");
                                t2=Integer.parseInt(ob.readLine());
                                flag=0;
                                if(t2==1)
                                {
                                    table4[em]=1; //1 means booked 0 means empty
                                    System.out.println("Your Table for 4 is booked!! :) Enjoy Your meal Your booking num is: "+(em+11));
                                    continue menu_loop;
                                }
                                if(t2==2)
                                {
                                    continue table_loop;
                                }
                                if(t2==0)
                                {
                                    continue menu_loop;
                                }
                                flag=0;
                            }
                         
                            else
                            {
                                System.out.println("Table for 4 not Available");
                                continue menu_loop;
                            }
                        }
                        else if(t1==8)
                        {
                            for(int j=0;j<5;j++)
                            {
                                if(table8[j]==0)
                                {
                                    flag=1;
                                    em=j;
                                    break;
                                }
                            }
                            if(flag==1)
                            {
                                System.out.println("Available!!! :) :D :)");
                                System.out.println("");
                                System.out.println("If you want to book that table press 1 ");
                                System.out.println("to go to table menu press 2");
                                System.out.println(" to go back to restaurant menu press 0 ");
                                t2=Integer.parseInt(ob.readLine());
                                flag=0;
                                if(t2==1)
                                {
                                    table8[em]=1; //1 means booked 0 means empty
                                    System.out.println("Your Table for 8 is booked!! :) Enjoy Your meal Your booking num is: "+(em+27));
                                    continue menu_loop;
                                }
                                if(t2==2)
                                {
                                    continue table_loop;
                                }
                                if(t2==0)
                                {
                                    continue menu_loop;
                                }
                                flag=0;
                            }
                         
                            else
                            {
                                System.out.println("Table not Available");
                                continue menu_loop;
                            }
                        }
                        else
                        {
                            System.out.println("Invalid entry");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println();
                    System.out.println("\t \t \t Welcome to Party Hall Booking");
                    System.out.println();
                    System.out.println();
                    System.out.println("1.To Book");
                    System.out.println("2.Main menu");
                    pc=Integer.parseInt(ob.readLine());
                    if(pc==1)
                    {
                        System.out.println("To book press 1(We have 2 party halls!!)");
                        System.out.println("To exit to Main menu press 0");
                        pc1=Integer.parseInt(ob.readLine());
                        if(pc1==1)
                        {
                            if(ph1==0)//not booked
                            {
                                ph1=1;
                                System.out.println("BOOKED");
                                System.out.println("Your booking no is - 101");
                            }
                            else if(ph2==0)//not booked
                            {
                                ph2=1;
                                System.out.println("BOOKED");
                                System.out.println("Your booking no is - 102");
                            }
                            else
                            {
                                System.out.print("Sorry were all booked for now try booking a table");
                                continue menu_loop;
                            }
                            System.out.println("If you want a buffet to be prepared press 1(Rs 650 per head)");
                            System.out.println("Else press 0 to return to main menu");
                            pc2=Integer.parseInt(ob.readLine());
                            if(pc2==1)
                            {
                                System.out.println("Enter No of People");
                                php=Integer.parseInt(ob.readLine());
                                System.out.println("Your bill is Rs "+(650*php));
                                continue menu_loop;
                            }
                            if(pc2==0)
                            {
                                continue menu_loop;
                            }
                            else
                            {
                                System.out.println("INVALID ENTRY Try Again");
                                continue menu_loop;
                            }
                        }
                    }
                    else if(pc==2)
                    {
                        continue menu_loop;
                    }
                    
                    else
                    {
                        System.out.println("INVALID ENTRY Please Try Again");
                        continue menu_loop;
                    }
                    
                
                
                case 4:
                    System.out.println();
                    System.out.println();
                    System.out.println("\t \t \t Cancel booking : ");
                    System.out.println();
                    System.out.println();
                    System.out.println("To cancel booking press 1");
                    System.out.println("To return to Restaurant menu press 0");
                    System.out.println();
                    t3=Integer.parseInt(ob.readLine());
                    if(t3==1)
                    {
                        System.out.println("Please enter booking number:");
                        bn=Integer.parseInt(ob.readLine());
                        if(bn<11)
                        {
                           if(table2[bn]==1)
                           {
                                table2[bn]=0;
                                System.out.println("Your booking has been canceled");
                                continue menu_loop;
                           }
                           else
                           {
                               System.out.println("booking no does not exist try again");
                               continue menu_loop;
                           }
                        }
                        else if(bn<27)
                        {
                            if(table4[bn]==1)
                            {
                                table4[bn-11]=0;
                                System.out.println("Your booking has been canceled");
                                continue menu_loop;
                            }
                            else
                            {
                               System.out.println("booking no does not exist try again");
                               continue menu_loop;
                            }
                        }
                        else if(bn<33)
                        {
                            if(table8[bn-27]==1)
                            {
                                table8[bn-27]=0;
                                System.out.println("Your booking has been canceled");
                                continue menu_loop;
                            }
                            else
                            {
                               System.out.println("booking no does not exist try again");
                               continue menu_loop;
                            }
                        }
                        else if(bn==101||bn==102)
                        {
                            if(bn==101)
                                {
                                    if(ph1==0)
                                    {
                                        System.out.println("ERROR Party Hall not booked TRY AGAIN");
                                        continue menu_loop;
                                    }
                                    else
                                    {
                                        ph1=0;
                                        System.out.println("Booking cancelled!");
                                        continue menu_loop;
                                    }
                                        
                                }
                                else if(bn==102)
                                {
                                    if(ph2==0)
                                    {
                                        System.out.println("ERROR Party Hall not booked TRY AGAIN");
                                        continue menu_loop;
                                    }
                                    else
                                    {
                                        ph2=0;
                                        System.out.println("Booking cancelled!");
                                        continue menu_loop;
                                    }
                                        
                                }
                        }
                        else
                        {
                            System.out.println("Invalid Entry! Please Retry");
                            continue menu_loop;
                        }
                    }
                    
                    else if(t3==0)
                    {
                        continue menu_loop;
                    }
                    
                    else
                    {
                        System.out.println("Invalid Entry! Please Retry");
                        continue menu_loop; 
                    }
                case 5:
                    System.out.println();
                    System.out.println();
                    System.out.println("This programme is made for the QUARTZ RoYale©");
                    System.out.println();
                    System.out.println("MADE BY- Sushant Rao,Pranav C Kumar and Pratheek Sadananda ");
                    System.out.println("To return to main menu press any key");
                    credc=Integer.parseInt(ob.readLine());
                    if(credc==1)
                    {continue menu_loop;
                    }
                    else
                    {continue menu_loop;}
                case 6:
                    System.exit(0); 
                default:
                    System.out.println("Invalid Entry!! PLEASE Re-enter correctly");
                    continue menu_loop;
                }
            break;
        }    
    }
}
