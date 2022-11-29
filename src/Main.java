public class Main {
    public static void main(String[] args) {
        System.out.println("Вопрос номер 1: for имеет переменную счетчик которая будет увеличиваться\n" +
                "до тех пор пока не нарушится условие; \n" +
                "Foreach цикл будет действовать относительно элемента к объекту \n" +
                "while будет действовать пока условие будет True\n" +
                "Do while тот же что и while но действует минимум один раз(даже если условие false)" +
                " из-за своего постусловия");
        System.out.println();
        System.out.println("Вопрос номер 2: в языке программирования 'Java' используется " +
                "порядок начинающийся \n с 0 потомучто это самый эффективный способ нужную ячейку в памяти");
        System.out.println();
        System.out.println("Вопрос номер 3: конструктор это не статический метод" +
                " который вызывается только\n при создании класса " +
                "позволяющий правильно инициализировать переменные класса\"");
        System.out.println();
        //Задание.
        String text = "12345678";
        StringBuilder sb = new StringBuilder(text);
        sb.delete(sb.length()/2,sb.length());
        text = String.valueOf(sb);
        System.out.println(text);
    }
}