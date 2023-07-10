package org.example;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

            public static void main(String[] args) {

                BrowserHistory browser = new BrowserHistory("https://www.example.com");
                LinkedList<String> browserActions = new LinkedList<>();

                while (true) {

                    System.out.println("Enter the action you want to perform among the following:");
                    System.out.println("BrowserHistory,visit,back,forward");
                    Scanner s = new Scanner(System.in);
                    String action = s.next();
                    browserActions.add(action);
                    System.out.println("browserActions:"+browserActions);

                    switch (action) {
                        case "BrowserHistory":
                            System.out.println("browser history");
                            break;

                        case "visit":
                            System.out.println("Enter the url of the site you want to visit.");
                            Scanner u = new Scanner(System.in);
                            String siteUrl = u.nextLine();
                            browser.visit(siteUrl);
                            break;

                        case "back":
                            System.out.println("Enter the  number of steps you want to move back.");
                            Scanner b = new Scanner(System.in);
                            int stepNoBack = b.nextInt();
                            System.out.println(browser.back(stepNoBack));
                            break;

                        case "forward":
                            System.out.println("Enter the  number of steps you want to move forward.");
                            Scanner f= new Scanner(System.in);
                            int stepNoForward = f.nextInt();
                            System.out.println(browser.forward(stepNoForward));
                            break;

                        default:
                            System.out.println("You did not enter any of the  the required actions.");
                            break;
                    }
                }
            }
        }

