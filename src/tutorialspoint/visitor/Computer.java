package tutorialspoint.visitor;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart {
    List <ComputerPart> parts = new ArrayList<>();

    public Computer(){
        parts.add(new Mouse());
        parts.add(new Keyboard());
        parts.add(new Monitor());
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
    }
}
