package CoreConcept;

import java.io.*;

public class SpecialModifiers  implements Serializable{
    transient String password="Hello Google-Android";
    int id=2027;
    public static void main(String[] args) throws Exception  {
        SpecialModifiers mod= new SpecialModifiers();
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("myText.txt"));
        stream.writeObject(mod);
        stream.close();

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("myText.txt"));
        mod = (SpecialModifiers) input.readObject();
        input.close();
        System.out.println(mod.id);
        System.out.println(mod.password);
    }
}
