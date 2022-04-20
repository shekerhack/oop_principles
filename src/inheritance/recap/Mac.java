package inheritance.recap;

public class Mac extends Computer {

    public Mac(String versionOS, String key, String cpuName, String motherBoard, double memory) {
        super(versionOS, key, cpuName, motherBoard, memory);
    }

    public Mac(String versionOS, String key, String cpuName, String motherBoard, double memory,
               boolean hasKeyboard, boolean hasScreen, boolean hasGarbageMagicMouse) {
        super(versionOS, key, cpuName, motherBoard, memory, hasKeyboard, hasScreen);
        this.hasGarbageMagicMouse = hasGarbageMagicMouse;
    }

    // variables
    public static final boolean hasIcloud = true;
    public static final boolean hasItunes = true;
    public boolean hasGarbageMagicMouse;

    //methods
    public static void getsSlowerWithEveryUpdate() {
        System.out.println("Mac is getting slower!");
    }


    public static void boot() {
        System.out.println("Mac is getting started!");
    }

    public static void shutDown() {
        System.out.println("Mac is getting shut down!");
    }

    public static void runProgram(String programName) {
        System.out.println("Mac is running " + programName + "!");
    }

    @Override
    public String getKey(){
        return super.getKey();
    }

    @Override
    public String toString() {
        return "Mac{" +
                "versionOS='" + versionOS + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", hasScreen=" + hasScreen +
                ", hasKeyboard=" + hasKeyboard +
                ", memory=" + memory +
                ", hasGarbageMagicMouse=" + hasGarbageMagicMouse +
                '}';
    }
}
