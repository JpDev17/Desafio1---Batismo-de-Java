package Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        String ninjaName1 = "Naruto Uzumaki";
        String missionName1 = "Se tornar Hokage";
        String missionStats1 = "Não conclúida";
        char missionLevel1 = 'S';
        int ninjaAge1 = 15;

        String ninjaName2 = "Sasuke Uchiha";
        String missionName2 = "Vingar a morte do seu clã";
        String missionStats2 = "Não concluída";
        char missionLevel2 = 'A';
        int ninjaAge2 = 15;

        String ninjaName3 = "Sakura Haruno";
        String missionName3 = "Alcançar Naruto e Sasuke";
        String missionStats3 = "Não concluída";
        char missionLevel3 = 'A';
        int ninjaAge3 = 15;

        //Dados Naruto Uzumaki
        System.out.println("Ficha Técnica do Primeiro Ninja");
        System.out.println("Nome e Idade: " + ninjaName1 + ", " + ninjaAge1 + " anos");
        System.out.println("Objetivo e Nível de dificuldade: " + missionName1 + ", dificuldade nível " + missionLevel1);

        if(ninjaAge1 < 15){
            System.out.println("Pode concluir missões de nível C ou D");
            System.out.println("Resultado da Missão: " + missionStats1);
        } else {
            System.out.println("Pode concluir missões de qualquer nível");
            missionStats1 = "Concluída";
            System.out.println("Resultado da Missão: " + missionStats1);
        }

        //Dados Sasuke Uchiha
        System.out.println();
        System.out.println("Ficha Técnica do Segundo Ninja");
        System.out.println("Nome e Idade: " + ninjaName2 + ", " + ninjaAge2 + " anos");
        System.out.println("Objetivo e Nível de dificuldade: " + missionName2 + ", dificuldade nível " + missionLevel2);

        if(ninjaAge2 < 15){
            System.out.println("Só pode concluir missões de nível C ou D");
            System.out.println("Resultado da Missão: " + missionStats1);
        } else {
            System.out.println("Pode concluir missões de qualquer nível");
            missionStats2 = "Concluída";
            System.out.println("Resultado da Missão: " + missionStats2);
        }

        //Dados Sakura Haruno
        System.out.println();
        System.out.println("Ficha Técnica do Terceiro Ninja");
        System.out.println("Nome e Idade: " + ninjaName3 + ", " + ninjaAge3 + " anos");
        System.out.println("Objetivo e nível de dificuldade: " + missionName3 + ", dificuldade nível " + missionLevel3);

        if(ninjaAge3 < 15){
            System.out.println("Pode concluir missões de nível C ou D");
            System.out.println("Resultado da Missão: " + missionStats1);
        } else {
            System.out.println("Pode concluir missões de qualquer nível");
            missionStats3 = "Concluída";
            System.out.println("Resultado da Missão: " + missionStats3);
        }
    }
}
