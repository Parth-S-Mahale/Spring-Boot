package Core_Java.methods;
class Computer {
    public void playMusic() {
        System.out.println("Music Playing...");
    }

    public String getMePen(int cost) {
        if (cost >= 10)
            return "Pen";
        
        return "Nothing";
    }
}

public class methods {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMePen(19);
        System.out.println(str);
    }    
}
