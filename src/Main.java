public class Main {
    public static void main(String[] args) {//
        System.out.println("Hello World!");

        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println("dog = "+ dog);
        var cat = 3.6;
        System.out.println("cat = "+ cat);
        var paper = 763789;
        System.out.println("paper = "+ paper);

        System.out.println("Задача 2");
        var dog1 = 8.0;
        var y1 = 4;
        var result1 = dog1 + y1;
        System.out.println("dog + 4 = "+ result1);
        var cat1 = 3.6;
        var y2 = 4;
        var result2 = cat1 + y2;
        System.out.println("cat + 4 = "+ result2);
        var paper1 = 763789;
        var result3 = paper1 + y2;
        System.out.println("paper + 4 = "+ result3);

        System.out.println("Задача 3");
        var dog2 = 8.0;
        var y4 = 4;
        var z1 = 3.5;
        var result4 = dog2 + y4 - z1;
        System.out.println("dog + 4 - 3.5 = "+ result4);
        var cat2 = 3.6;
        var y5 = 4;
        var z2 = 1.6;
        var result5 = cat2 + y5 - z2;
        System.out.println("cat + 4 - 1.6 = "+ result5);
        var paper2 = 763789;
        var y6 = 4;
        var z3 = 7639;
        var result6 = paper2 + y6 - z3;
        System.out.println("paper + 4 - 7639 = "+ result6);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        var friend1 = friend + 2;
        System.out.println(friend1);
        var z4 = 7;
        var result7 =  (friend1 / z4);
        System.out.println(result7);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        var y8 = 10;
        var result8 = frog * y8;
        System.out.println(result8);
        var z5 = 3.5;
        var result9 = (frog * y8) / z5;
        System.out.println(result9);
        var result10 = result9 + 4;
        System.out.println(result10);

        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общая масса бойцов = "+ totalWeight + "кг.");
        var weightsGap = boxerWeight2 - boxerWeight1;
        System.out.println("Разница масс = "+ weightsGap + "кг.");

        System.out.println("Задача 7");
        var remainder = (boxerWeight2 % boxerWeight1);
        System.out.println("Остаток от деления = "+ remainder + "кг.");
        System.out.println("!!!Я не поняла как высчитывается остаток от деления, можете поподробнее объяснить, пожалуйста.");

        System.out.println("Задача 8");
        var allHours = 640;
        var personalHours = 8;
        var result = allHours / personalHours;
        System.out.println("Всего работников в компании "+ result + " человек");
        var additionalEmployees = result + 94;
        var newPersonalHours = allHours / additionalEmployees;
        System.out.println("Если в компании работает "+ additionalEmployees + " человека, то всего "+ newPersonalHours + " часа работы может быть поделено между сотрудниками");


    }
}

