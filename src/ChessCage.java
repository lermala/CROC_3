/**
 * Класс, описывающий координаты шахматной клетки
 * Данные класса: компоненты x и y, отсчитываемые от левого нижнего угла. (8х8)
 */
public class ChessCage {
    // отсчитываем от левого нижнего угла:
    private byte x; // координата x от 1 до 8 (от a до h)
    private byte y; // координата y от 1 до 8

    /**
     * Конструктор. Внутри используем сеттеры, так как они проверяют знаение х и у на корректность.
     * @param x - значение, которое нужно записать в поле x
     * @param y - значение, которое нужно записать в поле y
     * @throws IllegalArgumentException
     */
    public ChessCage(byte x, byte y) throws IllegalArgumentException {
        setX(x);
        setY(y);
    }

    /**
     * Проверяем значение на корректность (должно быть от 0 до 7) и устанавливаем его в поле x.
     * Если значение не соответствует значениям от 1 до 8, то выбрасывается IllegalArgumentException.
     * @param x - значение, которое нужно записать в поле x
     * @throws IllegalArgumentException
     */
    public void setX(byte x) throws IllegalArgumentException{
        if (x < 0 || x > 7) {
            throw new IllegalArgumentException("Неверно задан х");
        } else {
            this.x = x;
        }
    }

    /**
     * Проверяем значение на корректность (должно быть от 0 до 7) и устанавливаем его в поле y.
     * Если значение не соответствует значениям от 1 до 8, то выбрасывается IllegalArgumentException.
     * @param y - значение, которое нужно записать в поле y
     * @throws IllegalArgumentException
     */
    public void setY(byte y) throws IllegalArgumentException{
        if (y < 0 || y > 7) {
            throw new IllegalArgumentException("Неверно задан y");
        } else {
            this.y = y;
        }
    }

    /**
     * Перевод значения координаты в текстовый вид типа <номер колонки в виде буквы от 'a' до 'h'><номер строки, начиная с 1>
     * @return resultStr - результат перевода координаты в текст, выводится в виде: <номер колонки><номер строки>
     */
    @Override
    public String toString() {
        char[] symbols = {'a' , 'b', 'c', 'd', 'e', 'f', 'g', 'h'}; // храним массив букв для вывода значения Х
        String resultStr = symbols[x] + "" + (y + 1); // т.к. в координатах отсчет с 0, а при выводе отсчет с 1, то (y+1)
        return resultStr;
    }

    public byte getX() {
        return x;
    }

    public byte getY() {
        return y;
    }
}
