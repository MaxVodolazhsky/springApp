package ru.vodolazhsky.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer MusicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);

        MusicPlayer.playMusic();

        context.close();
    }
}
