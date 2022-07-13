package Lesson12;

public class Queue {
    char q[];
    int putLoc, getLoc;
    Queue (int size) {
        q= new char [size+1];
        putLoc = getLoc = 0;
    }
    void put(char ch) {
        if (putLoc == q.length - 1) {
            System.out.println(" - the q is full");
            return;
        }
        putLoc++;
        q[putLoc] = ch;
    }
        char get() {
            if (getLoc==putLoc) {
                System.out.println(" - the q is full");
                return(char) 0;
            }
            getLoc++;
            return q[getLoc];
        }
    }

