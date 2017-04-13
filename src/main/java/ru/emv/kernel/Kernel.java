package ru.emv.kernel;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

@Component
public class Kernel extends Thread {

    // TODO: 13.04.2017 придумать формат сообщений и сделать отдельный класс для них 
    public static Queue<String> queue = new PriorityQueue<>();

    public void run() {
        // TODO: 13.04.2017 прикрутить логи 
        System.out.println("Kernel started");
        standbyMode();
    }

    private void standbyMode() {
        while (true) {
            if (!queue.isEmpty()) {
                actionManagement(queue.poll());
            }
        }
    }

    private void actionManagement(String message) {
        // TODO: 13.04.2017 анализ дальнейших действий
    }
}
