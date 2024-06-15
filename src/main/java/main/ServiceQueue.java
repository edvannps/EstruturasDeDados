package main;


import dataStructure.Queue;
import java.util.Random;

public class ServiceQueue {
    public static void main(String[] args) {
        int num = 5;
        var random = new Random();
        int customer = random.nextInt(101);
        Queue queue = new Queue(customer);

        System.out.println("\n** Chegada dos clientes **");

        System.out.println("Chegou o cliente número: " + customer);

        // Simula a chegada dos clientes a partir do segundo

        for (int i = 2; i <= num; i++) {
            customer = random.nextInt(101);
            System.out.println("Chegou o cliente número: " + customer);
            queue.enqueue(customer);
        }

        // Atendimento dos clientes
        var node = queue.dequeue();
        System.out.println("\n*****************\n");
        System.out.println("** Atendimento dos clientes **");
        while (node != null) {
            System.out.println("Atendimento do cliente: " + node.getValue());
            node = queue.dequeue();
        }
    }
}
