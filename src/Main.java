/**
 * ЗАДАНИЕ:
 * Определить класс, описывающий координаты шахматной клетки.
 * Данные класса: компоненты x и y, отсчитываемые от левого нижнего угла.
 *
 * 1. Все методы, позволяющие установить координаты, в том числе и конструкторы, должны проверять
 * корректность аргументов и генерировать IllegalArgumentException в случае ошибочных значений.
 *
 * 2. Переопределить метод toString(), выводящий координаты клетки в формате
 * <номер колонки в виде буквы от 'a' до 'h'><номер строки, начиная с 1>.
 * Например, клетка с координатами (1, 1) имеет строковое представление "b2".
 */
public class Main {

    public static void main(String[] args) {
        // здесь все выведется корректно, ошибок не будет
        byte x = 1, y = 1;
        ChessCage chessCage = new ChessCage(x, y);
        System.out.println(chessCage); // вывод "b2"

        // здесь тоже не будет ошибок
        x = y = 7;
        chessCage.setX(x);
        chessCage.setY(y);
        System.out.println(chessCage); // вывод "h8"

        // пробуем ввести некорректное значение 10
        chessCage.setY((byte) 10); // здесь появится исключение
        System.out.println(chessCage); // сюда уже не попадем
    }
}
