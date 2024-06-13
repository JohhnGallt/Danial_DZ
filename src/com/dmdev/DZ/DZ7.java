package com.dmdev.DZ;
/*
Задана последовательность,состоящаятолькоизсимволов‘>’,‘<’и‘-‘.
Требуетсянайтиколичествострел,которыеспрятанывэтойпоследовательности.
Стрелы–этоподстрокивида‘>>-->’и‘<--<<’.
Входныеданные:впервойстрокевходногопотоказаписанастрока,состоящаяизсимволов‘>’,‘<’и‘-‘(безпробелов).
Строкаможетсодержатьдо106символов.
Выходныеданные:вединственнуюстрокувыходногопотоканужновывестиискомоеколичествострелок.
 */

public class DZ7 {
    public static void main(String[] args) {

        String value = ">>-->-><<<><><>>--><--<<>>-->>><><--<<--<<>>>>----->>--><<---<<--<<<-<<>>-->>-->";
        char[] arrow1 = {'<', '-', '-', '<', '<'};
        char[] arrow2 = {'>', '>', '-', '-', '>'};

        int count = 0;

        char [] valueArray = value.toCharArray();
        for (int i = 0; i < valueArray.length - 4; i++) {
            if (arrow1[0] == valueArray[i]
                    && arrow1[1] == valueArray[i+1]
                    && arrow1[2] == valueArray[i+2]
                    && arrow1[3] == valueArray[i+3]
                    && arrow1[4] == valueArray[i+4]) {
                count ++;
                System.out.println("СТРЕЛА1");
            }
            if (arrow2[0] == valueArray[i]
                    && arrow2[1] == valueArray[i+1]
                    && arrow2[2] == valueArray[i+2]
                    && arrow2[3] == valueArray[i+3]
                    && arrow2[4] == valueArray[i+4]) {
                count ++;
                System.out.println("СТРЕЛА2");
            }
        }
        System.out.println("Количество стрел" + count);

    }
}
