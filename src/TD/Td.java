package TD;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Td {
    private static final List<String> todos=new ArrayList<>();
    private static final Scanner scan=new Scanner(System.in);

    public static void addTask(){
        System.out.print(Colors.AURORA.c()+ "Enter your task description: "+ Colors.RESET.c());
        String task=scan.nextLine();
        todos.add(task);
        System.out.println(Colors.SILVER.c()+"Successfully added"+Colors.RESET.c());
    }

    public static void removeByTask(){
        System.out.print(Colors.CORAL.c()+"Enter your full task name to remove: "+Colors.RESET.c());
        String removeTask=scan.nextLine();
        if(todos.contains(removeTask)){
        todos.remove(removeTask);
        }
        else {
            System.err.println("Come one mate, you are doing it wrong at smthwhere");
        }
    }

    public static void removeById(){
        System.out.println("Enter index number starting from 0: ");
        int index= scan.nextInt();
        if(index<= todos.size()-1) {
            todos.remove(index);
        }
        else {
            System.err.println("Error");
        }
    }

    public static void edit(){
        System.out.println("Enter index number to change: ");
        int index= scan.nextInt();
        scan.nextLine();
        if(index<= todos.size()-1){
            System.out.println("You can change that task:");
            System.out.print("Enter a new one: ");
            String edited= scan.nextLine();
            todos.set(index,edited+"------ edited");
        }
    }

    public static void viewAllTask(){
        System.out.println(Colors.SKY.c()+todos+Colors.RESET.c());
    }

    public static void main(String[] args) {
        String[] art = {
                "                        #############################                        ",
                "                   #########                     #########                   ",
                "               #######                                 #######               ",
                "            #####                                           #####            ",
                "         ####                                                   ####         ",
                "       ###              ########      ########                   ###        ",
                "     ###              ###      ###  ###      ###                  ###       ",
                "    ##              ###         ####         ###                    ##      ",
                "   ##              ###     ###########     ###                     ##       ",
                "  ##              ###   ####         ####   ###                   ##        ",
                " ##              ###  ####             ####  ###                 ##         ",
                " ##             ###  ###                 ###  ###                ##         ",
                "##             ###  ###                   ###  ###              ##          ",
                "##             ### ###      ########      ### ###              ##           ",
                "##             ### ###    ###      ###    ### ###              ##           ",
                "##             ### ###    ###      ###    ### ###              ##           ",
                "##             ###  ###    ###    ###    ###  ###              ##           ",
                " ##             ###  ####    ######    ####  ###              ##            ",
                "  ##             ###   ####          ####   ###              ##             ",
                "   ###             ###     ##########     ###              ###              ",
                "     ###             ####              ####              ###                ",
                "       ####             ####        ####             ####                   ",
                "          ####             ##########             ####                      ",
                "             ######                         ######                          ",
                "                 #########             #########                             ",
                "                        #####################                                 ",
                "                   #########         #########                                 ",
                "               #######                 #######                                 ",
                "            #####                         #####                                ",
                "         ####                               ####                               ",
                "       ###         #####################       ###                              ",
                "     ###         ###                   ###       ###                            ",
                "    ##         ###                       ###      ##                            ",
                "   ##         ###     ####       ####     ###      ##                           ",
                "  ##         ###    ###  ###   ###  ###    ###     ##                           ",
                " ##         ###    ###    ### ###    ###    ###    ##                           ",
                " ##        ###     ###     #####     ###     ###   ##                           ",
                "##        ###       ###               ###      ###  ##                           ",
                "##        ###         ###           ###         ### ##                           ",
                "##        ###           ###       ###           ### ##                           ",
                "##        ###             ###   ###             ### ##                           ",
                " ##       ###               #####               ### ##                           ",
                "  ##       ###                                 ### ##                           ",
                "   ###      ###                             ###   ###                           ",
                "     ###      ####                       ####      ###                          ",
                "       ####      ######             ######      ####                            ",
                "          ####        #################       ####                              ",
                "             #########               #########                                  "
        };


        Colors[] colors = Colors.values();
        int k = 0;

        for (String line : art) {
            StringBuilder sb = new StringBuilder();
            for (char ch : line.toCharArray()) {
                if (colors[k] == Colors.RESET) k++;
                sb.append(colors[k].c()).append(ch);
                k = (k + 1) % (colors.length - 1);
            }
            System.out.println(sb.toString() + Colors.RESET.c());

    }
        System.out.println("\n");
        boolean continueProcess=true;
        System.out.println(Colors.PACIFIC_BLUE.c()+"!!!!! Welcome to TDS !!!"+Colors.RESET.c());
        Scanner scan=new Scanner(System.in);
        AudioInputStream inputStream;
        Clip clip;
        try {
            inputStream= AudioSystem.getAudioInputStream(new File("src/TD/sounds/start.wav"));
            clip=AudioSystem.getClip();
            clip.open(inputStream);
            clip.start();
            Thread.sleep(10000);
            clip.stop();

            while(continueProcess) {
                System.out.println(Colors.AURORA.c()+
                        "1. Add task"+Colors.RESET.c()+"\n"+Colors.SKY.c()+
                        "2. View All Task " + Colors.RESET.c()+"\n"+Colors.CORAL.c()+
                        "3. Remove by task name " +Colors.RESET.c()+"\n"+Colors.ORANGE.c()+
                        "4. Remove By ID "+Colors.RESET.c()+"\n"+Colors.TEAL.c()+
                        "5. Edit"+Colors.RESET.c()+"\n"+
                        "6.Exit");
                System.out.print(Colors.MINT.c()+"Enter you choice: ");
                int choice = scan.nextShort();
                switch (choice) {
                    case 1:
                        inputStream= AudioSystem.getAudioInputStream(new File("src/TD/sounds/add.wav"));
                        clip=AudioSystem.getClip();
                        clip.open(inputStream);
                        clip.start();
                        Thread.sleep(2000);
                        addTask();
                        break;
                    case 2:
                        System.out.println("Searching.....");
                        inputStream= AudioSystem.getAudioInputStream(new File("src/TD/sounds/viewAll.wav"));
                        clip=AudioSystem.getClip();
                        clip.open(inputStream);
                        clip.start();
                        Thread.sleep(5000);
                        viewAllTask();
                        break;
                    case 3:
                        removeByTask();
                        inputStream= AudioSystem.getAudioInputStream(new File("src/TD/sounds/delTask.wav"));
                        clip=AudioSystem.getClip();
                        clip.open(inputStream);
                        clip.start();
                        Thread.sleep(5000);
                        System.out.println(Colors.PACIFIC_BLUE.c()+"Deleted....Woaah");
                        break;
                    case 4:
                        removeById();
                        break;
                    case 5:
                        edit();
                        break;
                    case 6:
                        System.out.println("BYE BYEEEE");
                        continueProcess = false;
                        break;

                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
