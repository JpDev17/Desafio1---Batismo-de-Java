package Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        String ninjaName1 = "Naruto Uzumaki";
        String missionName1 = "Se tornar Hokage";
        String missionStats1 = "Em andamento";
        char missionLevel1 = 'S';
        int ninjaAge1 = 15;

        if (ninjaAge1 < 15) {
            if (missionLevel1 == 'C' || missionLevel1 == 'D') {
                missionStats1 = "Concluída";
            } else {
                missionStats1 = "Não concluída";
            }
        } else {
            missionStats1 = "Concluída";
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Ficha Técnica do Primeiro Ninja");
        System.out.println("Nome: " + ninjaName1);
        System.out.println("Idade: " + ninjaAge1);
        System.out.println("Missão: " + missionName1);
        System.out.println("Nível da Missão: " + missionLevel1);
        System.out.println("Status da Missão: " + missionStats1);
        System.out.println("-----------------------------------------------------------");

        String ninjaName2 = "Sasuke Uchiha";
        String missionName2 = "Vingar a morte do seu clã";
        String missionStats2 = "Em andamento";
        char missionLevel2 = 'A';
        int ninjaAge2 = 15;

        if (ninjaAge2 < 15) {
            if (missionLevel2 == 'C' || missionLevel2 == 'D') {
                missionStats2 = "Concluída";
            } else {
                missionStats2 = "Não concluída";
            }
        } else {
            missionStats2 = "Concluída";
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Ficha Técnica do Segundo Ninja");
        System.out.println("Nome: " + ninjaName2);
        System.out.println("Idade: " + ninjaAge2);
        System.out.println("Missão: " + missionName2);
        System.out.println("Nível da Missão: " + missionLevel2);
        System.out.println("Status da Missão: " + missionStats2);
        System.out.println("-----------------------------------------------------------");

        String ninjaName3 = "Sakura Haruno";
        String missionName3 = "Alcançar o nível do Naruto e do Sasuke";
        String missionStats3 = "Em andamento";
        char missionLevel3 = 'A';
        int ninjaAge3 = 15;

        if (ninjaAge3 < 15) {
            if (missionLevel3 == 'C' || missionLevel3 == 'D') {
                missionStats3 = "Concluída";
            } else {
                missionStats3 = "Não concluída";
            }
        } else {
            missionStats3 = "Concluída";
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Ficha Técnica do Terceiro Ninja");
        System.out.println("Nome: " + ninjaName3);
        System.out.println("Idade: " + ninjaAge3);
        System.out.println("Missão: " + missionName3);
        System.out.println("Nível da Missão: " + missionLevel3);
        System.out.println("Status da Missão: " + missionStats3);
        System.out.println("-----------------------------------------------------------");
    }
}