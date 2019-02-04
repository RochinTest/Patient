//1.2). Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
//Создать массив объектов. Вывести:
//a)	список пациентов, имеющих данный диагноз;
//b)	список пациентов, номер медицинской карты у которых находится в заданном интервале.
package com.example.Patient;

import java.util.Scanner;

public class Main {
    private String[][] patient;
    private int id;
   public String numStr = null;
    public void setId(int id) {
        this.id = id;
    }

    public void setPatient(String[][] patient) {
        this.patient = patient;
    }

    public Main(String[][] patient, int id) {
        this.patient = patient;
        this.id = id;
    }

    public Main(String[][] patient, int id, String numStr) {
        this.patient = patient;
        this.id = id;
        this.numStr = numStr;
    }

    public Main() {
    }

    private void createMassiv() {
        patient[0][0] = "0";
        patient[0][1] = "Сидоров";
        patient[0][2] = "Петр";
        patient[0][3] = "Витальевич";
        patient[0][4] = "ул.Крапоткина";
        patient[0][5] = "345345";
        patient[0][6] = "1";
        patient[0][7] = "Чихает";
        patient[1][0] = "1";
        patient[1][1] = "Брундуков";
        patient[1][2] = "Артем";
        patient[1][3] = "Александрович";
        patient[1][4] = "ул.Давида";
        patient[1][5] = "6785454";
        patient[1][6] = "2";
        patient[1][7] = "Грип";
        patient[2][0] = "2";
        patient[2][1] = "Верещако";
        patient[2][2] = "Владислав";
        patient[2][3] = "Вячеславович";
        patient[2][4] = "ул.Лебедя";
        patient[2][5] = "5455667";
        patient[2][6] = "3";
        patient[2][7] = "Чихает";
        patient[3][0] = "3";
        patient[3][1] = "Голотовский";
        patient[3][2] = "Никита";
        patient[3][3] = "Владимирович";
        patient[3][4] = "ул.Крапоткина";
        patient[3][5] = "893434";
        patient[3][6] = "4";
        patient[3][7] = "Грипп";
        patient[4][0] = "4";
        patient[4][1] = "Добринская ";
        patient[4][2] = "Дарья";
        patient[4][3] = "Дмитриевна";
        patient[4][4] = "ул.Сепаратистов";
        patient[4][5] = "233568";
        patient[4][6] = "5";
        patient[4][7] = "Простуда";
        patient[5][0] = "5";
        patient[5][1] = "Жуковин ";
        patient[5][2] = "Леонид";
        patient[5][3] = "Максимович";
        patient[5][4] = "ул.Давида";
        patient[5][5] = "9783242";
        patient[5][6] = "6";
        patient[5][7] = "Простуда";
        patient[6][0] = "6";
        patient[6][1] = "Зуева";
        patient[6][2] = "Вероника";
        patient[6][3] = "Вячеславовна";
        patient[6][4] = "ул.Опереты";
        patient[6][5] = "6797833";
        patient[6][6] = "7";
        patient[6][7] = "Кашель";
        patient[7][0] = "7";
        patient[7][1] = "Иванченков";
        patient[7][2] = "Артур";
        patient[7][3] = "Андреевич";
        patient[7][4] = "ул.Крапоткина";
        patient[7][5] = "345345";
        patient[7][6] = "8";
        patient[7][7] = "Кашель";
        patient[8][0] = "8";
        patient[8][1] = "Игнатович";
        patient[8][2] = "Диана";
        patient[8][3] = "Викторовна";
        patient[8][4] = "ул.Лебедя";
        patient[8][5] = "780978235";
        patient[8][6] = "9";
        patient[8][7] = "Чихает";
        patient[9][0] = "9";
        patient[9][1] = "Казаченок";
        patient[9][2] = "Галина";
        patient[9][3] = "Валерьевна";
        patient[9][4] = "ул.Красина";
        patient[9][5] = "345343";
        patient[9][6] = "10";
        patient[9][7] = "Простуда";
        patient[10][0] = "10";
        patient[10][1] = "Коверзюк";
        patient[10][2] = "Мария";
        patient[10][3] = "Игоревна";
        patient[10][4] = "ул.Миронова";
        patient[10][5] = "345345";
        patient[10][6] = "11";
        patient[10][7] = "Грипп";
        patient[11][0] = "11";
        patient[11][1] = "Козак";
        patient[11][2] = "Александр";
        patient[11][3] = "Николаевич";
        patient[11][4] = "ул.Заграницы";
        patient[11][5] = "3453455";
        patient[11][6] = "12";
        patient[11][7] = "Грипп";
        patient[12][0] = "12";
        patient[12][1] = "Кот";
        patient[12][2] = "Юлия";
        patient[12][3] = "Александровна";
        patient[12][4] = "ул.Павленко";
        patient[12][5] = "98734534";
        patient[12][6] = "13";
        patient[12][7] = "Кашель";
        patient[13][0] = "13";
        patient[13][1] = "Кочеткова";
        patient[13][2] = "Лилия";
        patient[13][3] = "Геннадьевна";
        patient[13][4] = "ул.Космонавтов";
        patient[13][5] = "567878";
        patient[13][6] = "14";
        patient[13][7] = "Кашель";
        patient[14][0] = "14";
        patient[14][1] = "Кривецкий";
        patient[14][2] = "Александр";
        patient[14][3] = "Александрович";
        patient[14][4] = "ул.Крапоткина";
        patient[14][5] = "3343664";
        patient[14][6] = "15";
        patient[14][7] = "Насморк";
        patient[15][0] = "15";
        patient[15][1] = "Марчик";
        patient[15][2] = "Виктория";
        patient[15][3] = "Леонидовна";
        patient[15][4] = "ул.Красной Армии";
        patient[15][5] = "6767866";
        patient[15][6] = "16";
        patient[15][7] = "Насморк";
        patient[16][0] = "16";
        patient[16][1] = "Мирный";
        patient[16][2] = "Владислав";
        patient[16][3] = "Иванович";
        patient[16][4] = "ул.Миронова";
        patient[16][5] = "2342342";
        patient[16][6] = "17";
        patient[16][7] = "Понос";

    }

    public static void main(String[] args) {
        Main metod = new Main();
        Patient metod1 = new Patient();
        String[][] patient = metod1.getPatient();
        metod.setPatient(patient);
        int id = metod1.getId();
        metod.setId(id);
        metod.createMassiv();
        metod.searchPatient();
       // metod.diagnosis();
    }
    public String input() {
        String numStr = null;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            numStr = sc.nextLine();
        }
        return numStr;
    }
    public  int inputInt() {
       int num=0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        }
        return num;
    }
    private void diagnosis(){
        String str=new String();
        System.out.println("Введите диагноз (чихает, простуда, грипп, понос, насморк, кашель");
        str = input();
        for (int i=0;i<=16;i++){
            if (patient[i][7].equalsIgnoreCase(str) ){
                System.out.println(patient[i][1] + " " + patient[i][2] );
            }
        }
    }
    private void searchPatient(){
        System.out.println("Введите диапазон номеров медицинских карт (1-16) ");

        int n= inputInt();
        int n1=inputInt();
        for (int i=n;i<n1;i++){
            System.out.println(patient[i][1] + " " + patient[i][2]);

        }
    }
}
