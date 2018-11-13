package br.com.findmyduo.Teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 08/11/2018.
 */
public class TesteDatas {


    public static void main(String[] args) {


        LocalDate data1 = LocalDate.of(2019, 1, 20);
        LocalDate data2 = LocalDate.of(2000, 1, 21);
        LocalDate data3 = LocalDate.of(2000, 1, 22);
        LocalDate data4 = LocalDate.of(2000, 1, 23);
        LocalDate data5 = LocalDate.of(2019, 1, 14);
        LocalDate data6 = LocalDate.of(2000, 1, 15);
        LocalDate data7 = LocalDate.of(2000, 1, 16);
        LocalDate data8 = LocalDate.of(2000, 1, 17);
        LocalDate data9 = LocalDate.of(2000, 1, 18);
        LocalDate data10 = LocalDate.of(2000, 1, 19);

        List<LocalDate> datas = new ArrayList<>();
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);
        datas.add(data4);
        datas.add(data5);
        datas.add(data6);
        datas.add(data7);
        datas.add(data8);
        datas.add(data9);
        datas.add(data10);


        Collections.sort(datas);
        for (LocalDate data : datas) {
            System.out.println("sort > " + data);
        }


        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate agora = LocalDate.now();

        if (agora.isBefore(datas.get(0))) {
            System.out.println(formatador.format(agora) + " é antes de " + formatador.format(datas.get(0)));
        } else {
            System.out.println(formatador.format(agora) + " é depois de " + formatador.format(datas.get(0)));
        }


        Collections.reverse(datas);
        LocalDate depois = LocalDate.of(2019, 01, 05);

        if (depois.isBefore(datas.get(0))) {
            System.out.println(formatador.format(depois) + " é antes de " + formatador.format(datas.get(0)));
        } else {
            System.out.println(formatador.format(depois) + " é depois de " + formatador.format(datas.get(0)));
        }


    }


}
