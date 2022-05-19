package machine;
import java.util.Scanner;

/* Описание:
    Давайте смоделируем настоящую кофемашину. В нем ограниченный запас воды, молока,
кофейных зерен и одноразовых стаканчиков. Кроме того, он подсчитывает, сколько денег
он получает за продажу кофе. Кофемашина имеет несколько опций: во-первых, она должна
уметь продавать кофе. Может приготовить разные сорта кофе: эспрессо, латте и капучино.
Конечно, для каждого вида требуется разное количество расходных материалов,
за исключением того, что всем им требуется только один одноразовый стаканчик.
Во-вторых, кофемашина должна иметь возможность наполняться специальным работником.
В-третьих, другой специальный работник должен иметь возможность снимать деньги с
кофемашины.

    Напишите программу, которая может выполнять одно из этих действий за раз.
Он читает одну строку из стандартного ввода, которая может быть «купить»,
«заполнить» или «взять». Если вы хотите купить кофе, введите «купить».
Если вы спецработник и считаете, что пришло время заполнить все принадлежности для
кофемашины, введите «наполнить». Если вы еще один специальный работник и пришло время
взять деньги из кофемашины, введите «взять».

    Если пользователь пишет «купить», то он должен выбрать один из трех сортов кофе,
которые может приготовить кофемашина: эспрессо, латте или капучино.

   * (Для приготовления эспрессо кофемашине требуется 250 мл воды и 16 г кофейных зерен.
Это стоит 4 доллара.)
   * (Для приготовления латте кофемашине требуется 350 мл воды, 75 мл молока и 20 г
кофейных зерен. Это стоит 7 долларов.)
   * (А для капучино кофемашине нужно 200 мл воды, 100 мл молока и 12 г кофейных зерен.
Это стоит 6 долларов.)

    Если пользователь пишет «наполнить», программа должна спросить его, сколько воды,
молока, кофе и сколько одноразовых стаканчиков они хотят добавить в кофемашину.

    Если пользователь пишет «возьми», программа должна отдать ему все деньги,
заработанные на продаже кофе.

    Вначале в кофемашине есть 550 долларов, 400 мл воды, 540 мл молока, 120 г кофейных
зерен и 9 одноразовых стаканчиков.

    Напишите программу, которая выводит состояние кофемашины, обрабатывает один запрос
от пользователя и после этого также выводит состояние кофемашины. Попробуйте
использовать методы для реализации каждого действия, которое может сделать кофемашина.
Инструкция

    Напишите программу, которая предлагает купить одну чашку кофе, досыпать ингредиенты
или взять у нее деньги. При этом программа должна подсчитать, сколько ингредиентов
у нее осталось. А также отображать количество ингредиентов до и после покупки.

    Примеры:
    Эспрессо должен стоять под номером 1 в списке, латте — под номером 2,
а капучино — под номером 3.

    Опционы также должны называться «купить», «заполнить», «взять».

    Но одно действие неинтересно. Давайте улучшим программу, чтобы она могла выполнять
несколько действий одно за другим.
Программа должна неоднократно спрашивать, что пользователь хочет сделать.
Если пользователь набирает «купить», «заполнить» или «взять», то просто сделайте то,
что программа сделала на предыдущем шаге. Однако, если пользователь хочет выключить
кофемашину, он должен набрать «выход».
Затем программа должна завершиться. Также, когда пользователь вводит «осталось»,
программа должна выводить все ресурсы, которые есть у кофемашины. Это означает,
что вы не должны показывать
оставшиеся уровни запасов в начале/конце программы.

    Также не забывайте, что у вас могут не хватить ресурсов для приготовления кофе.
Если у кофемашины недостаточно ресурсов для приготовления кофе,
программа должна вывести сообщение о том, что она не может приготовить чашку кофе,
и указать, чего не хватает.

    И последнее улучшение программы на этом этапе — если пользователь набирает «купить», чтобы купить
чашку кофе, а затем передумает, он должен иметь возможность набрать «назад»,
чтобы вернуться в основной цикл.

    Инструкция

    Напишите программу, которая будет бесконечно работать, чтобы приготовить кофе для всех желающих,
пока не будет дан сигнал отключения.

    Пример

    Ваша кофемашина должна иметь те же начальные ресурсы, что и в примере
(400 мл воды, 540 мл молока, 120 г кофейных зерен,
9 одноразовых стаканчиков, 550 долларов наличными). */

public class CoffeeMachine {

    // local variables (локальные данные)
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposableCups = 9;
    static int money = 550;

    Scanner scanner = new Scanner(System.in);

    // methods espresso (метод еспрессо)
    public static void espresso(int cup) {

        /* Для приготовления эспрессо кофемашине требуется 250 мл воды
        и 16 г кофейных зерен. Это стоит 4 доллара. */
        if (250 * cup > water) { // Проверка, достаточно ли воды.
            System.out.println("Not enough water, replenish the boiler");
        } else if (16 * cup > coffeeBeans) { // Проверка, достаточно ли кофенных зерен.
            System.out.println("Not enough coffee beans, refill container");
        } else if (cup > disposableCups) { // Проверка, достаточно ли одноразовых стаканчиков.
            System.out.println("Not enough disposable cups, refill");
        } else { // Если всего хватает, пишем что готовим кофе.
            System.out.println("I'm making coffee, wait\n");

            // Вычтем и учтём потраченные ингридиенты из локальных данных!
            water -= 250 * cup;
            coffeeBeans -= 16 * cup;
            disposableCups -= cup;
            money += 4 * cup;
        }
    }

