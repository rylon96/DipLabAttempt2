package dip.lab3.student.solution1;

import java.util.Scanner;

public class KeyboardInput implements MessageInput {

    @Override
    public String inputMessage() {
            System.out.println("Entered text will be copied to output:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
	}
}
