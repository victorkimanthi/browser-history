package org.example;

import java.util.LinkedList;

public class BrowserHistory {

        private LinkedList<String> history;
        private int currentIndex;

        public BrowserHistory(String homepage) {
            history = new LinkedList<>();
            history.add(homepage);
            currentIndex = 0;
        }

        public void visit(String url) {
            // Clear forward history
            while (history.size() > currentIndex + 1) {
                history.removeLast();
            }

            System.out.println("You are currently in " + history.get(currentIndex)+". "+ "Visit " + url );
            // Add new url to history
            history.add(url);
            currentIndex++;
        }
        public String back(int steps) {
            int initialCurrentIndex = currentIndex;
            if((currentIndex - steps) < 0){
                System.out.println("You are in "+ history.get(currentIndex) + ".You can only move " + currentIndex + " step(s) back to 'example.com'.");
                return "blank";
            } else {
                currentIndex = currentIndex - steps;
                return "You are in " + history.get(initialCurrentIndex)+ ".Move back to "+history.get(currentIndex);
            }
        }
        public String forward(int steps) {
            int initialCurrentIndex = currentIndex;
            int size = history.size();

            if(( steps > (size-1)-currentIndex)){
                System.out.println("You are in "+ history.get(currentIndex) + ".You can not move those number of steps forward.");
                return history.get(size-1);
            }else {
//            currentIndex = Math.min(currentIndex + steps, size - 1);
                currentIndex = currentIndex + steps;
                return "You are in " + history.get(initialCurrentIndex) + ".Move forward to "+ history.get(currentIndex);
            }
        }
    }