    // methods latte (метод лате)
    public static void latte(int cup){

        /* Для приготовления латте кофемашине требуется 350 мл воды, 75 мл молока и 20 г
        кофейных зерен. Это стоит 7 долларов. */
        if (350 * cup > water) { // Проверка, достаточно ли воды.
            System.out.println("Sorry, not enough water!");
        } else if (75 * cup > milk) { // Проверка, достаточно ли молока.
            System.out.println("Not enough milk, refill");
        } else if (20 * cup > coffeeBeans) { // Проверка, достаточно ли кофенных зерен.
            System.out.println("Not enough coffee beans, refill container");
        } else if (cup > disposableCups) { // Проверка, достаточно ли одноразовых стаканчиков.
            System.out.println("Not enough disposable cups, refill");
        } else { // Если всего хватает, пишем что готовим кофе.
            System.out.println("I have enough resources, making you a coffee!\n");

            // Вычтем и учтём потраченные ингридиенты из локальных данных!
            water -= 350 * cup;
            milk -= 75 * cup;
            coffeeBeans -= 20 * cup;
            disposableCups -= cup;
            money += 7 * cup;
        }
    }

    // methods cappuccino (метод капучино)
    public static void cappuccino(int cup) {

        /* А для капучино кофемашине нужно 200 мл воды, 100 мл молока и 12 г кофейных зерен.
        Это стоит 6 долларов. */
        if (200 * cup > water) { // Проверка, достаточно ли воды.
            System.out.println("Not enough water, replenish the boiler");
        } else if (100 * cup > milk) { // Проверка, достаточно ли молока.
            System.out.println("Not enough milk, refill");
        } else if (12 * cup > coffeeBeans) { // Проверка, достаточно ли кофенных зерен.
            System.out.println("Not enough coffee beans, refill container");
        } else if (cup > disposableCups) { // Проверка, достаточно ли одноразовых стаканчиков.
            System.out.println("Not enough disposable cups, refill");
        } else { // Если всего хватает, пишем что готовим кофе.
            System.out.println("I'm making coffee, wait\n");

            // Вычтем и учтём потраченные ингридиенты из локальных данных!
            water -= 200 * cup;
            milk -= 100 * cup;
            coffeeBeans -= 12 * cup;
            disposableCups -= cup;
            money += 6 * cup;
        }
    }

    // Далее опишем методы «купить», «пополнить», «взять». Начнем попорядку:

    // method "buy" (метод купить)
    public static void buy() {

        int cup = 1;

        System.out.print("\nWhat do you want to buy? ");
        System.out.println("1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

        CoffeeMachine coffeeM = new CoffeeMachine();
        String number = coffeeM.scanner.next();

        switch (number) {
            case "1":
                espresso(cup);
                break;
            case "2":
                latte(cup);
                break;
            case "3":
                cappuccino(cup);
                break;
            case "back":
                break;
        }
    }

    // method "fill" (метод пополнить)
    public static void fill() {

        CoffeeMachine coffeeM = new CoffeeMachine();

        System.out.println("\nWrite how many ml of water you want to add:");
        water += coffeeM.scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        milk += coffeeM.scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans += coffeeM.scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee you want to add:");
        disposableCups += coffeeM.scanner.nextInt();
    }

    //method "take" (метод взять)
    public static void take() {

        System.out.println("I gave you $" + money);
        money -= money;
    }

    // Сколько осталось ингридиентов в кофе машине.
    public static void remaining() {

        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void exit() {

        System.exit(0);
    }

    public static void main(String[] args) {

        System.out.println("Write action (buy, fill, take, remaining, exit):");

        CoffeeMachine coffeeM = new CoffeeMachine();
        String vibor = coffeeM.scanner.next();

        while (!vibor.equals("exit")) //if the choice doesn't equal exit than the loop continues
        {

            if (vibor.equals("buy")) { //if "buy" than it calls the method(buy)
                buy();
            } else if (vibor.equals("take")) { //if "take" than it calls the method(take)
                take();
            } else if (vibor.equals("fill")) { //if "fill" than it calls the method(fill)
                fill();
            } else if (vibor.equals("remaining")) { //if "remaining" than it calls the method(remaining)
                remaining();
            } else if (!vibor.equals("exit")) { //if any other choice is given then it falls under this condition
                System.out.println("Wrong input, please try again");
                //vibor = coffeeM.scanner.next();
            }

            //loops the question to keep asking if the user doesn't input exit
            System.out.println("\nWrite action (buy, take, fill, remaining, exit):");
            vibor = coffeeM.scanner.next();
        }
    }
}