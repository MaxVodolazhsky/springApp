package ru.vodolazhsky.spring;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){

    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Creat object");

        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Johann Sebastian Bach - Suite No.2 in B minor, BWV 1067 Badinerie";
    }

    public void initMethod() {
        System.out.println("Do my initialization");
    }

    public void destroyMethod() {
        System.out.println("Doing my distraction");
    }
}
