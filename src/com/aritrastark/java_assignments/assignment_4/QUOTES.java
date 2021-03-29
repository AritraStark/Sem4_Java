//Create a class diagram and Java code for the following system and scenario, taking into account the possibility of
//        future extensions. "The system is a command line utility that prints a short 'quote of the day' on the user's terminal
//        when run. To begin with the quote is selected randomly from a set of hard-coded strings within the program itself,
//        but that might change later on -- the quotes might be based on the user's history, the time of day, the date, etc..

package com.aritrastark.java_assignments.assignment_4;

import java.util.Random;

public class QUOTES {
    private final String arr[] = {
            "Talk is cheap. Show me the code. - Linus Torvalds",
            "Microsoft isn't evil, they just make really crappy operating systems. - Linus Torvalds",
            "Shareware tends to combine the worst of commercial software with the worst of free software. - Linus Torvalds",
            "Intelligence is the ability to avoid doing work, yet getting the work done. - Linus Torvalds",
            "The cyberspace earnings I get from Linux come in the format of having a Network of people that know me and trust me, and that I can depend on in return. - Linus Torvalds",
            "That's what makes Linux so good: you put in something, and that effort multiplies. It's a positive feedback cycle. - Linus Torvalds",
    };

    public String generate(){
        Random random = new Random();
        int index = random.nextInt(arr.length);
        return arr[index];
    }
}
